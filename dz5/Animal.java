package lesson05.dz5;

public abstract class Animal {

    protected String name;
    protected double length;
    protected double swimLength;
    protected double height;

    public Animal(String name, double length, double swimLength, double height) {
        this.name = name;
        this.length = length;
        this.swimLength = swimLength;
        this.height = height;
    }

    abstract protected void running (double length);
    abstract protected void swimming (double swimLength);
    abstract protected void jumping (double height);

    //    public Animal(String name, double run, double swim, double jump) {
//        this.name = name;
//        this.run = run;
//        this.swim = swim;
//        this.jump = jump;
//    }
//
//    abstract protected void running (double runDistance){
//        if (run >= runDistance){
//            System.out.println(name + " пробежал(а) " + runDistance);
//        } else {
//            System.out.println(name + " не пробежит");
//        }
//    }
//
//    abstract protected void swimming (double swimDistance){
//        if (swim >= swimDistance){
//            System.out.println(name + " проплыл(а) " + swimDistance);
//        } else {
//            System.out.println(name + " не проплывёт (не умеет плавать)");
//        }
//    }
//
//    protected void jumping (double jumpDistance){
//        if (jump >= jumpDistance){
//            System.out.println(name + " подпрыгнул(а) " + jumpDistance);
//        } else {
//            System.out.println(name + " не допрыгнет");
//        }
//    }
}
