import java.util.*;

public class sum {
    public static void main(String args[]) {

        /*int a = 10;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);*/

        
        Scanner sc = new Scanner(System.in);


        /*String input = sc.next();
        System.out.println(input);  -------------- this only prints the first
        word and could not print the other words.*/

        /*String input = sc.nextLine();
        System.out.println(input);  -------------this is for the sentences phrases
        and para where next line is needed*/

        /*String input = sc.nextInt();
        System.out.println(input);*/

        /* Inputs in JAVA
         next
         nextLine
         nextInt
         nextByte
         nextFloat
         nextDouble
         nextBoolean
         nextShort
         nextLong
         */

         int a = sc.nextInt();
         int b = sc.nextInt();
         int sum = a+b;
         System.out.println(sum);

    }
}
