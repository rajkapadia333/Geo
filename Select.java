import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Select implements ActionListener
{
	public JFrame frame;
	public JPanel mainPanel, subPanel, subPanel2;
	public JButton mainButton;
	public JLabel label;
	public JRadioButton b1, b9;
	Color sPanelbg = new Color(214, 245, 245);

	//for various shapes
	String cube = "Cube";
	String rPrism = "Rectangular Prism";
	String tPrism = "Triangular Prism";
	String cone = "Cone";
	String pyr = "Pyramid/Tetrahedron";
	String sqrPyr = "Square Pyramid";
	String sphere = "Sphere";
	String semiSphere = "Semi-sphere";
	String lsArea = "Lateral Surface Area";
	String csArea = "Curved Surface Area";
	String vol = "Volume";


	//vars for dimensions
	int framePosX = 110;
	int framePosY = 110;
	int frameX = 750;
	int frameY = 600;
	int buttonX = 100;
	int buttonY = 20;
	int buttonPosX = frameX/2 - (buttonX/2);
	int buttonPosY = frameY/2 + 160;
	String buttonText = "Next ->";

	//sub panel bounds
	int sPanelX = 175;
	int sPanelY = 250;
	int sPanelPosX = buttonPosX - 120;
	int sPanelposY = frameY/2 - (sPanelY/2);
	int s2PanelPosX = sPanelPosX + (sPanelX + 10);
	int s2PanelPosY = sPanelposY;

	//set bools
	Boolean b1b9 = false;
	Boolean b2b9 = false;
	Boolean b3b9 = false;
	Boolean b4b9 = false;
	Boolean b5b9 = false;
	Boolean b6b9 = false;
	Boolean b7b9 = false;
	Boolean b8b9 = false;
	Boolean b1b10 = false;
	Boolean b2b10 = false;
	Boolean b3b10 = false;
	Boolean b4b10 = false;
	Boolean b5b10 = false;
	Boolean b6b10 = false;
	Boolean b7b10 = false;
	Boolean b8b10 = false;
	Boolean b1b11 = false;
	Boolean b2b11 = false;
	Boolean b3b11 = false;
	Boolean b4b11 = false;
	Boolean b5b11 = false;
	Boolean b6b11 = false;
	Boolean b7b11 = false;
	Boolean b8b11 = false;
 
	public Select()
	{
		gui();
	}

	public void gui()
	{
		//init the frame
		frame = new JFrame("Select");
		frame.setVisible(true);
		frame.setLocation(framePosX, framePosY);
		frame.setSize(frameX, frameY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//init the panel
		mainPanel = new JPanel();
		mainPanel.setLayout(null); //set to null so to position your components better.
		mainPanel.setBackground(Color.WHITE);

		//init the subpanel
		subPanel = new JPanel();
		subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.PAGE_AXIS));
		subPanel.setBackground(sPanelbg);
		subPanel.setBounds(sPanelPosX, sPanelposY, sPanelX, sPanelY);

		//init the second subpanel
		subPanel2 = new JPanel();
		subPanel2.setLayout(new BoxLayout(subPanel2, BoxLayout.PAGE_AXIS));
		subPanel2.setBackground(sPanelbg);
		subPanel2.setBounds(s2PanelPosX, s2PanelPosY, sPanelX, sPanelY);


		//init the button
		mainButton = new JButton(buttonText);
		mainButton.setBounds(buttonPosX, buttonPosY, buttonX, buttonY);  //works better when you have no layout.
		mainButton.setActionCommand("Open");
		mainButton.addActionListener(this);
		mainButton.setVisible(true);

		//init all the radio buttons
		b1 = new JRadioButton(cube);
		b1.setActionCommand(cube);
		b1.setSelected(true);
		b1.addActionListener(this);

		JRadioButton b2 = new JRadioButton(rPrism);
		b2.setActionCommand(rPrism);
		b2.addActionListener(this);

		JRadioButton b3 = new JRadioButton(tPrism);
		b2.setActionCommand(tPrism);
		b2.addActionListener(this);

		JRadioButton b4 = new JRadioButton(cone);
		b4.setActionCommand(cone);
		b4.addActionListener(this);

		JRadioButton b5 = new JRadioButton(pyr);
		b5.setActionCommand(pyr);
		b5.addActionListener(this);

		JRadioButton b6 = new JRadioButton(sqrPyr);
		b6.setActionCommand(sqrPyr);
		b6.addActionListener(this);

		JRadioButton b7 = new JRadioButton(sphere);
		b7.setActionCommand(sphere);
		b7.addActionListener(this);

		JRadioButton b8 = new JRadioButton(semiSphere);
		b8.setActionCommand(semiSphere);
		b8.addActionListener(this);

		JRadioButton b9 = new JRadioButton(lsArea);
		b9.setActionCommand(lsArea);
		b9.setSelected(true);
		b9.addActionListener(this);

		JRadioButton b10 = new JRadioButton(csArea);
		b10.setActionCommand(csArea);
		b10.addActionListener(this);

		JRadioButton b11 = new JRadioButton(vol);
		b11.setActionCommand(vol);
		b11.addActionListener(this);


		//add all the radiobuttons for shapes in this group.
		ButtonGroup shapes = new ButtonGroup();
		shapes.add(b1);
		shapes.add(b2);
		shapes.add(b3);
		shapes.add(b4);
		shapes.add(b5);
		shapes.add(b6);
		shapes.add(b7);
		shapes.add(b8);

		//add all the radiobuttons for dimensions in this group.
		ButtonGroup dim = new ButtonGroup();
		dim.add(b9);
		dim.add(b10);
		dim.add(b11);

		//add to sub panel on the right
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel.add(b1);
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel.add(b2);
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel.add(b3);
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel.add(b4);
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel.add(b5);
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel.add(b6);
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel.add(b7);
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel.add(b8);
		subPanel.add(Box.createRigidArea(new Dimension(0, 7)));

		//add radio buttons for dimensions on the left
		subPanel2.add(Box.createRigidArea(new Dimension(0, 75)));
		subPanel2.add(b9);
		subPanel2.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel2.add(b10);
		subPanel2.add(Box.createRigidArea(new Dimension(0, 7)));
		subPanel2.add(b11);


		//add to main panel
		mainPanel.add(mainButton);
		mainPanel.add(subPanel);
		mainPanel.add(subPanel2);
	
		//add panel to frame
		frame.add(mainPanel);

		//set bools
		if(b1.isSelected() && b9.isSelected())
		{
			b1b9 = true;
		}


		if(b2.isSelected() && b9.isSelected())
		{
			b2b9 = true;
		}


		if(b3.isSelected() && b9.isSelected())
		{
			b3b9 = true;
		}


		if(b4.isSelected() && b9.isSelected())
		{
			b4b9 = true;
		}


		if(b5.isSelected() && b9.isSelected())
		{
			b5b9 = true;
		}


		if(b6.isSelected() && b9.isSelected())
		{
			b6b9 = true;
		}


		if(b7.isSelected() && b9.isSelected())
		{
			b7b9 = true;
		}


		if(b8.isSelected() && b9.isSelected())
		{
			b8b9 = true;
		}


	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();

		if(cmd.equals("Open") && b1b9)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b2b9)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b3b9)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b4b9)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b5b9)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b6b9)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b7b9)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b8b9)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b1b10)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b2b10)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b3b10)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b4b10)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b5b10)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b6b10)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b7b10)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b8b10)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b1b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b2b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b2b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b2b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b3b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b4b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b5b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b6b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b7b11)
		{
			new Gui();
			frame.dispose();
		}

		else if(cmd.equals("Open") && b8b11)
		{
			new Gui();
			frame.dispose();
		}


	}



	public static void main(String[] args)
	{
		Select g = new Select();
	}
}