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
    public Worker(String fullname, String positon, String email, int phone, int salary, int age) {
        this.fullname = fullname;
        this.positon = positon;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
}
