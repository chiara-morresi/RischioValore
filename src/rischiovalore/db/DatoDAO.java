package rischiovalore.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatoDAO {
	
	public List<String> popolaFamigliaProdotto() {
		
		Connection conn = BDConnect.getConnection();
		String sql ="select nome from famiglia";
		PreparedStatement st;
		try {
			st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();
			List<String> famigliaProdotto = new ArrayList<String>();
			while(res.next())
			{
				famigliaProdotto.add(res.getString("nome"));
			}
			res.close();
			conn.close();
			return famigliaProdotto;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	
	
	}
	
	
	
public List<String> popolaSottofamigliaProdotto(int codFamiglia) {
		
		Connection conn = BDConnect.getConnection();
		String sql ="select nome from sottofamiglia where codFamiglia=?";
		PreparedStatement st;
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, codFamiglia);
			ResultSet res = st.executeQuery();
			List<String> sottofamigliaProdotto = new ArrayList<String>();
			while(res.next())
			{
				sottofamigliaProdotto.add(res.getString("nome"));
			}
			res.close();
			conn.close();
			return sottofamigliaProdotto;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	
	
	}


}
	
