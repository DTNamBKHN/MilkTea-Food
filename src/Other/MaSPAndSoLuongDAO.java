/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MaSPAndSoLuongDAO {

    public List<MaSPAndSoLuong> select() {
        String sql = "SELECT MaSP, SUM(SoLuong) AS SoLuong "
                + "FROM dbo.ChiTietHoaDon GROUP BY MaSP";
        return select(sql);
    }

    private List<MaSPAndSoLuong> select(String sql, Object... args) {
        List<MaSPAndSoLuong> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    MaSPAndSoLuong model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private MaSPAndSoLuong readFromResultSet(ResultSet rs) throws SQLException {
        MaSPAndSoLuong model = new MaSPAndSoLuong();
        model.setMaSP(rs.getInt("MaSP"));
        model.setSoLuong(rs.getInt("Soluong"));
        return model;
    }
}
