package cn.jinlu.spi.demo;

import org.junit.Test;

import java.util.ServiceLoader;

public class AnimalTest {
    @Test
    public void animalTest() {
        ServiceLoader<Animal> animals = ServiceLoader.load(Animal.class);
        for(Animal animal: animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
