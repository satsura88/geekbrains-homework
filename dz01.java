package lesson01;

public class dz01 {
    public static void main (String[] args){
        System.out.println(simpleMath(12, 25, 32, 2)); //проверка 1ого задания
        System.out.println(sumTrueFalse(10, 10) ); // проверка 2ого задания
        positiveOrNegative(-5);// проверка 3его задания
        sayHello("Вася"); // проверка 4ого задания
        leapYear(2020); // проверка 5ого задания

    }
    //1е задание
    public static double simpleMath(int a, int b, int c, int d){
        return  a * (b + (c / d));
    }
    //2е задание
    public static boolean sumTrueFalse(int a, int b){
        if ((a+b)>=10 && (a+b)<=20){
            return true;
        }else {
            return false;
        }
    }
    //3е задание
    public static void positiveOrNegative(int a){
        if (a>=0){
            System.out.println(a + "  это положительно число!");
        } else {
            System.out.println(a + "  это отрицательное число");
        }
   }
   //4е задание
    public static void sayHello (String name){
        System.out.println("Привет, " + name + "!");
    }
    //5е задание
    public static void leapYear(int year){
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.print(year + " этот год является високосным!");
        }else {
            System.out.print(year + " этот год не является високосным");
        }
    }
}
