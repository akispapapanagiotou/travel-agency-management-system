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

public class ManageTrip extends javax.swing.JFrame {

    private int tripID;
    private String tripDeparture;
    private String tripReturn;
    private int tripMaxSeats;
    private float tripCost;
    private int tripBranchCode;
    private String tripGuideAT;
    private String tripDriverAT;
    
    public ManageTrip() {
       initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleAppClosing();
            }
        });
        
        displayTripTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        goBack = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        tripIDField = new javax.swing.JTextField();
        tripDepartureField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        updatePanel = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        usernameLabel2 = new javax.swing.JLabel();
        tripReturnField = new javax.swing.JTextField();
        usernameLabel3 = new javax.swing.JLabel();
        tripMaxSeatsField = new javax.swing.JTextField();
        usernameLabel4 = new javax.swing.JLabel();
        tripBranchCodeField = new javax.swing.JTextField();
        usernameLabel5 = new javax.swing.JLabel();
        tripDriverATField = new javax.swing.JTextField();
        usernameLabel6 = new javax.swing.JLabel();
        tripGuideATField = new javax.swing.JTextField();
        usernameLabel7 = new javax.swing.JLabel();
        tripCostField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tripTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Trip | Travel Agency Management System");

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

        tripIDField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripIDField.setForeground(new java.awt.Color(0, 0, 0));

        tripDepartureField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripDepartureField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Trip Departure:");

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
        usernameLabel2.setText("Trip Return:");

        tripReturnField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripReturnField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel3.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel3.setText("Max Seats:");

        tripMaxSeatsField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripMaxSeatsField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel4.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel4.setText("Branch Code:");

        tripBranchCodeField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripBranchCodeField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel5.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel5.setText("Driver AT:");

        tripDriverATField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripDriverATField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel6.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel6.setText("Guide AT:");

        tripGuideATField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripGuideATField.setForeground(new java.awt.Color(0, 0, 0));

        usernameLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel7.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel7.setText("Cost:");

        tripCostField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripCostField.setForeground(new java.awt.Color(0, 0, 0));

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
                        .addGap(34, 34, 34)
                        .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel5)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameLabel1)
                                .addComponent(usernameLabel)
                                .addComponent(tripIDField)
                                .addComponent(tripDepartureField, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                .addComponent(usernameLabel2)
                                .addComponent(tripReturnField)
                                .addComponent(usernameLabel4)
                                .addComponent(usernameLabel6)
                                .addComponent(tripGuideATField, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                .addComponent(tripDriverATField, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                .addComponent(tripBranchCodeField)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tripMaxSeatsField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(usernameLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLabel7)
                                        .addComponent(tripCostField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(15, 15, 15))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(goBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tripIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tripDepartureField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tripReturnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tripMaxSeatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tripCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(usernameLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tripBranchCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tripGuideATField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usernameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tripDriverATField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tripTable.setBackground(new java.awt.Color(200, 200, 200));
        tripTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tripTable.setForeground(new java.awt.Color(0, 0, 0));
        tripTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip ID", "Trip Departure", "Trip Return", "Max Seats", "Cost", "Branch Code", "Guide AT", "Driver AT"
            }
        ));
        tripTable.setRowHeight(25);
        tripTable.setSelectionBackground(new java.awt.Color(255, 106, 53));
        tripTable.setShowGrid(true);
        tripTable.getTableHeader().setResizingAllowed(false);
        tripTable.getTableHeader().setReorderingAllowed(false);
        tripTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tripTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tripTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
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
        if (addTrip() == true) {
            JOptionPane.showMessageDialog(this, "The trip was added.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) tripTable.getModel();
            model.setRowCount(0);

            displayTripTable();
        } else {
            JOptionPane.showMessageDialog(this, "Trip addition failed!");
        }
    }//GEN-LAST:event_addPanelMouseClicked

    private void updatePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePanelMouseClicked
        if (updateTrip() == true) {
            JOptionPane.showMessageDialog(this, "The trip was updated.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) tripTable.getModel();
            model.setRowCount(0);

            displayTripTable();
        } else {
            JOptionPane.showMessageDialog(this, "Trip update failed!");
        }
    }//GEN-LAST:event_updatePanelMouseClicked

    private void deletePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePanelMouseClicked
        if (deleteTrip() == true) {
            JOptionPane.showMessageDialog(this, "The trip was deleted.");

            // Clear phones Table
            DefaultTableModel model = (DefaultTableModel) tripTable.getModel();
            model.setRowCount(0);

            displayTripTable();
        } else {
            JOptionPane.showMessageDialog(this, "Trip deletion failed!");
        }
    }//GEN-LAST:event_deletePanelMouseClicked

    private void tripTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tripTableMouseClicked
        int rowNumber = tripTable.getSelectedRow();
        TableModel model = tripTable.getModel();

        tripIDField.setText(model.getValueAt(rowNumber, 0).toString());
        tripDepartureField.setText(model.getValueAt(rowNumber, 1).toString());
        tripReturnField.setText(model.getValueAt(rowNumber, 2).toString());
        tripMaxSeatsField.setText(model.getValueAt(rowNumber, 3).toString());
        tripCostField.setText(model.getValueAt(rowNumber, 4).toString());
        tripBranchCodeField.setText(model.getValueAt(rowNumber, 5).toString());
        tripGuideATField.setText(model.getValueAt(rowNumber, 6).toString());
        tripDriverATField.setText(model.getValueAt(rowNumber, 7).toString());
        
    }//GEN-LAST:event_tripTableMouseClicked

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
    private javax.swing.JTextField tripBranchCodeField;
    private javax.swing.JTextField tripCostField;
    private javax.swing.JTextField tripDepartureField;
    private javax.swing.JTextField tripDriverATField;
    private javax.swing.JTextField tripGuideATField;
    private javax.swing.JTextField tripIDField;
    private javax.swing.JTextField tripMaxSeatsField;
    private javax.swing.JTextField tripReturnField;
    private javax.swing.JTable tripTable;
    private javax.swing.JLabel update;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel usernameLabel2;
    private javax.swing.JLabel usernameLabel3;
    private javax.swing.JLabel usernameLabel4;
    private javax.swing.JLabel usernameLabel5;
    private javax.swing.JLabel usernameLabel6;
    private javax.swing.JLabel usernameLabel7;
    // End of variables declaration//GEN-END:variables

    public void displayTripTable(){
        String sql = "{CALL get_trip_entries()}";
        
        tripTable.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 17));
        
        // Create a header renderer for header 
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255, 106, 53));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        // Create a center renderer for cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for (int i = 0; i < tripTable.getColumnCount(); i++) {
            tripTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            tripTable.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        try {
            CallableStatement getTripEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getTripEntries.executeQuery();
            
            while (result.next()) {
                int tripID = result.getInt("tr_id");
                String tripDeparture = result.getString("tr_departure");
                String tripReturn = result.getString("tr_return");
                int tripMaxSeats = result.getInt("tr_maxseats");
                float tripCost = result.getFloat("tr_cost");
                int tripBranchCode = result.getInt("tr_br_code");
                String tripGuideAT = result.getString("tr_gui_AT");
                String tripDriverAT = result.getString("tr_drv_AT");
                
                Object tableData[] = {tripID, tripDeparture, tripReturn, tripMaxSeats, tripCost, tripBranchCode, tripGuideAT, tripDriverAT};
                DefaultTableModel tableModel = (DefaultTableModel)tripTable.getModel();
                
                tableModel.addRow(tableData);
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean addTrip(){
        boolean isAdded = false;
        
        tripID = Integer.parseInt(tripIDField.getText());
        tripDeparture = tripDepartureField.getText();
        tripReturn = tripReturnField.getText();
        tripMaxSeats = Integer.parseInt(tripMaxSeatsField.getText());
        tripCost = Float.parseFloat(tripCostField.getText());
        tripBranchCode = Integer.parseInt(tripBranchCodeField.getText());
        tripGuideAT = tripGuideATField.getText();
        tripDriverAT =tripDriverATField.getText();
        
        String sql = "{CALL add_trip_entry(?, ?, ?, ?, ?, ?, ?, ?)}";
        
        try {
            CallableStatement addTripEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            addTripEntries.setInt(1, tripID);
            addTripEntries.setString(2, tripDeparture);
            addTripEntries.setString(3, tripReturn);
            addTripEntries.setInt(4, tripMaxSeats);
            addTripEntries.setFloat(5, tripCost);
            addTripEntries.setInt(6, tripBranchCode);
            addTripEntries.setString(7, tripGuideAT);
            addTripEntries.setString(8, tripDriverAT);
            
            int rowCount = addTripEntries.executeUpdate();
            isAdded = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isAdded;
    }
    
    public boolean updateTrip() {
         boolean isUpdated = false;
         
         tripID = Integer.parseInt(tripIDField.getText());
         tripDeparture = tripDepartureField.getText();
         tripReturn = tripReturnField.getText();
         tripMaxSeats = Integer.parseInt(tripMaxSeatsField.getText());
         tripCost = Float.parseFloat(tripCostField.getText());
         tripBranchCode = Integer.parseInt(tripBranchCodeField.getText());
         tripGuideAT = tripGuideATField.getText();
         tripDriverAT =tripDriverATField.getText();
        
        String sql = "{CALL update_trip_entry(?, ?, ?, ?, ?, ?, ?, ?)}";
         
         try {
            CallableStatement updateTripEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            updateTripEntries.setInt(1, tripID);
            updateTripEntries.setString(2, tripDeparture);
            updateTripEntries.setString(3, tripReturn);
            updateTripEntries.setInt(4, tripMaxSeats);
            updateTripEntries.setFloat(5, tripCost);
            updateTripEntries.setInt(6, tripBranchCode);
            updateTripEntries.setString(7, tripGuideAT);
            updateTripEntries.setString(8, tripDriverAT);
            
            int rowCount = updateTripEntries.executeUpdate();
            
            isUpdated = rowCount > 0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return isUpdated;
    }
    
    public boolean deleteTrip() {
         boolean isDeleted = false;
         
         tripID = Integer.parseInt(tripIDField.getText());
         
         String sql = "{CALL delete_trip_entry(?)}";
         
         try {
            CallableStatement deleteTripEntries = DBConnection.getInstance().getConnection().prepareCall(sql);
            deleteTripEntries.setInt(1, tripID);
            
            int rowCount = deleteTripEntries.executeUpdate();
            
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
