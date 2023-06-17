package com.js.webclienttutorial.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rates {
    private String no;
    private String effectiveDate;
    private double mid;
}
