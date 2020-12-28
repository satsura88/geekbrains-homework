package lesson05.dz5.animals;

import lesson05.dz5.Animal;

public class LittleDog extends Dog {
    public LittleDog(String name, double length, double swimLength, double height) {
        super(name, length, swimLength, height);
    }

    @Override
    public void running(double length){
        double max = 400;
        if (length <= max){
            System.out.println(name + " побежал(а)!");
        }else {
            System.out.println(name + " не побежит!");
        }
    }
}
