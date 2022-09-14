import javax.swing.*; //Using "javax.swing.JFrame;"

public class Project12 {
    
    public static void main(String[] args) {
        
        MyPanel panel = new MyPanel();
        
        JFrame app = new JFrame();
        
        app.add(panel);
        
        app.setTitle("My Application");
        
        app.setSize(300, 300);
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        app.setVisible(true);
        
    }
    
}