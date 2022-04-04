package course2.HomeWork;
import java.util.Random;
public class Homework1 {

    // 4 задание делал не сам естественно, но было интересно разобраться
    public static void main(String[] args) {

        Random rand = new Random();
   Jumping[] jumping = new Jumping[3];
   Runing[] runing = new Runing[3];
  int distance = rand.nextInt(10);;
   int height = rand.nextInt(10);;
   jumping[0] = new Robot(" XW 9", 7, 7);
   runing[0]  = new Robot("XW 9", 7, 7);

        distance = rand.nextInt(10);;
        height = rand.nextInt(10);;
        jumping[1] = new Human(" Сергей ", 6, 6);
        runing[1]  = new Human("Сергей", 6, 6);

       distance = rand.nextInt(10);
        height = rand.nextInt(10);
        jumping[2] = new Cat(" Fluffy ", 8, 8);
        runing[2]  = new Cat(" Fluffy ", 8, 8);

        Barrier[] barriers = new Barrier[6]; // массив препятствий

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(10);;
            isRoad = rand.nextBoolean();
            if (isRoad) {                                                    //  Раставляем рандомно препятсвия
                barriers[i] = new Track(" Дорожка " + i, distance);     // и присваеиваем длину ему
            } else {
                barriers[i] = new Wall(" Стена " + i, distance);
            }
        }
        for (int i = 0; i < jumping.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].moving(jumping[i],runing[i]);

                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("Успешно");
            } else {
                System.out.println("неуспешно");
            }
        }
    }
            }





