package dbMigrator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class UserInterface {
	
	private JFrame frame = new JFrame("TableMigrator Demo");
	private JPanel panel = new JPanel();
	private JLabel sourceLabel = new JLabel("Source");
	private String[] dataSourceList = {"Oracle", "MySQL"};
	private JComboBox<String> sourceComboBox = new JComboBox<String>(dataSourceList);
	private JLabel targetLabel = new JLabel("Target");
	private JComboBox<String> targetComboBox = new JComboBox<String>(dataSourceList);
	private String source;
	
	UserInterface(){
		sourceComboBox.setSelectedItem(null);
		targetComboBox.setSelectedItem(null);
		panel.add(sourceLabel);
		panel.add(sourceComboBox);
		panel.add(targetLabel);
		panel.add(targetComboBox);
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	String getSourceCluster(){
		return this.source;
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new UserInterface();
			}
		});
	}


	
}
