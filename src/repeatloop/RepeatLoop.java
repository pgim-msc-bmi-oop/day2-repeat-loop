package repeatloop;
//Import APIs needed
import javax.swing.JOptionPane;

public class RepeatLoop {
    public static void main(String[] args) {
        String response;
        do {
            JOptionPane.showMessageDialog(null, "Missle Launched >>>>>>>>> !!!!!");
            response = JOptionPane.showInputDialog(null, "Enamy Stopped? (Y or N)");
        } while (response.equals("N"));
        JOptionPane.showMessageDialog(null, "No more missiles launched as enemy stopped.");
    }
}
