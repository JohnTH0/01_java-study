package com.jun.practice1.dto;

public class Dog extends Animal{

    private int weight;



    public Dog(String name, String kinds, int weight) {
        super(name, kinds);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "weight=" + weight +
                '}';
    }

    @Override
    public void speak() {
        System.out.println(super.toString() + "몸무게는 " + weight + "kg입니다.");
    }

}
