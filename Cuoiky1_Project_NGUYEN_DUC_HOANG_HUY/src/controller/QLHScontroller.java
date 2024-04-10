package controller;
// NGUYEN DUC HOANG HUY
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.Hocsinh;
import model.Quequan;
import view.QLHSview;
public class QLHScontroller implements ActionListener  {
   public QLHSview view;
   public QLHScontroller(QLHSview view) {
	this.view = view;
}
@Override
	public void actionPerformed(ActionEvent e)  {
	 String cm = e.getActionCommand();
	 boolean errorOccurred = false;
	 boolean errorOccurred_1 = false;
	 if(cm.equals("Thêm")){
		 this.view.lamrong();
        
	 }  else if(cm.equals("Lưu")) {
		   if(this.view.textField_hovaten.getText().isEmpty() || this.view.textField_malop.getText().isEmpty()|| 
				   this.view.textField_mahocsinh.getText().isEmpty()|| this.view.textField_dtb.getText().isEmpty()
				   || this.view.textField_ngaysinh.getText().isEmpty()) {
			   System.out.println("Thông tin không đầy đủ");
			   JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin học sinh khi thêm", "Thông báo:", JOptionPane.INFORMATION_MESSAGE);
			   errorOccurred = true;
			   errorOccurred_1=true;
		   } else { 
		try {
			String mahocsinh = this.view.textField_mahocsinh.getText();
			String malop = this.view.textField_malop.getText();
			String hovaten = this.view.textField_hovaten.getText();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Định dạng ngày tháng trong textField_ngaysinh
			Date ngaysinh=null;
			   java.util.Date parsedDate = dateFormat.parse(this.view.textField_ngaysinh.getText());
			      ngaysinh = new Date(parsedDate.getTime());
			
			int tinh = -1;  
			if (this.view.comboBox.getSelectedIndex() != -1) {
			    tinh = this.view.comboBox.getSelectedIndex();
			};
			 
			Quequan quequan= Quequan.getQuequanById(tinh);
			 
			boolean gioitinh = this.view.getRdbutton_nam().isSelected();
            if (this.view.rdbutton_nam.isSelected()) {
                gioitinh = true;
            } else {
                gioitinh = false;
            }
			double dtb = Double.valueOf(this.view.textField_dtb.getText());
			Hocsinh hs= new Hocsinh(mahocsinh, malop, hovaten, ngaysinh, gioitinh, dtb, quequan);
			
			 if(errorOccurred==false) {
				 
				  boolean saved = DAO.luuStudent(hs);
				  if(saved) {
	                     this.view.luuHocsinh(hs);         
	                }
                 
			 }  
			
			
		} catch (ParseException  e2) {
		JOptionPane.showMessageDialog(null, "Vui lòng nhập đúng định dạng ngày sinh: Day/Month/Year", "Thông báo:", JOptionPane.INFORMATION_MESSAGE); 
		  }
		catch (Exception e3) {
			  JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin học sinh khi thêm", "Thông báo:", JOptionPane.INFORMATION_MESSAGE);
			    }
		 }  
	 } else if(cm.equals("Xóa")) {
		 try {
			 DefaultTableModel hienthi= (DefaultTableModel) this.view.table.getModel();
				int i_row= this.view.table.getSelectedRow();
				Hocsinh hs=new Hocsinh();
				if (i_row != -1) { 
			       hs.setMahocsinh(hienthi.getValueAt(i_row, 1).toString());
		  this.view.xoaHocsinh();
		  DAO.xoaStudent( hs.getMahocsinh());
				}
		 }catch (ParseException e1) {
		}
	 } else if(cm.equals("Cập nhật")){
			  this.view.capnhatThonTin();
	 } else if(cm.equals("Tìm")) {
		 this.view.thuchienTim();
	 } else if(cm.equals("Hủy tìm")) {
		  this.view.thuchienHuyTim();
	 } else if(cm.equals("Exit")) {
		 this.view.exit();
	 }  else if(cm.equals("Thống kê xếp loại")) {
		 this.view.thongKeXepLoaiTheoLop( );
	 } else if(cm.equals("Thêm ảnh")) {
		 String maHocSinh = this.view.textField_mahocsinh.getText();
					  this.view.luuAnh(maHocSinh);
	                
			 
           }
           
	 }
	 }
	  
