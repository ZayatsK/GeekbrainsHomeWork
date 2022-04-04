package course2.HomeWork;

public class Human implements Runing,Jumping {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump() {
        System.out.println(this.name + "может прыгнуть на " + this.getRunDistance());

    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }

    @Override
    public void run() {

    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }
}
