package HomeWork.HomeWork6;

public class Animals {
    String name;
    int run;
    int swim;

    
    public Animals(String name, int run, int swim) {
        System.out.println("Это животное "+ name + " Дистнация бега = " + run + " Дистанция плавания =  " + swim);
        this.name = name;
        this.run = run;
        this.swim = swim;

    }



    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}









