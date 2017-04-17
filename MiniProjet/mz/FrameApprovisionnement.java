package mz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FrameApprovisionnement extends JFrame {
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameApprovisionnement frame = new FrameApprovisionnement("Q1");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private JComboBox<Produit> comboProduit = new JComboBox<Produit>();
	private JTextField txtQuantite;
	private Quincaillerie quincaillerie;

	public FrameApprovisionnement(String nom) {
		super("Gestion de Quincailleries");
		quincaillerie = Quincaillerie.valueOf(nom);
		if (quincaillerie==null) {
			JOptionPane.showMessageDialog(this, "Mauvaise Quincaillerie");
		}
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setForeground(Color.DARK_GRAY);
		table.setModel(new ApprovTableModel(new Object[][] {}));		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBorder(new LineBorder(Color.BLACK, 1));
		table.setBounds(173, 155, 443, 343);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		table.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
		table.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
		getContentPane().add(table);
		
		JLabel lblProduits = new JLabel("Produits");
		lblProduits.setHorizontalAlignment(SwingConstants.CENTER);
		lblProduits.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProduits.setForeground(Color.BLUE);
		lblProduits.setBackground(Color.WHITE);
		lblProduits.setBorder(new LineBorder(Color.BLACK, 1));
		lblProduits.setBounds(173, 133, 148, 25);
		getContentPane().add(lblProduits);
		
		JLabel lblQuantite = new JLabel("Quantité");
		lblQuantite.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantite.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantite.setForeground(Color.BLUE);
		lblQuantite.setBackground(Color.WHITE);
		lblQuantite.setBorder(new LineBorder(Color.BLACK, 1));
		lblQuantite.setBounds(468, 133, 148, 25);
		getContentPane().add(lblQuantite);
		
		JLabel lblStock = new JLabel("En Stock");
		lblStock.setHorizontalAlignment(SwingConstants.CENTER);
		lblStock.setForeground(Color.BLUE);
		lblStock.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStock.setBorder(new LineBorder(Color.BLACK, 1));
		lblStock.setBackground(Color.WHITE);
		lblStock.setBounds(320, 133, 149, 25);
		getContentPane().add(lblStock);
		
		
		comboProduit.setMaximumRowCount(10);
		comboProduit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboProduit.setModel(new DefaultComboBoxModel<Produit>(new Produit[] {new Ampoule(),new Carreau(),new Ciment(),new Clou(),new Lavabo(),new Marteau(),new Peinture(),new Robinet(),new Tournevis(),new Tuyau()}));
		comboProduit.setBackground(Color.WHITE);
		comboProduit.setForeground(Color.BLUE);
		comboProduit.setBounds(251, 96, 129, 25);
		getContentPane().add(comboProduit);
		
		JLabel lblAjouter = new JLabel("Ajouter : ");
		lblAjouter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAjouter.setForeground(Color.BLUE);
		lblAjouter.setBackground(Color.WHITE);
		lblAjouter.setBounds(94, 96, 100, 25);
		getContentPane().add(lblAjouter);
		
		JButton btnConfirmer = new JButton("Confirmer");
		btnConfirmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajouter();
			}
		});
		btnConfirmer.setForeground(Color.WHITE);
		btnConfirmer.setBackground(Color.BLUE);
		btnConfirmer.setBounds(601, 99, 105, 23);
		getContentPane().add(btnConfirmer);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valider();
			}
		});
		btnValider.setBackground(Color.BLUE);
		btnValider.setForeground(Color.WHITE);
		btnValider.setBounds(352, 517, 89, 23);
		getContentPane().add(btnValider);
		
		JLabel lblApprovisionnement = new JLabel("APPROVISIONNEMENT");
		lblApprovisionnement.setBackground(Color.WHITE);
		lblApprovisionnement.setForeground(Color.BLUE);
		lblApprovisionnement.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblApprovisionnement.setBounds(242, 11, 310, 31);
		getContentPane().add(lblApprovisionnement);
		
		txtQuantite = new JTextField();
		txtQuantite.setHorizontalAlignment(SwingConstants.CENTER);
		txtQuantite.setForeground(Color.BLUE);
		txtQuantite.setBackground(Color.WHITE);
		txtQuantite.setBounds(428, 96, 55, 24);
		getContentPane().add(txtQuantite);
		txtQuantite.setColumns(10);
		
		JLabel lblQuantite_1 = new JLabel("Quantité");
		lblQuantite_1.setForeground(Color.BLUE);
		lblQuantite_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantite_1.setBackground(Color.WHITE);
		lblQuantite_1.setBounds(428, 71, 100, 25);
		getContentPane().add(lblQuantite_1);
		
		setResizable(false);
		setBackground(Color.WHITE);
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private void valider(){
		if(JOptionPane.showConfirmDialog(this, "Voulez vous vraiment effectuer ajouter ces produits", "Confirmation", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
			int n=table.getRowCount();
			try {
				for(int i=0;i<n;i++){
					Produit p =(Produit) table.getValueAt(i, 0);
					double q = (Double) table.getValueAt(i, 2);
					quincaillerie.approvisionne(p,q );
					JOptionPane.showMessageDialog(this, "Stock approvisionné avec succes");
					txtQuantite.setText("");
					table.setModel(new ApprovTableModel(new Object[][]{}));
					comboProduit.setModel(new DefaultComboBoxModel<Produit>(new Produit[] {new Ampoule(),new Carreau(),new Ciment(),new Clou(),new Lavabo(),new Marteau(),new Peinture(),new Robinet(),new Tournevis(),new Tuyau()}));
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Erreur, veuillez verifier les quantités");
				JOptionPane.showMessageDialog(this, e);
			}
		}
	}
	
	private void ajouter(){
		try {
			Produit p = comboProduit.getItemAt(comboProduit.getSelectedIndex()); 
			String str=txtQuantite.getText();
			double q = Double.parseDouble(str);
			if(quincaillerie.getStock(p)==null){
				try {
					int prix = Integer.parseInt(JOptionPane.showInputDialog("Veuillez entrer le prix de ce produit ("+p+") : "));
					quincaillerie.addStock(p, prix, 0);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(this, "Le prix entré est incorrect !");
					JOptionPane.showMessageDialog(this, e);
				}
			}
			comboProduit.removeItem(comboProduit.getSelectedItem());
			int n=table.getRowCount();
			Object [][] liste = new Object[n+1][3];
			for (int i = 0; i < n; i++) {
				liste[i][0]=table.getValueAt(i, 0);
				liste[i][1]=table.getValueAt(i, 1);
				liste[i][2]=table.getValueAt(i, 2);
			}
			liste[n][0]=p;
			liste[n][1]=quincaillerie.getStock(p).getQuantite();
			liste[n][2]=new Double(q);
			table.setModel(new ApprovTableModel(liste));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "La quantité renseignée est incorrecte");
			JOptionPane.showMessageDialog(this, e);
		}
	}
}
