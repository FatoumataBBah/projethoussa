/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quingestion;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jedda
 */
public class stock extends javax.swing.JFrame {

    /**
     * Creates new form stock
     */
    boolean click=false;
    Connxion conn=new Connxion();
    Statement stm;
    ResultSet Rs;
    JFrame mainFrame;
  
   public stock(JFrame frame){
       initComponents();
       DefaultTableModel model=new DefaultTableModel();
       mainFrame=frame;
       
       
       
       
       
        model.addColumn("Produit");
        model.addColumn("Quincaillerie");
        model.addColumn("Quantite");
        model.addColumn("Prix");

        try{
            stm=conn.ObtenirConnexion().createStatement();
            ResultSet Rs=stm.executeQuery("Select * from stock");
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getString("produit"),Rs.getString("quincaillerie"),Rs.getString("quantite"),Rs.getString("prix")});
            }
        }catch(Exception e){System.err.println(e);}
       tabStock.setModel(model);   
       setVisible(true);
   }
        
    
    
     
     
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        stock = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        element = new javax.swing.JComboBox<>();
        liste = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valeur = new javax.swing.JComboBox<>();
        rech = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabStock = new javax.swing.JTable();
        titre = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        stock.setBackground(new java.awt.Color(255, 154, 0));
        stock.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 18)); // NOI18N
        stock.setText("liste globale");
        stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockMouseClicked(evt);
            }
        });
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(251, 231, 152));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Recherche ");

        element.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        element.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "produit", "quincaillerie", "prix", "quantite" }));
        element.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementActionPerformed(evt);
            }
        });

        liste.setBackground(new java.awt.Color(0, 0, 255));
        liste.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        liste.setForeground(new java.awt.Color(255, 255, 255));
        liste.setText("valider");
        liste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeMouseClicked(evt);
            }
        });
        liste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Type de recherche :");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Choisissez :");

        valeur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        valeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valeurActionPerformed(evt);
            }
        });

        rech.setBackground(new java.awt.Color(0, 0, 255));
        rech.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rech.setForeground(new java.awt.Color(255, 255, 255));
        rech.setText("OK");
        rech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechMouseClicked(evt);
            }
        });
        rech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(element, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(liste))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valeur, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rech, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(element, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(valeur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liste)
                    .addComponent(rech))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabStock);

        titre.setBackground(new java.awt.Color(0, 0, 255));
        titre.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(0, 0, 255));
        titre.setText("LES STOCKS DE PRODUITS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(stock))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(146, 146, 146)
                                        .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(stock)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formWindowOpened

    private void rechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechActionPerformed
        // TODO add your handling code here:

        if(click){
            DefaultTableModel model=new DefaultTableModel();
            String elmt=element.getSelectedItem().toString();

            String val=valeur.getSelectedItem().toString();
            model.addColumn("Produit");
            model.addColumn("Quincaillerie");
            model.addColumn("Quantite");
            model.addColumn("Prix");

            try{
                stm=conn.ObtenirConnexion().createStatement();
                ResultSet Rs=stm.executeQuery("Select * from stock where "+elmt+"='"+val+"'");
                while(Rs.next()){
                    model.addRow(new Object[]{Rs.getString("produit"),Rs.getString("quincaillerie"),Rs.getString("quantite"),Rs.getString("prix")});
                }
            }catch(Exception e){System.err.println(e);}
            tabStock.setModel(model);}
        else  JOptionPane.showMessageDialog(null,"Validez dabord le type de recherche");

    }//GEN-LAST:event_rechActionPerformed

    private void rechMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rechMouseClicked

    private void valeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valeurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valeurActionPerformed

    private void listeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeActionPerformed
        // TODO add your handling code here:

        click=true;
        DefaultComboBoxModel liste=new DefaultComboBoxModel();

        String attribut=element.getSelectedItem().toString();
        try{
            stm=conn.ObtenirConnexion().createStatement();
            ResultSet Rs=stm.executeQuery("Select "+attribut+" from stock ");
            while(Rs.next()){
                liste.addElement(Rs.getString(attribut));

            }
            valeur.setModel(liste);
        }catch(Exception e){System.err.println(e);}
    }//GEN-LAST:event_listeActionPerformed

    private void listeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeMouseClicked
        // TODO add your handling code here:
        click=true;
    }//GEN-LAST:event_listeMouseClicked

    private void elementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementActionPerformed
        // TODO add your handling code here:
        click=false;
    }//GEN-LAST:event_elementActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockActionPerformed

    private void stockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=new DefaultTableModel();

        model.addColumn("Produit");
        model.addColumn("Quincaillerie");
        model.addColumn("Quantite");
        model.addColumn("Prix");

        try{
            stm=conn.ObtenirConnexion().createStatement();
            ResultSet Rs=stm.executeQuery("Select * from stock");
            while(Rs.next()){
                model.addRow(new Object[]{Rs.getString("produit"),Rs.getString("quincaillerie"),Rs.getString("quantite"),Rs.getString("prix")});
            }
        }catch(Exception e){System.err.println(e);}
        tabStock.setModel(model);
    }//GEN-LAST:event_stockMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       mainFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosed
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> element;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton liste;
    private javax.swing.JButton rech;
    private javax.swing.JButton stock;
    private javax.swing.JTable tabStock;
    private javax.swing.JLabel titre;
    private javax.swing.JComboBox<String> valeur;
    // End of variables declaration//GEN-END:variables
}
