package main.java.lesson1;

 hometask3


 master
public class Task2 {

    public static void main(String[] args) {
        String s = "Natalia";
         for(int i = 0; i < 5; i++) {
              for(int j = 0; j < 9; j++) {
              System.out.print(s+" ");
           }
            System.out.println(s);
        }
    }
    public static String namePrint () {
        String name = "Natalia";
        String str = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                str += name + " ";
            }
            str += "\n";
        }
        return str;
    }

}


