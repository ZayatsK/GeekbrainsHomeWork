package course2.HomeWork;


public class Track extends Barrier {
    private int length;

    public Track(String name, int length) {
        super(name);
        this.length = length;

    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Jumping jumping, Runing runing) { // преопределил абстрактное движение

        System.out.println(" Дорожка " + super.getName() + " длина " + this.length);
        runing.run(); // интерфейс => побежали
        if (getLength() <= runing.getRunDistance()) {  //если длина дорожки <= макс дистанции объекта то
            System.out.println("Получилось! ");
            return true;
        } else {
            System.out.println("Неполучилось");
            return false;
        }
    }
}
