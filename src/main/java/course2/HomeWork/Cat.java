package course2.HomeWork;


public class Cat implements Runing, Jumping {

    private String name;
    private int jumpHeight;
    private int runDistance;

    public Cat(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void run() {
        System.out.println("Кот" + this.name + " может бежать на " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Кот" + this.name + "может прыгнуть на " + this.getJumpHeight());
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }
}
