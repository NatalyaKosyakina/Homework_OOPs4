package org.example;


import java.util.ArrayList;
import java.util.Comparator;

public class Box <T extends Fruit>{
    private ArrayList<T> box;

    Box(){
        this.box = new ArrayList<T>();
    }
    public void add(T fruit){
        box.add(fruit);
    }
    public T get(int index){
        return box.get(index);
    }

    @Override
    public String toString() {
        return box.toString();
    }
    public double getWeight(){
        if (box.isEmpty()){
            return  0;
        }
        else {
            return box.size() * box.get(0).getWeight();
        }
    }

    public boolean compare(Box somebox){
        return (getWeight() == somebox.getWeight());
    }

    public void moveFruitsFrom(Box<T> somebox){
        this.box.addAll(somebox.box);
        somebox.box.removeAll(somebox.box) ;
    }
}
