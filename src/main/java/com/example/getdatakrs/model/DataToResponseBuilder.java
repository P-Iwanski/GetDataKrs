package com.example.getdatakrs.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DataToResponseBuilder {
    private String formaPrawna;
    private String regon;
    private String nip;
}
