package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<>());
    }
    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton","Alberta"));
        assertEquals(listSize +1, list.getCount());
    }
    @Test

    void testHasCity(){

        City city = new City("Edmonton","Alberta");
        list.addCity(city);
        assertEquals(1,list.hasCity(city));


    }
    @Test
    void testDeleteSuccess(){

        City city = new City("Winnipeg","Manitoba");
        list.addCity(city);
        list.delete(city);
        assertEquals(1, list.hasCity(city));

    }
    @Test
    public void testCountCities() {
        City city = new City("Winnipeg","Manitoba");
        list.addCity(city);
        assertEquals(1, list.countCities());



    }
}
