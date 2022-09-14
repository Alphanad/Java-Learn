public class Projec19 {
    
    public static void main(String[] args) {
        
        double[] X = {14, 11, 17, 18, 16, 10, 20, 19}; 
        
        /*
        for(int i = 0; i < X.length; i++) {
            
            System.out.format("X%d = %.2f\n", i, X[i]);
            
        }
        */
        
        /*
        int i = 0;
        for(double x:X) {
            
            System.out.format("x%d = %.2f\n", i, x);
            i++;
            
        }
        */
        
        int n = X.length;        
        System.out.format("n\t= %d\n", n);
        System.out.format("Sum\t= %.2f\n", ArraySum(X));
        System.out.format("Mean\t= %.2f\n", ArrayMean(X));
        System.out.format("Var.\t= %.2f\n", ArrayVar(X));
        System.out.format("St.D\t= %.2f\n", ArrayStd(X));
        
        System.out.print("Orginal Array :");
        ShowArray(X);
        
        ModifyArray1(X);
        System.out.print("Modify Array 1 :");
        ShowArray(X);
        
        ModifyArray2(X);
        System.out.print("Modify Array 2 :");
        ShowArray(X);
        
        ModifyElement1(X[1]);
        System.out.print("Modify Element 1 :");
        ShowArray(X);
        
        ModifyElement2(X, 1);
        System.out.print("Modify Element 2 :");
        ShowArray(X);
        
    }
    
    public static double ArraySum (double[] A) {
        
        double sum = 0;
        for(double x:A) {    
            sum += x;
        }
        return sum;
        
    }
    
    public static double ArrayMean (double[] A) {
        
        return ArraySum(A) / A.length;
        
    }
    
    public static double ArrayVar (double[] A) {
        
        double mean = ArrayMean(A);
        double variance = 0;
        for(double x:A) {
            variance += (x - mean) * (x - mean);
        }
        variance /= (A.length-1);
        return variance;
        
    }
    
    public static double ArrayStd (double[] A) {
        
        return Math.sqrt(ArrayVar(A));
        
    }
    
    public static void ModifyArray1 (double[] A) { //Send by value. (Array didn't change)
        
        for(double a:A) {
           a *= 2; 
        }
        
    }
    
    /*
    public static void ModifyArray1 (double[] A) { //Using "i" to change values in array.
        int i = 0;
        for(double a:A) {
           A[i] *= 2; 
           i++;
        }
        
    }
    */
    
    public static void ModifyArray2 (double[] A) { //Send by reference. (Array change)
        
        for(int i = 0; i<A.length; i++) {
            A[i] *= 2;
        }
        
    }    
    
    public static void ModifyElement1 (double a) {
        
        a *= 2;
        
    }
    
    public static void ModifyElement2 (double[] A, int i) {
        
        A[i] *= 2;
        
    }
    
    public static void ShowArray (double[] A) {
        
        for(double a:A) {
            System.out.format("%.2f ", a);
        }
        System.out.print("\n");
        
    }
    
}