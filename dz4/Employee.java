package lesson04;

public class Employee {
    private String name;
    private String position;
    private String phoneNumber;
    private int pay;
    private int age;
    private int ID;
    private static int temp = 1;


    Employee(String name, String position, String phoneNumber, int pay, int age){
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
        this.ID = temp;
        temp++;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPay() {
        return pay;
    }

    public int getAge() {
        return age;
    }

    public String getFullInfo(){
        return "\n ФИО: " + name + "\n Должность: " + position + "\n Номер телефона: " + phoneNumber + "\n Заработная плата " + pay + "\n Возраст: " + age + "\n Индификационный номер: " + ID;
    }

    public void setPay() {
        if(age > 35) {
            pay += 10000;
        }
    }

    public int getID() {
        return ID;
    }
}


