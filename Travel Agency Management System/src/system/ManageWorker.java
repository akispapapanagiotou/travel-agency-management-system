package system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ManageWorker extends javax.swing.JFrame {

    private String workerAT;
    private String workerName;
    private String workerLastname;
    private float workerSalary;
    private int workerBranchCode;
    
    public ManageWorker() {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleAppClosing();
            }
        });
        
        displayWorkerTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        goBack = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        workerATField = new javax.swing.JTextField();
        workerNameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        usernameLabel2 = new javax.swing.JLabel();
        workerLastnameField = new javax.swing.JTextField();
        usernameLabel3 = new javax.swing.JLabel();
        workerSalaryField = new javax.swing.JTextField();
        usernameLabel4 = new javax.swing.JLabel();
        workerBranchCodeField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        workerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Worker | Travel Agency Management System");

        jPanel1.setBackground(new java.awt.Color(45, 62, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(1263, 669));

        jPanel2.setBackground(new java.awt.Color(255, 106, 53));
        jPanel2.setPreferredSize(new java.awt.Dimension(445, 669));

        goBack.setBackground(new java.awt.Color(255, 51, 51));
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Go back");

        javax.swing.GroupLayout goBackLayout = new javax.swing.GroupLayout(goBack);
        goBack.setLayout(goBackLayout);
        goBackLayout.setHorizontalGroup(
            goBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goBackLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        goBackLayout.setVerticalGroup(
            goBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, goBackLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        usernameLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel1.setText("AT:");

        workerATField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        workerATField.setForeground(new java.awt.Color(0, 0, 0));

        workerNameField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        workerNameField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Name:");

        addPanel.setBackground(new java.awt.Color(255, 51, 51));
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
        });

        add.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(add)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        updatePanel.setBackground(new java.awt.Color(255, 51, 51));
        updatePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePanelMouseClicked(evt);
            }
        });

        update.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        deletePanel.setBackground(new java.awt.Color(255, 51, 51));
        deletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePanelMouseClicked(evt);
            }
        });

        delete.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(delete)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        usernameLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel2.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel2.setText("Lastname:");

        workerLastnameField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        workerLastnameField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel3.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel3.setText("Salary:");

        workerSalaryField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        workerSalaryField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel4.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel4.setText("Branch:");

        workerBranchCodeField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        workerBranchCodeField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(workerATField)
                                .addComponent(workerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(workerLastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel3)
                            .addComponent(workerSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel4)
                            .addComponent(workerBranchCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel1)
                            .addComponent(usernameLabel)
                            .addComponent(usernameLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(usernameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workerATField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(usernameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workerLastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(usernameLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workerSalaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(usernameLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workerBranchCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        workerTable.setBackground(new java.awt.Color(200, 200, 200));
        workerTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        workerTable.setForeground(new java.awt.Color(0, 0, 0));
        workerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AT", "Name", "Lastname", "Salary", "Branch"
            }
        ));
        workerTable.setRowHeight(25);
        workerTable.setSelectionBackground(new java.awt.Color(255, 106, 53));
        workerTable.setShowGrid(true);
        workerTable.getTableHeader().setResizingAllowed(false);
        workerTable.getTableHeader().setReorderingAllowed(false);
        workerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(workerTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseClicked

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        if (addWorker() == true) {
            JOptionPane.showMessageDialog(this, "The worker was added.");

            // Clear worker table
            DefaultTableModel model = (DefaultTableModel) workerTable.getModel();
            model.setRowCount(0);

            displayWorkerTable();
        } else {
            JOptionPane.showMessageDialog(this, "Worker addition failed!");
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked
        if (updateWorker() == true) {
            JOptionPane.showMessageDialog(this, "The worker was updated.");

            // Clear worker table
            DefaultTableModel model = (DefaultTableModel) workerTable.getModel();
            model.setRowCount(0);

            displayWorkerTable();
        } else {
            JOptionPane.showMessageDialog(this, "Worker update failed!");
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
        if (deleteWorker() == true) {
            JOptionPane.showMessageDialog(this, "The worker was deleted.");

            // Clear worker table
            DefaultTableModel model = (DefaultTableModel) workerTable.getModel();
            model.setRowCount(0);

            displayWorkerTable();
        } else {
            JOptionPane.showMessageDialog(this, "Worker deletion failed!");
        }
    }//GEN-LAST:event_deletePanelMouseClicked

    private void workerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workerTableMouseClicked
        int rowNumber = workerTable.getSelectedRow();
        TableModel model = workerTable.getModel();

        workerATField.setText(model.getValueAt(rowNumber, 0).toString());
        workerNameField.setText(model.getValueAt(rowNumber, 1).toString());
        workerLastnameField.setText(model.getValueAt(rowNumber, 2).toString());
        workerSalaryField.setText(model.getValueAt(rowNumber, 3).toString());
        workerBranchCodeField.setText(model.getValueAt(rowNumber, 4).toString());
    }//GEN-LAST:event_workerTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel update;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel usernameLabel2;
    private javax.swing.JLabel usernameLabel3;
    private javax.swing.JLabel usernameLabel4;
    private javax.swing.JTextField workerATField;
    private javax.swing.JTextField workerBranchCodeField;
    private javax.swing.JTextField workerLastnameField;
    private javax.swing.JTextField workerNameField;
    private javax.swing.JTextField workerSalaryField;
    private javax.swing.JTable workerTable;
    // End of variables declaration//GEN-END:variables

    public void displayWorkerTable(){
        String sql = "{CALL get_worker_entries()}";
        
        workerTable.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 17));
        
        // Create a header renderer for header 
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255, 106, 53));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        // Create a center renderer for cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for (int i = 0; i < workerTable.getColumnCount(); i++) {
            workerTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            workerTable.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        try {
            CallableStatement getWorkerEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getWorkerEntries.executeQuery();
            
            while (result.next()) {
                String workerAT = result.getString("wrk_AT");
                String workerName = result.getString("wrk_name");
                String workerLastname = result.getString("wrk_lname");
                float workerSalary = result.getFloat("wrk_salary");
                int workerBranchCode = result.getInt("wrk_br_code");
                
                Object tableData[] = {workerAT, workerName, workerLastname, workerSalary, workerBranchCode};
                DefaultTableModel tableModel = (DefaultTableModel)workerTable.getModel();
                
                tableModel.addRow(tableData);
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addWorker(){
        boolean isAdded = false;
        
        workerAT = workerATField.getText();
        workerName = workerNameField.getText();
        workerLastname = workerLastnameField.getText();
        workerSalary = Float.parseFloat(workerSalaryField.getText());
        workerBranchCode = Integer.parseInt(workerBranchCodeField.getText());
        
        String sql = "{CALL add_worker_entry(?, ?, ?, ?, ?)}";
        
        try {
            CallableStatement addWorkerEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            addWorkerEntries.setString(1, workerAT);
            addWorkerEntries.setString(2, workerName);
            addWorkerEntries.setString(3, workerLastname);
            addWorkerEntries.setFloat(4, workerSalary);
            addWorkerEntries.setInt(5, workerBranchCode);
            
            int rowCount = addWorkerEntries.executeUpdate();
            isAdded = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isAdded;
    }
    
    public boolean updateWorker() {
         boolean isUpdated = false;
         
         workerAT = workerATField.getText();
         workerName = workerNameField.getText();
         workerLastname = workerLastnameField.getText();
         workerSalary = Float.parseFloat(workerSalaryField.getText());
         workerBranchCode = Integer.parseInt(workerBranchCodeField.getText());
         
         String sql = "{CALL update_worker_entry(?, ?, ?, ?, ?)}";
         
         try {
            CallableStatement updateWorkerEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            updateWorkerEntries.setString(1, workerAT);
            updateWorkerEntries.setString(2, workerName);
            updateWorkerEntries.setString(3, workerLastname);
            updateWorkerEntries.setFloat(4, workerSalary);
            updateWorkerEntries.setInt(5, workerBranchCode);
            
            int rowCount = updateWorkerEntries.executeUpdate();
            
            isUpdated = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isUpdated;
    }
    
    public boolean deleteWorker() {
         boolean isDeleted = false;
         
         workerAT = workerATField.getText();
         
         String sql = "{CALL delete_worker_entry(?)}";
         
         try {
            CallableStatement deleteWorkerEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            deleteWorkerEntries.setString(1, workerAT);
            
            int rowCount = deleteWorkerEntries.executeUpdate();
            
            isDeleted = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isDeleted;
    }
    
    private void handleAppClosing() {
        String sql = "{CALL set_IT_managers_inactive()}";
        
         try {
            CallableStatement setITManagersInactive = DBConnection.getInstance().getConnection().prepareCall(sql);
            setITManagersInactive.execute();
         } catch (SQLException ex) {
            ex.printStackTrace();
        }
         
        DBConnection.getInstance().closeConnection();
    }
}