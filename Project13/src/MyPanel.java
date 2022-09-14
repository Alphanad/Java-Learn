import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        int n = 50;
        
        int w = getWidth();
        
        int h = getHeight();
        
        int i, j;
        
        for(i = 0; i <= n; i++) {
            
            j = n - i;
            
            g.setColor(Color.RED);
                        
            g.drawLine(i * w / n, 0, 0, j * h / n);

            g.setColor(Color.GREEN);
            
            g.drawLine(i * w / n, 0, w, i * h / n);            
            
            g.setColor(Color.ORANGE);
            
            g.drawLine(w, i * h / n, j * w / n, h);
            
            g.setColor(Color.BLUE);
            
            g.drawLine(j * w /n, h, 0, j * h / n);
            
        }
        
    }
    
}