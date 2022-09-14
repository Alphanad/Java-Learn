import javax.swing.*; //Using "javax.swing.JOptionPane;"

public class Project11 {
    
    public static void main(String[] args) {
        
        String message, ans = JOptionPane.showInputDialog("Enter a number:"); //For inputs.
        
        int n = Integer.parseInt(ans); //Convert String number to an integer.
        
        if(n % 2 == 0) message = String.format("%d is an Even number.", n);
        
        else message = String.format("%d is an Odd number.", n);
        
        JOptionPane.showMessageDialog(null,
                                      message,
                                      "Result",
                                      JOptionPane.INFORMATION_MESSAGE); //For outputs.        
    }
    
}