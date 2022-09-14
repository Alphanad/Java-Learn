import java.awt.*; //Using "java.awt.Graphics;" and "java.awt.Color;"
import javax.swing.*; //Using "javax.swing.JPanel;"

public class MyPanel extends JPanel {
    
    @Override
    
    public void paintComponent (Graphics g) {
        
        super.paintComponent(g);
        
        int w = getWidth();

        int h = getHeight();
        
        g.setColor(Color.ORANGE);
        
        g.drawLine(0, 0, w, h);
        
    }
    
}