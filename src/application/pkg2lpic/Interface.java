package application.pkg2lpic;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Interface extends javax.swing.JFrame {

    static String path = null;
    String format_name = null;
    static int action_type = -1;
    static JLabel l;

    public Interface(String path) {
        this.path = path;

        initComponents();

        setLocationRelativeTo(null);

        rightPanel.setVisible(false);

        JButton b = new JButton();
        b.setText("Voir la Carte d'Identité");
        b.setSize(222, 40);
        b.setLocation(10, 20);
        b.setBorderPainted(false);
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.setDefaultCapable(false);
        b.setFocusPainted(false);
        b.setFont(new java.awt.Font("Dialog", 1, 14));
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setBackground(new java.awt.Color(230, 126, 34));
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCNIButtonActionPerformed(evt);
            }
        });
        b.setVisible(true);
        
        l = new JLabel();
        l.setSize(200, 40);
        l.setLocation(28, 90);
        l.setFont(new java.awt.Font("Dialog", 1, 16));
        l.setForeground(Color.ORANGE);
        l.setText("Vérification ...");
        l.setVisible(true);
        
        internalFrame.add(b);
        internalFrame.add(l);

        getWaitFiles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataList = new javax.swing.JList<>();
        rightPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        refuseButton = new javax.swing.JButton();
        internalFrame = new javax.swing.JInternalFrame();
        fromCountryLabel = new javax.swing.JLabel();
        reasonVisitLabel = new javax.swing.JLabel();
        timeVisitLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        refreshMenu = new javax.swing.JMenu();
        leaveMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arstotzka");
        setResizable(false);

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        dataList.setBackground(new java.awt.Color(255, 255, 255));
        dataList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataList);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setBackground(new java.awt.Color(51, 51, 51));
        nameLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Firstname LASTNAME");

        ageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ageLabel.setText("Age: - ans");

        heightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heightLabel.setText("Taille: - mètres");

        weightLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weightLabel.setText("Poids: - Kg");

        acceptButton.setBackground(new java.awt.Color(46, 204, 113));
        acceptButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        acceptButton.setForeground(new java.awt.Color(255, 255, 255));
        acceptButton.setText("ACCEPTER");
        acceptButton.setBorderPainted(false);
        acceptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acceptButton.setDefaultCapable(false);
        acceptButton.setFocusPainted(false);
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        refuseButton.setBackground(new java.awt.Color(231, 76, 60));
        refuseButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        refuseButton.setForeground(new java.awt.Color(255, 255, 255));
        refuseButton.setText("REFUSER");
        refuseButton.setBorderPainted(false);
        refuseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refuseButton.setDefaultCapable(false);
        refuseButton.setFocusPainted(false);
        refuseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refuseButtonActionPerformed(evt);
            }
        });

        internalFrame.setTitle("Vérification CNI");
        internalFrame.setVisible(true);

        javax.swing.GroupLayout internalFrameLayout = new javax.swing.GroupLayout(internalFrame.getContentPane());
        internalFrame.getContentPane().setLayout(internalFrameLayout);
        internalFrameLayout.setHorizontalGroup(
            internalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        internalFrameLayout.setVerticalGroup(
            internalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        fromCountryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fromCountryLabel.setText("Pays d'origine: -");

        reasonVisitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reasonVisitLabel.setText("Raison de la visite: -");

        timeVisitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeVisitLabel.setText("Durée de la visite:  - jours");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heightLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(weightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refuseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fromCountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reasonVisitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeVisitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(internalFrame, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(acceptButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(nameLabel)
                .addGap(26, 26, 26)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(heightLabel)
                    .addComponent(weightLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(internalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(fromCountryLabel)
                        .addGap(18, 18, 18)
                        .addComponent(reasonVisitLabel)
                        .addGap(18, 18, 18)
                        .addComponent(timeVisitLabel)))
                .addGap(18, 18, 18)
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refuseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        refreshMenu.setText("Rafraîchir");
        refreshMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshMenuMousePressed(evt);
            }
        });
        menuBar.add(refreshMenu);

        leaveMenu.setText("Quitter");
        leaveMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                leaveMenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                leaveMenuMouseReleased(evt);
            }
        });
        leaveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveMenuActionPerformed(evt);
            }
        });
        menuBar.add(leaveMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void getWaitFiles() {
        File repertoire = new File(path + "/ATTENTE");
        String liste[] = repertoire.list();

        DefaultListModel defaultListModel = new DefaultListModel();

        if (liste != null) {
            for (int i = 0; i < liste.length; i++) {
                defaultListModel.addElement(liste[i].replace("%", " ").replaceAll(".zip", ""));
            }
        } else {
            System.err.println("Nom de repertoire invalide");
        }

        dataList.setModel(defaultListModel);
    }

    public static void getFileData() {
        String file = path + "/TRAITEMENT/info.txt";
        ArrayList<String> lines = new ArrayList();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            lines.clear();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        nameLabel.setText(lines.get(1).substring(lines.get(1).indexOf("\"") + 1, lines.get(1).length() - 1)
                + " " + lines.get(0).substring(lines.get(0).indexOf("\"") + 1, lines.get(0).length() - 1));

        ageLabel.setText("Age: " + lines.get(2).substring(lines.get(2).indexOf("\"") + 1, lines.get(2).length() - 1) + " ans");

        heightLabel.setText("Taille: " + lines.get(3).substring(lines.get(3).indexOf("\"") + 1, lines.get(3).length() - 1) + " mètres");

        weightLabel.setText("Poids: " + lines.get(4).substring(lines.get(4).indexOf("\"") + 1, lines.get(4).length() - 1) + " kg");

        fromCountryLabel.setText("Pays d'origine: " + lines.get(5).substring(lines.get(5).indexOf("\"") + 1, lines.get(5).length() - 1));

        reasonVisitLabel.setText("Raison de la visite: " + lines.get(6).substring(lines.get(6).indexOf("\"") + 1, lines.get(6).length() - 1));

        timeVisitLabel.setText("Durée de la visite: " + lines.get(7).substring(lines.get(7).indexOf("\"") + 1, lines.get(7).length() - 1) + " jours");

        String format_firstname = lines.get(1).substring(lines.get(1).indexOf("\"") + 1);
        format_firstname = format_firstname.substring(0, 1);
        
        if (format_firstname.equalsIgnoreCase("m") || format_firstname.equalsIgnoreCase("t") || 
                format_firstname.equalsIgnoreCase("s") || format_firstname.equalsIgnoreCase("e")) {
            l.setLocation(30, 90);
            l.setForeground(Color.RED);
            l.setText("CNI rejetée !");
        } else {
            l.setLocation(34, 90);
            l.setForeground(new Color(46, 204, 113));
            l.setText("CNI valide !");
        }
        
        rightPanel.setVisible(true);
    }

    private void leaveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveMenuActionPerformed

    }//GEN-LAST:event_leaveMenuActionPerformed

    private void leaveMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveMenuMousePressed
        System.exit(0);
    }//GEN-LAST:event_leaveMenuMousePressed

    private void leaveMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveMenuMouseReleased

    }//GEN-LAST:event_leaveMenuMouseReleased

    private void refreshMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMenuMousePressed
        rightPanel.setVisible(false);

        getWaitFiles();
    }//GEN-LAST:event_refreshMenuMousePressed

    private void dataListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataListMouseClicked
        rightPanel.setVisible(false);

        enableAction(false);

        format_name = dataList.getSelectedValue().replace(" ", "%");

        actionProgress(-1);
    }//GEN-LAST:event_dataListMouseClicked

    private void viewCNIButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File(path + "/TRAITEMENT/doc.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        actionProgress(1);
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void refuseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refuseButtonActionPerformed
        actionProgress(0);
    }//GEN-LAST:event_refuseButtonActionPerformed

    public void actionProgress(int type) {
        if (type == -1) {
            try {
                ProcessBuilder pb = new ProcessBuilder("/bin/sh", path + "/treatment.sh", format_name);
                Process p = pb.start();
                p.waitFor();
            } catch (IOException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            enableAction(false);
            try {
                ProcessBuilder pb2 = new ProcessBuilder("/bin/sh", path + "/sentence.sh", "" + type, format_name);
                Process p2 = pb2.start();
                p2.waitFor();
            } catch (InterruptedException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new BackgroundWorker(type).execute();
            }

        });
    }

    public static void clearData() {
        nameLabel.setText("Firstname LASTNAME");
        ageLabel.setText("Age: - ans");
        heightLabel.setText("Taille: - mètres");
        weightLabel.setText("Poids: - Kg");
        fromCountryLabel.setText("Pays d'origine: -");
        reasonVisitLabel.setText("Raison de la visite: -");
        timeVisitLabel.setText("Durée de la visite:  - jours");
    }

    public static void enableAction(boolean stat) {
        dataList.setEnabled(stat);
        acceptButton.setEnabled(stat);
        refuseButton.setEnabled(stat);
    }

    public static void callBack(int type) {
        if (type == -1) {
            enableAction(true);
            clearData();
            getFileData();
        } else {
            rightPanel.setVisible(false);
            getWaitFiles();
            enableAction(true);
            clearData();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton acceptButton;
    public static javax.swing.JLabel ageLabel;
    public static javax.swing.JList<String> dataList;
    public static javax.swing.JLabel fromCountryLabel;
    public static javax.swing.JLabel heightLabel;
    public static javax.swing.JInternalFrame internalFrame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu leaveMenu;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JMenuBar menuBar;
    public static javax.swing.JLabel nameLabel;
    public static javax.swing.JLabel reasonVisitLabel;
    private javax.swing.JMenu refreshMenu;
    public static javax.swing.JButton refuseButton;
    public static javax.swing.JPanel rightPanel;
    public static javax.swing.JLabel timeVisitLabel;
    public static javax.swing.JLabel weightLabel;
    // End of variables declaration//GEN-END:variables
}
