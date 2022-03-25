package HomeWork.HomeWork7;

public class testApp {

    public static void main(String[] args) {

        //Создаем объекты

        Cats[] catsArray = new Cats[5];
        catsArray[0] = new Cats("Вася", 10);
        catsArray[1] = new Cats("Барсик", 20);
        catsArray[2] = new Cats("Лешка", 15);
        catsArray[3] = new Cats("Рыжик", 25);
        catsArray[4] = new Cats("Пушок", 29);
        Plate plate = new Plate(100);

        //вызываем методы
       plate.info();
        for (Cats cats : catsArray) {
            cats.eat(plate);
        }
        plate.plusFood(100);
        //cats.eat(plate);
        plate.info();
    }
}
