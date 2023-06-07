package org.example;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Антоновка");
        Apple apple2 = new Apple("Солнцедар");
        Apple apple3 = new Apple("Уэлси");

        Orange orange1 = new Orange("Марокко");
        Orange orange2 = new Orange("Азербайджан");
        Orange orange3 = new Orange("Бразилия");

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(apple1);
        appleBox1.add(apple2);
        appleBox1.add(apple3);
        System.out.printf("Содержимое первой коробки: %s, общий вес %.2f. \n", appleBox1, appleBox1.getWeight());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(orange1);
        orangeBox1.add(orange2);
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.add(orange3);
        System.out.printf("Содержимое второй и третьей коробки: %s, вес %.2f, %s, вес %.2f. \n",orangeBox1,
                + orangeBox1.getWeight(), orangeBox1, orangeBox2.getWeight());
        System.out.println("\n" + appleBox1.compare(orangeBox1));
        orangeBox1.moveFruitsFrom(orangeBox2);
        System.out.printf("Содержимое второй и третьей коробки: %s, вес %.2f, %s, вес %.2f. \n",orangeBox1,
                + orangeBox1.getWeight(), orangeBox1, orangeBox2.getWeight());

    }
}