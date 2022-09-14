//control structures (looping statements part 2)

import java.util.*;

public class Project6 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float n;
        String ans;
        
        while(true) { //infinite loop
            System.out.print("Enter a number: ");
            n = input.nextFloat();
            System.out.format("%.2f\t%.2f\t%.2f\n", n, Math.pow(n, 2), Math.pow(n, 3));
            System.out.print("Do you want to continue [Y/N]? \n");
            ans = input.next();
            if(!ans.toLowerCase().startsWith("y")) break; 
        } //use "break" for exit from the loop and "continue" for skip the loop
        
    }    
    
}