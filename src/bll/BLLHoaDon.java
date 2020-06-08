/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import Other.MyCombobox;
import Other.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class BLLHoaDon {
    public static int GetMaHDBySoHoaDon(String SoHoaDon){
        ResultSet rs = Other.DAOHoaDon.GetBySoHoaDon(SoHoaDon);
        try {
            if(rs.next()){//neu co thi tra ve MaHD trong csdl
                return rs.getInt("MaHD");
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Lỗi lấy mã hóa đơn từ số hóa đơn", "Thông báo lỗi");
        }
        return -1;
    }
    public static void DoDuLieuVaocboMaDonHang(JComboBox cbb){//ham nay chua dung duoc
        try {
            ResultSet rs = Other.DAOHoaDon.GetAll();
            
            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
            MyCombobox cbb0 = new MyCombobox("Tất cả", 0);
            cbbModel.addElement(cbb0);
            while(rs.next()){
                MyCombobox mb = new MyCombobox(rs.getString("SoHoaDon"), 
                                            rs.getInt("MaHD"));
                cbbModel.addElement(mb);                
            }
        } catch (SQLException ex) {
            ThongBao.ThongBao("Thông báo", "Lỗi truy vấn dữ liệu.");
        }
    }
    
}
