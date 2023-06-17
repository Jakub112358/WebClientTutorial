package com.js.webclienttutorial.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyResponse {
    private String table;
    private String currency;
    private String code;
    private List<Rates> rates;

}
