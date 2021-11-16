package com.example.service.Impl;

import com.example.model.BitPay;
import com.example.repo.BitPayRepository;
import com.example.service.BitPayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BitPayInfoServiceImpl implements BitPayInfoService {

    @Autowired
    private final BitPayRepository bitPayRepository;
    public static final String REST_SERVICE_Rates_URI = "https://bitpay.com/api/rates";


    RestTemplate restTemplate= new RestTemplate();

    ResponseEntity<List<BitPay>> rateResponse =
            restTemplate.exchange(REST_SERVICE_Rates_URI,
                    HttpMethod.GET, null, new ParameterizedTypeReference<List<BitPay>>() {
                    });

    List<BitPay> bitPayClientList = rateResponse.getBody();



    public BitPayInfoServiceImpl(BitPayRepository bitPayRepository) {
        this.bitPayRepository = bitPayRepository;
    }


    @Override
    public List<BitPay> getAllBitpays() {



        return bitPayClientList;
    }

    @Override
    public BitPay getBitPayByCode(String bitPay) {
        return null;
    }

    @Override
    public BitPay savePerson(BitPay bitPay) {
        return null;
    }

    @Override
    public BitPay updateBitPay(BitPay bitPay) {
        return null;
    }

    @Override
    public void deleteBitPay(String code) {

    }
}
