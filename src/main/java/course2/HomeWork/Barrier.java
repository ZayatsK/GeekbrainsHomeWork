package course2.HomeWork;

public abstract class Barrier {
   private String name;

    public Barrier(String name) { // конструктор препятсвия
        this.name = name;
    }

    public String getName() {
        return name;
            }


    protected abstract boolean moving(Jumping jumping, Runing runing); // метод движения

}
