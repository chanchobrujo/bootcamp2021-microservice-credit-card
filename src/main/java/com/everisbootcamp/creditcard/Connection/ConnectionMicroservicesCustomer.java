package com.everisbootcamp.creditcard.Connection;

import com.everisbootcamp.creditcard.Model.Response.ResponseCustomer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ConnectionMicroservicesCustomer {

    public ResponseEntity<ResponseCustomer> findCustomerById(String idcustomer) {
        return Consumer.webClientCustomer
            .get()
            .uri(UriBuilder -> UriBuilder.path("findById").queryParam("id", idcustomer).build())
            .retrieve()
            .toEntity(ResponseCustomer.class)
            .block();
    }
}
