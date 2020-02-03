
package lesson1;

/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
public class Task5 {
    public static void main(String[] args) {
        //System.out.println(reverse("Hello world!!!"));
        String str = "Hello world!!!";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println(reverse);


    }
};
