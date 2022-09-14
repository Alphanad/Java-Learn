import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel{
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        g.setColor(Color.CYAN);
        g.fillRect(20, 20, 200, 150);
        
        g.setColor(Color.PINK);
        g.drawRect(20, 20, 200, 150);
        
        g.setColor(Color.ORANGE);
        g.fillOval(230, 20, 150, 200);
        
        g.setColor(Color.GREEN);
        g.drawOval(230, 20, 150, 200);
        
        g.setColor(Color.RED);
        g.fillOval(20, 180, 150, 150);

        g.setColor(Color.YELLOW);
        g.drawOval(20, 180, 150, 150);
        
        g.setColor(Color.GREEN);
        g.fillRect(180, 230, 150, 150);
        
        g.setColor(Color.ORANGE);
        g.drawRect(180, 230, 150, 150);
        
        g.setColor(Color.BLUE);
        g.drawString("Welcome to Java!", 155, 205);
        
    }
    
}