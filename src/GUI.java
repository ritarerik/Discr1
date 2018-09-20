import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setTitle("\u041B\u0430\u0431. \u0440\u0430\u0431\u043E\u0442\u0430 \u2116 1. \u041C\u0435\u0442\u0435\u043B\u0451\u0432\u0430 \u041C.\u0414., \u041A\u043E\u043A\u043E\u0440\u0438\u043D \u0410.\u0413., \u0432\u0430\u0440\u0438\u0430\u043D\u0442 7");
		frame.setBounds(100, 100, 767, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
		tabbedPane.setBounds(0, 0, 749, 454);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panelVertex = new JPanel();
		tabbedPane.addTab("\u041F\u043E\u043B\u0443\u0441\u0442\u0435\u043F\u0435\u043D\u044C \u0437\u0430\u0445\u043E\u0434\u0430 \u0433\u0440\u0430\u0444\u0430", null, panelVertex, null);
		panelVertex.setLayout(null);
		
		JPanel panelIntersection = new JPanel();
		tabbedPane.addTab("\u041F\u0435\u0440\u0435\u0441\u0435\u0447\u0435\u043D\u0438\u0435 \u0433\u0440\u0430\u0444\u043E\u0432", null, panelIntersection, null);
		panelIntersection.setLayout(null);
	}
}
