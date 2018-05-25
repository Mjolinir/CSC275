package Lab_10;

import javax.swing.*;
import java.awt.event.* ;
import java.awt.* ;

public class Lab_10 extends JFrame implements ActionListener {
	private JButton action1 = new JButton ("");
    private JButton action2 = new JButton ("");
	private JList list;
	DefaultListModel model = new DefaultListModel();
	
	public Lab_10(){
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
		
		list = new JList(model);
		list.setLayoutOrientation(JList.VERTICAL);
		JScrollPane scrollPane_1 = new JScrollPane(list);
		scrollPane_1.setPreferredSize(new Dimension(380, 230));
	    String[] listData = {"Math", "Computer", "Physics", "Chemistry"};
	    
	    for (int n = 0; n < listData.length; n++) {
	    	model.addElement(listData[n]);
	    }
	    panel1.add(scrollPane_1, BorderLayout.CENTER);
	    
	    JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 2, 2));
	    
	    action1 = new JButton("Add Course");
	    action2 = new JButton("Close");
	    
	    panel2.add(action1);
	    action1.addActionListener(this);
	    panel2.add(action2);
	    action2.addActionListener(this);
	    
	    add(panel1, BorderLayout.CENTER);
	    add(panel2, BorderLayout.SOUTH);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
	    if (event.getSource() == action1)
	    {
	        //JOptionPane ask for course to add
	    	String optionChoice;
	    	optionChoice = JOptionPane.showInputDialog(null, "Enter a coursename to add");
	    	model.addElement(optionChoice);
	    	
	    }
	    else if(event.getSource() == action2){
	      System.exit(0);
	    }
	}
	
	public static void main(String[] args) {
		JFrame frame = new Lab_10();
		frame.setTitle("Course Management") ;
	    frame.setSize(400, 300);
	    frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}