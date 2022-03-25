package HomeWork.HomeWork7;



public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
        if (this.food <= 0) {
            this.food = 0;
            System.out.println("Тарелка пуста");
        }
    }



    public void info() {
        System.out.println("Количество еды в тарелке " + this.food); // можно заместо фуд писать this
    }

    public void decreaseFood(int n) {
        this.food = this.food - n;
        if (this.food < 0) {
            this.food = 0;
        }

    }

    public void plusFood (int plus) {
        this.food = this.food + plus;
        System.out.println("После пополнения в тарелке лежит ");

    }


}
