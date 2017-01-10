import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GeoMain implements ActionListener
{
	public JFrame frame;
	public JPanel panel;
	public JButton mainButton;
	public JLabel label;

	//vars for dimensions
	int framePosX = 500;
	int framePosY = 500;
	int frameX = 500;
	int frameY = 400;
	int buttonX = 100;
	int buttonY = 20;
	int buttonPosX = frameX/2 - (buttonX/2);
	int buttonPosY = frameY/2 + 60;

	String buttonText = "Let's Go...";
	int labelX = 500 ;
	int labelY = 50;
	int labelPosX = frameX/2  - (labelX/2);
	int labelPosY = frameY/2 - ((labelY/2) + 50);
	String labelText = "Calculate the Area and Volume of various 3D shapes.";

	public GeoMain()
	{
		test();
	}

	public void test()
	{
		//init the frame
		frame = new JFrame("main frame");
		frame.setVisible(true);
		frame.setLocation(framePosX, framePosY);
		frame.setSize(frameX, frameY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//init the panel
		panel = new JPanel();
		panel.setLayout(null); //set to null so to position your components better.
		panel.setBackground(Color.WHITE);


		//init the button
		mainButton = new JButton(buttonText);
		mainButton.setBounds(buttonPosX, buttonPosY, buttonX, buttonY);  //works better when you have no layout.
		mainButton.setActionCommand("Open");
		mainButton.addActionListener(this);
		mainButton.setVisible(true);


		//init the label
		label = new JLabel(labelText, SwingConstants.CENTER);
		label.setBounds(labelPosX, labelPosY, labelX, labelY);

		//add to panel
		panel.add(mainButton);
		panel.add(label);

		//add panel to frame
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();

		if(cmd.equals("Open"))
		{
			frame.dispose();
			new Select();
		}
	}


	public static void main(String[] args)
	{
		GeoMain g = new GeoMain();
	}
}