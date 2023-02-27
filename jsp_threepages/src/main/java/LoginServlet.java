import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<String> members = new ArrayList<String>();
    members.add("aaa");    members.add("bbb");
    boolean isLogin = false;
    String id = req.getParameter("id");
    Iterator<String> iterator = members.iterator();
    while(iterator.hasNext()){
      if (iterator.next().equals(id)) {
        isLogin = true;
        break;
      }
    }
    if (isLogin) {
      System.out.println("login success");
    } else {
      System.out.println("id 혹은 password를 확인하세요");
    }
  }
}
