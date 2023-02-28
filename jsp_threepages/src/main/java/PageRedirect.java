import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/redirect")
public class PageRedirect extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //resp.getWriter().println("<html><body><h1>This is Redirect screen</h1></body></html>");
    req.setAttribute("aaa", "bbb");
    req.setAttribute("111", "222");
    resp.sendRedirect("/index.jsp");
  }
}
