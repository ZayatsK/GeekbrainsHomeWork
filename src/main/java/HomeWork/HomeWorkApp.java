package HomeWork;
//Совршенно не понятно, что не так с Мавеном, запустить у меня его так как у Тебя в уроке не получилось,
//поэтому создавал проект по методичеке, писал код, проверял работоспособность, а затем чтобы залить на гитхаб
//копировал его в тот как ты на лекции делал.
public class HomeWorkApp {
    public static void main(String[] args) { //прописал метод main
        printThreeWords(); //вызываю метод на 3 слова

        checkSumSign(); //вызываю метод на сумму

        printColor(); // запустили метод на вывод цвета
        compareNumbers(); // метод на сравнение чисел
    }
    public static void printThreeWords() {      //создаю метод на три слова
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {     // создаю метод для двух переменных
        int a = -30; // объявил первую переменную и присвоил ей число 10
        int b = 5; // объявил вторую переменную и присвоил ей число 20
        int sum = a + b; // обьявляю переменную для сравнения

        if (sum >= 0) { // сравниванию относительно 0 чтобы определеить, что положительная
            System.out.println("Сумма положительная");
        }
        if (sum < 0) { // Делаю обратное условие
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 100;
        if (value<=0) {
            System.out.println("Красный"); // если меньше либо равно нулю выведет красный
        }
        if (value>100) {
            System.out.println("Зеленный"); // если больше 100 выведет Зеленый
        }
        else {
            System.out.println("Желтый"); // во всех остальных случаях Желтый
        }
    }
    public static void compareNumbers() {
        int a = 30; //создали переменные и присвоили значения
        int b = 20;

        if (a >= b) {
            System.out.println("a>=b"); // условие а больше либо равно б вывод a>=b
        } else {
            System.out.println("a<b"); // во всех остальных случаях a<b
        }
    }
}