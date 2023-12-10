// Program to print the Prime numbers between 1 to n

import java.util.*;
public class p2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Range: ") ;
        int n = sc.nextInt();
        for(int i =1;i<n;i++){
            int factors =0;
            for(int j =1; j<=i;j++) {
                if (i % j == 0) {
                    factors += 1;
                }
            }
            if (factors == 2){
                System.out.println(i) ;
            }
        }
    }
}
