package com.aurora;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Alvaro", "Coria Sanchez", 63, "coria@gmail.com");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(p);
        System.out.println(json);
    }
}