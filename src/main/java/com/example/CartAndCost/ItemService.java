package com.example.CartAndCost;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class ItemService {
    private List<String> items=new ArrayList<>();


    public  ItemService()
    {
        items.add("Happiness");
        items.add("Sleep");
        items.add("Food");
        items.add("Brownies");
        items.add("Music");


    }
    public List<String> getItems()
    {
        return items;
    }
    public void addItems(String item)
    {
        items.add(item);
    }
}
