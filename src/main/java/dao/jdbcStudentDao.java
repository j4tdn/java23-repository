package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import persistence.student;

public class jdbcStudentDao implements studentDao {
	
	private final Connection con = null;
	private Statement st;
	private ResultSet rs;
	@Override
	public List<student> getAll() {
		List<student> result = new ArrayList<student>();
		String sql = "SELECT * FROM STUDENT WHERE class_id = ? ";
				try {
					st = con.createStatement();
					rs = st.executeQuery(sql);
					while(rs.next()) {
						Integer id  = rs.getInt("student_id");
						String name = rs.getString("student_name");
						String gender = rs.getString("gender");
						student student = new student(id,name,gender);
						result.add(student);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
		return result;
	}
	
	
}
