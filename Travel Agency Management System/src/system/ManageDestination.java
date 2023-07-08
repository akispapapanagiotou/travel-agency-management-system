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

public class ManageDestination extends javax.swing.JFrame {

    private int destinationID;
    private String destinationName;
    private String destinationDescription;
    private String destinationType;
    private String destinationLanguage;
    private int destinationLocation;
    
    public ManageDestination() {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleAppClosing();
            }
        });
        
        displayDestinationTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        goBack = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        destinationIDField = new javax.swing.JTextField();
        destinationNameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        usernameLabel2 = new javax.swing.JLabel();
        destinationDescriptionField = new javax.swing.JTextField();
        usernameLabel3 = new javax.swing.JLabel();
        destinationTypeField = new javax.swing.JTextField();
        usernameLabel4 = new javax.swing.JLabel();
        destinationLanguageField = new javax.swing.JTextField();
        usernameLabel5 = new javax.swing.JLabel();
        destinationLocationField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        destinationTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Destination | Travel Agency Management System");

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
        usernameLabel1.setText("ID:");

        destinationIDField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinationIDField.setForeground(new java.awt.Color(0, 0, 0));

        destinationNameField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinationNameField.setForeground(new java.awt.Color(0, 0, 0));

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
        usernameLabel2.setText("Description:");

        destinationDescriptionField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinationDescriptionField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel3.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel3.setText("Type:");

        destinationTypeField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinationTypeField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel4.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel4.setText("Language:");

        destinationLanguageField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinationLanguageField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel5.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel5.setText("Location:");

        destinationLocationField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinationLocationField.setForeground(new java.awt.Color(0, 0, 0));

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
                                .addComponent(destinationIDField)
                                .addComponent(destinationNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usernameLabel2)
                            .addComponent(destinationDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel3)
                            .addComponent(destinationTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel4)
                            .addComponent(destinationLanguageField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel5)
                            .addComponent(destinationLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(usernameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationLanguageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(destinationLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        destinationTable.setBackground(new java.awt.Color(200, 200, 200));
        destinationTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        destinationTable.setForeground(new java.awt.Color(0, 0, 0));
        destinationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Description", "Type", "Language", "Location"
            }
        ));
        destinationTable.setRowHeight(25);
        destinationTable.setSelectionBackground(new java.awt.Color(255, 106, 53));
        destinationTable.setShowGrid(true);
        destinationTable.getTableHeader().setResizingAllowed(false);
        destinationTable.getTableHeader().setReorderingAllowed(false);
        destinationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destinationTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(destinationTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
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
        if (addDestination() == true) {
            JOptionPane.showMessageDialog(this, "The destination was added.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) destinationTable.getModel();
            model.setRowCount(0);

            displayDestinationTable();
        } else {
            JOptionPane.showMessageDialog(this, "Destination addition failed!");
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked
        if (updateDestination() == true) {
            JOptionPane.showMessageDialog(this, "The destination was updated.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) destinationTable.getModel();
            model.setRowCount(0);

            displayDestinationTable();
        } else {
            JOptionPane.showMessageDialog(this, "Destination update failed!");
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
        if (deleteDestination() == true) {
            JOptionPane.showMessageDialog(this, "The destination was deleted.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) destinationTable.getModel();
            model.setRowCount(0);

            displayDestinationTable();
        } else {
            JOptionPane.showMessageDialog(this, "Destination deletion failed!");
        }
    }//GEN-LAST:event_deletePanelMouseClicked

    private void destinationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinationTableMouseClicked
        int rowNumber = destinationTable.getSelectedRow();
        TableModel model = destinationTable.getModel();

        destinationIDField.setText(model.getValueAt(rowNumber, 0).toString());
        destinationNameField.setText(model.getValueAt(rowNumber, 1).toString());
        destinationDescriptionField.setText(model.getValueAt(rowNumber, 2).toString());
        destinationTypeField.setText(model.getValueAt(rowNumber, 3).toString());
        destinationLanguageField.setText(model.getValueAt(rowNumber, 4).toString());
        destinationLocationField.setText(model.getValueAt(rowNumber, 5).toString());
    }//GEN-LAST:event_destinationTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JTextField destinationDescriptionField;
    private javax.swing.JTextField destinationIDField;
    private javax.swing.JTextField destinationLanguageField;
    private javax.swing.JTextField destinationLocationField;
    private javax.swing.JTextField destinationNameField;
    private javax.swing.JTable destinationTable;
    private javax.swing.JTextField destinationTypeField;
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
    private javax.swing.JLabel usernameLabel5;
    // End of variables declaration//GEN-END:variables
    
    public void displayDestinationTable(){
        String sql = "{CALL get_destination_entries()}";
        
        destinationTable.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 17));
        
        // Create a header renderer for header 
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255, 106, 53));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        // Create a center renderer for cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for (int i = 0; i < destinationTable.getColumnCount(); i++) {
            destinationTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            destinationTable.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        try {
            CallableStatement getDestinationEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getDestinationEntries.executeQuery();
            
            while (result.next()) {
                int destinationID = result.getInt("dst_id");
                String destinationName = result.getString("dst_name");
                String destinationDescription = result.getString("dst_descr");
                String destinationType = result.getString("dst_rtype");
                String destinationLanguage = result.getString("dst_language");
                int destinationLocation = result.getInt("dst_location");
                
                Object tableData[] = {destinationID, destinationName, destinationDescription, destinationType, destinationLanguage, destinationLocation};
                DefaultTableModel tableModel = (DefaultTableModel)destinationTable.getModel();
                
                tableModel.addRow(tableData);
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addDestination(){
        boolean isAdded = false;
        
        destinationID = Integer.parseInt(destinationIDField.getText());
        destinationName = destinationNameField.getText();
        destinationDescription = destinationDescriptionField.getText();
        destinationType = destinationTypeField.getText();
        destinationLanguage = destinationLanguageField.getText();
        destinationLocation = Integer.parseInt(destinationLocationField.getText());
        
        String sql = "{CALL add_destination_entry(?, ?, ?, ?, ?, ?)}";
        
        try {
            CallableStatement addDestinationEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            addDestinationEntries.setInt(1, destinationID);
            addDestinationEntries.setString(2, destinationName);
            addDestinationEntries.setString(3, destinationDescription);
            addDestinationEntries.setString(4, destinationType);
            addDestinationEntries.setString(5, destinationLanguage);
            addDestinationEntries.setInt(6, destinationLocation);
            
            int rowCount = addDestinationEntries.executeUpdate();
            isAdded = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isAdded;
    }
    
    public boolean updateDestination() {
         boolean isUpdated = false;
         
         destinationID = Integer.parseInt(destinationIDField.getText());
         destinationName = destinationNameField.getText();
         destinationDescription = destinationDescriptionField.getText();
         destinationType = destinationTypeField.getText();
         destinationLanguage = destinationLanguageField.getText();
         destinationLocation = Integer.parseInt(destinationLocationField.getText());
         
         String sql = "{CALL update_destination_entry(?, ?, ?, ?, ?, ?)}";
         
         try {
            CallableStatement updateDestinationEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            updateDestinationEntries.setInt(1, destinationID);
            updateDestinationEntries.setString(2, destinationName);
            updateDestinationEntries.setString(3, destinationDescription);
            updateDestinationEntries.setString(4, destinationType);
            updateDestinationEntries.setString(5, destinationLanguage);
            updateDestinationEntries.setInt(6, destinationLocation);
            
            int rowCount = updateDestinationEntries.executeUpdate();
            
            isUpdated = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isUpdated;
    }
    
    public boolean deleteDestination() {
         boolean isDeleted = false;
         
         destinationID = Integer.parseInt(destinationIDField.getText());
         
         String sql = "{CALL delete_destination_entry(?}";
         
         try {
            CallableStatement deleteDestinationEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            deleteDestinationEntries.setInt(1, destinationID);
            
            int rowCount = deleteDestinationEntries.executeUpdate();
            
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