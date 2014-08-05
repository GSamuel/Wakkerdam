package other;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import event.EventManager;
import event.Vote;

public class SimpleInput extends JFrame
{
	public SimpleInput(final EventManager eventManager)
	{
		setTitle("VOTE !!!");
		setSize(200, 120);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout());

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		final JTextField leftField;
		final JTextField rightField;

        leftField  = new JTextField("test", 3);        
        rightField  = new JTextField("yay", 3);
        
        panel.add(leftField);
        panel.add(rightField);
		
		JButton quitButton = new JButton("Quit");
		quitButton.setBounds(50, 60, 80, 30);
		quitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				eventManager.vote(new Vote(Integer.parseInt(leftField.getText()),Integer.parseInt(rightField.getText())));
			}
		});

		panel.add(quitButton);

	}
}
