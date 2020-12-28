package lesson05.dz5.animals;

import lesson05.dz5.Animal;

public class Horse extends Animal {

    public Horse(String name, double length, double swimLength, double height) {
        super(name, length, swimLength, height);
    }

    @Override
    public void running(double length){
        double max = 1500;
        if (length <= max){
            System.out.println(name + " поскакал(а)!");
        }else {
            System.out.println(name + " не поскачет!");
        }
    }

    @Override
    public void swimming (double swimLength){
        double max = 100;
        if (swimLength <= max){
            System.out.println(name + " поплыл(а)!");
        }else {
            System.out.println(name + " не поплывёт!");
        }
    }

    @Override
    public void jumping (double height){
        double max = 3;
        if (height <= max){
            System.out.println(name + " перепрыгнул(а)!");
        }else {
            System.out.println(name + " не перепрыгнет!");
        }
    }
}
