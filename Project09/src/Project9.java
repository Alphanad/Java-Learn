public class Project9 {
    
    public static void main(String[] args) {
        
        System.out.println("Triangle T1:");
        Triangle t1 = new Triangle(3, 4);
        t1.printInfo();
        System.out.println("__________");

        System.out.println("Triangle T2:");
        Triangle t2 = new Triangle(-3, 17);
        t2.printInfo();
        System.out.println("__________");

        System.out.println("Triangle T3:");
        Triangle t3 = new Triangle(6, -23);
        t3.printInfo();
        System.out.println("__________");
        
        Triangle t4 = t3; //reference types property (use reference of value not the copy of it)
        t4.set_A(17);
        
        System.out.println("Triangle T3:");
        t3.printInfo();
        System.out.println("__________");
        
        System.out.println("Triangle T4:");
        t4.printInfo();
        System.out.println("__________");
        
        /*
        Triangle t5 = new Triangle(t3.get_A(), t3.get_B());
        Triangle t5 = Triangle.copy(t3);
        */
        
        Triangle t5 = t3.copy();
        t5.set_A(19);

        System.out.println("Triangle T3:");
        t3.printInfo();
        System.out.println("__________");
        
        System.out.println("Triangle T5:");
        t5.printInfo();
        System.out.println("__________");        
        
        System.out.print("Press enter to exit ...");
        try {System.in.read();}
        catch(Exception ex) {}
        
    }
    
}