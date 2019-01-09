package com.company;

abstract class  Cat {
    abstract void display();

    public void purr() {
        System.out.println("This cat can purr, mrrrrr...");
    }

    public void meow() {
        System.out.println("Does this cat meow? - Meow!");
    }

    public void jump() {
        System.out.println("How does this cat jump? - Jumps high");
    }

}
