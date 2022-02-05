package HomeWork.HomeWork7;
// В работе , не успел сделать
public class Cats {
   private String name;
   private int hungry;
   public boolean isSatiety = false ;


    public int getHungry() {
        return hungry;

    }

    public Cats(String name, int hungry) {
        this.name = name;
        this.hungry = hungry;
            }

    public void eat(Plate p) {

        if(this.isSatiety == false && p.getFood() >= hungry) {
            p.decreaseFood(this.hungry);
            isSatiety = true;
            System.out.println("Кот покушал на " + hungry);
        }
            //if (p.getFood() <= hungry) {
              //  isSatiety = false;
             //   System.out.println(" Нехватает еды в тарелке покушать " );
           // }
            else if (this.isSatiety == true) {
                System.out.println("Кот сыт ");
            } else {
            System.out.println( "в тарелке не хватает еды ");
        }
    }
 }







