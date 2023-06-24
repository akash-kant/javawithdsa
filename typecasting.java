import java.util.*;
public class typecasting {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //float a = 25.12f;
        //int b =a;
        //System.out.println(b);
        //error: incompatible types: possible lossy conversion from float to int
        //int b =a;

        float a = 25.12f;
        int b =(int)a;
        System.out.println(b);
    }
    
}
