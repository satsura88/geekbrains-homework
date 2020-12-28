package lesson05.dz5.animals;

import lesson05.dz5.Animal;

public class Bird extends Animal {

    public Bird(String name, double length, double swimLength, double height) {
        super(name, length, swimLength, height);
    }

    @Override
    public void running(double length){
        double max = 5;
        if (length >= max){
            System.out.println(name + " побежал(а)!");
        }else {
            System.out.println(name + " не побежит!");
        }
    }

    @Override
    public void swimming (double swimLength){
        System.out.println("Птицы не умеют плавать!");
    }

    @Override
    public void jumping (double height){
        double max = 0.2;
        if (height <= max){
            System.out.println(name + " перепрыгнул(а)!");
        }else {
            System.out.println(name + " не перепрыгнет!");
        }
    }
}
