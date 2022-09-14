import javax.swing.*;

public class Project13 {
    
    public static void main(String[] args) {
        
        MyPanel panel = new MyPanel();
        
        JFrame app = new JFrame();
        
        app.add(panel);
        
        app.setTitle("Intersting Lines");
        
        app.setSize(500, 500);
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.setVisible(true);
        
    }
    
}