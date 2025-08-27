package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;

public class Exam {

	// 1
	public static void listStudentsByClassId(int classId) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			if (conn == null) {
				System.err.println("fall");
				return;
			}

			String sql;
			if (classId > 0) {
				sql = "SELECT id, name, gender, class_id FROM Student WHERE class_id";
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1, classId);
				System.out.println("Students in class " + classId + ":");
			} else {
				sql = "SELECT id, name, gender, class_id FROM Student";
				stmt = conn.prepareStatement(sql);
				System.out.println("All students:");
			}

			rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println("Student { ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Gender: "
						+ rs.getString("gender") + ", Class ID: " + rs.getInt("class_id") + " }");
			}
		} catch (SQLException e) {
			System.err.println("fail" + e.getMessage());// dbug
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 2
	public static void listExcellentStudents() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			if (conn == null) {
				System.err.println("Connection is null. Check DB config.");
				return;
			}

			String sql = "SELECT c.name AS class_name, " + "COUNT(DISTINCT s.id) AS student_count, "
					+ "GROUP_CONCAT(DISTINCT s.name SEPARATOR ', ') AS student_names " + "FROM Class c "
					+ "JOIN Student s ON c.id = s.class_id "
					+ "JOIN Result r1 ON r1.student_id = s.id AND r1.subject = 'Math' AND r1.score >= 8 "
					+ "JOIN Result r2 ON r2.student_id = s.id AND r2.subject = 'Literature' AND r2.score >= 8 "
					+ "GROUP BY c.id, c.name";

			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();

			System.out.println("Classes with students having Math >= 8 and Literature >= 8:");
			while (rs.next()) {
				System.out.println("Class: " + rs.getString("class_name") + ", Student count: "
						+ rs.getInt("student_count") + ", Students: " + rs.getString("student_names"));
			}
		} catch (SQLException e) {
			System.err.println("Query error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 3
	public static void countStudentsPerClass() {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbConnection.getConnection();
			if (conn == null) {
				System.err.println("Connection is null. Check database configuration.");
				return;
			}

			String sql = "SELECT c.id, c.name AS class_name, COUNT(s.id) AS student_count " + "FROM Class c "
					+ "LEFT JOIN Student s ON c.id = s.class_id " + "GROUP BY c.id, c.name";


		} 
	}

	public static void main(String[] args) {
		System.out.println("1");
		listStudentsByClassId(0);// 0 list all / 1 2 3 tung id

		// listExcellentStudents();

		// countStudentsPerClass();
	}
}