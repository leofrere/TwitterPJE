package TwitterAnalysis_UI;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.LinkedList;

import javax.swing.*;

import TwitterAnalysis.SearchAction;

public class AnalysisUI extends JFrame{
	
	private JButton searchButton;
	private JTextField textField;
	private JTextArea label;
	
	
	public JTextField textField() {
		return textField;
	}
	
	public JTextArea label() {
		return label;
	}
	
	public AnalysisUI() {
		super();
		build();
	}
	
	public void build() {
		setTitle("TwitterAnalysis");
		setSize(700,500);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContents());
	}
	
	private JPanel buildContents() {	
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());	
		
		label = new JTextArea(20,30);
		label.setEnabled(false);
		label.setSize(500, 400);
		panel.add(label, BorderLayout.PAGE_END);
		
		
		JScrollPane scrollPane = new JScrollPane(label);
		panel.add(scrollPane);
				
		
		textField = new JTextField();
		textField.setColumns(10);
		
		panel.add(textField,BorderLayout.PAGE_START);
		
		searchButton = new JButton(new SearchAction(this, "search"));
		panel.add(searchButton,BorderLayout.PAGE_START);
		
		return panel;
	}
		
	public static void main(String[] args) {
		JFrame frame = new AnalysisUI();
		frame.setVisible(true);
	}
	
}
