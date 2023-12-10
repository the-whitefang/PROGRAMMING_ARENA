import java.util.*;
public class p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your values one after one: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c ){
            System.out.println(a + ": is the Smallest Number.");
        }
        else if(b < c && b < a ){
            System.out.println(b + ": is the Smallest Number.");
        }
        System.out.println(c + ": is the Smallest Number.");
    }
}
