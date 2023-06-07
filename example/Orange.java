package org.example;

public class Orange extends Fruit{
    Orange(String fruitsort){
        this.fruitsort = fruitsort;
        this.weight = 1.5;
    }
    @Override
    public String toString() {
        return "Апельсины " + fruitsort;
    }
}
