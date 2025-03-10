package com.example.CartAndCost;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DisplayCart
{
    @Autowired
    private ItemService itemService;

    @Autowired
    private CostService costService;

    @Autowired
    @Qualifier("creditCardPaymentService")
    private PaymentService paymentService;

    @RequestMapping("/")
    public String index(Model model){

        Map<String,Integer> cartItems=new HashMap<>();
        for(String i:itemService.getItems())
        {
         cartItems.put(i,costService.getCost(i));
        }
        model.addAttribute("items",cartItems);
        model.addAttribute("total",paymentService.processPayment());
        return "index";
    }

}
