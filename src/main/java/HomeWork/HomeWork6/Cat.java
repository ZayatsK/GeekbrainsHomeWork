package HomeWork.HomeWork6;

public class Cat extends Animals {

    int maxSwim;
    int maxRun;


    public Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    public void run(String name, int run, int maxRun) {
        this.maxRun = maxRun;
        this.name = name;
        this.run = run;

        if (run <= maxRun && run > 0) {
            System.out.println(name + " пробежал(а) " + run + " метров ");
        } else if (run > maxRun) {
            System.out.println(name + " пробежал(а) " + maxRun + " и устал ");
        }
        if (run == 0) {
            System.out.println(name + " не бежит ");
        }
    }

    public void swim(String name, int swim, int maxSwim) {
        this.name = name;
        this.maxSwim = maxSwim;
        this.swim = swim;

        if (swim <= maxSwim && swim > 0) {
            System.out.println(name + " проплыл(а) " + swim + " метров ");
        } else if (swim > maxSwim) {
            System.out.println(name + " проплыл(а) " + maxSwim + " и устал(а) ");
        }
        if (swim == 0) {
            System.out.println(name + " не плывет ");
        }
        if (maxSwim == 0) {
            System.out.println(name + " не умеет плавать ");

        }
    }
}




