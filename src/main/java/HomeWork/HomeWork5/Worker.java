package HomeWork.HomeWork5;

public class Worker {

    public String fullname;
    public String positon;
    public String email;

    public int phone;
    public int salary;
    public int age;

    public void info (){
        System.out.println("ФИО " + fullname);
        System.out.println("Должность " + positon);
        System.out.println("email " + email);
        System.out.println("Телефон " + phone);
        System.out.println("Зарплата "+ salary);
        System.out.println("Возраст " + age);

    }
    public Worker(String fullname_, String positon_, String email_, int phone_, int salary_, int age_) {
        fullname = fullname_;
        positon = positon_;
        email = email_;
        phone = phone_;
        salary = salary_;
        age = age_;
    }
}
