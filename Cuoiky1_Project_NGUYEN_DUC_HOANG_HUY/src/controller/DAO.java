package controller;
// NGUYEN DUC HOANG HUY
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

import model.Hocsinh;
import model.Quequan;
import view.QLHSview;
import view.QLHSview;
public class DAO {
	 private static Connection conn;
	  public static Connection getConnection() {
		  conn=null;
		  try {
			  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			    String url  = "jdbc:sqlserver://localhost:1433;databaseName=QLHS;encrypt=true;trustServerCertificate=true";
			    String user = "sa";
			    String pass = "hoanghuy111205";
			    conn = DriverManager.getConnection(url, user, pass);
			    System.out.println("Ket noi DB thanh cong!");
			    }
		  catch (Exception ex) {
 	      ex.printStackTrace();
		  }
		return conn;
			 
	     }
	     public static void closeConnection (Connection c) {
	    	 try {
	    		 if(c!=null) {
	    			 c.close();
	    		 }
	    	 } catch (Exception e) {
	    		 e.printStackTrace();
	    	 }
	     }
	     public static boolean luuStudent (Hocsinh hs) {
	    	 String sqlInsert= "INSERT INTO HocSinh(MaLop, MaHocSinh, HoVaTen, GioiTinh, NgaySinh, Quequan, DiemTB,XepLoai) "
	    	 		+ "VALUES(?,?,?,?,?,?,?,?)";
	    	 String sqlCheck = "SELECT * FROM HocSinh WHERE MaHocSinh = ?";
	    	 try {
	    		 DAO dao = new DAO();  
	    		 Connection conn = dao.getConnection();
	    		 if(conn!=null) {
	    			PreparedStatement pstCheck = conn.prepareStatement(sqlCheck);
			 
				pstCheck.setString(1, hs.getMahocsinh());
		            ResultSet rs = pstCheck.executeQuery();
		            if (rs.next()) {
		               
		                JOptionPane.showMessageDialog(null, "Mã học sinh đã tồn tại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
		                return false;
		            }
           else {
 
		                 
		            	String xepLoai = xepLoai(hs.getDtb());
		            	PreparedStatement pstInsert=conn.prepareStatement(sqlInsert);
		            	pstInsert.setString(1, hs.getMalop());
		            	pstInsert.setString(2, hs.getMahocsinh());
		            	pstInsert.setString(3, hs.getHovaten());
		            	pstInsert.setBoolean(4, hs.isGioitinh());
		            	pstInsert.setDate(5, new java.sql.Date(hs.getNgaysinh().getTime()));
		            	pstInsert.setString(6, hs.getTinh().getTenquequan());
		            	pstInsert.setFloat(7, (float) hs.getDtb());            
		            	pstInsert.setString(8, xepLoai);
	            return pstInsert.executeUpdate()>0;
		            }
	    		 }
		            else {
	    			 System.out.println("Khong the ket noi den co so du lieu.");
	    	            return false;
	    		 }
	            		} catch (Exception e) {
			 e.printStackTrace();
			}
	    	 	return false;
	     }
	     public static ArrayList<Hocsinh> getDSHocsinh(){
	    	 ArrayList<Hocsinh> list=new ArrayList< >();
	    	 String sql="SELECT * FROM HocSinh";
	    	 try {
	    		 Connection conn = getConnection();
	    			PreparedStatement pst=conn.prepareStatement(sql);
	    			ResultSet rs= pst.executeQuery();
	    			while(rs.next()) {
	    				Hocsinh hs= new Hocsinh();
	    				hs.setMalop(rs.getString("MaLop"));
	    				hs.setMahocsinh(rs.getString("MaHocSinh"));
	    				hs.setHovaten(rs.getString("HoVaTen"));
	    				hs.setGioitinh(rs.getBoolean("GioiTinh"));
	    				hs.setNgaysinh(rs.getDate("NgaySinh"));
	    				 String tenTinh = rs.getString("QueQuan");
	    		         Quequan tinh = Quequan.getQuequanByTen(tenTinh);
	    		            hs.setTinh(tinh);
	    				hs.setDtb(rs.getFloat("DiemTB"));
	    				 hs.setXepLoai(rs.getString("XepLoai"));
	    				  
	    				list.add(hs);
	    			}
			} catch (Exception e) {
			e.printStackTrace();
			}
	    	 return list;
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
	     public static void xoaStudent(String mahocsinh) {
	    	 String sqlxoa="DELETE FROM HocSinh WHERE MaHocSinh=?";
	    	 try {
	    		 Connection conn = getConnection();
	    			PreparedStatement pst=conn.prepareStatement(sqlxoa);
	    		 pst.setString(1, mahocsinh);
	    		 int rowsAffected = pst.executeUpdate();
	    		 if (rowsAffected > 0) {
	                 System.out.println("Đã xóa thành công");   
	             } else {
	                 System.out.println("Không tìm thấy học sinh có mã: " + mahocsinh);      
	             }
	     } catch (SQLException e) {
	    	 e.printStackTrace();
	     }
	     }
	     public static boolean capNhatStudent(Hocsinh hs) {
	         String sqlUpdate = "UPDATE HocSinh SET MaLop = ?, HoVaTen = ?, GioiTinh = ?, NgaySinh = ?, Quequan = ?, DiemTB = ?, XepLoai = ? WHERE MaHocSinh = ?";
	         try {
	             Connection conn = getConnection();
	             if (conn != null) {
	                 PreparedStatement pstUpdate = conn.prepareStatement(sqlUpdate);
	                 pstUpdate.setString(1, hs.getMalop());
	                 pstUpdate.setString(2, hs.getHovaten());
	                 pstUpdate.setBoolean(3, hs.isGioitinh());
	                 pstUpdate.setDate(4, new java.sql.Date(hs.getNgaysinh().getTime()));
	                 pstUpdate.setString(5, hs.getTinh().getTenquequan());
	                 pstUpdate.setFloat(6, (float) hs.getDtb());
	                 pstUpdate.setString(7, hs.getXepLoai());
	                 pstUpdate.setString(8, hs.getMahocsinh());

	                 int rowsAffected = pstUpdate.executeUpdate();
	                 return rowsAffected > 0;
	             }
	         } catch (SQLException e) {
	             e.printStackTrace();
	         }
	         return false;
	     }
	     public static boolean luuDuongDanAnh(String maHocSinh, String duongDanAnh) {
	    	    String sqlUpdateAnh = "UPDATE HocSinh SET DuongDanAnh = ? WHERE MaHocSinh = ?";
	    	    try {
	    	        Connection conn = getConnection();
    	        if (conn != null) {
    	            PreparedStatement pstUpdateAnh = conn.prepareStatement(sqlUpdateAnh);
	    	            pstUpdateAnh.setString(1, duongDanAnh);
	    	            pstUpdateAnh.setString(2, maHocSinh);

	    	            int rowsAffected = pstUpdateAnh.executeUpdate();
	    	            if (rowsAffected > 0) {
	    	                JOptionPane.showMessageDialog(null, "Thêm ảnh thành công!");
   	                return true;
	    	            }
	    	        
	    	            return rowsAffected > 0;
	    	        }
	    	    } catch (SQLException e) {
	    	        e.printStackTrace();
	    	    }
	    	    return false;
	    	}
	     public static String layDuongDanAnhHocSinh(String maHocSinh) {
	    	    String duongDanAnh = null;
	    	    String sql = "SELECT DuongDanAnh FROM HocSinh WHERE MaHocSinh = ?";
	    	    try {
	    	        Connection conn = getConnection();
	    	        if (conn != null) {
	    	            PreparedStatement pst = conn.prepareStatement(sql);
	    	            pst.setString(1, maHocSinh);
	    	            ResultSet rs = pst.executeQuery();
	    	            if (rs.next()) {
	    	                duongDanAnh = rs.getString("DuongDanAnh");
	    	            }
	    	            rs.close();
	    	            pst.close();
	    	        }
	    	    } catch (SQLException e) {
	    	        e.printStackTrace();
	    	    }
	    	    return duongDanAnh;
	    	}
	}

