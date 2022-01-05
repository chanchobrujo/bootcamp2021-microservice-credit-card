package com.everisbootcamp.creditcard.Connection;

import com.everisbootcamp.creditcard.Constant.Paths.Path;
import org.springframework.web.reactive.function.client.WebClient;

public class Consumer {

    public static final WebClient webClientCustomer = WebClient.create(Path.URLS.CUSTOMERS_PATH);
    public static final WebClient webClientAccount = WebClient.create(Path.URLS.ACCOUNT_PATH);
    public static final WebClient webClientLogic = WebClient.create(Path.URLS.LOGIC_PATH);
}
