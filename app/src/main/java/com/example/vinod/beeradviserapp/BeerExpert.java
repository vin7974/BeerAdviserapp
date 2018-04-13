package com.example.vinod.beeradviserapp;

/**
 * Created by vinod on 4/13/18.
 */
import  java.util.ArrayList;
import  java.util.List;


public class BeerExpert {

    List<String> getBrands(String color)
    {
        List<String> brands = new ArrayList<>();

        if (color.equals("Beer 1"))
        {
            brands.add("Beer 2");
            brands.add("Beer 3");
        }
        else
        {
            brands.add("Else Condition");
            brands.add("Else Condition");
        }
        return brands;
    }
}
