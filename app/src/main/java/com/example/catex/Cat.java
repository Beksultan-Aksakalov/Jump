package com.example.catex;

public class Cat {

    IJump iJump;

    public Cat(IJump iJump) {
        this.iJump = iJump;
    }

    /**
     * Данный метод, для каждого конкретного котика, должен быть свой.
     */
    public void display() {
        throw new UnsupportedOperationException();
    }

    public void purr() {
        System.out.println("This cat can purr, mrrrrr...");
    }

    public void meow() {
        System.out.println("Does this cat meow? - Meow!");
    }

    public void jump() {
        iJump.jump();
        System.out.println("How does this cat jump? - Jumps high");
    }


}
