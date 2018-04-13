package com.example.vinod.beeradviserapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    private  BeerExpert expert = new BeerExpert();  //Custom Java class object initilization

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    public void onClickFindBeerBtn(View view){
        TextView brands1 = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        //brands1.setText(beerType);

        // We are using BeerExpert custom Java class here to get lists


        List<String> brandslist = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brands: brandslist)
        {
            brandsFormatted.append(brands).append('\n');

        }
        brands1.setText(brandsFormatted);

   }
}
