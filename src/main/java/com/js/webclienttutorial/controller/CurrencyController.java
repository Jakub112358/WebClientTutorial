package com.js.webclienttutorial.controller;

import com.js.webclienttutorial.dto.CurrencyResponse;
import com.js.webclienttutorial.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
@RequiredArgsConstructor
public class CurrencyController {

    private final CurrencyService currencyService;


    @GetMapping(params = "currency")
    public ResponseEntity<CurrencyResponse> findCurrency(@RequestParam String currency) {
        return ResponseEntity.ok(currencyService.findCurrency(currency));
    }

}
