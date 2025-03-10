package com.example.CartAndCost;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CostService
{
    private Map<String,Integer> costs=new HashMap<>();

    public CostService()
    {
        costs.put("Happiness",10000);
        costs.put("Sleep",20000);
        costs.put("Music",650);
        costs.put("Brownies",500);
        costs.put("Food",200);
        costs.put("Sadness",0);
        costs.put("Assignments",10);
        costs.put("SomeRandomThought",1000000);
    }

    public Integer getCost(String item)
    {
        return costs.get(item);
    }
    public void addCost(String item,Integer cost)
    {
        costs.put(item,cost);
    }


}
