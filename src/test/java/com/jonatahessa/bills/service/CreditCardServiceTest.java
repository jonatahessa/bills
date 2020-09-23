package com.jonatahessa.bills.service;

import com.jonatahessa.bills.model.CreditCard;
import com.jonatahessa.bills.repository.CreditCardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static org.mockito.Mockito.when;

public class CreditCardServiceTest {

    @Autowired
    CreditCardService creditCardService;

    @Mock
    CreditCardRepository creditCardRepository;

    private List<CreditCard> creditCards;

    @BeforeEach
    public void instantiateCreditCards() {
        int numberOfCards = 3;
        creditCards = new ArrayList<>();
        while (numberOfCards != 0) {
            CreditCard creditCard = new CreditCard(
                    null, "Cartao N° " + numberOfCards,
                    new GregorianCalendar(2020, 10, 23).getTime(),
                    new GregorianCalendar(2020, 10, 13).getTime(),
                    new BigDecimal("300.00" + numberOfCards));
            creditCards.add(creditCard);
            numberOfCards--;
        }
    }

    @Test
    public void mustGetAllCreditCards() {
        when(creditCardRepository.findAll()).thenReturn(creditCards);
    }
}
