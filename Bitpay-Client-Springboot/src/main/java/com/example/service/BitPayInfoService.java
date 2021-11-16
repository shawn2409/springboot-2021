package com.example.service;

import com.example.model.BitPay;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BitPayInfoService {

    List<BitPay> getAllBitpays();

    BitPay getBitPayByCode(String bitPay);

    BitPay savePerson(BitPay bitPay);

    BitPay updateBitPay(BitPay bitPay);

    void deleteBitPay(String code);


}
