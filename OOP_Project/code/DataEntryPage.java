import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DataEntryPage extends JFrame implements ActionListener {
    private JComboBox<String> jobTypeBox = new JComboBox<>(new String[]{"Installation Job", "Repair Job"});
    private JTextField idTxt = new JTextField();
    private JTextField customerTxt = new JTextField();
    private JTextField addressTxt = new JTextField();
    private JTextField costTxt = new JTextField();
    private JTextField outletsTxt = new JTextField();
    private JTextField faultTxt = new JTextField();
    private JTextArea jobListArea = new JTextArea(10, 40);

    public DataEntryPage() {
        super("Job Data Entry");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(600, 550);

        JPanel form = new JPanel(new GridLayout(7, 2));
        form.add(new JLabel("Job type"));
        form.add(jobTypeBox);
        form.add(new JLabel("Job ID"));
        form.add(idTxt);
        form.add(new JLabel("Customer name"));
        form.add(customerTxt);
        form.add(new JLabel("Address"));
        form.add(addressTxt);
        form.add(new JLabel("Cost"));
        form.add(costTxt);
        form.add(new JLabel("Outlets (Installation only)"));
        form.add(outletsTxt);
        form.add(new JLabel("Fault (Repair only)"));
        form.add(faultTxt);

        JButton addBtn = new JButton("Add Job");
        JButton backBtn = new JButton("Back to Main Page");
        addBtn.addActionListener(this);
        backBtn.addActionListener(this);
        JPanel buttons = new JPanel();
        buttons.add(addBtn);
        buttons.add(backBtn);

        JPanel top = new JPanel(new BorderLayout());
        top.add(form, BorderLayout.CENTER);
        top.add(buttons, BorderLayout.SOUTH);

        jobListArea.setEditable(false);
        for (JobInterface j : Database.getJobs()) {   // show jobs already stored
            jobListArea.append(j.toString());
        }

        add(new JLabel("Job Data Entry", SwingConstants.CENTER), BorderLayout.NORTH);
        add(top, BorderLayout.CENTER);
        add(new JScrollPane(jobListArea), BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Add Job")) {
            try {
                String id = idTxt.getText();
                String customer = customerTxt.getText();
                String address = addressTxt.getText();
                double cost = Double.parseDouble(costTxt.getText());   // may throw

                JobInterface job;
                if (jobTypeBox.getSelectedItem().equals("Installation Job")) {
                    int outlets = Integer.parseInt(outletsTxt.getText());   // may throw
                    job = new InstallationJob(id, customer, address, cost, outlets);
                } else {
                    job = new RepairJob(id, customer, address, cost, faultTxt.getText());
                }

                Database.addJob(job);
                jobListArea.append(job.toString());
                JOptionPane.showMessageDialog(this, "Add job successfully.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Wrong input. Cost and outlets must be numbers.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Some error occurred.\n" + ex);
            }
        } else if (command.equals("Back to Main Page")) {
            dispose();
        }
    }
}
