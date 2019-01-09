package com.company;

public class PiggyBankCat extends Cat {
    @Override
    public void display() {
        System.out.println("Piggy bank cat is displayed, it can keep money"); }

    @Override
    public void purr() {
        System.out.println("This cat does not purr!");
    }

    @Override
    public void meow() {
        System.out.println("This cat does not mew!");
    }


}
