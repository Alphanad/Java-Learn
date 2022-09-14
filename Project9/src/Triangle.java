public class Triangle { 
    
    private double a;
    private double b;
    
    public Triangle(double a1, double b1) {
        
        set_A(a1);
        set_B(b1);
        
    }
    
    public double get_A() {
        
        return a;
        
    }
    
    public final void set_A(double value) { //use "final" to be unoverridable.
        
        a = Math.abs(value); //or can use "Math.max(value, 0);" to can't use negative numbers.
    
    }

    public double get_B() {
        
        return b;
        
    }
    
    public final void set_B(double value) {
        
        b = Math.abs(value);
        
    }

    public double get_C() {
        
        return Math.sqrt(a*a + b*b); //or can define a variable and return it.
        //"double c = Math.sqrt(a*a + b*b);"
        //"return c;
        
    }
        
    public double get_Theta() {
        
        return Math.atan2(b, a)*180/Math.PI;
        
    }
    
    public double get_Phi() {
        
        return Math.atan2(a, b)*180/Math.PI;
        
    }
    
    private double get_Area() {
        
        return (a*b)/2;
        
    }

    public void printInfo() {
        
        System.out.format("a: %.2f\n", get_A());
        System.out.format("b: %.2f\n", get_B());
        System.out.format("c: %.2f\n", get_C());
        System.out.format("theta: %.2f\n", get_Theta());
        System.out.format("phi: %.2f\n", get_Phi());
        System.out.format("s: %.2f\n", get_Area());

    }
    
    /*
    public static Triangle copy(Triangle t) {
        return new Triangle(t.a, t.b);
    }
    */
    
    public Triangle copy() {
        return new Triangle(a, b);
    }
    
}