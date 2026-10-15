import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchPage extends JFrame implements ActionListener {
    private JComboBox<String> criterionBox = new JComboBox<>(new String[]{
            "Cost >=", "Customer name contains", "Number of outlets >=", "Fault description contains"});
    private JTextField valueTxt = new JTextField(15);
    private JTextArea resultsArea = new JTextArea(15, 50);

    public SearchPage() {
        super("Job Search");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(600, 450);

        JButton searchBtn = new JButton("Search");
        JButton backBtn = new JButton("Back to Main Page");
        searchBtn.addActionListener(this);
        backBtn.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Criterion:"));
        inputPanel.add(criterionBox);
        inputPanel.add(new JLabel("Value:"));
        inputPanel.add(valueTxt);
        inputPanel.add(searchBtn);
        inputPanel.add(backBtn);

        resultsArea.setEditable(false);
        add(new JLabel("Job Search", SwingConstants.CENTER), BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(new JScrollPane(resultsArea), BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Search")) {
            try {
                String criterion = (String) criterionBox.getSelectedItem();
                String value = valueTxt.getText().toLowerCase();
                double number = 0;
                if (criterion.equals("Cost >=") || criterion.equals("Number of outlets >=")) {
                    number = Double.parseDouble(value);          // may throw
                }

                resultsArea.setText("Results:\n");
                boolean found = false;
                for (JobInterface j : Database.getJobs()) {
                    boolean match = false;
                    if (criterion.equals("Cost >=")) {
                        match = j.getCost() >= number;                       // both types
                    } else if (criterion.equals("Customer name contains")) {
                        match = j.getCustomerName().toLowerCase().contains(value);   // both types
                    } else if (criterion.equals("Number of outlets >=")) {
                        if (j instanceof InstallationJob) {                  // only this type
                            match = ((InstallationJob) j).getNumberOfOutlets() >= number;
                        }
                    } else {
                        if (j instanceof RepairJob) {                        // only this type
                            match = ((RepairJob) j).getFaultDescription().toLowerCase().contains(value);
                        }
                    }
                    if (match) {
                        resultsArea.append(j.toString());
                        found = true;
                    }
                }
                if (!found) {
                    resultsArea.append("Not Found\n");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Wrong input. This criterion needs a number.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Some error occurred.\n" + ex);
            }
        } else if (command.equals("Back to Main Page")) {
            dispose();
        }
    }
}
