package course2.HomeWork;

public class Robot implements Runing, Jumping{

    private String name; //Поле имени
    private int runDistance; // поле для дистанции бега
    private int jumpHeigth; // поле для дистанции прыжка

    public Robot(String name, int runDistance, int jumpHeigth) { // конструктор объекта
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeigth = jumpHeigth;
    }

    @Override
    public void jump() {
        System.out.println("Робот " + this.name + "прыгает на " + this.getJumpHeight());
//метод прыжка объекта имя,  на сколько прыгает
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeigth;   // геттер высоты прыжка
    }

    @Override
    public void run() {
        System.out.println("Робот " + this.name + "может пробежать " + this.getRunDistance());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }
}
