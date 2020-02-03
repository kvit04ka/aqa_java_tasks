package lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом do () while
*/

public class Task4 {

    public static void main(String[] args) {
        String s = "Natalia";
        int i = 1;
        do {
            for (int j = 0; j < 9; j++) {
                System.out.print(s + " ");
            }
            i++;
            System.out.println(s);
        } while (i < 10);


    }
};

