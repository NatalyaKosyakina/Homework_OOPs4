package org.example;

public class Apple extends Fruit{
    Apple(String fruitsort){
        this.fruitsort = fruitsort;
        this.weight = 1;
    }
    @Override
    public String toString() {
        return "Яблоки " + fruitsort;
    }
}
