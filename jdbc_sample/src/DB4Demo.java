import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB4Demo {
  public static Connection makeConnection() {
    String url = "jdbc:mysql://localhost:3306/spring?serverTimezone=Asia/Seoul";
    String userName = "root";
    String password = "1111";
    Connection con = null;
    try {
      con = DriverManager.getConnection(url, userName, password);
      System.out.println("데이터베이스 연결 성공");
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
      System.out.println(e.getMessage());
    }
    return con;
  }
  public static void main(String[] args) throws SQLException {
    Connection con = makeConnection();

    String sql = "SELECT * FROM member;";
    PreparedStatement pstmt = con.prepareStatement(sql);
    ResultSet rs = pstmt.executeQuery();

    while (rs.next()) {
      System.out.print("id : " + rs.getInt("id") + "\t");
      System.out.println("name : " + rs.getString("name"));
    }
  }
}
