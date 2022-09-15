import java.util.*;

public class Project8 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("For equation [a * x + b = 0]");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        
        EquationSolver.SolveEq(a, b);
        
        EquationSolver.SolveEq(1, -6, 8);
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch (Exception ex) {}
        
    }    
    
}