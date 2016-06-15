
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Kwanrudee
 */
public class NewClass {

    public static void main(String[] args) {
        //create object
        JFrame f = new JFrame("A JFrame");
        f.setSize(250, 250);
        f.setLocation(300, 200);
        f.getContentPane().add(BorderLayout.CENTER, new JTextArea(10, 40));
        f.setVisible(true);
    }

}
