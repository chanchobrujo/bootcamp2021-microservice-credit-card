package com.everisbootcamp.creditcard.Connection;

import com.everisbootcamp.creditcard.Model.Request.RequestUpdateBalance;
import com.everisbootcamp.creditcard.Model.Response.ResponseAccount;
import java.util.Map;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class ConnectionMicroservicesAccount {

    public ResponseEntity<ResponseAccount> findAccountByNumberAccount(String number) {
        return Consumer.webClientAccount
            .get()
            .uri(UriBuilder -> UriBuilder.path("findById").queryParam("number", number).build())
            .retrieve()
            .toEntity(ResponseAccount.class)
            .block();
    }

    public ResponseEntity<Map<String, Object>> updateBalance(RequestUpdateBalance model) {
        return Consumer.webClientAccount
            .post()
            .uri("updateBalance")
            .body(Mono.just(model), RequestUpdateBalance.class)
            .retrieve()
            .toEntity(new ParameterizedTypeReference<Map<String, Object>>() {})
            .block();
    }
}
