import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPage extends JFrame implements ActionListener {

    public MainPage() {
        super("Electrical Job Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);

        JButton addBtn = new JButton("Add Job");
        JButton searchBtn = new JButton("Search Jobs");
        JButton exitBtn = new JButton("Exit");
        addBtn.addActionListener(this);
        searchBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(addBtn);
        panel.add(searchBtn);
        panel.add(exitBtn);

        add(new JLabel("Job Management Main Menu", SwingConstants.CENTER), BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Add Job")) {
            new DataEntryPage();
        } else if (command.equals("Search Jobs")) {
            new SearchPage();
        } else if (command.equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MainPage();
    }
}
