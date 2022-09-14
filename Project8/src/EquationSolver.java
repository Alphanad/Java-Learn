public class EquationSolver {
    
    public static void SolveEq(double a, double b) { //for "a * x + b = 0"
        
        double x = (-b)/a;
        System.out.format("%.2f * x + %.2f = 0\nx : %.2f\n\n", a, b, x);
        
    }
    
    public static void SolveEq(double a, double b, double c) {
        
        System.out.println("For equation : [a * x ^ 2 + b * x + c = 0]");
        double delta = (b*b) - (4*a*c);
        if(delta > 0) {
            
            // Two real roots
            double x1 = ((-b)+Math.sqrt(delta))/(2*a);
            double x2 = ((-b)-Math.sqrt(delta))/(2*a);
            System.out.format
                    ("%.2f * x ^ 2 + %.2f * x + %.2f = 0\nx1 : %.2f\nx2 : %.2f\n\n",
                    a, b, c, x1, x2);
            
        }else if(delta==0) {
            
            //One real root
            double x = (-b)/(2*a);
            System.out.format
                    ("%.2f * x ^ 2 + %.2f * x + %.2f = 0\nx : %.2f\n\n",
                    a, b, c, x);
            
        }else {
            
            // No real roots
            System.out.println("The equation has not any real roots.\n");
        
        }
        
    }
    
}