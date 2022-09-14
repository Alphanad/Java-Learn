//control structures (looping statements part 3)

import java.util.*;

public class Project7 {
    
    public static void main(String[] args) {
        
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.format("Divisors of %d:\n", n);
        int d = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.format("%d\n", i);
                d++;
            }
        }
        
        System.out.format("Number of divisors: %d\n", d);
        
        if(d == 2) {
            System.out.format("The number %d is a prime number.\n", n);
        } else {
            System.out.format("The number %d is not a prime number.\n", n);
        }
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch(Exception ex) {}
        
    }    
    
}