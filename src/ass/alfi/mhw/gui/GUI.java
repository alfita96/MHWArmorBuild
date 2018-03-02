package ass.alfi.mhw.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class GUI {

	private JFrame frmMonsterHunterWorld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmMonsterHunterWorld.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMonsterHunterWorld = new JFrame();
		frmMonsterHunterWorld.getContentPane().setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmMonsterHunterWorld.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel monsterList = new JPanel();
		tabbedPane.addTab("Monster List", null, monsterList, null);
		tabbedPane.setEnabledAt(0, true);
		
		JPanel questList = new JPanel();
		tabbedPane.addTab("", new ImageIcon(GUI.class.getResource("/resources/icons/quest.png")), questList, null);
		frmMonsterHunterWorld.setFont(new Font("Book Antiqua", Font.PLAIN, 12));
		frmMonsterHunterWorld.setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/resources/icons/gui_icon.png")));
		frmMonsterHunterWorld.setTitle("Monster Hunter World: ASS");
		frmMonsterHunterWorld.setBounds(100, 100, 750, 600);
		frmMonsterHunterWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
