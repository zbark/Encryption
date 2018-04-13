package Encryption;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class padWindow
{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					padWindow window = new padWindow();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public padWindow()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		keyCrypt k = new keyCrypt();

		
		frame = new JFrame();
		frame.setBounds(100, 100, 893, 649);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 84, 857, 515);
		frame.getContentPane().add(editorPane);
		
		JButton btnCopy = new JButton("Copy");
		btnCopy.setBounds(44, 36, 89, 23);
		frame.getContentPane().add(btnCopy);
		
		JButton btnPaste = new JButton("Paste");
		btnPaste.setBounds(211, 36, 89, 23);
		frame.getContentPane().add(btnPaste);
		
		JButton btnKey = new JButton("Key");
		btnKey.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				k.randKey();
			}
		});
		btnKey.setBounds(378, 36, 89, 23);
		frame.getContentPane().add(btnKey);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.setBounds(562, 36, 89, 23);
		frame.getContentPane().add(btnEncrypt);
	}
}
