package com.example.getdatakrs.service;

import com.example.getdatakrs.model.DataToResponseBuilder;
import com.example.getdatakrs.webclient.DataClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KrsDataService {
    private final DataClient dataClient;

    public DataToResponseBuilder getData(String Krs){
        return dataClient.getDto(Krs);
    }
}
