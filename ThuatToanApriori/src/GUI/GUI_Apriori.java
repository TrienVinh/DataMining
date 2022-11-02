package GUI;

import BUS.BUS_FrequentItemSet;
import BUS.BUS_Transaction;
import DTO.DTO_AssociationItemSet;
import DTO.DTO_FrequentItemSet;
import DTO.DTO_Transaction;
import UTIL.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_Apriori extends javax.swing.JFrame {

    static ArrayList<String> ItemSet = new ArrayList<>();
    static ArrayList<DTO_FrequentItemSet> ListOfFrequentItemSet = new ArrayList<>();
    private ArrayList<DTO_Transaction> ListOfTransaction;
    private DefaultTableModel TransactionModel;

    Verification v = new Verification();

    public GUI_Apriori() throws IOException {
        Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        initComponents();
        ListOfTransaction = new ArrayList<>();
        TransactionModel = (DefaultTableModel) jTable1.getModel();
        LoadData();
        this.setBounds((ScreenSize.width - 840) / 2, (ScreenSize.height - 500) / 2, 840, 500);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apriori Algorithm And Association Rule");

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List Of Items");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Item(s)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jTable1.setPreferredSize(new java.awt.Dimension(300, 1000));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Minimum Support");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Minimum Confidence");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Start");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Input1 = jTextField1.getText();
        String Input2 = jTextField2.getText();
        if (!Input1.isEmpty() && !Input2.isEmpty()) {
            double MinimumSupport = v.VerficateMinimumSupport(Input1);
            double MinimumConfidence = v.VerficateMinimumSupport(Input2);
            if (MinimumSupport != -1 && MinimumConfidence != -1) {
                jTextArea1.setText("");
                jTextArea1.append("Frequent ItemSet: \n");
                BUS_Transaction Transaction = new BUS_Transaction();
                ArrayList<String> ItemSetOfTransaction = null;
                try {
                    ItemSetOfTransaction = Transaction.GetItemSet();
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Apriori.class.getName()).log(Level.SEVERE, null, ex);
                }
                ArrayList<DTO_Transaction> ListOfTransaction = null;
                try {
                    ListOfTransaction = Transaction.GetData();
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Apriori.class.getName()).log(Level.SEVERE, null, ex);
                }
                BUS_FrequentItemSet FrequentItemSet = new BUS_FrequentItemSet();
                ArrayList<ArrayList<String>> X = new ArrayList<>();
                ArrayList<ArrayList<String>> Y = new ArrayList<>();
                Operation Operation = new Operation();
                ItemSet = Transaction.GetItem(ListOfTransaction);
                int Current = 1;
                while (Current <= ItemSetOfTransaction.size()) {
                    ArrayList<ArrayList<String>> ListOfItemSet = new ArrayList<>();
                    ArrayList<ArrayList<Integer>> ArrayListOfInteger = new ArrayList<>();
                    ItemSet = Operation.RemoveExistingItem(ItemSet);
                    int[] ArrayOfInteger = new int[ItemSet.size() + 1];
                    ArrayOfInteger = FrequentItemSet.CreateArrayOfInteger(ItemSet.size() + 1);
                    ArrayListOfInteger = FrequentItemSet.CreateSubItemSet(1, ItemSet.size(), Current, ArrayOfInteger);
                    ListOfItemSet = FrequentItemSet.MappingItemSet(ArrayListOfInteger, ItemSet, Current);
                    ListOfFrequentItemSet = FrequentItemSet.CountFrequency(ItemSetOfTransaction, ListOfItemSet, Current);
                    ListOfFrequentItemSet = FrequentItemSet.FilterItemSet(ListOfFrequentItemSet, (MinimumSupport * ListOfTransaction.size()) / 100);
                    if (!ListOfFrequentItemSet.isEmpty()) {
                        Current++;
                    } else {
                        break;
                    }
                }
                for (int i = 0; i < ListOfFrequentItemSet.size(); i++) {
                    String FrequentItem = Operation.TurnItemSetIntoItem(ListOfFrequentItemSet.get(i).getItemSet());
                    jTextArea1.append(FrequentItem + ": (Support: " + Operation.RoundNumber((ListOfFrequentItemSet.get(i).getFrequency() / ListOfTransaction.size()) * 100) + "%)\n");
                }
                jTextArea1.append("\nAssociation Rule: \n");
                for (int i = 0; i < ListOfFrequentItemSet.size(); i++) {
                    X.add(ListOfFrequentItemSet.get(i).getItemSet());
                    if (ListOfFrequentItemSet.get(i).getItemSet().size() >= 2) {
                        Y.add(ListOfFrequentItemSet.get(i).getItemSet());
                    }
                }
                ArrayList<DTO_AssociationItemSet> ListOfAssociationItemSet = new ArrayList<>();
                int Index = 0;
                while (Index < Y.size()) {
                    ArrayList<String> Yp = Y.get(Index);
                    for (int i = 0; i < X.size(); i++) {
                        ArrayList<String> Xp = X.get(i);
                        int Count = 0;
                        ArrayList<String> TemporaryItemSet = new ArrayList<>();
                        for (int j = 0; j < Xp.size(); j++) {
                            if (Yp.contains(Xp.get(j))) {
                                TemporaryItemSet.add(Xp.get(j));
                                Count++;
                            }
                        }
                        if (Yp.size() != TemporaryItemSet.size()) {
                            if (Count == Xp.size()) {
                                DTO_AssociationItemSet AssociationItemSet = new DTO_AssociationItemSet();
                                AssociationItemSet.setConsequent(Yp);
                                AssociationItemSet.setAntecedent(TemporaryItemSet);
                                ListOfAssociationItemSet.add(AssociationItemSet);
                            }
                        }
                    }
                    Index++;
                }
                for (int j = 0; j < ListOfAssociationItemSet.size(); j++) {
                    String Xp = Operation.TurnItemSetIntoItem(ListOfAssociationItemSet.get(j).getAntecedent());
                    String Yp = Operation.TurnItemSetIntoItem(ListOfAssociationItemSet.get(j).getConsequent());
                    if (((double) FrequentItemSet.GetFrequency(ListOfFrequentItemSet, ListOfAssociationItemSet.get(j).getConsequent()) / (double) (FrequentItemSet.GetFrequency(ListOfFrequentItemSet, ListOfAssociationItemSet.get(j).getAntecedent()))) * 100 >= MinimumConfidence) {
                        jTextArea1.append(Xp + " --> " + Yp + ": (Confidence: " + Operation.RoundNumber(((double) FrequentItemSet.GetFrequency(ListOfFrequentItemSet, ListOfAssociationItemSet.get(j).getConsequent()) / (double) (FrequentItemSet.GetFrequency(ListOfFrequentItemSet, ListOfAssociationItemSet.get(j).getAntecedent()))) * 100) + "%)\n");
                    }
                }
            } else {
                if (MinimumConfidence == -1 && MinimumSupport == -1) {
                    JOptionPane.showMessageDialog(null, "Minimum support & minimum confidence is invalid !", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (MinimumSupport == -1) {
                        JOptionPane.showMessageDialog(null, "Minimum support is invalid !", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (MinimumConfidence == -1) {
                        JOptionPane.showMessageDialog(null, "Minimum confidence is invalid !", "Message", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            }
        } else {
            if (Input1.isEmpty() && Input2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please insert minimum support & minimum confidence !", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (Input1.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please insert minimum support !", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                if (Input2.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please insert minimum confidence !", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextArea1.setText("");
        try {
            LoadData();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Apriori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void LoadData() throws IOException {
        ListOfTransaction = new BUS_Transaction().GetData();
        TransactionModel.setRowCount(0);
        for (DTO_Transaction Transaction : ListOfTransaction) {
            TransactionModel.addRow(new Object[]{
                Transaction.getItems()
            });
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI_Apriori().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Apriori.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
