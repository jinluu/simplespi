package cn.jinlu.spi.demo.impl;

import cn.jinlu.spi.demo.Animal;

public class Elephant implements Animal {
    @Override
    public void eat() {
        System.out.println("Elephant is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping");
    }
}
