/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projethoussa;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class vente extends javax.swing.JFrame {
    Statement st;
    String q;
    private String quin;
    /**
     * Creates new form vente
     */
    public vente(String nom) {
        initComponents();
        quin = nom;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        art = new javax.swing.JLabel();
        quant = new javax.swing.JLabel();
        prix = new javax.swing.JLabel();
        mont = new javax.swing.JLabel();
        quantf = new javax.swing.JTextField();
        prixf = new javax.swing.JTextField();
        montf = new javax.swing.JTextField();
        val = new javax.swing.JButton();
        artcomb = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        art.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        art.setForeground(new java.awt.Color(0, 102, 255));
        art.setText(" Articles ");

        quant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quant.setForeground(new java.awt.Color(51, 102, 255));
        quant.setText("   Quantité");

        prix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prix.setForeground(new java.awt.Color(51, 102, 255));
        prix.setText(" Prix Unitaire");

        mont.setBackground(new java.awt.Color(255, 255, 255));
        mont.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mont.setForeground(new java.awt.Color(51, 102, 255));
        mont.setText(" Montant Reçu");

        val.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        val.setForeground(new java.awt.Color(51, 102, 255));
        val.setText("VALIDER");
        val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valActionPerformed(evt);
            }
        });

        artcomb.setForeground(new java.awt.Color(0, 51, 255));
        artcomb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ampoule", "cable", "ciment", "clou", "fil", "marteau", "peinture", "robinet", "serrure", "tourne vis", "tuyau", " " }));
        artcomb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artcombMouseClicked(evt);
            }
        });
        artcomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artcombActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("QUITTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mont, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(art, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prix, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantf)
                            .addComponent(prixf)
                            .addComponent(artcomb, 0, 188, Short.MAX_VALUE)
                            .addComponent(montf)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(val, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artcomb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(art, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quant))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prix)
                    .addComponent(prixf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(mont))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(montf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(val, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valActionPerformed
        double pv,prv=0,mont,rest=0;
        int quant1=1;
        Date dat = new Date();
         SimpleDateFormat fr = new SimpleDateFormat("yyyy-MM-dd");
         String d = fr.format(dat);
          String art1 = artcomb.getSelectedItem().toString();
          if(artcomb.getSelectedIndex()!= -1 ) {
          
          
         if (prixf.getText()!= " " && quantf.getText()!=" " && montf.getText()!=" ")  {
             try{
          pv = Double.parseDouble(prixf.getText());
          quant1 = Integer.parseInt(quantf.getText());
          prv = pv*quant1;
          mont = Double.parseDouble(montf.getText());
          rest = mont - prv;} catch (NumberFormatException e) {{JOptionPane.showMessageDialog(null, e);};}
          
        try{
        Connexion co1 = new Connexion();
        PreparedStatement pr1 = co1.Getcon().prepareStatement("insert into vente values (?,?,?,?,?)");
        pr1.setString(1,"Diop et Frere");
        pr1.setString(2,art1);
        pr1.setDate(3,java.sql.Date.valueOf(d));
        pr1.setInt(4,quant1);
         pr1.setDouble(5,prv);
         pr1.executeUpdate();
         pr1.close();
        
                  
            
        }catch ( SQLException e ) {JOptionPane.showMessageDialog(null, e);}  
        
        JOptionPane.showMessageDialog(null,"Operqtion reussi Vente: "+artcomb.getSelectedItem().toString() + " Quantite = "+quantf.getText() +" Prix Unitaire= "+prixf.getText() +"  Montant Reçu = "+montf.getText() +" Reste= "+rest); }
         else {JOptionPane.showMessageDialog(null, "Remplir correctement les champs ");}
        
      }
          else {JOptionPane.showMessageDialog(null, "Renseigner l'article choisi");}
           
    }//GEN-LAST:event_valActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         
    }//GEN-LAST:event_formWindowActivated

    private void artcombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artcombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artcombActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      close();
       
      espacegerant g1 = new espacegerant(quin);
      g1.setVisible(true);
      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void artcombMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artcombMouseClicked
        // String art = artcomb.getSelectedItem().toString();
         String art =artcomb.getSelectedItem().toString();
        if(artcomb.getSelectedIndex()!= -1 ) {          
        String s2 = "select prix from stock where produit='"+art+"' and quincaillerie='"+quin+"'";
        
       
         try{
        Connexion co2 = new Connexion();
        st = co2.Getcon().createStatement();
        ResultSet r3 = st.executeQuery(s2);
         
        while (r3.next()) {
              
             String p = r3.getString("prix");
              prixf.setText(p);     
             } 
         
                 
                 
             
         } catch ( SQLException e ) { ;}  
        
        }
         
    }//GEN-LAST:event_artcombMouseClicked
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel art;
    private javax.swing.JComboBox artcomb;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mont;
    private javax.swing.JTextField montf;
    private javax.swing.JLabel prix;
    private javax.swing.JTextField prixf;
    private javax.swing.JLabel quant;
    private javax.swing.JTextField quantf;
    private javax.swing.JButton val;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}