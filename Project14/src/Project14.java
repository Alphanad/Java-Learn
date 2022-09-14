import javax.swing.*;

public class Project14 {
    
    public static void main(String[] args) {
        
        MyPanel panel = new MyPanel();
        
        JFrame app = new JFrame();
        
        app.add(panel);
        
        app.setTitle("Shapes");
        
        app.setSize(420, 450);
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.setVisible(true);
        
    }
    
}