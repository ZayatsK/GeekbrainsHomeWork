package HomeWork;

import java.net.InetAddress;

public class HomeWork_2 {
    public static void main(String[] args) {
        checkPositive(-10);
summ(2,8);
positive(-10);
text("Stroka", 4);
god(0);


    }

// Первое задание // Не понимаю почему булиан не выводит в консоль значение или не должен? Это делает только println?
    public static boolean summ(int a, int b) {
if (a+b<10) {
        return false; }
else if (a+b>20) {
    return false; }
    else {
       return true; }
    }
// Второе задание
public static void positive(int a){
        if (a<0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }

}

// Третье задание

    public static boolean checkPositive (int a) {
if (a<0){
return true;
}
else {
return false; }
    }

    // Четертое задание
    public static void text (String str, int a){
for (a = a; a>0; a-- ) {
    if (a<=0) {
        break; }
    System.out.println(str);
}
    }

    //Пятое задание проба

        public static boolean god (int a){

        for (a = 0; a <= 400; a++) {
            if ((a%4)==0) {
                return true;}
            else if ((a%100)==0) {
                return false;}
            else if ((a%400)==0) {
                return true;
            }

            }
            return false;
        }
        }



