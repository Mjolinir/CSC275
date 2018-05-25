package Lab_11;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Lab_11 extends JFrame implements ActionListener {
	public static ArrayList<Student> sl = new ArrayList<Student>(10);
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("File");
	JMenuItem menuItem = new JMenuItem();
	JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem();
	JTextArea mainMenu = new JTextArea();
	JScrollPane mainScroll = new JScrollPane(mainMenu);

	public Lab_11() {
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
		menu.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menu);
		menuItem = new JMenuItem("Add Student",new ImageIcon("..\\CSC 275\\src\\Lab_11\\middle.jpg"));
		menuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				addStudents();
			}
		});
		menu.add(menuItem);
		menuItem = new JMenuItem("Remove Student",new ImageIcon("..\\CSC 275\\src\\Lab_11\\middle.jpg"));
		menuItem.setMnemonic(KeyEvent.VK_B);
		menuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				remStudents();
			}
		});
		menu.add(menuItem);
		menu.addSeparator();
		menuItem = new JMenuItem("Display Students",new ImageIcon("..\\CSC 275\\src\\Lab_11\\middle.jpg"));
		menuItem.setMnemonic(KeyEvent.VK_C);
		menuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				displayStudents();
			}
		});
		menu.add(menuItem);
		menu.addSeparator();
		menuItem = new JMenuItem("Sort Students",new ImageIcon("..\\CSC 275\\src\\Lab_11\\middle.jpg"));
		menuItem.setMnemonic(KeyEvent.VK_D);
		menuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				sortStudents();
			}
		});
		menu.add(menuItem);
		menu.addSeparator();
		menuItem = new JMenuItem("Clear Buffer");
		menuItem.setMnemonic(KeyEvent.VK_E);
		menuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
			}
		});
		menu.add(menuItem);
		menu.addSeparator();
		menuItem = new JMenuItem("Exit");
		menuItem.setMnemonic(KeyEvent.VK_F);
		menuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(menuItem);
		mainScroll.setPreferredSize(new Dimension(280, 250));
		mainMenu.setText("Student Database\nPlease select from the options below:");

		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
		JButton addButton = new JButton("  Add Student ");
		JButton remButton = new JButton("Remove Student ");
		JButton sortButton = new JButton("Sort Students");
		JButton displayButton = new JButton("Display Students");

		panel2.add(menuBar);
		panel2.add(mainScroll);
		panel2.add(addButton);
		addButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
				addStudents();
			}
		});
		panel2.add(remButton);
		remButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
				remStudents();
			}
		});
		panel2.add(sortButton);
		remButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
				sortStudents();
			}
		});
		panel2.add(displayButton);
		displayButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
				displayStudents();
			}
		});
		add(panel1);
		add(panel2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		JFrame frame = new Lab_11();
		frame.setTitle("Students") ;
		frame.setSize(300, 410);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addStudents() {
		String fn = JOptionPane.showInputDialog(null, "Enter First Name: ");
		String ln = JOptionPane.showInputDialog(null, "Enter Last Name: ");
		String mj = JOptionPane.showInputDialog(null, "Enter Major: ");
		String gpaStr = JOptionPane.showInputDialog(null, "Enter GPA: ");
		double gpa = Double.parseDouble(gpaStr);
		String uinStr = JOptionPane.showInputDialog(null, "Enter UIN: ");
		int uin = Integer.parseInt(uinStr);
		String nid = JOptionPane.showInputDialog(null, "Enter NetID: ");
		String ageStr = JOptionPane.showInputDialog(null, "Enter Age: ");
		int age = Integer.parseInt(ageStr);
		String gen = JOptionPane.showInputDialog(null, "Enter Gender (M/F): ").toUpperCase();

		Student newStud = new Student(fn, ln, mj, gpa, uin, nid, age, gen);
		sl.add(newStud);
		mainMenu.append("Student added");
	}

	public void remStudents() {
		displayStudents();
		String rsStr = JOptionPane.showInputDialog(null, "Remove Student (Student No.): ");
		int rs = Integer.parseInt(rsStr);
		sl.remove(rs - 1);
		mainMenu.append("Student " + rs + " removed");
		
	}

	public void displayStudents() {
		mainMenu.setText("");
		for (int z = 0; z < sl.size(); z++) {
			mainMenu.append("Student No.: " + (z + 1) + "\n");
			mainMenu.append(sl.get(z).toString() + "\n");
		}
	}

	public void sortStudents() {
		Collections.sort(sl, Student.StuNameComparator);
		for(Student str: sl) {
			String outStr = str.toString();
			mainMenu.setText(outStr);
		}
	}
}
