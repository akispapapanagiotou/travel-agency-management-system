package system;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    private final Color mouseEnteredButtonColor;
    private final Color mouseExitedButtonColor;
    
    public Dashboard() {
        initComponents();
        displayHomePage();
            
        /* Button Colors */        
        mouseEnteredButtonColor = new Color(255,106,53);
        mouseExitedButtonColor = new Color(45,62,80);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleAppClosing();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        welcomeMessage = new javax.swing.JLabel();
        sidePanel = new javax.swing.JPanel();
        homePageTitlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageDataTitlePanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        logOutTitlePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        travelAgencyIconPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JTabbedPane();
        homePagePanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        noOfBranchesLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        noOfWorkersLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totalIncomeLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        expensesPerBranchTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservationsPerTripTable = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        noOfAdminsLabel = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        noOfGuidesLabel = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        noOfDriversLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        noOfITManagersLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        manageDataPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        branch = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        worker = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        admin = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        phones = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        manages = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        languages = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        driver = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        event = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        guide = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        trip = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        travel_to = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        reservation = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        destination = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        offers = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard | Travel Agency Management System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(255, 106, 53));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Travel Agency Management System");

        welcomeMessage.setFont(new java.awt.Font("Calibri", 1, 26)); // NOI18N
        welcomeMessage.setForeground(new java.awt.Color(255, 255, 255));
        welcomeMessage.setText("welcome message");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(welcomeMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(welcomeMessage))
                .addContainerGap())
        );

        dashboardPanel.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        sidePanel.setBackground(new java.awt.Color(45, 62, 80));
        sidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homePageTitlePanel.setBackground(new java.awt.Color(45, 62, 80));
        homePageTitlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePageTitlePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePageTitlePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePageTitlePanelMouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(45, 62, 80));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home Page");

        javax.swing.GroupLayout homePageTitlePanelLayout = new javax.swing.GroupLayout(homePageTitlePanel);
        homePageTitlePanel.setLayout(homePageTitlePanelLayout);
        homePageTitlePanelLayout.setHorizontalGroup(
            homePageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePageTitlePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        homePageTitlePanelLayout.setVerticalGroup(
            homePageTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePageTitlePanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        sidePanel.add(homePageTitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 210, 50));

        manageDataTitlePanel.setBackground(new java.awt.Color(45, 62, 80));
        manageDataTitlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageDataTitlePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageDataTitlePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageDataTitlePanelMouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(45, 62, 80));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manage Data");

        javax.swing.GroupLayout manageDataTitlePanelLayout = new javax.swing.GroupLayout(manageDataTitlePanel);
        manageDataTitlePanel.setLayout(manageDataTitlePanelLayout);
        manageDataTitlePanelLayout.setHorizontalGroup(
            manageDataTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageDataTitlePanelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        manageDataTitlePanelLayout.setVerticalGroup(
            manageDataTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageDataTitlePanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        sidePanel.add(manageDataTitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 210, 50));

        logOutTitlePanel.setBackground(new java.awt.Color(45, 62, 80));
        logOutTitlePanel.setForeground(new java.awt.Color(255, 255, 255));
        logOutTitlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutTitlePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutTitlePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutTitlePanelMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Log Out");

        javax.swing.GroupLayout logOutTitlePanelLayout = new javax.swing.GroupLayout(logOutTitlePanel);
        logOutTitlePanel.setLayout(logOutTitlePanelLayout);
        logOutTitlePanelLayout.setHorizontalGroup(
            logOutTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logOutTitlePanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        logOutTitlePanelLayout.setVerticalGroup(
            logOutTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logOutTitlePanelLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        sidePanel.add(logOutTitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 210, 40));

        travelAgencyIconPanel.setBackground(new java.awt.Color(45, 62, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/travel agency icon.png"))); // NOI18N

        javax.swing.GroupLayout travelAgencyIconPanelLayout = new javax.swing.GroupLayout(travelAgencyIconPanel);
        travelAgencyIconPanel.setLayout(travelAgencyIconPanelLayout);
        travelAgencyIconPanelLayout.setHorizontalGroup(
            travelAgencyIconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(travelAgencyIconPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        travelAgencyIconPanelLayout.setVerticalGroup(
            travelAgencyIconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, travelAgencyIconPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sidePanel.add(travelAgencyIconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, -1));

        dashboardPanel.add(sidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 610));

        mainPanel.setBackground(new java.awt.Color(235, 235, 235));

        jPanel6.setBackground(new java.awt.Color(235, 235, 235));

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 106, 53)));

        noOfBranchesLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        noOfBranchesLabel.setForeground(new java.awt.Color(0, 0, 0));
        noOfBranchesLabel.setText("16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(noOfBranchesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(noOfBranchesLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(235, 235, 235));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("No of Branches");

        jLabel11.setBackground(new java.awt.Color(235, 235, 235));
        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("No of Workers");

        jPanel2.setBackground(new java.awt.Color(200, 200, 200));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 106, 53)));

        noOfWorkersLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        noOfWorkersLabel.setForeground(new java.awt.Color(0, 0, 0));
        noOfWorkersLabel.setText("16");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(noOfWorkersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(noOfWorkersLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 106, 53)));

        totalIncomeLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        totalIncomeLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalIncomeLabel.setText("1666");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(totalIncomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(totalIncomeLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel14.setBackground(new java.awt.Color(235, 235, 235));
        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Total Income from Trips");

        expensesPerBranchTable.setBackground(new java.awt.Color(200, 200, 200));
        expensesPerBranchTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        expensesPerBranchTable.setForeground(new java.awt.Color(0, 0, 0));
        expensesPerBranchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Branch", "Expenses in €"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        expensesPerBranchTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        expensesPerBranchTable.setRowHeight(25);
        expensesPerBranchTable.setSelectionBackground(new java.awt.Color(255, 106, 53));
        expensesPerBranchTable.setShowGrid(true);
        expensesPerBranchTable.getTableHeader().setResizingAllowed(false);
        expensesPerBranchTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(expensesPerBranchTable);

        reservationsPerTripTable.setBackground(new java.awt.Color(200, 200, 200));
        reservationsPerTripTable.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        reservationsPerTripTable.setForeground(new java.awt.Color(0, 0, 0));
        reservationsPerTripTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip", "Reservations"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservationsPerTripTable.setRowHeight(25);
        reservationsPerTripTable.setSelectionBackground(new java.awt.Color(255, 106, 53));
        reservationsPerTripTable.setShowGrid(true);
        reservationsPerTripTable.getTableHeader().setResizingAllowed(false);
        reservationsPerTripTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(reservationsPerTripTable);

        jLabel22.setBackground(new java.awt.Color(235, 235, 235));
        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("No of Admins");

        jPanel14.setBackground(new java.awt.Color(200, 200, 200));
        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 106, 53)));

        noOfAdminsLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        noOfAdminsLabel.setForeground(new java.awt.Color(0, 0, 0));
        noOfAdminsLabel.setText("16");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(noOfAdminsLabel)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(noOfAdminsLabel)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(200, 200, 200));
        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 106, 53)));

        noOfGuidesLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        noOfGuidesLabel.setForeground(new java.awt.Color(0, 0, 0));
        noOfGuidesLabel.setText("16");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(noOfGuidesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(noOfGuidesLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel28.setBackground(new java.awt.Color(235, 235, 235));
        jLabel28.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("No of Guides");

        jPanel16.setBackground(new java.awt.Color(200, 200, 200));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 106, 53)));

        noOfDriversLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        noOfDriversLabel.setForeground(new java.awt.Color(0, 0, 0));
        noOfDriversLabel.setText("16");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(noOfDriversLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(noOfDriversLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel26.setBackground(new java.awt.Color(235, 235, 235));
        jLabel26.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("No of Drivers");

        jPanel15.setBackground(new java.awt.Color(200, 200, 200));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 0, 0, new java.awt.Color(255, 106, 53)));

        noOfITManagersLabel.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        noOfITManagersLabel.setForeground(new java.awt.Color(0, 0, 0));
        noOfITManagersLabel.setText("16");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(noOfITManagersLabel)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(noOfITManagersLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel24.setBackground(new java.awt.Color(235, 235, 235));
        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("No of IT Managers");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 63, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(96, 96, 96))
        );

        javax.swing.GroupLayout homePagePanelLayout = new javax.swing.GroupLayout(homePagePanel);
        homePagePanel.setLayout(homePagePanelLayout);
        homePagePanelLayout.setHorizontalGroup(
            homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePagePanelLayout.setVerticalGroup(
            homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.addTab("tab1", homePagePanel);

        jPanel7.setBackground(new java.awt.Color(235, 235, 235));

        branch.setBackground(new java.awt.Color(200, 200, 200));
        branch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                branchMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Branch");

        javax.swing.GroupLayout branchLayout = new javax.swing.GroupLayout(branch);
        branch.setLayout(branchLayout);
        branchLayout.setHorizontalGroup(
            branchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, branchLayout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        branchLayout.setVerticalGroup(
            branchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, branchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(26, 26, 26))
        );

        worker.setBackground(new java.awt.Color(200, 200, 200));
        worker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workerMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Worker");

        javax.swing.GroupLayout workerLayout = new javax.swing.GroupLayout(worker);
        worker.setLayout(workerLayout);
        workerLayout.setHorizontalGroup(
            workerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workerLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        workerLayout.setVerticalGroup(
            workerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        admin.setBackground(new java.awt.Color(200, 200, 200));
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Admin");

        javax.swing.GroupLayout adminLayout = new javax.swing.GroupLayout(admin);
        admin.setLayout(adminLayout);
        adminLayout.setHorizontalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel15)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        adminLayout.setVerticalGroup(
            adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(27, 27, 27))
        );

        phones.setBackground(new java.awt.Color(200, 200, 200));
        phones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phonesMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Phones");

        javax.swing.GroupLayout phonesLayout = new javax.swing.GroupLayout(phones);
        phones.setLayout(phonesLayout);
        phonesLayout.setHorizontalGroup(
            phonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phonesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        phonesLayout.setVerticalGroup(
            phonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phonesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel16)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        manages.setBackground(new java.awt.Color(200, 200, 200));
        manages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managesMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Manages");

        javax.swing.GroupLayout managesLayout = new javax.swing.GroupLayout(manages);
        manages.setLayout(managesLayout);
        managesLayout.setHorizontalGroup(
            managesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managesLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        managesLayout.setVerticalGroup(
            managesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managesLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        languages.setBackground(new java.awt.Color(200, 200, 200));
        languages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                languagesMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Languages");

        javax.swing.GroupLayout languagesLayout = new javax.swing.GroupLayout(languages);
        languages.setLayout(languagesLayout);
        languagesLayout.setHorizontalGroup(
            languagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, languagesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        languagesLayout.setVerticalGroup(
            languagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, languagesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(22, 22, 22))
        );

        driver.setBackground(new java.awt.Color(200, 200, 200));
        driver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                driverMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Driver");

        javax.swing.GroupLayout driverLayout = new javax.swing.GroupLayout(driver);
        driver.setLayout(driverLayout);
        driverLayout.setHorizontalGroup(
            driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, driverLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(54, 54, 54))
        );
        driverLayout.setVerticalGroup(
            driverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        event.setBackground(new java.awt.Color(200, 200, 200));
        event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Event");

        javax.swing.GroupLayout eventLayout = new javax.swing.GroupLayout(event);
        event.setLayout(eventLayout);
        eventLayout.setHorizontalGroup(
            eventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(50, 50, 50))
        );
        eventLayout.setVerticalGroup(
            eventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(22, 22, 22))
        );

        guide.setBackground(new java.awt.Color(200, 200, 200));
        guide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guideMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Guide");

        javax.swing.GroupLayout guideLayout = new javax.swing.GroupLayout(guide);
        guide.setLayout(guideLayout);
        guideLayout.setHorizontalGroup(
            guideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guideLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel21)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        guideLayout.setVerticalGroup(
            guideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guideLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(22, 22, 22))
        );

        trip.setBackground(new java.awt.Color(200, 200, 200));
        trip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tripMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Trip");

        javax.swing.GroupLayout tripLayout = new javax.swing.GroupLayout(trip);
        trip.setLayout(tripLayout);
        tripLayout.setHorizontalGroup(
            tripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tripLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tripLayout.setVerticalGroup(
            tripLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tripLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        travel_to.setBackground(new java.awt.Color(200, 200, 200));
        travel_to.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                travel_toMouseClicked(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Travel-to");

        javax.swing.GroupLayout travel_toLayout = new javax.swing.GroupLayout(travel_to);
        travel_to.setLayout(travel_toLayout);
        travel_toLayout.setHorizontalGroup(
            travel_toLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(travel_toLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel25)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        travel_toLayout.setVerticalGroup(
            travel_toLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, travel_toLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(26, 26, 26))
        );

        reservation.setBackground(new java.awt.Color(200, 200, 200));
        reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservationMouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Reservation");

        javax.swing.GroupLayout reservationLayout = new javax.swing.GroupLayout(reservation);
        reservation.setLayout(reservationLayout);
        reservationLayout.setHorizontalGroup(
            reservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reservationLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel27)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        reservationLayout.setVerticalGroup(
            reservationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reservationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addGap(26, 26, 26))
        );

        destination.setBackground(new java.awt.Color(200, 200, 200));
        destination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destinationMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Destination");

        javax.swing.GroupLayout destinationLayout = new javax.swing.GroupLayout(destination);
        destination.setLayout(destinationLayout);
        destinationLayout.setHorizontalGroup(
            destinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel29)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        destinationLayout.setVerticalGroup(
            destinationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, destinationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(26, 26, 26))
        );

        offers.setBackground(new java.awt.Color(200, 200, 200));
        offers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                offersMouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Offers");

        javax.swing.GroupLayout offersLayout = new javax.swing.GroupLayout(offers);
        offers.setLayout(offersLayout);
        offersLayout.setHorizontalGroup(
            offersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, offersLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(57, 57, 57))
        );
        offersLayout.setVerticalGroup(
            offersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, offersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(27, 27, 27))
        );

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 27)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Select the table you want to manage:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(languages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(worker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(event, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(reservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(travel_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(offers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel33)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(worker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(branch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(languages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(event, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(driver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(destination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(offers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(travel_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout manageDataPanelLayout = new javax.swing.GroupLayout(manageDataPanel);
        manageDataPanel.setLayout(manageDataPanelLayout);
        manageDataPanelLayout.setHorizontalGroup(
            manageDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manageDataPanelLayout.setVerticalGroup(
            manageDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.addTab("tab2", manageDataPanel);

        dashboardPanel.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 1070, 640));

        getContentPane().add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homePageTitlePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageTitlePanelMouseEntered
        homePageTitlePanel.setBackground(mouseEnteredButtonColor);
    }//GEN-LAST:event_homePageTitlePanelMouseEntered

    private void manageDataTitlePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDataTitlePanelMouseEntered
        manageDataTitlePanel.setBackground(mouseEnteredButtonColor);
    }//GEN-LAST:event_manageDataTitlePanelMouseEntered

    private void manageDataTitlePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDataTitlePanelMouseExited
       manageDataTitlePanel.setBackground(mouseExitedButtonColor);
    }//GEN-LAST:event_manageDataTitlePanelMouseExited

    private void logOutTitlePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutTitlePanelMouseEntered
       logOutTitlePanel.setBackground(mouseEnteredButtonColor);
    }//GEN-LAST:event_logOutTitlePanelMouseEntered

    private void logOutTitlePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutTitlePanelMouseExited
        logOutTitlePanel.setBackground(mouseExitedButtonColor);
    }//GEN-LAST:event_logOutTitlePanelMouseExited

    private void manageDataTitlePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDataTitlePanelMouseClicked
        mainPanel.setSelectedIndex(1);
    }//GEN-LAST:event_manageDataTitlePanelMouseClicked

    private void homePageTitlePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageTitlePanelMouseClicked
        mainPanel.setSelectedIndex(0);
    }//GEN-LAST:event_homePageTitlePanelMouseClicked

    private void homePageTitlePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageTitlePanelMouseExited
        homePageTitlePanel.setBackground(mouseExitedButtonColor);
    }//GEN-LAST:event_homePageTitlePanelMouseExited

    private void logOutTitlePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutTitlePanelMouseClicked
       int dialogOption = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Warning", JOptionPane.YES_NO_OPTION);
       if (dialogOption == 0) {
           logout();
           
           LoginForm loginForm = new LoginForm();
           loginForm.setVisible(true);
       }
    }//GEN-LAST:event_logOutTitlePanelMouseClicked

    private void branchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_branchMouseClicked
        ManageBranch manageBranch = new ManageBranch();
        manageBranch.setVisible(true);
        dispose();
    }//GEN-LAST:event_branchMouseClicked

    private void phonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phonesMouseClicked
        ManagePhones managePhones = new ManagePhones();
        managePhones.setVisible(true);
        dispose();
    }//GEN-LAST:event_phonesMouseClicked

    private void workerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workerMouseClicked
        ManageWorker manageWorker = new ManageWorker();
        manageWorker.setVisible(true);
        dispose();
    }//GEN-LAST:event_workerMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        ManageAdmin manageAdmin = new ManageAdmin();
        manageAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_adminMouseClicked

    private void managesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managesMouseClicked
        ManageManages manageManages = new ManageManages();
        manageManages.setVisible(true);
        dispose();
    }//GEN-LAST:event_managesMouseClicked

    private void driverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_driverMouseClicked
        ManageDriver manageDriver = new ManageDriver();
        manageDriver.setVisible(true);
        dispose();
    }//GEN-LAST:event_driverMouseClicked

    private void guideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideMouseClicked
         ManageGuide manageGuide = new ManageGuide();
         manageGuide.setVisible(true);
         dispose();
    }//GEN-LAST:event_guideMouseClicked

    private void languagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_languagesMouseClicked
         ManageLanguages manageLanguages = new ManageLanguages();
         manageLanguages.setVisible(true);
         dispose();
    }//GEN-LAST:event_languagesMouseClicked

    private void tripMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tripMouseClicked
         ManageTrip manageTrip = new ManageTrip();
         manageTrip.setVisible(true);
         dispose();
    }//GEN-LAST:event_tripMouseClicked

    private void eventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventMouseClicked
         ManageEvent manageEvent = new ManageEvent();
         manageEvent.setVisible(true);
         dispose();
    }//GEN-LAST:event_eventMouseClicked

    private void reservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservationMouseClicked
         ManageReservation manageReservation = new ManageReservation();
         manageReservation.setVisible(true);
         dispose();
    }//GEN-LAST:event_reservationMouseClicked

    private void destinationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinationMouseClicked
         ManageDestination manageDestination = new ManageDestination();
         manageDestination.setVisible(true);
         dispose();
    }//GEN-LAST:event_destinationMouseClicked

    private void travel_toMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travel_toMouseClicked
         ManageTravelTo manageTravelTo = new ManageTravelTo();
         manageTravelTo.setVisible(true);
         dispose();
    }//GEN-LAST:event_travel_toMouseClicked

    private void offersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offersMouseClicked
         ManageOffers manageOffers = new ManageOffers();
         manageOffers.setVisible(true);
         dispose();
    }//GEN-LAST:event_offersMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin;
    private javax.swing.JPanel branch;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel destination;
    private javax.swing.JPanel driver;
    private javax.swing.JPanel event;
    private javax.swing.JTable expensesPerBranchTable;
    private javax.swing.JPanel guide;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel homePagePanel;
    private javax.swing.JPanel homePageTitlePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel languages;
    private javax.swing.JPanel logOutTitlePanel;
    private javax.swing.JTabbedPane mainPanel;
    private javax.swing.JPanel manageDataPanel;
    private javax.swing.JPanel manageDataTitlePanel;
    private javax.swing.JPanel manages;
    private javax.swing.JLabel noOfAdminsLabel;
    private javax.swing.JLabel noOfBranchesLabel;
    private javax.swing.JLabel noOfDriversLabel;
    private javax.swing.JLabel noOfGuidesLabel;
    private javax.swing.JLabel noOfITManagersLabel;
    private javax.swing.JLabel noOfWorkersLabel;
    private javax.swing.JPanel offers;
    private javax.swing.JPanel phones;
    private javax.swing.JPanel reservation;
    private javax.swing.JTable reservationsPerTripTable;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel totalIncomeLabel;
    private javax.swing.JPanel travelAgencyIconPanel;
    private javax.swing.JPanel travel_to;
    private javax.swing.JPanel trip;
    private javax.swing.JLabel welcomeMessage;
    private javax.swing.JPanel worker;
    // End of variables declaration//GEN-END:variables

    public void displayWelcomeMessage(){
        String sql = "{CALL get_active_IT_manager()}";
        
        try {
            CallableStatement getActiveITManager = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getActiveITManager.executeQuery();
            
            if (result.next()) {
                String activeITManager = result.getString("Username");
                welcomeMessage.setText("Welcome " + activeITManager);
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayExpensesPerBranchTable(){
        String sql = "{CALL get_branch_expenses()}";
        
        expensesPerBranchTable.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 17));
        expensesPerBranchTable.getColumnModel().getColumn(0).setPreferredWidth(25);
        
        // Create a header renderer for header 
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255, 106, 53));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        // Create a center renderer for cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for (int i = 0; i < expensesPerBranchTable.getColumnCount(); i++) {
            expensesPerBranchTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            expensesPerBranchTable.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        try {
            CallableStatement getBranchExpenses = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getBranchExpenses.executeQuery();
            
            while (result.next()) {
                int branchId = result.getInt("Branch ID");
                float expenses = result.getFloat("Expenses");
                
                Object tableData[] = {branchId, expenses};
                DefaultTableModel tableModel = (DefaultTableModel)expensesPerBranchTable.getModel();
                
                tableModel.addRow(tableData);
            }
            
            if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
    }
    
    public void displayReservationsPerTripTable(){
        String sql = "{CALL get_trip_reservations()}";
        
        reservationsPerTripTable.getTableHeader().setFont(new Font("Calibri", Font.PLAIN, 17));
        reservationsPerTripTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        
        // Create a header renderer for header 
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(255, 106, 53));
        headerRenderer.setForeground(Color.WHITE);
        headerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        // Create a center renderer for cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        
        for (int i = 0; i < expensesPerBranchTable.getColumnCount(); i++) {
            reservationsPerTripTable.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            reservationsPerTripTable.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        try {
            CallableStatement getTripReservations = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getTripReservations.executeQuery();
            
            while (result.next()) {
                int tripId = result.getInt("Trip ID");
                int noOfReservations = result.getInt("Number of Reservations");
                
                Object tableData[] = {tripId, noOfReservations};
                DefaultTableModel tableModel = (DefaultTableModel)reservationsPerTripTable.getModel();
                
                tableModel.addRow(tableData);
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayTotalIncome(){
        String sql = "{CALL get_total_income()}";
        
        try {
            CallableStatement getTotalIncome = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getTotalIncome.executeQuery();
            
            if (result.next()) {
                int totalIncome = result.getInt("Total Income");
                totalIncomeLabel.setText(Integer.toString(totalIncome)  + " €");
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayNoOfBranches(){
        String sql = "{CALL get_No_of_branches()}";
        
        try {
            CallableStatement getNoOfBranches = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getNoOfBranches.executeQuery();
            
            if (result.next()) {
                int noOfBranches = result.getInt("No of branches");
                noOfBranchesLabel.setText(Integer.toString(noOfBranches));
            }
            if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayNoOfWorkers(){
        String sql = "{CALL get_No_of_workers()}";
        
        try {
            CallableStatement getNoOfWorkers = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getNoOfWorkers.executeQuery();
            
            if (result.next()) {
                int noOfWorkers = result.getInt("No of workers");
                noOfWorkersLabel.setText(Integer.toString(noOfWorkers));
            }
            if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayNoOfDrivers(){
        String sql = "{CALL get_No_of_drivers()}";
        
        try {
            CallableStatement getNoOfDrivers = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getNoOfDrivers.executeQuery();
            
            if (result.next()) {
                int noOfDrivers = result.getInt("No of drivers");
                noOfDriversLabel.setText(Integer.toString(noOfDrivers));
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayNoOfGuides(){
        String sql = "{CALL get_No_of_guides()}";
        
        try {
            CallableStatement getNoOfGuides = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getNoOfGuides.executeQuery();
            
            if (result.next()) {
                int noOfGuides = result.getInt("No of guides");
                noOfGuidesLabel.setText(Integer.toString(noOfGuides));
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayNoOfITManagers(){
        String sql = "{CALL get_No_of_IT_managers()}";
        
        try {
            CallableStatement getNoOfITManagers = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getNoOfITManagers.executeQuery();
            
            if (result.next()) {
                int noOfITManagers = result.getInt("No of IT Managers");
                noOfITManagersLabel.setText(Integer.toString(noOfITManagers));
            }
            if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayNoOfAdmins(){
        String sql = "{CALL get_No_of_admins()}";
        
        try {
            CallableStatement getNoOfAdmins = DBConnection.getInstance().getConnection().prepareCall(sql);
            ResultSet result = getNoOfAdmins.executeQuery();
            
            if (result.next()) {
                int noOfAdmins = result.getInt("No of admins");
                noOfAdminsLabel.setText(Integer.toString(noOfAdmins));
            }
             if (result!=null) {
                result.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void displayHomePage(){
        displayWelcomeMessage();
        displayExpensesPerBranchTable();
        displayReservationsPerTripTable();
        displayTotalIncome();
        displayNoOfWorkers();
        displayNoOfBranches();
        displayNoOfDrivers();
        displayNoOfGuides();
        displayNoOfITManagers();
        displayNoOfAdmins();
    }
    
    public void logout() {
        String sql = "{CALL set_IT_managers_inactive()}";
                
        try {
            CallableStatement setITManagersInactive = DBConnection.getInstance().getConnection().prepareCall(sql);
            setITManagersInactive.executeQuery();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        dispose();
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
