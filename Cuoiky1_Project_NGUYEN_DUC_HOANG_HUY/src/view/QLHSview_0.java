package view;
// NGUYEN DUC HOANG HUY
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.QLHSview;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QLHSview_0 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLHSview_0 frame = new QLHSview_0();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLHSview_0() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÍ HỌC SINH");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(228, 191, 308, 65);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 int luachon = JOptionPane.showConfirmDialog(QLHSview_0.this, "Bạn có muốn thoát chương trình?", "Power off", JOptionPane.YES_NO_OPTION);
		            if (luachon == JOptionPane.YES_OPTION) {
		                System.exit(0);
		            }
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HUY\\OneDrive\\Hình ảnh\\power.1.png"));
		lblNewLabel_1.setBounds(0, 438, 37, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				java.awt.EventQueue.invokeLater( new Runnable() {
					public void run() {
						  QLHSview frame = new QLHSview();
	                        frame.setVisible(true);
	                        frame.showData();
				}
		});
				setVisible(false);
				dispose();
			
			
			}
		});
	 
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HUY\\OneDrive\\Hình ảnh\\right-arrow (5).png"));
		lblNewLabel_2.setBounds(699, 445, 43, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\HUY\\OneDrive\\Hình ảnh\\background-mau-xanh-khai-giang-truong-hoc_024037383______1.jpg"));
		lblNewLabel_3.setBounds(0, 0, 745, 520);
		contentPane.add(lblNewLabel_3);
	
		this.setLocationRelativeTo(null);
	}
}
