package Assignment_06;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Assignment_06 extends JFrame implements ActionListener {
	JMenuBar menuBar = new JMenuBar();
	JMenu menu = new JMenu("File");
	JMenuItem menuItem = new JMenuItem();
	JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem();
	JTextArea mainMenu = new JTextArea();
	JScrollPane mainScroll = new JScrollPane(mainMenu);
	ArrayList<Plant> plantPack = new ArrayList<Plant>();

	public Assignment_06() {
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
		menuBar.add(menu);
		menuItem = new JMenuItem("Menu item one",KeyEvent.VK_T);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItem.getAccessibleContext().setAccessibleDescription("This doesn't do anything");
		menu.add(menuItem);
		menuItem = new JMenuItem("Menu item two",new ImageIcon("..\\CSC 275\\src\\Assignment_05\\middle.jpg"));
		menuItem.setMnemonic(KeyEvent.VK_B);
		menu.add(menuItem);
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("Checkbox menu item");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);
		cbMenuItem = new JCheckBoxMenuItem("Another one");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);
		menu.addSeparator();
		JMenu submenu = new JMenu("Submenu one");
		submenu.setMnemonic(KeyEvent.VK_S);
		menuItem = new JMenuItem("Submenu item one");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		submenu.add(menuItem);
		menuItem = new JMenuItem("Another item");
		submenu.add(menuItem);
		menu.add(submenu);
		menu.addSeparator();
		menuItem = new JMenuItem("Exit");
		menuItem.setMnemonic(KeyEvent.VK_H);
		menuItem.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(menuItem);
		mainScroll.setPreferredSize(new Dimension(280, 250));
		mainMenu.setText("Welcome to my plant pack interface!\nPlease select from the options below:");

		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 2));
		JButton addButton = new JButton("Add Item");
		JButton remButton = new JButton("Remove Item");
		JButton searchButton = new JButton("Search Item");
		JButton displayButton = new JButton("Display Items");
		JButton analyzeButton = new JButton("Analyze Items");
		JButton saveButton = new JButton("Save Items");
		JButton loadButton = new JButton("Load Items");
		JButton quitButton = new JButton("Exit");

		panel2.add(menuBar);
		panel2.add(mainScroll);
		panel2.add(addButton);
		addButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
				addItems();
			}
		});
		panel2.add(remButton);
		remButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
				remItems();
			}
		});
		panel2.add(searchButton);
		searchButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
				searchItems();
			}
		});
		panel2.add(displayButton);
		displayButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu.setText("");
				for (int z = 0; z < plantPack.size(); z++) {
					mainMenu.append("Plant Number: " + (z + 1) + "\n");
					mainMenu.append(plantPack.get(z).toString() + "\n");
				}
			}
		});
		panel2.add(analyzeButton);
		analyzeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String analyzeString = JOptionPane.showInputDialog(null, "Which character(s) do you want to analyze? ");
				int index = analyze(analyzeString, 0);
		        String result = (index == -1) ? "not found"
		                                      : "found at index " + index;
		        mainMenu.setText(analyzeString + " is " + result);
			}
		});
		panel2.add(saveButton);
		saveButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				saveItems();
			}
		});
		panel2.add(loadButton);
		loadButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				loadItems();
			}
		});
		panel2.add(quitButton);
		quitButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		add(panel1);
		add(panel2);
	}

	@Override
	public void actionPerformed(ActionEvent event) {

	}

	public static void main(String[] args) {
		JFrame frame = new Assignment_06();
		frame.setTitle("Plant Pack") ;
		frame.setSize(300, 430);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void addItems() {
		JFrame frame2 = new JFrame();
		frame2.setTitle("Add Items") ;
		frame2.setSize(300, 380);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField txtBox1 = new JTextField(" ");
		txtBox1.setPreferredSize(new Dimension(280, 20));
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 10));

		JButton addFlButton = new JButton(" Add Flower ");
		JButton addFuButton = new JButton(" Add Fungus ");
		JButton addHButton = new JButton("    Add Herb    ");
		JButton addWButton = new JButton("    Add Weed    ");
		JButton addCancel = new JButton("Cancel");

		panel3.add(addFlButton);
		addFlButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Boolean ht = false;
				String id = "Flower";
				String nm = JOptionPane.showInputDialog(null, "Flower name: ");
				String cl = JOptionPane.showInputDialog(null, "Flower color: ");
				String hasThorns = JOptionPane.showInputDialog(null, "Flower has thorns? (Y/N): ").toUpperCase();
				if (hasThorns == "Y"){
					ht = true;
				}
				String sm = JOptionPane.showInputDialog(null, "Flower smell: ");
				Flower newFwr = new Flower(nm,id,cl,ht,sm);
				plantPack.add(newFwr);
				txtBox1.setText(nm + " has been added");
			}
		});
		panel3.add(addFuButton);
		addFuButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Boolean fp = false;
				String fid = "Fungus";
				String nf = JOptionPane.showInputDialog(null, "Fungus name: ");
				String co = JOptionPane.showInputDialog(null, "Fungus color: ");
				String fHasPoison = JOptionPane.showInputDialog(null, "Fungus is poisionous? (Y/N): ").toUpperCase();
				if (fHasPoison == "Y"){
					fp = true;
				}
				Fungus newFun = new Fungus(nf,fid,co,fp);
				plantPack.add(newFun);
				txtBox1.setText(nf + " has been added");
			}
		});
		panel3.add(addHButton);
		addHButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Boolean md = false;
				Boolean se = false;
				String id = "Herb";
				String nh = JOptionPane.showInputDialog(null, "Herb name: ");
				String fl = JOptionPane.showInputDialog(null, "Herb flavor: ");
				String hMed = JOptionPane.showInputDialog(null, "Herb is medicinal? (Y/N): ").toUpperCase();
				if (hMed == "Y"){
					md = true;
				}
				String hSea = JOptionPane.showInputDialog(null, "Herb is seasonal? (Y/N): ").toUpperCase();
				if (hSea == "Y"){
					se = true;
				}
				Herb newHerb = new Herb(nh,id,fl,md,se);
				plantPack.add(newHerb);
				txtBox1.setText(nh + " has been added");
			}
		});
		panel3.add(addWButton);
		addWButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				Boolean hp = false;
				Boolean ed = false;
				Boolean md = false;
				String wid = "Weed";
				String nw = JOptionPane.showInputDialog(null, "Weed name: ");
				String cw = JOptionPane.showInputDialog(null, "Weed color: ");
				String wPoi = JOptionPane.showInputDialog(null, "Weed is poisionous? (Y/N): ").toUpperCase();
				if (wPoi == "Y"){
					hp = true;
				}
				String wEdible = JOptionPane.showInputDialog(null, "Weed is edible? (Y/N): ").toUpperCase();
				if (wEdible == "Y"){
					ed = true;
				}
				String wMed = JOptionPane.showInputDialog(null, "Weed is medicinal? (Y/N): ").toUpperCase();
				if (wMed == "Y"){
					md = true;
				}
				Weed newWeed = new Weed(nw,wid,cw,hp,ed,md);
				plantPack.add(newWeed);
				txtBox1.setText(nw + " has been added");
			}
		});
		panel3.add(addCancel);
		addCancel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();
			}
		});

		panel3.add(txtBox1);

		frame2.add(panel3);

	}

	public void remItems() {
		JFrame frame3 = new JFrame();
		JTextArea remMenu = new JTextArea();
		JScrollPane remScroll = new JScrollPane(remMenu);
		frame3.setTitle("Remove Items") ;
		frame3.setSize(300, 410);
		frame3.setVisible(true);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 10));

		remScroll.setPreferredSize(new Dimension(280, 250));
		remMenu.setText("");
		JButton remFlButton = new JButton("Remove Flower");
		JButton remFuButton = new JButton("Remove Fungus");
		JButton remHButton = new JButton("Remove Herb");
		JButton remWButton = new JButton("Remove Weed");
		JButton remCancel = new JButton("Cancel");

		panel4.add(remFlButton);
		remFlButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				remMenu.setText("");
				for (int z = 0; z < plantPack.size(); z++) {
					if (plantPack.get(z).getid().contains("Flower")) {
						remMenu.append("Flower Number: " + (z) + "\n");
						remMenu.append(plantPack.get(z) + "\n");
					}
				}
				String remFlower = JOptionPane.showInputDialog(null, "Which flower would you like to remove? ");
				int remMe = Integer.parseInt(remFlower);
				plantPack.remove(remMe);
				remMenu.setText("Flower " + remFlower + " has been removed\n");
			}
		});
		panel4.add(remFuButton);
		remFuButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				remMenu.setText("");
				for (int z = 0; z < plantPack.size(); z++) {
					if (plantPack.get(z).getid().contains("Fungus")) {
						remMenu.append("Fungus Number: " + (z) + "\n");
						remMenu.append(plantPack.get(z) + "\n");
					}
				}
				String remFungus = JOptionPane.showInputDialog(null, "Which fungus would you like to remove? ");
				int remMe = Integer.parseInt(remFungus);
				plantPack.remove(remMe);
				remMenu.setText("Fungus " + remFungus + " has been removed\n");
			}
		});
		panel4.add(remHButton);
		remHButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				remMenu.setText("");
				for (int z = 0; z < plantPack.size(); z++) {
					if (plantPack.get(z).getid().contains("Herb")) {
						remMenu.append("Herb Number: " + (z) + "\n");
						remMenu.append(plantPack.get(z) + "\n");
					}
				}
				String remHerb = JOptionPane.showInputDialog(null, "Which herb would you like to remove? ");
				int remMe = Integer.parseInt(remHerb);
				plantPack.remove(remMe);
				remMenu.setText("Herb " + remHerb + " has been removed\n");
			}
		});
		panel4.add(remWButton);
		remWButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				remMenu.setText("");
				for (int z = 0; z < plantPack.size(); z++) {
					if (plantPack.get(z).getid().contains("Weed")) {
						remMenu.append("Weed Number: " + (z) + "\n");
						remMenu.append(plantPack.get(z) + "\n");
					}
				}
				String remWeed = JOptionPane.showInputDialog(null, "Which weed would you like to remove? ");
				int remMe = Integer.parseInt(remWeed);
				plantPack.remove(remMe);
				remMenu.setText("Weed " + remWeed + " has been removed\n");
			}
		});
		panel4.add(remCancel);
		remCancel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame3.dispose();
			}
		});

		panel4.add(remScroll);

		frame3.add(panel4);

	}

	public void searchItems() {
		JFrame frame4 = new JFrame();
		JTextArea searchMenu = new JTextArea();
		JScrollPane searchScroll = new JScrollPane(searchMenu);
		frame4.setTitle("Search Items") ;
		frame4.setSize(300, 410);
		frame4.setVisible(true);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.CENTER, 2, 10));

		searchScroll.setPreferredSize(new Dimension(280, 250));
		searchMenu.setText("");
		JButton searchFlButton = new JButton("Search Flowers");
		JButton searchFuButton = new JButton("Search Fungii");
		JButton searchHButton = new JButton("Search Herbs");
		JButton searchWButton = new JButton("Search Weeds");
		JButton searchCancel = new JButton("Cancel");

		panel5.add(searchFlButton);
		searchFlButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < plantPack.size(); i++) {
					if (plantPack.get(i).getid().contains("Flower")) {
						searchMenu.setText("Flowers:\n" + "ID: " + (i) + "\n");
						searchMenu.append(plantPack.get(i) + "\n");
					}				
				}
			}
		});
		panel5.add(searchFuButton);
		searchFuButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < plantPack.size(); i++) {
					if (plantPack.get(i).getid().contains("Fungus")) {
						searchMenu.setText("Fungii:\n" + "ID: " + (i) + "\n");
						searchMenu.append(plantPack.get(i) + "\n");
					}				
				}
			}
		});
		panel5.add(searchHButton);
		searchHButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < plantPack.size(); i++) {
					if (plantPack.get(i).getid().contains("Herb")) {
						searchMenu.setText("Herbs:\n" + "ID: " + (i) + "\n");
						searchMenu.append(plantPack.get(i) + "\n");
					}				
				}
			}
		});
		panel5.add(searchWButton);
		searchWButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < plantPack.size(); i++) {
					if (plantPack.get(i).getid().contains("Weed")) {
						searchMenu.setText("Weeds:\n" + "ID: " + (i) + "\n");
						searchMenu.append(plantPack.get(i) + "\n");
					}				
				}
			}
		});
		panel5.add(searchCancel);
		searchCancel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				frame4.dispose();
			}
		});

		panel5.add(searchScroll);

		frame4.add(panel5);
	}

	public void saveItems() {
		File saveFile= new File("..\\CSC 275\\src\\Assignment_05\\SavedAnswers.data");
		try {
			FileOutputStream outFileStream = new FileOutputStream(saveFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			for (int z = 0; z < plantPack.size(); z++) {
				outStream.println(plantPack.get(z));
			}
			outStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void loadItems() {
		try {
			Scanner inFile = new Scanner(new File("..\\CSC 275\\src\\Assignment_05\\SavedAnswers.data"));
			inFile.useDelimiter("\r\n");
			while(inFile.hasNext())
			{
				//plantPack.add(inFile.next());
			}
			System.out.println("Answer file loaded");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int analyze (String as, int n) {
		if(n > plantPack.size()-1)
            return -1;
        if(plantPack.get(n).getname().contains(as))
            return n;
        else
            return analyze(as, n+1);
	}
}
