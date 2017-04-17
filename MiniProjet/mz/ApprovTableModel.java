package mz;


import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class ApprovTableModel extends DefaultTableModel {

		public ApprovTableModel(Object[][] data) {
		super(data, new String[] {
				"Produit", "En Stock", "Quantite"
			});
	}
		
		@SuppressWarnings("rawtypes")
		Class[] columnTypes = new Class[] {
			Object.class, Double.class, Double.class
		};
		@SuppressWarnings({ "unchecked", "rawtypes" })
		public Class getColumnClass(int columnIndex) {
			return columnTypes[columnIndex];
		}
		boolean[] columnEditables = new boolean[] {
			false, false, true
		};
		public boolean isCellEditable(int row, int column) {
			return columnEditables[column];
		}		
		
}
