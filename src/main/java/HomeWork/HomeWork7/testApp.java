package HomeWork.HomeWork7;

public class testApp {

    public static void main(String[] args) {

        //Создаем объекты

        Cats cats = new Cats("Бублик", 100);
        Plate plate = new Plate(-100);

        //вызываем методы
        plate.info();
        cats.eat(plate);
        plate.info();
    }
}
