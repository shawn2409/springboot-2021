package com.example.controller;

import com.example.model.BitPay;
import com.example.service.BitPayInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BitPayController {

    private final BitPayInfoService bitPayInfoService;


    public BitPayController(BitPayInfoService bitPayInfoService) {
        this.bitPayInfoService = bitPayInfoService;
    }

    @GetMapping("/bitpay")
    List<BitPay> getAllPersons() {

        return bitPayInfoService.getAllBitpays();

    }


}
