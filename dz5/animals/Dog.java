package lesson05.dz5.animals;

import lesson05.dz5.Animal;

public class Dog extends Animal {

    public Dog(String name, double length, double swimLength, double height) {
        super(name, length, swimLength, height);
    }

    @Override
    public void running(double length){
        double max = 600;
        if (length <= max){
            System.out.println(name + " побежал(а)!");
        }else {
            System.out.println(name + " не побежит!");
        }
    }

    @Override
    public void swimming (double swimLength){
        double max = 10;
        if (length <= max){
            System.out.println(name + " поплыл(а)!");
        }else {
            System.out.println(name + " не поплывёт!");
        }
    }

    @Override
    public void jumping (double height){
        double max = 0.5;
        if (height <= max){
            System.out.println(name + " перепрыгнул(а)!");
        }else {
            System.out.println(name + " не перепрыгнет!");
        }
    }
}
