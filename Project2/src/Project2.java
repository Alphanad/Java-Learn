//format specifiers and escape sequences

public class Project2 {
    
    public static void main(String[] args) {
        
        //decimal form
        int a = 12345;
        System.out.format("The number is: %d\n", a);
        System.out.format("The number is: %8d\n", a);
        System.out.format("The number is: %-8d\n", a);
        System.out.format("The number is: %08d\n", a);
        System.out.format("The number is: %,-8d\n", a);
        System.out.format("The number is: %,08d\n", a);
        System.out.format("The number is: %+,-8d\n", a);
        System.out.format("The number is: %+,08d\n", a);
        
        //floating point form
        double b = 1234.56789;
        System.out.format("\nThe number is: %f\n", b);
        System.out.format("The number is: %.2f\n", b);
        System.out.format("The number is: %11.2f\n", b);
        System.out.format("The number is: %-11.2f\n", b);
        System.out.format("The number is: %011.2f\n", b);
        System.out.format("The number is: %,-11.2f\n", b);
        System.out.format("The number is: %,011.2f\n", b);
        System.out.format("The number is: %+,-11.2f\n", b);
        System.out.format("The number is: %+,011.2f\n", b);
        
        //string form
        String c = "Hello";
        System.out.format("\n%s\n", c); //new line
        System.out.format("%s\r \n", c); //return
        System.out.format("%s\t \n", c); //tab
        System.out.format("%s\b \n", c); //backspace
        System.out.format("%s\' \n", c); //single quotes
        System.out.format("%s\" \n", c); //double quotes
        System.out.format("%s\\ \n", c); //backslash
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch(Exception ex) {}
    }
    
}