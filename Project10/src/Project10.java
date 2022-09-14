public class Project10 {
    
    public static void main(String[] args) {
        
        String s = "Welcome to java!";
        System.out.format("String is: %s\n", s);
        System.out.format("Lenght: %d\n", s.length());
        System.out.format("IsEmpty: %s\n", s.isEmpty());
        System.out.format("Char in position 3: %s\n", s.charAt(2));
        System.out.format("Lower case: %s\n", s.toLowerCase());
        System.out.format("Upper case: %s\n", s.toUpperCase());
        System.out.format("First space index: %d\n", s.indexOf(' '));
        System.out.format("'Java' index: %d\n", s.indexOf("Java"));
        System.out.format("Ends with '!': %s\n", s.endsWith("!"));
        System.out.format("Ends with '.': %s\n", s.endsWith("."));
        
        int x = 10; //primitive data types property (use a copy of value not the reference of it)
        int y = x;
        x++;
        System.out.format("x = %d\ny = %d\n", x, y);
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch(Exception ex) {}
        
    }   
    
}