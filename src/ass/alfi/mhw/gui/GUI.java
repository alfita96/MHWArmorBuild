package ass.alfi.mhw.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import ass.alfi.mhw.objects.Monsters;

import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import java.awt.Choice;
import javax.swing.JMenuItem;

public class GUI {

	private JFrame frmMonsterHunterWorld;
	private Font font = new Font("Book Antiqua", Font.PLAIN, 13);

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
		frmMonsterHunterWorld.getContentPane().setFont(font);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		frmMonsterHunterWorld.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel monsterList = new JPanel();
		tabbedPane.addTab("", new ImageIcon(GUI.class.getResource("/resources/icons/monster.png")), monsterList, "Monster List");
		Monsters monsterNames = new Monsters();
		
		Choice choice = new Choice();
		monsterList.add(choice);
		tabbedPane.setEnabledAt(0, true);
		
		JPanel questList = new JPanel();
		tabbedPane.addTab("", new ImageIcon(GUI.class.getResource("/resources/icons/quest.png")), questList, "Quest List");
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("", new ImageIcon(GUI.class.getResource("/resources/icons/helm.png")), panel, "Armor Build");
		frmMonsterHunterWorld.setFont(font);
		frmMonsterHunterWorld.setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/resources/icons/gui_icon.png")));
		frmMonsterHunterWorld.setTitle("Monster Hunter World: ASS");
		frmMonsterHunterWorld.setBounds(100, 100, 750, 600);
		frmMonsterHunterWorld.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
