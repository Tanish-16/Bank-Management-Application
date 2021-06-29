package bankapp;


import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carl
 */
public class AddAccountMenu extends javax.swing.JDialog {

    private Bank bank;
    private Customer customer;

    /**
     * Creates new form AddAccountMenu
     */
    public AddAccountMenu(java.awt.Frame parent, boolean modal, Bank bank) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.bank = bank;
        customer = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        ssnLabel = new javax.swing.JLabel();
        ssnField = new javax.swing.JTextField();
        depositLabel = new javax.swing.JLabel();
        depositField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        typeField = new javax.swing.JComboBox();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Account Menu");
        getContentPane().setLayout(new java.awt.GridLayout(6, 2, 5, 5));

        firstNameLabel.setForeground(new java.awt.Color(82, 87, 93));
        firstNameLabel.setText("First Name:");
        getContentPane().add(firstNameLabel);
        getContentPane().add(firstNameField);

        lastNameLabel.setForeground(new java.awt.Color(82, 87, 93));
        lastNameLabel.setText("Last Name:");
        getContentPane().add(lastNameLabel);
        getContentPane().add(lastNameField);

        ssnLabel.setForeground(new java.awt.Color(82, 87, 93));
        ssnLabel.setText("Phone Number:");
        getContentPane().add(ssnLabel);
        getContentPane().add(ssnField);

        depositLabel.setForeground(new java.awt.Color(82, 87, 93));
        depositLabel.setText("Initial Deposit:");
        getContentPane().add(depositLabel);
        getContentPane().add(depositField);

        typeLabel.setForeground(new java.awt.Color(82, 87, 93));
        typeLabel.setText("Account Type:");
        getContentPane().add(typeLabel);

        typeField.setBackground(new java.awt.Color(253, 219, 58));
        typeField.setForeground(new java.awt.Color(82, 87, 93));
        typeField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Checking", "Savings", "Loan" }));
        typeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeFieldActionPerformed(evt);
            }
        });
        getContentPane().add(typeField);

        okButton.setBackground(new java.awt.Color(81, 99, 101));
        okButton.setForeground(new java.awt.Color(246, 244, 230));
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);

        cancelButton.setBackground(new java.awt.Color(81, 99, 101));
        cancelButton.setForeground(new java.awt.Color(246, 244, 230));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        StringBuilder warnings = new StringBuilder();
        String firstName = "", lastName = "", ssn = "", depositString = "",LoanType="";
        double amount = 0, roi=0, LAmt=0;
        int timep=0;
        
        //Verify first name field
        if (firstNameField.getText().isEmpty()) {
            warnings.append("First name must not be empty.\n");
        } else {
            firstName = firstNameField.getText();
        }
        //Verify last name field
        if (lastNameField.getText().isEmpty()) {
            warnings.append("Last name must not be empty.\n");
        } else {
            lastName = lastNameField.getText();
        }
        if (!ssnField.getText().matches("(\\d{3}-?){2}\\d{4}")) {
            warnings.append("Phone Number must be 10 digits\n");
        } else {
            ssn = ssnField.getText().replace("-", "");
        }
        //Verify initial deposit
        if (depositField.getText().isEmpty()) {
            warnings.append("Initial deposit must be entered.");
        } else {
            try {
                amount = Bank.round(Double.parseDouble(depositField.getText()), 2);
            } catch (NumberFormatException ex) {
                warnings.append("Initial deposit must be a number.");
            }
        }
        if (warnings.length() > 0) {
            JOptionPane.showMessageDialog(this, warnings.toString(), "Input Warnings", JOptionPane.WARNING_MESSAGE);
        } else {
            Account account = null;
            if (typeField.getSelectedItem().toString() == "Checking") {
                if (amount >= 100) {
                    account = new Checking(amount);
                } else {
                    warnings.append("Initial deposit must be at least ₹100 for Checking accounts.");
                }
            } else if (typeField.getSelectedItem().toString() == "Savings") {
                if (amount >= 50) {
                    account = new Savings(amount);
                } else {
                    warnings.append("Initial deposit must be at least ₹50 for Savings accounts.");
                }
            }
            else if (typeField.getSelectedItem().toString() == "Loan") {
                if (amount ==0) {
                    account = new Loan(LAmt, roi, timep);
                } else {
                    warnings.append("No Initial deposit required for Loan accounts.");
                }
            }
            if (account != null) {
                customer = new Customer(firstName, lastName, ssn, account,LoanType, LAmt ,roi,timep);
                bank.addCustomer(customer);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, warnings.toString(), "Input Warnings", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void typeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeFieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField depositField;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField ssnField;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JComboBox typeField;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    Customer getCustomer() {
        return customer;
    }
}
