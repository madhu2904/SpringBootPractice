package com.example.CartAndCost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DebitCardPaymentService implements PaymentService{
    private int totalCost;
    @Autowired
    private ItemService itemservice;
    @Autowired
    private CostService costService;
    private int fee=100;

    @Override
    public int processPayment()
    {

        for(String i: itemservice.getItems())
        {
            totalCost+=costService.getCost(i);
        }
        return totalCost+fee;
    }
}
