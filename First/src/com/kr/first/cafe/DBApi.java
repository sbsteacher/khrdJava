package com.kr.first.cafe;

import static com.kr.first.cafe.DBCon.*;
import java.sql.*;
import java.util.*;

public class DBApi {
	public static List<CoffeeVO> getCoffeeList() {
		List<CoffeeVO> list = new ArrayList();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " SELECT * FROM coffee ORDER BY i_coffee ";
		
		try {
			con = getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int i_coffee = rs.getInt("i_coffee");
				String nm = rs.getString("nm");
				int price = rs.getInt("price");
				
				CoffeeVO vo = new CoffeeVO();
				vo.setI_coffee(i_coffee);
				vo.setNm(nm);
				vo.setPrice(price);
				
				list.add(vo);
			}
			
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			close(con, ps, rs);
		}
		
		return list;
	}
}





