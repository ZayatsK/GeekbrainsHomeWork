package HomeWork.HomeWork5;

import com.sun.corba.se.impl.ior.WireObjectKeyTemplate;

public class Worker {

    public String fullname;
    public String positon;
    public String email;

    public int phone;
    public int salary;
    public int age;

    public void info() {
        System.out.println("ФИО " + fullname);
        System.out.println("Должность " + positon);
        System.out.println("email " + email);
        System.out.println("Телефон " + phone);
        System.out.println("Зарплата " + salary);
        System.out.println("Возраст " + age);

    }

    public Worker(String fullname, String positon, String email, int phone, int salary, int age) {
        this.fullname = fullname;
        this.positon = positon;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Worker(String fullname, int age) { //Специальный конструктор из двух полей, для 4 и 5 задания
        this.fullname = fullname;
        this.age = age;
    }

    public void testAge(String fullname, int age) { //Сомневаюсь что будет работать

        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Ваня", 30);
        workArray[1] = new Worker("Петя", 40);
        workArray[2] = new Worker("Гриша", 50);
        workArray[3] = new Worker("Леша", 60);
        workArray[4] = new Worker("Андрей", 70);

        for (int i = 0; i < workArray.length; i++) {
            if (this.age > 40) {
                System.out.println("Старше 40" + workArray[i]);
            }
        }
    }
}
