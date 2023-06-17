package com.js.webclienttutorial.service;

import com.js.webclienttutorial.dto.CurrencyResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Service
public class CurrencyService {
    private final WebClient webClient;

    public CurrencyService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
                .baseUrl("http://api.nbp.pl/api")
                .build();
    }


    public CurrencyResponse findCurrency(String currency) {
        Mono<CurrencyResponse> responseMono = this.webClient.get().uri("/exchangerates/rates/a/" + currency)
                .retrieve()
                .bodyToMono(CurrencyResponse.class);

        return responseMono.block(Duration.of(1000, ChronoUnit.MILLIS));

    }


}
