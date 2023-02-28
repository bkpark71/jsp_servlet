import data.Member;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/memberjoin")
public class MemberJoinServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 동적 배열 활용
    Map<String, Member> members = new HashMap<>();

    members.put("1",new Member("1","aaa","aaa"));
    members.put("2",new Member("2","bbb","bbb"));
    members.put("3",new Member("3","ccc","ccc"));

    Member member = new Member("4","ddd","ddd");
    members.put("4",member);

    req.setAttribute("members", members);
    req.getRequestDispatcher("memberList.jsp").forward(req, resp);
  }
}
