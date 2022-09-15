//control structures (looping statements part 1)

import java.util.*;

public class Project5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
            
        System.out.print("Enter a floating point number: ");
        double x = input.nextDouble();
        int counter_1 = 0;
        
        while(x >= 1 && counter_1 < 3) {
            System.out.format("%.2f\n", x);
            x /= 2;
            counter_1++;
        }
        
        System.out.print("Enter another floating point number: ");
        double y = input.nextDouble();
        int counter_2 = 0;
        
        do { //always run onece or more
            System.out.format("%.2f\n", y);
            y /= 2;
            counter_2++;
        } while(y >= 1 && counter_2 < 3); 
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch(Exception ex) {}
        
    }    
    
}