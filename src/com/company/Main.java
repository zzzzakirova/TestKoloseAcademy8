package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>();
        cats.add(new MaineCoonCat());
        cats.add(new MunchkinCat());
        cats.add(new PiggyBankCat());
        cats.add(new ToyCat());

        for (Cat cat : cats) {
            cat.display();
            cat.purr();
            cat.meow();
            cat.jump();
            System.out.println();
        }
    }
}

