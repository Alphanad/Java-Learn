//operators

public class Project3 {
    
    public static void main(String[] args) {
        
        //arithmetic operators
        System.out.println(2+6);
        System.out.println(18-7);
        System.out.println(3*5);
        System.out.println(71/9);
        System.out.println(14%2);
        System.out.print("\n");
        
        //assignment operators
        int n = 10;
        System.out.println(n);
        
        //compound assignment operators
        System.out.println(n += 2); //n = n + 2
        System.out.println(n -= 2); //n = n - 2
        System.out.println(n *= 2); //n = n * 2
        System.out.println(n /= 2); //n = n / 2
        System.out.println(n %= 2); //n = n % 2
        
        //prefix and postfix assignment operators
        System.out.println(++n); //n = n + 1 (prefix)
        System.out.println(n++); 
        System.out.println(n--); //n = n - 1 (postfix)
        System.out.println(--n); 
        System.out.print("\n"); 

        //relational operators
        System.out.println(n < 1);
        System.out.println(n <= -1); 
        System.out.println(n > -1);
        System.out.println(n >= 1);
        System.out.println(n == 0);
        System.out.println(n != 0);
        System.out.print("\n");
        
        //logical operators
        System.out.println(n > -1 && n < 1);
        System.out.println(n > 1 || n < -1);
        boolean m = false;
        System.out.println(!m);
        System.out.print("\n");
        
        //conditional operators
        System.out.println((n > 1 || m == false)?"true":"false");
        System.out.println((n > -1 && m == true)?"true":"false");
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch(Exception ex) {}
        
    }   
    
}