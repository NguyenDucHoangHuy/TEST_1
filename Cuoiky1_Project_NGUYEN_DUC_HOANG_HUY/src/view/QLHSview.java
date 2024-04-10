	package view;
	      // NGUYEN DUC HOANG HUY
	import java.awt.EventQueue;
	 
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JMenuBar;
	import javax.swing.JMenu;
	import java.awt.Font;
	import javax.swing.JMenuItem;
	import javax.swing.JOptionPane;
	import javax.swing.JSeparator;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import javax.swing.SwingUtilities;
	import javax.swing.SwingWorker;
	import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
	import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.EOFException;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.lang.reflect.Array;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
	import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
	import java.util.TreeSet;
	import java.util.stream.Collectors;
	
	import javax.swing.JTable;
	import javax.swing.table.DefaultTableModel;

import controller.DAO;
import controller.QLHScontroller;
	import model.Hocsinh;
	import model.QLHSmodel;
	import model.Quequan;
	
	import javax.swing.JRadioButton;
	import javax.swing.JComboBox;
	import javax.swing.JFileChooser;
	import javax.swing.JSlider;
	import javax.swing.border.TitledBorder;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	
	public class QLHSview extends JFrame {
	
		private static final long serialVersionUID = 1L;
		public QLHScontroller controller;
		public QLHSmodel model;
		private JPanel contentPane;
		public JTextField textField_maloptim;
		public JTable table;
		public JTextField textField_malop;
		public JTextField textField_mahocsinh;
		public JTextField textField_hovaten;
		public JTextField textField_dtb;
		public JComboBox comboBox, comboBox_1,comboBox_xepLoai;
		public ButtonGroup buttonGroup;
		public JTextField textField_ngaysinh;
		 public JRadioButton  rdbutton_nam,  rdbtn_nu ;
		 public JLabel lblNewLabel_anh;
	
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						QLHSview frame = new QLHSview();
						frame.setVisible(true);
						frame.showData();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	
		/**
		 * Create the frame.
		 */
		public QLHSview() {
			this.model = new QLHSmodel();
		 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1015, 802);
			contentPane = new JPanel();
			contentPane.setForeground(new Color(192, 192, 192));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        ActionListener action = new QLHScontroller(this);
			
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JMenuBar menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 1021, 29);
			contentPane.add(menuBar);
			
			JMenu menuFile = new JMenu("File");
			menuBar.add(menuFile);
			menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			
			JMenuItem itemOpen = new JMenuItem("Open");
			itemOpen.addActionListener(action);
			itemOpen.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			menuFile.add(itemOpen);
			
			JMenuItem itemSave = new JMenuItem("Save");
			itemSave.addActionListener(action);
			itemSave.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			menuFile.add(itemSave);
			JSeparator separator = new JSeparator();
			menuFile.add(separator);
			
			JMenuItem itemExit = new JMenuItem("Exit");
			itemExit.addActionListener(action);
			itemExit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
			menuFile.add(itemExit);
			
			JLabel lblNewLabel = new JLabel("Mã lớp");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblNewLabel.setBounds(25, 40, 100, 35);
			contentPane.add(lblNewLabel);
			
			JLabel lblMSinhVin = new JLabel("Quê quán");
			lblMSinhVin.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblMSinhVin.setBounds(198, 40, 100, 35);
			contentPane.add(lblMSinhVin);
			
			textField_maloptim = new JTextField();
			textField_maloptim.setBounds(104, 47, 73, 25);
			contentPane.add(textField_maloptim);
			textField_maloptim.setColumns(10);
			
			JButton bt_Tim = new JButton("Tìm");
			bt_Tim.setFont(new Font("Tahoma", Font.PLAIN, 15));
			bt_Tim.setBounds(754, 41, 109, 35);
			bt_Tim.addActionListener(action);
			contentPane.add(bt_Tim);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setForeground(new Color(192, 192, 192));
			separator_1.setBounds(0, 102, 1001, 2);
			contentPane.add(separator_1);
			
			JLabel lblNewLabel_1 = new JLabel("Danh sách học sinh ");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setBounds(10, 115, 183, 29);
			contentPane.add(lblNewLabel_1);
			table= new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Hocsinh hs=null;
					try {
						hs = getHocsinhDangChon();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();	
					}
					 textField_malop.setText(hs.getMalop() );
					  textField_mahocsinh.setText(hs.getMahocsinh());
					  textField_hovaten.setText(hs.getHovaten());
					 if(hs.isGioitinh()) {
						 rdbutton_nam.setSelected(true);
					 } else {
						 rdbtn_nu.setSelected(true);
					 }
					  String s_ngaysinh=hs.getNgaysinh().getDate()+"/"+ (hs.getNgaysinh().getMonth()+1)+"/"+(hs.getNgaysinh().getYear()+1900);
					     textField_ngaysinh.setText(s_ngaysinh);
					    comboBox.setSelectedItem(hs.getTinh().getTenquequan());
					    textField_dtb.setText(hs.getDtb()+"");
					    
					    int selectedRow = table.getSelectedRow();
					    String maHocSinh = table.getModel().getValueAt(selectedRow,1).toString();
					    hienThiAnhChoHocSinh(maHocSinh);
				}
	
			});
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"M\u00E3 l\u1EDBp", "M\u00E3 h\u1ECDc sinh", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh", "Ng\u00E0y sinh", "Qu\u00EA qu\u00E1n", "\u0110i\u1EC3m trung b\u00ECnh", "Xếp loại"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(68);
			table.getColumnModel().getColumn(1).setPreferredWidth(89);
			table.getColumnModel().getColumn(2).setPreferredWidth(122);
			table.getColumnModel().getColumn(4).setPreferredWidth(91);
			table.getColumnModel().getColumn(5).setPreferredWidth(123);
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(10, 155, 981, 245);
			contentPane.add(scrollPane);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBounds(0, 442, 1001, 2);
			contentPane.add(separator_2);
			
			JLabel lblNewLabel_2 = new JLabel("Thông tin học sinh");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_2.setBounds(10, 462, 163, 25);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3_1 = new JLabel("Mã học sinh");
			lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3_1.setBounds(67, 543, 81, 25);
			contentPane.add(lblNewLabel_3_1);
			
			JLabel lblNewLabel_3_1_1 = new JLabel("Họ và tên");
			lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3_1_1.setBounds(67, 591, 81, 25);
			contentPane.add(lblNewLabel_3_1_1);
			
			JLabel lblNewLabel_3_1_1_1 = new JLabel("Ngày sinh");
			lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3_1_1_1.setBounds(67, 647, 81, 25);
			contentPane.add(lblNewLabel_3_1_1_1);
			
			JLabel lblNewLabel_3 = new JLabel("Mã lớp");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3.setBounds(66, 498, 59, 25);
			contentPane.add(lblNewLabel_3);
			
			JLabel lblNewLabel_3_1_2 = new JLabel("Giới tính");
			lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3_1_2.setBounds(430, 510, 81, 25);
			contentPane.add(lblNewLabel_3_1_2);
			
			JLabel lblNewLabel_3_1_2_1 = new JLabel("Quê quán");
			lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3_1_2_1.setBounds(430, 567, 81, 25);
			contentPane.add(lblNewLabel_3_1_2_1);
			
			JLabel lblNewLabel_3_1_2_1_1 = new JLabel("Điểm trung bình");
			lblNewLabel_3_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_3_1_2_1_1.setBounds(430, 633, 116, 25);
			contentPane.add(lblNewLabel_3_1_2_1_1);
			
			textField_malop = new JTextField();
			textField_malop.setBounds(158, 502, 148, 20);
			contentPane.add(textField_malop);
			textField_malop.setColumns(10);
			
			textField_mahocsinh = new JTextField();
			textField_mahocsinh.setColumns(10);
			textField_mahocsinh.setBounds(158, 547, 148, 20);
			contentPane.add(textField_mahocsinh);
			
			textField_hovaten = new JTextField();
			textField_hovaten.setColumns(10);
			textField_hovaten.setBounds(158, 595, 148, 20);
			contentPane.add(textField_hovaten);
			
			textField_dtb = new JTextField();
			textField_dtb.setColumns(10);
			textField_dtb.setBounds(556, 637, 148, 20);
			contentPane.add(textField_dtb);
			
			  buttonGroup = new ButtonGroup();
			
			 rdbutton_nam = new JRadioButton("Nam");
			rdbutton_nam.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbutton_nam.setBounds(545, 513, 73, 23);
			contentPane.add(rdbutton_nam);
			
			  rdbtn_nu = new JRadioButton("Nữ");
			rdbtn_nu.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtn_nu.setBounds(629, 513, 73, 23);
			contentPane.add(rdbtn_nu);
			buttonGroup.add(rdbtn_nu);
			buttonGroup.add(rdbutton_nam);
			
			
			  comboBox = new JComboBox();
			ArrayList<Quequan> listqq= Quequan.getDSQuequan();
			comboBox.addItem(" ");
			for(Quequan qq : listqq) {
				comboBox.addItem(qq.getTenquequan());
			}
			comboBox.setBounds(556, 570, 148, 22);
			contentPane.add(comboBox);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBounds(0, 697, 1001, 2);
			contentPane.add(separator_3);
			
			JButton btnNewButton_them = new JButton("Thêm");
			btnNewButton_them.addActionListener(action);
			btnNewButton_them.setBounds(29, 719, 148, 34);
			contentPane.add(btnNewButton_them);
			
			JButton btnCpNht_capnhat = new JButton("Cập nhật");
			btnCpNht_capnhat.addActionListener(action);
			btnCpNht_capnhat.setBounds(234, 719, 148, 34);
			contentPane.add(btnCpNht_capnhat);
			
			JButton btnNewButton_xoa = new JButton("Xóa");
			btnNewButton_xoa.addActionListener(action);
			btnNewButton_xoa.setBounds(430, 719, 148, 34);
			contentPane.add(btnNewButton_xoa);
			
			JButton btnNewButton_luu = new JButton("Lưu");
			btnNewButton_luu.addActionListener(action);
			btnNewButton_luu.setBounds(640, 719, 148, 34);
			contentPane.add(btnNewButton_luu);
			
			
			  comboBox_1 = new JComboBox();
			ArrayList<Quequan> listqq1= Quequan.getDSQuequan();
			comboBox_1.addItem(" ");
			for(Quequan qq : listqq1) {
				comboBox_1.addItem(qq.getTenquequan());
			}
			comboBox_1.setBounds(287, 49, 162, 22);
			contentPane.add(comboBox_1);
			
			textField_ngaysinh = new JTextField();
			textField_ngaysinh.setColumns(10);
			textField_ngaysinh.setBounds(158, 651, 148, 20);
			contentPane.add(textField_ngaysinh);
			
			JButton bt_Huytim = new JButton("Hủy tìm");
			 
			bt_Huytim.setFont(new Font("Tahoma", Font.PLAIN, 15));
			bt_Huytim.setBounds(892, 41, 109, 35);
			bt_Huytim.addActionListener(action);
			contentPane.add(bt_Huytim);
			
			comboBox_xepLoai = new JComboBox();
			comboBox_xepLoai.setBounds(566, 49, 162, 22);
			comboBox_xepLoai.addItem("");
			comboBox_xepLoai.addItem("Giỏi");
			comboBox_xepLoai.addItem("Khá");
			comboBox_xepLoai.addItem("Trung bình");
			comboBox_xepLoai.addItem("Yếu");
			contentPane.add(comboBox_xepLoai);
			
			JLabel lblXpLoi = new JLabel("Xếp loại");
			lblXpLoi.setFont(new Font("Tahoma", Font.PLAIN, 17));
			lblXpLoi.setBounds(483, 40, 73, 35);
			contentPane.add(lblXpLoi);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "\u1EA2nh h\u1ECDc sinh", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(814, 479, 156, 182);
			contentPane.add(panel);
			
			  lblNewLabel_anh = new JLabel("");
			lblNewLabel_anh.setPreferredSize(new Dimension(148, 155));
			panel.add(lblNewLabel_anh);
			
			JButton btnNewButton_luu_1 = new JButton("Thêm ảnh");
			btnNewButton_luu_1.setBounds(829, 719, 133, 34);
			btnNewButton_luu_1.addActionListener(action);
			contentPane.add(btnNewButton_luu_1);
			
			JButton btnNewButton_thongke = new JButton("Thống kê xếp loại");
			btnNewButton_thongke.setBounds(793, 114, 148, 34);
			btnNewButton_thongke.addActionListener(action);
			contentPane.add(btnNewButton_thongke);
			
			 
			 
			 this.setLocationRelativeTo(null);
		}
	
		public void lamrong() {
		 textField_dtb.setText("");
		 textField_hovaten.setText("");
		 textField_mahocsinh.setText("");
		 textField_malop.setText("");
		 textField_ngaysinh.setText("");
		 comboBox.setSelectedIndex(-1);
		    
		 buttonGroup.clearSelection();
		 lblNewLabel_anh.setIcon(null);
			
		}
		public JRadioButton getRdbutton_nam() {
		    return rdbutton_nam;
		}
		 
		public void luuHocsinh(Hocsinh hs) {
			 this.model.insert(hs);
			 DefaultTableModel luu= (DefaultTableModel) table.getModel();
			 luu.addRow(new Object[] { hs.getMalop() + " ",
					                                       hs.getMahocsinh() +" ",
					                                       hs.getHovaten() + " ",
					                                       (hs.isGioitinh()?"Nam":"Nữ"),
					                                       hs.getNgaysinh().getDate()+"/"+ (hs.getNgaysinh().getMonth()+1)+"/"+(hs.getNgaysinh().getYear()+1900),
					                                       hs.getTinh().getTenquequan(),
					                                       hs.getDtb()+ " ",
					                                       
					                                     });
			 capNhatXepLoai();
			
		}
		
		public void xoaHocsinh() throws ParseException {
			DefaultTableModel model_table= (DefaultTableModel) table.getModel();
	     int i_row=table.getSelectedRow();
	     Hocsinh hs= getHocsinhDangChon();
	     int luachon=JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xóa dòng đã chọn?");
	     if(luachon==JOptionPane.YES_OPTION) {
	    	this.model.delete(hs);
	    	 model_table.removeRow(i_row);
	    	 
	     }
		}
		public Hocsinh getHocsinhDangChon() throws ParseException {
			DefaultTableModel hienthi= (DefaultTableModel) table.getModel();
			int i_row= table.getSelectedRow();
			Hocsinh hs=new Hocsinh();
			 
			if (i_row != -1) { // Kiểm tra xem đã chọn hàng nào trong bảng chưa
		        hs.setMalop(hienthi.getValueAt(i_row, 0).toString());
		        hs.setMahocsinh(hienthi.getValueAt(i_row, 1).toString());
		        hs.setHovaten(hienthi.getValueAt(i_row, 2).toString());
	
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		        java.util.Date parsedDate = dateFormat.parse(hienthi.getValueAt(i_row, 4).toString());
		        Date ngaysinh = new Date(parsedDate.getTime());
		        hs.setNgaysinh(ngaysinh);
	
		        Quequan quequan = Quequan.getQuequanByTen(hienthi.getValueAt(i_row, 5).toString());
		        hs.setTinh(quequan);
	
		        String textGioitinh = hienthi.getValueAt(i_row, 3).toString();
		        boolean gioitinh = textGioitinh.equals("Nam");
		        hs.setGioitinh(gioitinh);
	
		        double dtb = Double.parseDouble(hienthi.getValueAt(i_row, 6).toString());
		        hs.setDtb(dtb);
		    }
	
		    return hs;
		}
		
	
		public void capnhatThonTin() {
			  int luachon=JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn cập nhật thông tin?");
			     if(luachon==JOptionPane.YES_OPTION) {
			try {
		        Hocsinh hs = getHocsinhDangChon();  
		        // Cập nhật thông tin từ các trường nhập vào đối tượng học sinh đã chọn
		        hs.setMalop(textField_malop.getText());
		        hs.setMahocsinh(textField_mahocsinh.getText());
		        hs.setHovaten(textField_hovaten.getText());
	
		        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		        Date ngaysinh = dateFormat.parse(textField_ngaysinh.getText());
		        hs.setNgaysinh(ngaysinh);
	
		        int tinhIndex = comboBox.getSelectedIndex();
		        Quequan quequan = Quequan.getQuequanById(tinhIndex);
		        hs.setTinh(quequan);
	
		        boolean gioitinh = rdbutton_nam.isSelected();
		        hs.setGioitinh(gioitinh);
	
		        double dtb = Double.parseDouble(textField_dtb.getText());
		        hs.setDtb(dtb);
		        
		        boolean updateData =DAO.capNhatStudent(hs);
		        if(updateData) {
		        	System.out.println("Cập nhật data thành công");
		        // Lấy số thứ tự hàng đang chọn
		        int selectedRow = table.getSelectedRow();
	
		        // Lấy mảng dữ liệu mới từ đối tượng học sinh đã cập nhật
		        Object[] newData = {
		            hs.getMalop(),
		            hs.getMahocsinh(),
		            hs.getHovaten(),
		            hs.isGioitinh() ? "Nam" : "Nữ",
		            dateFormat.format(hs.getNgaysinh()),
		            hs.getTinh().getTenquequan(),
		            hs.getDtb(),
		            
		        };
	
		        // Cập nhật hàng trong bảng với thông tin mới
		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        for (int i = 0; i < newData.length; i++) {
		            model.setValueAt(newData[i], selectedRow, i);
		        }
		        capNhatXepLoai();
		        }
		    } catch (ParseException e) {
		        JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng ngày sinh: dd/MM/yyyy", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
		    }		
		}
		}
	
		 
		public void thuchienTim() {
			this.thuchienHuyTim();
			 String malopcantim= textField_maloptim.getText();
			 
			 Object selectedQuequan =comboBox_1.getSelectedItem();
			 String queQuancantim = (selectedQuequan != null) ? selectedQuequan.toString() : "".trim();
			 
			 Object selectedXepLoai =comboBox_xepLoai.getSelectedItem();
			 String xepLoaicantim = (selectedXepLoai!= null) ? selectedXepLoai.toString() : "".trim();
			 
	        ArrayList<Hocsinh> ketquaTimkiem = new ArrayList<>();
	        DAO dao = new DAO();
	        ArrayList<Hocsinh> dsHocsinh = dao.getDSHocsinh();
	        for (Hocsinh hs : dsHocsinh ) {
	        	 System.out.println("Ma lop hoc sinh: " + hs.getMalop());
	        	    System.out.println("Ma lop can tim: " + malopcantim);
	        	    System.out.println("Xep loai dang co: "+hs.getXepLoai());
	        	    System.out.println("Xep loai can tim: "+xepLoaicantim);
	        	    boolean searchMalop = malopcantim.isEmpty();
	    	        boolean searchQuequan = queQuancantim.isEmpty();
	    	        boolean searchXepLoai = xepLoaicantim.isEmpty();
	        	    boolean matchMalop =   hs.getMalop().replaceAll("\\s","").equalsIgnoreCase(malopcantim.replaceAll("\\s",""));
	        	    boolean matchQuequan =  hs.getTinh().getTenquequan().equalsIgnoreCase(queQuancantim);
	        	    boolean matchXeploai =  hs.getXepLoai().trim().equalsIgnoreCase(xepLoaicantim); 
	        	  
	        	   if(!searchMalop&& !searchQuequan&&!searchXepLoai&&matchMalop&& matchQuequan && matchXeploai) {
	        		   ketquaTimkiem.add(hs);  
	        	   }
	        	    
	        		 if(searchMalop &&!searchQuequan&&!searchXepLoai)  {
	        			 if(matchQuequan&&matchXeploai) {
	        			 ketquaTimkiem.add(hs);
	        			 }
	        		 }  
	        		 if(searchQuequan &&!searchMalop&&!searchXepLoai) {
	        			 if(matchMalop&&matchXeploai) {
	        			 ketquaTimkiem.add(hs);
	        		 }  
	        		 }
	        		 if(searchXepLoai &&!searchMalop&&!searchQuequan ) {
	        			 if(matchMalop&&matchQuequan) {
	        			 ketquaTimkiem.add(hs);
	        		 }  
	        		 }
	        		 if(!searchMalop&&searchQuequan&&searchXepLoai ) {
	        			 if(matchMalop) {
	        			 ketquaTimkiem.add(hs);
	        		 } 
	        		 }
	        		 if(searchMalop&&!searchQuequan&&searchXepLoai ) {
	        			 if(matchQuequan) {
	        			 ketquaTimkiem.add(hs);
	        		 }  
	        		 }
	        		 if(searchMalop&&searchQuequan&&!searchXepLoai ) {
	        			 if(matchXeploai ){
	        			 ketquaTimkiem.add(hs);
	        		 }
	        	 }
	        }	       
	        
	        if (ketquaTimkiem.size() != 0) {
	        	hienThiKetQuaTimKiem(ketquaTimkiem);
	        } else {
	        	JOptionPane.showMessageDialog(null, "Không tìm thấy học sinh phù hợp với yêu cầu.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
	        }
	        	  
	        
	        
	        }
	        
		 
		private void hienThiKetQuaTimKiem(ArrayList<Hocsinh> ketquaTimkiem) {
			DefaultTableModel hienthiketquatimkiem = (DefaultTableModel) table.getModel();
			hienthiketquatimkiem.setRowCount(0);
			for (Hocsinh hs : ketquaTimkiem) {
				hienthiketquatimkiem.addRow(new Object[] {
			            hs.getMalop(),
			            hs.getMahocsinh(),
			            hs.getHovaten(),
			            (hs.isGioitinh() ? "Nam" : "Nữ"),
			            hs.getNgaysinh().getDate()+"/"+ (hs.getNgaysinh().getMonth()+1)+"/"+(hs.getNgaysinh().getYear()+1900),
	                    hs.getTinh().getTenquequan(),
	                    hs.getDtb()+ " ",
	                    hs.getXepLoai()
				  });
			}
			}

		public void thuchienHuyTim() {
			while(true) {
				DefaultTableModel xoadong = (DefaultTableModel) table.getModel();
				int soluongDong=xoadong.getRowCount();
				if(soluongDong==0) {
					break;
					} else xoadong.removeRow(0);
			}
			this.showData();
			 
		}
		public void exit() {
			 int luachon=JOptionPane.showConfirmDialog(this, "Bạn có muốn quay lại trang chủ?","Exit",JOptionPane.YES_NO_OPTION);
		     if(luachon==JOptionPane.YES_OPTION) {
		    	 java.awt.EventQueue.invokeLater( new Runnable() {
						public void run() {
							new  QLHSview_0().setVisible(true);
					}
			});
					setVisible(false);
					dispose();
		     }
		}
		 public static String xepLoai(double diemTrungBinh) {
		        if (diemTrungBinh >= 8.0) {
		            return "Giỏi";
		        } else if (diemTrungBinh >= 6.5) {
		            return "Khá";
		        } else if (diemTrungBinh >= 5.0) {
		            return "Trung bình";
		        } else {
		            return "Yếu";
		        }
		    }
		 public void capNhatXepLoai() {
		        DefaultTableModel model = (DefaultTableModel) table.getModel();
		        for (int row = 0; row < model.getRowCount(); row++) {
		            double diemTrungBinh = Double.parseDouble(model.getValueAt(row, 6).toString());
		            String xepLoai = xepLoai(diemTrungBinh);
		            model.setValueAt(xepLoai, row, 7);  
		        }
		    }
		 public void showData() {
			 DAO dao = new DAO();
			    ArrayList<Hocsinh> dsHocsinh = dao.getDSHocsinh();
			    DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
			    for (Hocsinh hs : dsHocsinh) {
			        modelTable.addRow(new Object[]{
			                hs.getMalop(),
			                hs.getMahocsinh(),
			                hs.getHovaten(),
			                hs.isGioitinh() ? "Nam" : "Nữ",
			                hs.getNgaysinh().getDate() + "/" + (hs.getNgaysinh().getMonth() + 1) + "/" + (hs.getNgaysinh().getYear() + 1900),
			                hs.getTinh().getTenquequan(),
			                hs.getDtb(),
			                hs.getXepLoai()  
			        });
			    }
			    capNhatXepLoai(); 
			
		 }
		 public void thongKeXepLoaiTheoLop() {
			    HashMap<String, HashMap<String, Integer>> thongKe = new HashMap<>();

			    ArrayList<Hocsinh> danhSachHocSinh = DAO.getDSHocsinh();

			    for (Hocsinh hs : danhSachHocSinh) {
			        String maLop = hs.getMalop();
			        String xepLoai = hs.getXepLoai();

			        if (xepLoai != null) {
			            if (thongKe.containsKey(maLop)) {
			                HashMap<String, Integer> xepLoaiCount = thongKe.get(maLop);
			                // Kiểm tra xem xếp loại đã tồn tại trong lớp hay chưa
			                if (xepLoaiCount.containsKey(xepLoai)) {
			                    // Nếu tồn tại, tăng giá trị cho xếp loại đó
			                    xepLoaiCount.put(xepLoai, xepLoaiCount.get(xepLoai) + 1);
			                } else {
			                    // Nếu chưa tồn tại, thêm xếp loại mới vào lớp
			                    xepLoaiCount.put(xepLoai, 1);
			                }
			            } else {
			                HashMap<String, Integer> xepLoaiCount = new HashMap<>();
			                xepLoaiCount.put(xepLoai, 1);
			                thongKe.put(maLop, xepLoaiCount);
			            }
			        }
			    }

			    StringBuilder message = new StringBuilder();
			    for (String maLop : thongKe.keySet()) {
			        message.append("Lớp ").append(maLop).append(" có:\n");
			        HashMap<String, Integer> xepLoaiCount = thongKe.get(maLop);
			        for (String xepLoai : xepLoaiCount.keySet()) {
			            message.append(xepLoai).append(": ").append(xepLoaiCount.get(xepLoai)).append("\n");
			        }
			        message.append("------------------------\n");
			    }

			    JOptionPane.showMessageDialog(null, message.toString(), "Thống kê xếp loại theo lớp", JOptionPane.INFORMATION_MESSAGE);
			}
		 public void luuAnh(String maHocSinh) {
			 
			    JFileChooser chooser = new JFileChooser();
			    chooser.showOpenDialog(null);
			    File file = chooser.getSelectedFile();
			    if (file != null) {
			        String duongDanAnh = file.getAbsolutePath();

			       
			        boolean daLuu = DAO.luuDuongDanAnh(maHocSinh, duongDanAnh);
			        if (daLuu) {
			            hienThiAnhChoHocSinh(maHocSinh);
			        }
			        else {
			        	   JOptionPane.showMessageDialog(null, "Thêm ảnh chưa thành công!\nVui lòng lưu học sinh trước và thêm ảnh ngay sau đó.");
			        }
			        
			    }
			}
		 public void hienThiAnh(String duongDanAnh) {
			 ImageIcon icon = new ImageIcon(duongDanAnh);
			 lblNewLabel_anh.setIcon(icon);
		 }
		 public void hienThiAnhChoHocSinh(String maHocSinh) {
		        String duongDanAnh = DAO.layDuongDanAnhHocSinh(maHocSinh); // Lấy đường dẫn ảnh từ cơ sở dữ liệu
		        if (duongDanAnh != null && !duongDanAnh.isEmpty()) {
		            hienThiAnh(duongDanAnh); // Hiển thị ảnh cho học sinh
		        } else {
		            lblNewLabel_anh.setIcon(null);  
		        }
	    }
		 

}