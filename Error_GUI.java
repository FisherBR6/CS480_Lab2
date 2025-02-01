import javax.swing.*;
import java.awt.*;

public class Error_GUI {
    private JPanel panel1;
    private JLabel errorVal;
    JFrame frame = new JFrame();

    public void buildGuiPanel() {
        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        errorVal = new JLabel("ERROR. Invalid input. Please try again.");
        panel1.add(errorVal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setContentPane(panel1);
        frame.setVisible(true);
    }

}
