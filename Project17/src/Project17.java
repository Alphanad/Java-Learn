import java.util.*; // Using "java.util.Random;"

public class Project17 {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        int N = 1000;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int k;
        
        for(int i=0; i < N; i++) {
            k = rnd.nextInt(6) + 1;
            switch(k) {
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
                case 5:
                    n5++;
                    break;
                case 6:
                    n6++;
                    break;
            }
        }
        
        double p1 = ((double)n1/N)*100;
        double p2 = ((double)n2/N)*100;
        double p3 = ((double)n3/N)*100;
        double p4 = ((double)n4/N)*100;
        double p5 = ((double)n5/N)*100;
        double p6 = ((double)n6/N)*100;
        
        System.out.format("Result of rolling a dice %d times:\n", N);
        System.out.format("P1 = %d/%d = %.2f%%\n", n1, N, p1);
        System.out.format("P2 = %d/%d = %.2f%%\n", n2, N, p2);
        System.out.format("P3 = %d/%d = %.2f%%\n", n3, N, p3);
        System.out.format("P4 = %d/%d = %.2f%%\n", n4, N, p4);
        System.out.format("P5 = %d/%d = %.2f%%\n", n5, N, p5);
        System.out.format("P6 = %d/%d = %.2f%%\n", n6, N, p6);
        
    }
    
}