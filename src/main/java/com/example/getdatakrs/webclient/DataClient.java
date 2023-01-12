package com.example.getdatakrs.webclient;

import com.example.getdatakrs.model.DataToResponseBuilder;
import com.example.getdatakrs.webclient.DTO.Dto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class DataClient {
    private final String KRS_API = "https://api-krs.ms.gov.pl/api/krs/OdpisAktualny/{Krs}?rejestr=P&format=json";
    private RestTemplate restTemplate = new RestTemplate();
    public DataToResponseBuilder getDto(String Krs){
        Dto dto = restTemplate.getForObject(KRS_API, Dto.class, Krs);
       return DataToResponseBuilder.builder()
               .formaPrawna(dto.getOdpis().getDane().getDzial1().getDanePodmiotu().getFormaPrawna())
               .regon(dto.getOdpis().getDane().getDzial1().getDanePodmiotu().getIdentyfikatory().getRegon())
               .nip(dto.getOdpis().getDane().getDzial1().getDanePodmiotu().getIdentyfikatory().getNip())
               .build();
    }
}
