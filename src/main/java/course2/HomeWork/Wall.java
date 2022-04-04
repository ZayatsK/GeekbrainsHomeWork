package course2.HomeWork;

public class Wall extends Barrier {

    private int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected boolean moving(Jumping jumping, Runing runing) {
        System.out.println("Стенка" + super.getName() + "высота " + this.height);
        jumping.jump();
        if (getHeight() <= jumping.getJumpHeight()) {
            System.out.println(" перепрыгнул !");
            return true;
        } else {
            System.out.println(" не получилось");
            return false;


        }
    }
}