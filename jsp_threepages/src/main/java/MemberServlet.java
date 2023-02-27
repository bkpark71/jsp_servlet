import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //  /member 에 접속하면 사용자 정보(id)를 list 에 추가 -->
//    System.out.println(req.getParameter("id"));
//    System.out.println(req.getParameter("name"));
//    System.out.println(req.getParameter("password"));
    List<String> members = new ArrayList<>();
    members.add(req.getParameter("id"));

    System.out.println(members);
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  }
}
