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

public class ManageBranch extends javax.swing.JFrame {

    private int branchId;
    private String branchStreet;
    private int branchNum;
    private String branchCity;
    
    public ManageBranch() {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleAppClosing();
            }
        });
        
        displayBranchTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        goBack = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        streetField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        branchCodeField = new javax.swing.JTextField();
        usernameLabel1 = new javax.swing.JLabel();
        usernameLabel2 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        numberField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        branchTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Branch | Travel Agency Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 62, 80));

        jPanel2.setBackground(new java.awt.Color(255, 106, 53));

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

        streetField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        streetField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Street:");

        passwordLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Number:");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(update)
                .addContainerGap(13, Short.MAX_VALUE))
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
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        branchCodeField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        branchCodeField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel1.setText("Branch Code:");

        usernameLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel2.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel2.setText("City:");

        cityField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cityField.setForeground(new java.awt.Color(0, 0, 0));

        numberField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        numberField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel1)
                            .addComponent(usernameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(branchCodeField, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(streetField)
                            .addComponent(cityField)
                            .addComponent(numberField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(usernameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(branchCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(streetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(usernameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        branchTable.setBackground(new java.awt.Color(200, 200, 200));
        branchTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        branchTable.setForeground(new java.awt.Color(0, 0, 0));
        branchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch Code", "Street", "Number", "City"
            }
        ));
        branchTable.setRowHeight(25);
        branchTable.setSelectionBackground(new java.awt.Color(255, 106, 53));
        branchTable.setShowGrid(true);
        branchTable.getTableHeader().setResizingAllowed(false);
        branchTable.getTableHeader().setReorderingAllowed(false);
        branchTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branchTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(branchTable);
        if (branchTable.getColumnModel().getColumnCount() > 0) {
            branchTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackMouseClicked

    private void branchTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchTableMouseClicked
        int rowNumber = branchTable.getSelectedRow();
        TableModel model = branchTable.getModel();
        
        branchCodeField.setText(model.getValueAt(rowNumber, 0).toString());
        streetField.setText(model.getValueAt(rowNumber, 1).toString());
        numberField.setText(model.getValueAt(rowNumber, 2).toString());
        cityField.setText(model.getValueAt(rowNumber, 3).toString());
    }//GEN-LAST:event_branchTableMouseClicked

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
        if (addBranch() == true) {
            JOptionPane.showMessageDialog(this, "The branch was added.");
            
            // Clear branch Table
            DefaultTableModel model = (DefaultTableModel) branchTable.getModel();
            model.setRowCount(0);
            
            displayBranchTable();
        } else {
            JOptionPane.showMessageDialog(this, "Branch addition failed!");
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked
       if (updateBranch() == true) {
            JOptionPane.showMessageDialog(this, "The branch was updated.");
            
            // Clear branch Table
            DefaultTableModel model = (DefaultTableModel) branchTable.getModel();
            model.setRowCount(0);
            
            displayBranchTable();
        } else {
            JOptionPane.showMessageDialog(this, "Branch update failed!");
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
        if (deleteBranch() == true) {
            JOptionPane.showMessageDialog(this, "The branch was deleted.");
            
            // Clear branch Table
            DefaultTableModel model = (DefaultTableModel) branchTable.getModel();
            model.setRowCount(0);
            
            displayBranchTable();
        } else {
            JOptionPane.showMessageDialog(this, "Branch deletion failed!");
        }
    }//GEN-LAST:event_deletePanelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField branchCodeField;
    private javax.swing.JTable branchTable;
    private javax.swing.JTextField cityField;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JPanel goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField streetField;
    private javax.swing.JLabel update;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel usernameLabel2;
    // End of variables declaration//GEN-END:variables

    public void displayBranchTable(){
        String sql = "{CALL get_branch_entries()}";
        
        branchTable.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 17));
        branchTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        
        // Create a header renderer for header 
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255, 106, 53));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        // Create a center renderer for cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for (int i = 0; i < branchTable.getColumnCount(); i++) {
            branchTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            branchTable.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        try {
            CallableStatement getBranchEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getBranchEntries.executeQuery();
            
            while (result.next()) {
                int branchId = result.getInt("br_code");
                String branchStreet = result.getString("br_street");
                int branchNum = result.getInt("br_num");
                String branchCity = result.getString("br_city");
                
                Object tableData[] = {branchId, branchStreet, branchNum, branchCity};
                DefaultTableModel tableModel = (DefaultTableModel)branchTable.getModel();
                
                tableModel.addRow(tableData);
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addBranch(){
        boolean isAdded = false;
        
        branchId = Integer.parseInt(branchCodeField.getText());
        branchStreet = streetField.getText();
        branchNum = Integer.parseInt(numberField.getText());
        branchCity = cityField.getText();
        
        String sql = "{CALL add_branch_entry(?, ?, ?, ?)}";
        
        try {
            CallableStatement addBranchEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            addBranchEntries.setInt(1, branchId);
            addBranchEntries.setString(2, branchStreet);
            addBranchEntries.setInt(3, branchNum);
            addBranchEntries.setString(4, branchCity);
            
            int rowCount = addBranchEntries.executeUpdate();
            isAdded = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isAdded;
    }
    
    public boolean updateBranch() {
         boolean isUpdated = false;
         
         branchId = Integer.parseInt(branchCodeField.getText());
         branchStreet = streetField.getText();
         branchNum = Integer.parseInt(numberField.getText());
         branchCity = cityField.getText();
         
         String sql = "{CALL update_branch_entry(?, ?, ?, ?)}";
         
         try {
            CallableStatement updateBranchEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            updateBranchEntries.setInt(1, branchId);
            updateBranchEntries.setString(2, branchStreet);
            updateBranchEntries.setInt(3, branchNum);
            updateBranchEntries.setString(4, branchCity);
            
            int rowCount = updateBranchEntries.executeUpdate();
            
            isUpdated = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isUpdated;
    }
    
    public boolean deleteBranch() {
         boolean isDeleted = false;
         
         branchId = Integer.parseInt(branchCodeField.getText());
         
         String sql = "{CALL delete_branch_entry(?)}";
         
         try {
            CallableStatement updateBranchEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            updateBranchEntries.setInt(1, branchId);
            
            int rowCount = updateBranchEntries.executeUpdate();
            
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
