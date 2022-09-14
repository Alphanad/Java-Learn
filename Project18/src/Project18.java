import java.util.*; // Using "java.util.Random;"

public class Project18 {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        int S = 12;
        int N = 1000;
        int n[] = new int[S + 1];
        double p[] = new double[S + 1];
        int k;
        
        for(int i=0; i < N; i++) {
            k = rnd.nextInt(S) + 1;
            n[k]++;
        }
        
        System.out.format("Result of rolling a dice %d times:\n", N);

        for (int j = 1; j < S+1; j++) {
            p[j] = ((double)n[j] / N) * 100;
            System.out.format("P%d = %d/%d = %.2f%%\n", j, n[j], N, p[j]);
        }
        
    }
    
}