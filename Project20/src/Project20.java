public class Project20 {

    /*
    public static void main(String[] args) {
        
        double m = Maximum(new double[] {20, 15, 44, 9});
        System.out.format("Max = %.2f\n", m);
        
    }
    
    public static double Maximum(double[] A) {
        
        double max = A[0];
        for(double a:A) {
            if(a>max)
                max = a;
        }
        return max;
        
    }
    */
    
    public static void main(String[] args) {
        
        double m = Maximum(20, 11, 6, 19, 32, 74, 28, 4);
        System.out.format("Max = %.2f\n", m);
        
    }
    
    public static double Maximum(double... A) { //Using "Variable-Length Argument List"
        
        double max = A[0];
        for(double a:A) {
            if(a>max)
                max = a;
        }
        return max;
        
    }
    
}