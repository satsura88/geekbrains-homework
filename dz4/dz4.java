package lesson04;

public class dz4 {

    public static void main (String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Трушаков Иван Генадьевич", "Преподаватель Охраны Труда", "+375446589124", 1000, 57);
        employees[1] = new Employee("Кришин Валерий Олегович", "Охранник", "+375335489647", 800, 25);
        employees[2] = new Employee("Заступин Дмитрий Валерьянович", "Директор", "+375254569874", 3000, 41);
        employees[3] = new Employee("Шаповалова Юлия Алексеевна", "Бухгалтер", "+375291285497", 2000, 38);
        employees[4] = new Employee("Богданов Артём Леонидович", "Системный Администратор", "+375334589621", 1500, 21);

//        System.out.println(employees[2].getName() + " " + employees[2].getPosition());

//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getAge() > 40)
//                System.out.println(employees[i].getFullInfo());
//        }

        for (int i = 0; i < employees.length; i++) {
            employees[i].setPay();
            System.out.println(employees[i].getFullInfo());
        }
    }
}
