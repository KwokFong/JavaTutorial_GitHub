package pattern01_observer;

/*
 * udemy: Java Tutorial
 * https://www.udemy.com/java-tutorial/
 * Pattern01: Observer Pattern.
 * Subject/Observer(Listener):   
 * - When something happens in Subject (Subject fires an event.): (ie) a button click
 *   - Observer is notified (can be more than one...)
 *   - User-defined code in Observer is run.
 *   - An object instance of the Subject (contained in the Event object) is passed into Observer's user-defined code.
 */

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 1. Make View implements ActionListener interface.
public class View extends JFrame implements ActionListener {

	JPanel panel;
	JButton helloButton;
	JButton quitButton;

	public View() {
		initUI();
	}

	private void initUI() {

		panel = new JPanel();
		helloButton = new JButton("Hello");
		quitButton = new JButton("Quit");

		panel.add(helloButton);
		panel.add(quitButton);

		// 1. Make View class implements ActionListener interface; passing in this as the ActionListener instance object.
		helloButton.addActionListener(this);
		quitButton.addActionListener(this);

		// 2. Use Anon class to add ActionListener
		// - addXXX hints that multiple ActionListeners can be added; setXXX hints that only 1 ActionListener can be 'set'.
		// - For quitButton both ActionListeners will fire.  Last one added is fired first.
		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				System.out.println(source.getText() + ": Sorry to see you go...");
			}
		});

		add(panel);
		pack();

		setTitle("Sample Swing App");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				View v = new View();
				v.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		
		if (source == helloButton) {
			System.out.println(source.getText() + ": Hello There!!!");
		} else if (source == quitButton) {
			System.out.println(source.getText() + ": Quitting!!!");
		}

	}
}
