public class Project23 {
    
    public static void main(String[] args) {
        
        int q;
        try {
            q = Divide(10, 2);
            System.out.format("q = %d\n", q);
        }
        catch (Exception ex) {
            System.out.println("Somehing went wrong.");
            System.out.format("Exception: %s\n", ex);
        }
        finally {
            System.out.println("Finally Block!!!");
        }
        
    }
    
    public static int Divide(int a, int b) {
        return a/b;
    }
    
}