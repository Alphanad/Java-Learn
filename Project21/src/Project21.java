import java.util.*; //Using "java.util.Arrays;"

public class Project21 {

    public static void main(String[] args) {
        
        double[] A = {10, 20, 50, 15, 26, 80, 12, 90, 25, 35, 75};
        
        double[] B = Arrays.copyOf(A, A.length + 5);
        
        //System.out.format("A = %s\n", A);
        
        System.out.println("Before Sort: ");
        System.out.format("A = %s\n", Arrays.toString(A));
        
        Arrays.sort(A);
        
        System.out.println("After Sort: ");
        System.out.format("A = %s\n", Arrays.toString(A));
        
        double a = 26;
        int index = Arrays.binarySearch(A, a);
        System.out.format("A[%d] = %.2f\n", index, a);
        
        System.out.format("B = %s\n", Arrays.toString(B));
        
    }
    
}