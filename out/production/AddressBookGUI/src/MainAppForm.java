import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainAppForm extends JFrame{
    private JButton buttonUsers;
    private JButton buttonContacts;
    private JButton buttonPhones;
    private JPanel mainPanel;

    public MainAppForm(String title, String url) {
        super(title);

        // this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();



        buttonUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame userFrame = new DisplayUsersData("Fetching Users Info From DataBase", url);
            }
        });
        buttonContacts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame contactFrame = new DisplayContactsData("Fetching Contacts Info From DataBase", url);
            }
        });
        buttonPhones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame phoneFrame = new DisplayPhonesData("Fetching Phones Info From DataBase", url);
            }
        });
    }
}
