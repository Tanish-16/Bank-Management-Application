package bankapp;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainMenu extends javax.swing.JFrame {

    private Bank bank;
    private String saveLocation = null;
    private final DefaultTableModel model;
    private PrintReport window;

    
    public MainMenu() {
        initComponents();
        setLocationRelativeTo(null);
        bank = new Bank();
        model = (DefaultTableModel) accountTable.getModel();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new javax.swing.JPanel();
        addAccountButton = new javax.swing.JButton();
        removeAccountButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        TakeLoan = new javax.swing.JButton();
        PrintReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Application");
        setBackground(new java.awt.Color(246, 244, 230));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contentPanel.setBackground(new java.awt.Color(65, 68, 75));

        addAccountButton.setBackground(new java.awt.Color(253, 219, 58));
        addAccountButton.setForeground(new java.awt.Color(82, 87, 93));
        addAccountButton.setText("Add Account");
        addAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountButtonActionPerformed(evt);
            }
        });

        removeAccountButton.setBackground(new java.awt.Color(246, 244, 230));
        removeAccountButton.setForeground(new java.awt.Color(82, 87, 93));
        removeAccountButton.setText("Remove Account");
        removeAccountButton.setEnabled(false);
        removeAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAccountButtonActionPerformed(evt);
            }
        });

        depositButton.setBackground(new java.awt.Color(246, 244, 230));
        depositButton.setForeground(new java.awt.Color(82, 87, 93));
        depositButton.setText("Deposit");
        depositButton.setEnabled(false);
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        withdrawButton.setBackground(new java.awt.Color(246, 244, 230));
        withdrawButton.setForeground(new java.awt.Color(82, 87, 93));
        withdrawButton.setText("Withdrawal");
        withdrawButton.setEnabled(false);
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        accountTable.setAutoCreateRowSorter(true);
        accountTable.setBackground(new java.awt.Color(246, 244, 230));
        accountTable.setForeground(new java.awt.Color(82, 87, 93));
        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Account Type", "Account Number", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accountTable.setGridColor(new java.awt.Color(82, 87, 93));
        accountTable.setSelectionBackground(new java.awt.Color(82, 87, 93));
        accountTable.setSelectionForeground(new java.awt.Color(246, 244, 230));
        accountTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        accountTable.getTableHeader().setReorderingAllowed(false);
        accountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accountTable);
        if (accountTable.getColumnModel().getColumnCount() > 0) {
            accountTable.getColumnModel().getColumn(0).setResizable(false);
            accountTable.getColumnModel().getColumn(1).setResizable(false);
            accountTable.getColumnModel().getColumn(2).setResizable(false);
            accountTable.getColumnModel().getColumn(3).setResizable(false);
        }

        TakeLoan.setBackground(new java.awt.Color(246, 244, 230));
        TakeLoan.setForeground(new java.awt.Color(82, 87, 93));
        TakeLoan.setText("Take Loan");
        TakeLoan.setEnabled(false);
        TakeLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeLoanActionPerformed(evt);
            }
        });

        PrintReport.setBackground(new java.awt.Color(246, 244, 230));
        PrintReport.setForeground(new java.awt.Color(82, 87, 93));
        PrintReport.setText("Print Report");
        PrintReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(addAccountButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeAccountButton)
                        .addGap(18, 18, 18)
                        .addComponent(depositButton)
                        .addGap(18, 18, 18)
                        .addComponent(withdrawButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(TakeLoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PrintReport)))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAccountButton)
                    .addComponent(removeAccountButton)
                    .addComponent(depositButton)
                    .addComponent(withdrawButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TakeLoan)
                    .addComponent(PrintReport))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountButtonActionPerformed
        AddAccountMenu menu = new AddAccountMenu(this, true, bank);
        menu.setVisible(true);
        if (menu.getCustomer() != null) {
            addCustomerToTable(menu.getCustomer());
        }
    }//GEN-LAST:event_addAccountButtonActionPerformed

    private void removeAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAccountButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure?", "Select an Option" , JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            int selectedRow = accountTable.getSelectedRow();
            if (selectedRow >= 0) {
                Customer customer = getSelectedCustomer(selectedRow);
                if (customer != null) {
                    bank.removeCustomer(customer);
                    removeCustomerFromTable(selectedRow);
                }
            }
        }
    }//GEN-LAST:event_removeAccountButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        depositOrWithdraw("deposit");
    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        depositOrWithdraw("withdraw");
    }//GEN-LAST:event_withdrawButtonActionPerformed
    
    private void depositOrWithdraw(String action) {
        int selectedRow = accountTable.getSelectedRow();
        Customer customer = getSelectedCustomer(selectedRow);
        if (customer != null) {
            javax.swing.JDialog window = null;
            if (action.equals("deposit")) {
                window = new DepositMenu(this, true, customer);
            }
            else if (action.equals("withdraw")) {
                window = new WithdrawalMenu(this, true, customer);
            }
            else if (action.equals("Loan")){
                if(customer.getAccount().getAccountType().equals("Loan"))
                window = new LoanMenu(this, true, customer);
                else{
                    JOptionPane.showMessageDialog(null,"Select a Loan accout to take a Loan.","Alert",JOptionPane.WARNING_MESSAGE);
                }
            }
            if (window != null) {
                window.setVisible(true);
            }
            reloadCustomerRowData(selectedRow, customer);
        }
    }

    private void accountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTableMouseClicked
        setAccountButtonsActive(true);
        if (evt.getClickCount() == 2) {
            int selectedRow = accountTable.getSelectedRow();
            Customer customer = getSelectedCustomer(selectedRow);
            if (customer != null) {
                AccountDetailsPage page = new AccountDetailsPage(this, true, customer);
                page.setVisible(true);
            }
        }
    }//GEN-LAST:event_accountTableMouseClicked

    private void TakeLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeLoanActionPerformed
        depositOrWithdraw("Loan");
    }//GEN-LAST:event_TakeLoanActionPerformed

    private void PrintReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintReportActionPerformed
        window = new PrintReport(this, true);    
        window.setVisible(true);
    }//GEN-LAST:event_PrintReportActionPerformed

    private Customer getSelectedCustomer(int selectedRow) {
        Customer customer = null;
        if (selectedRow >= 0) {
            int accountNumber = (int) accountTable.getValueAt(selectedRow, 2);
            customer = bank.getCustomerByAccountNumber(accountNumber);
        }
        return customer;
    }

    private void addCustomerToTable(Customer customer) {
        model.addRow(new Object[]{});
        reloadCustomerRowData(model.getRowCount() - 1, customer);
    }

    private void removeCustomerFromTable(int row) {
        model.removeRow(row);
    }

    private void reloadCustomerRowData(int selectedRow, Customer customer) {
        model.setValueAt(customer.getFirstName(), selectedRow, 0);
        model.setValueAt(customer.getAccount().getAccountType(), selectedRow, 1);
        model.setValueAt(customer.getAccount().getAccountNumber(), selectedRow, 2);
        model.setValueAt(String.format("%.2f", customer.getAccount().getBalance()), selectedRow, 3);
    }

    private void reloadTable() {
        DefaultTableModel model = (DefaultTableModel) accountTable.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i); 
        }
        for (Customer c : bank.getCustomers()) {
            addCustomerToTable(c);
        }
    }

    private void setAccountButtonsActive(boolean active) {
        depositButton.setEnabled(active);
        withdrawButton.setEnabled(active);
        TakeLoan.setEnabled(active);
        removeAccountButton.setEnabled(active);
        PrintReport.setEnabled(active);
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrintReport;
    private javax.swing.JButton TakeLoan;
    private javax.swing.JTable accountTable;
    private javax.swing.JButton addAccountButton;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton depositButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeAccountButton;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables

}
