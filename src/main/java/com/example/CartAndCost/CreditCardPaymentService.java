package com.example.CartAndCost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentService implements PaymentService {

    private int totalCost=0;
    @Autowired
    private ItemService itemservice;
    @Autowired
    private CostService costService;
    private int fee=10;

    @Override
    public int processPayment()
    {
        totalCost=0;

        for(String i: itemservice.getItems())
        {
            totalCost+=costService.getCost(i);
        }
        return totalCost+fee;
    }
}
