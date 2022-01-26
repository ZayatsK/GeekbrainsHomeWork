package HomeWork.HomeWork6;

public class Cat extends Animals {

    int maxSwim;
    int maxRun;


    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

public void swim () {
if (this.swim > 0) {
    System.out.println("Коты не плавают");
}

}

}
