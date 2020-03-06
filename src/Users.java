import javax.swing.*;

public class Users extends JFrame {
    private JPanel userMainPanel;

    public Users(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(userMainPanel);
        this.pack();
        // here the event handlers will be added
    }
}
