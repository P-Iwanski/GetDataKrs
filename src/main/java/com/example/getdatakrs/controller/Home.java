package com.example.getdatakrs.controller;

import com.example.getdatakrs.model.DataToResponseBuilder;
import com.example.getdatakrs.service.KrsDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Home {
    private final KrsDataService krsDataService;
    @GetMapping("/home")
    public DataToResponseBuilder getData(@RequestParam String Krs) {
        return krsDataService.getData(Krs);
    }
}
