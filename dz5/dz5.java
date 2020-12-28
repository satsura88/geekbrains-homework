package lesson05.dz5;

import lesson05.dz5.animals.*;

public class dz5 {
    public static void main(String[] args){

        Dog dog1 = new Dog("Шарик", 600, 50, 0.5);
        dog1.running(dog1.length);

        LittleDog littleDog1 = new LittleDog("Спинки", 500, 10, 0.6);
        littleDog1.jumping(littleDog1.height);

        Horse horse1 = new Horse("Пегас", 1600, 90, 2.5);
        horse1.swimming(horse1.swimLength);

        Bird bird1 = new Bird("Тинки", 4, 15000, 0.2);
        bird1.swimming(bird1.swimLength);

        Cat cat1 = new Cat("Томас", 210, 15,2);
        cat1.jumping(cat1.height);

    }
}
