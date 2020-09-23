package com.jonatahessa.bills.service;

import com.jonatahessa.bills.model.CreditCard;
import com.jonatahessa.bills.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CreditCardService {

    @Autowired
    CreditCardRepository creditCardRepository;

    public List<CreditCard> findAll() {
        return creditCardRepository.findAll();
    }
}
