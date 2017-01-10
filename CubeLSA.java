import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CubeLSA implements ActionListener
{
	public JFrame frame;
	public JPanel panel;
	public JButton mainButton;
	public JLabel label;
	public JTextField textField;

	//vars for dimensions
	int framePosX = 500;
	int framePosY = 500;
	int frameX = 500;
	int frameY = 400;
	int buttonX = 100;
	int buttonY = 20;
	int buttonPosX = frameX/2 - (buttonX/2);
	int buttonPosY = frameY/2 + 50;
	String buttonText = "Calculate";
	int labelX = 500 ;
	int labelY = 50;
	int labelPosX = frameX/2  - (labelX/2) + 20;
	int labelPosY = buttonPosY + 50;
	int answer = 0;
	String input = "0";
	String labelText = "The Lateral Surface Area is: " + answer;

	public CubeLSA()
	{
		Gui();
	}

	public void Gui()
	{
		//init the frame
		frame = new JFrame("LSA of a Cube");
		frame.setVisible(true);
		frame.setLocation(framePosX, framePosY);
		frame.setSize(frameX, frameY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//init the panel
		panel = new JPanel();
		//panel.setLayout(null); //set to null so to position your components better.
		panel.setBackground(Color.WHITE);


		//init the button
		mainButton = new JButton(buttonText);
		mainButton.setBounds(buttonPosX, buttonPosY, buttonX, buttonY); //works better when you have no layout.
		mainButton.setVisible(true);
		mainButton.addActionListener(this);
		mainButton.setActionCommand("Calc");

		//add the textfield
		textField = new JTextField(5);
		input = textField.getText();
		textField.addActionListener(this);


		//init the label
		label = new JLabel(labelText, SwingConstants.LEFT);
		label.setBounds(labelPosX, labelPosY, labelX, labelY);

		//add to panel
		panel.add(mainButton);
		panel.add(textField);
		panel.add(label);

		//add panel to frame
		frame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		int dimension = Integer.parseInt(input);
		if(cmd.equals("Calc"))
		{
			answer = 4*dimension;
			System.out.println("answer");
		}
	}


	public static void main(String[] args)
	{
		CubeLSA g = new CubeLSA();
	}
}