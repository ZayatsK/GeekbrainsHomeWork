package HomeWork.HomeWork5;

public class main {
    public static void main(String[] args) {

        Worker worker = new Worker("Валера", "Инженер", "valera@ya.ru", 70579, 10000, 30);
        worker.info();
        // Worker.info(); нельзя так как не статический!
    }
}
