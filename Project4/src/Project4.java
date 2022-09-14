//control structures (conditional statements)

import java.util.*;

public class Project4 {
    
    public static void main(String[] args) {
        
        System.out.print("Please enter an integer number [1 to 7]: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String day, type = "";
        
        if(n == 1) { //"if (n == 1) day = Saturday;"
            day = "Saturday";
        } else if(n == 2) {
            day = "Sunday";
        } else if(n == 3) {
            day = "Monday";
        } else if(n == 4) {
            day = "Tuesday";
        } else if(n == 5) {
            day = "Wednesday";
        } else if(n == 6) {
            day = "Thursday";
        } else if(n == 7) {
            day = "Friday";
        } else {
            day = "";
        }
        
        switch(n) {
            case 1:
            case 3:
            case 5:
                type = "Even";
                break;
            case 2:
            case 4:
            case 6:
                type = "Odd";
                break;
        }
        
        if(!day.equals("")) { //"day != "" " is not recommended
            System.out.format("The #%d day in week is %s.\n", n, day);
            if(!type.isEmpty()) { //same of "!day.equals("")"
                System.out.format("%s is an %s day.\n", day, type);
            } else {
                System.out.format("%s is not Even or Odd day.\n", day);
            }
        } else {
            System.out.println("You have entered an invalid number.");
        }
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch(Exception ex) {}

    }
    
}