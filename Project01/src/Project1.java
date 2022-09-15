//primitive data types

public class Project1 {
    
    public static void main(String[] args) {
                
        //integer
        byte b = 127; //8-Bit [-128,...,+127]
        System.out.println(b);
        
        short s = 32767; //16-Bit [-32768,...,+32767]
        System.out.println(s);
        
        int i = 2147483647; //32-Bit [-2147483648,...,+2147483647]
        System.out.println(i);
        
        long l = 9223372036854775807L; //64-Bit [-9223372036854775808,...,+9223372036854775807]
        System.out.println(l);
                
        char c1 = 'a'; //16-Bit
        System.out.println(c1);
        
        char c2 = 65;
        System.out.println(c2);
        
        //floating point
        float f = 123.456f; //32-Bit
        System.out.println(f); 
        
        double d = 12345.678910; //64-Bit
        System.out.println(d);
        
        //other
        boolean b1 = true; //true or false
        System.out.println(b1);
        
        boolean b2 = false;
        System.out.println(b2);
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch(Exception ex) {}
                
    }
    
}