import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/name")
public class HiServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    System.out.println("doGet() ==>" + name);
    resp.getWriter().append("hello , " + name);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //1. parameter 가져온다.
    String name = req.getParameter("name");
    System.out.println("doPost() ==>" + name);
    //2. request객체의 attribute 에 값을 저장한다.
    req.setAttribute("name", name);
    //3. dispatcher에게 값을 넘기면서 작업을 forward 한다.
    req.getRequestDispatcher("/hi.jsp").forward(req, resp);
  }

  @Override
  protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    System.out.println("doPut() ===> " +  name);
  }

  @Override
  protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("name");
    System.out.println("doDelete() ===> " + name);
  }
}
