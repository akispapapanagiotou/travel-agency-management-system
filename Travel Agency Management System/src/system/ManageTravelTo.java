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

public class ManageTravelTo extends javax.swing.JFrame {

    private int travelToID;
    private int travelToDestinationID;
    private String travelToArrival;
    private String travelToDeparture;
    
    public ManageTravelTo() {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleAppClosing();
            }
        });
        
        displayTravelToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        goBack = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        travelToTripIDField = new javax.swing.JTextField();
        travelToDestinationIDField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        usernameLabel2 = new javax.swing.JLabel();
        travelToArrivalField = new javax.swing.JTextField();
        usernameLabel3 = new javax.swing.JLabel();
        travelToDepartureField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        travelToTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Travel-To | Travel Agency Management System");

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
        usernameLabel1.setText("Trip ID:");

        travelToTripIDField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        travelToTripIDField.setForeground(new java.awt.Color(0, 0, 0));

        travelToDestinationIDField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        travelToDestinationIDField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Destination ID:");

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
        usernameLabel2.setText("Arrival:");

        travelToArrivalField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        travelToArrivalField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel3.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel3.setText("Departure:");

        travelToDepartureField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        travelToDepartureField.setForeground(new java.awt.Color(0, 0, 0));

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
                                .addComponent(travelToTripIDField)
                                .addComponent(travelToDestinationIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usernameLabel2)
                            .addComponent(travelToArrivalField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel3)
                            .addComponent(travelToDepartureField, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(usernameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(travelToTripIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(travelToDestinationIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(usernameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(travelToArrivalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(usernameLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(travelToDepartureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );

        travelToTable.setBackground(new java.awt.Color(200, 200, 200));
        travelToTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        travelToTable.setForeground(new java.awt.Color(0, 0, 0));
        travelToTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip ID", "Destination ID", "Arrival", "Departure"
            }
        ));
        travelToTable.setRowHeight(25);
        travelToTable.setSelectionBackground(new java.awt.Color(255, 106, 53));
        travelToTable.setShowGrid(true);
        travelToTable.getTableHeader().setResizingAllowed(false);
        travelToTable.getTableHeader().setReorderingAllowed(false);
        travelToTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                travelToTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(travelToTable);

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
        if (addTravelTo() == true) {
            JOptionPane.showMessageDialog(this, "The travelTo relation was added.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) travelToTable.getModel();
            model.setRowCount(0);

            displayTravelToTable();
        } else {
            JOptionPane.showMessageDialog(this, "TravelTo relation addition failed!");
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked
        if (updateTravelTo() == true) {
            JOptionPane.showMessageDialog(this, "The travelTo relation was updated.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) travelToTable.getModel();
            model.setRowCount(0);

            displayTravelToTable();
        } else {
            JOptionPane.showMessageDialog(this, "TravelTo relation update failed!");
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
        if (deleteTravelTo() == true) {
            JOptionPane.showMessageDialog(this, "The travelTo relation was deleted.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) travelToTable.getModel();
            model.setRowCount(0);

            displayTravelToTable();
        } else {
            JOptionPane.showMessageDialog(this, "TravelTo relation deletion failed!");
        }
    }//GEN-LAST:event_deletePanelMouseClicked

    private void travelToTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travelToTableMouseClicked
        int rowNumber = travelToTable.getSelectedRow();
        TableModel model = travelToTable.getModel();

        travelToTripIDField.setText(model.getValueAt(rowNumber, 0).toString());
        travelToDestinationIDField.setText(model.getValueAt(rowNumber, 1).toString());
        travelToArrivalField.setText(model.getValueAt(rowNumber, 2).toString());
        travelToDepartureField.setText(model.getValueAt(rowNumber, 3).toString());
    }//GEN-LAST:event_travelToTableMouseClicked

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
    private javax.swing.JTextField travelToArrivalField;
    private javax.swing.JTextField travelToDepartureField;
    private javax.swing.JTextField travelToDestinationIDField;
    private javax.swing.JTable travelToTable;
    private javax.swing.JTextField travelToTripIDField;
    private javax.swing.JLabel update;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel usernameLabel2;
    private javax.swing.JLabel usernameLabel3;
    // End of variables declaration//GEN-END:variables

    public void displayTravelToTable(){
        String sql = "{CALL get_travel_to_entries()}";
        
        travelToTable.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 17));
        
        // Create a header renderer for header 
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255, 106, 53));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        // Create a center renderer for cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for (int i = 0; i < travelToTable.getColumnCount(); i++) {
            travelToTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            travelToTable.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        try {
            CallableStatement getTravelToEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getTravelToEntries.executeQuery();
            
            while (result.next()) {
                int travelToID = result.getInt("to_tr_id");
                int travelToDestinationID = result.getInt("to_dst_id");
                String travelToArrival = result.getString("to_arrival");
                String travelToDeparture = result.getString("to_departure");
    
                Object tableData[] = {travelToID, travelToDestinationID, travelToArrival, travelToDeparture};
                DefaultTableModel tableModel = (DefaultTableModel)travelToTable.getModel();
                
                tableModel.addRow(tableData);
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addTravelTo(){
        boolean isAdded = false;
        
        travelToID = Integer.parseInt(travelToTripIDField.getText());
        travelToDestinationID = Integer.parseInt(travelToDestinationIDField.getText());
        travelToArrival = travelToArrivalField.getText();
        travelToDeparture = travelToDepartureField.getText();
        
        String sql = "{CALL add_travel_to_entry(?, ?, ?, ?)}";
        
        try {
            CallableStatement addTravelToEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            addTravelToEntries.setInt(1, travelToID);
            addTravelToEntries.setInt(2, travelToDestinationID);
            addTravelToEntries.setString(3, travelToArrival);
            addTravelToEntries.setString(4, travelToDeparture);
            
            int rowCount = addTravelToEntries.executeUpdate();
            isAdded = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isAdded;
    }
    
    public boolean updateTravelTo() {
         boolean isUpdated = false;
         
         travelToID = Integer.parseInt(travelToTripIDField.getText());
         travelToDestinationID = Integer.parseInt(travelToDestinationIDField.getText());
         travelToArrival = travelToArrivalField.getText();
         travelToDeparture = travelToDepartureField.getText();
         
         String sql = "{CALL update_travel_to_entry(?, ?, ?, ?)}";
         
         try {
            CallableStatement updateTravelToEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            updateTravelToEntries.setInt(1, travelToID);
            updateTravelToEntries.setInt(2, travelToDestinationID);
            updateTravelToEntries.setString(3, travelToArrival);
            updateTravelToEntries.setString(4, travelToDeparture);
            
            int rowCount = updateTravelToEntries.executeUpdate();
            
            isUpdated = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isUpdated;
    }
    
    public boolean deleteTravelTo() {
         boolean isDeleted = false;
         
         travelToID = Integer.parseInt(travelToTripIDField.getText());
         travelToDestinationID = Integer.parseInt(travelToDestinationIDField.getText());
         
         String sql = "{CALL delete_travel_to_entry(?, ?}";
         
         try {
            CallableStatement deleteTravelToEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            deleteTravelToEntries.setInt(1, travelToID);
            deleteTravelToEntries.setInt(2, travelToDestinationID);
            
            int rowCount = deleteTravelToEntries.executeUpdate();
            
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