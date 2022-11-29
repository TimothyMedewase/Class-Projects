import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class helloworld extends JFrame {

	private JTextField textField1 = null;
	private JTextField textField2 = null;
	GridBagConstraints layoutConstraints = null;
	JButton button1 = null;

	public helloworld() {

		this.setLayout(new GridBagLayout());
		textField1 = new JTextField(15);
		layoutConstraints = new GridBagConstraints();
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.insets = new Insets(10, 10, 10, 10);
		this.add(textField1, layoutConstraints);
		
		
		
		textField2 = new JTextField(15);
		textField2.setEditable(false);
		layoutConstraints = new GridBagConstraints();
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 2;
		layoutConstraints.insets = new Insets(10, 10, 10, 10);
		this.add(textField2, layoutConstraints);

		button1 = new JButton("UpperCase");
		layoutConstraints = new GridBagConstraints();
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.insets = new Insets(10, 10, 10, 10);
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String val = textField1.getText();
				textField2.setText(val.toUpperCase());
			}
		});
		this.add(button1, layoutConstraints);
	}

	public static void main(String[] args) {

		helloworld frame = new helloworld();

		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}