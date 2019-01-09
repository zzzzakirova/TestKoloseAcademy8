package com.company;

public class ToyCat extends Cat {
    @Override
    public void display() {
        System.out.println("Toy cat is displayed, it is soft");
    }

    @Override
    public void purr() {
        System.out.println("This cat does not purr!");
    }

    @Override
    public void jump() {
        super.jump();
    }
}
