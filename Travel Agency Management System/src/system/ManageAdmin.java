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

public class ManageAdmin extends javax.swing.JFrame {

    private String adminAT;
    private String adminType;
    private String adminDiploma;
    
    public ManageAdmin() {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleAppClosing();
            }
        });
        
        displayAdminTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        goBack = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        adminATField = new javax.swing.JTextField();
        adminTypeField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        usernameLabel2 = new javax.swing.JLabel();
        adminDiplomaField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Admin | Travel Agency Management System");

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

        adminATField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        adminATField.setForeground(new java.awt.Color(0, 0, 0));

        adminTypeField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        adminTypeField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Type:");

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
        usernameLabel2.setText("Diploma:");

        adminDiplomaField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        adminDiplomaField.setForeground(new java.awt.Color(0, 0, 0));

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
                            .addComponent(usernameLabel1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameLabel)
                                .addComponent(adminATField)
                                .addComponent(adminTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usernameLabel2)
                            .addComponent(adminDiplomaField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(99, 99, 99)
                .addComponent(usernameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminATField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(usernameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminDiplomaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        adminTable.setBackground(new java.awt.Color(200, 200, 200));
        adminTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        adminTable.setForeground(new java.awt.Color(0, 0, 0));
        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AT", "Type", "Diploma"
            }
        ));
        adminTable.setRowHeight(25);
        adminTable.setSelectionBackground(new java.awt.Color(255, 106, 53));
        adminTable.setShowGrid(true);
        adminTable.getTableHeader().setResizingAllowed(false);
        adminTable.getTableHeader().setReorderingAllowed(false);
        adminTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(adminTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (addAdmin() == true) {
            JOptionPane.showMessageDialog(this, "The admin was added.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
            model.setRowCount(0);

            displayAdminTable();
        } else {
            JOptionPane.showMessageDialog(this, "Admin addition failed!");
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked
        if (updateAdmin() == true) {
            JOptionPane.showMessageDialog(this, "The admin was updated.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
            model.setRowCount(0);

            displayAdminTable();
        } else {
            JOptionPane.showMessageDialog(this, "Admin update failed!");
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
        if (deleteAdmin() == true) {
            JOptionPane.showMessageDialog(this, "The admin was deleted.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) adminTable.getModel();
            model.setRowCount(0);

            displayAdminTable();
        } else {
            JOptionPane.showMessageDialog(this, "Admin deletion failed!");
        }
    }//GEN-LAST:event_deletePanelMouseClicked

    private void adminTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTableMouseClicked
        int rowNumber = adminTable.getSelectedRow();
        TableModel model = adminTable.getModel();

        adminATField.setText(model.getValueAt(rowNumber, 0).toString());
        adminTypeField.setText(model.getValueAt(rowNumber, 1).toString());
        adminDiplomaField.setText(model.getValueAt(rowNumber, 2).toString());
    }//GEN-LAST:event_adminTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JPanel addPanel;
    private javax.swing.JTextField adminATField;
    private javax.swing.JTextField adminDiplomaField;
    private javax.swing.JTable adminTable;
    private javax.swing.JTextField adminTypeField;
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
    // End of variables declaration//GEN-END:variables

    public void displayAdminTable(){
        String sql = "{CALL get_admin_entries()}";
        
        adminTable.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 17));
        adminTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        
        // Create a header renderer for header 
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255, 106, 53));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        // Create a center renderer for cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for (int i = 0; i < adminTable.getColumnCount(); i++) {
            adminTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            adminTable.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        try {
            CallableStatement getAdminEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getAdminEntries.executeQuery();
            
            while (result.next()) {
                String adminAT = result.getString("adm_AT");
                String adminType = result.getString("adm_type");
                String adminDiploma = result.getString("adm_diploma");
                      
                Object tableData[] = {adminAT, adminType, adminDiploma};
                DefaultTableModel tableModel = (DefaultTableModel)adminTable.getModel();
                
                tableModel.addRow(tableData);
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addAdmin(){
        boolean isAdded = false;
        
        adminAT = adminATField.getText();
        adminType = adminTypeField.getText();
        adminDiploma = adminDiplomaField.getText();
        
        String sql = "{CALL add_admin_entry(?, ?, ?)}";
        
        try {
            CallableStatement addAdminEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            addAdminEntries.setString(1, adminAT);
            addAdminEntries.setString(2, adminType);
            addAdminEntries.setString(3, adminDiploma);
            
            int rowCount = addAdminEntries.executeUpdate();
            isAdded = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isAdded;
    }
    
    public boolean updateAdmin() {
         boolean isUpdated = false;
         
         adminAT = adminATField.getText();
         adminType = adminTypeField.getText();
         adminDiploma = adminDiplomaField.getText();
         
         String sql = "{CALL update_admin_entry(?, ?, ?)}";
         
         try {
            CallableStatement updateAdminEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            updateAdminEntries.setString(1, adminAT);
            updateAdminEntries.setString(2, adminType);
            updateAdminEntries.setString(3, adminDiploma);
            
            int rowCount = updateAdminEntries.executeUpdate();
            
            isUpdated = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isUpdated;
    }
    
    public boolean deleteAdmin() {
         boolean isDeleted = false;
         
         adminAT = adminATField.getText();
         
         String sql = "{CALL delete_admin_entry(?)}";
         
         try {
            CallableStatement deleteAdminEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            deleteAdminEntries.setString(1, adminAT);
            
           int rowCount = deleteAdminEntries.executeUpdate();
            
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
