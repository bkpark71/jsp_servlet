import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // query parameters 로 넘어온 매개변수를 변수에 저장한 후
    // 2단 이면 2단을 출력하라고 jsp에 전달하고 화면 이동
    int dan = 0;
    int limit = 6 ;
    try {
      dan = Integer.parseInt(req.getParameter("dan")); // 여기에서 numberformatexception 발생
      req.setAttribute("dan", dan);
      req.setAttribute("limit",limit);
      RequestDispatcher requestDispatcher =
          req.getRequestDispatcher("gugudan.jsp");
      requestDispatcher.forward(req, resp);
    } catch (NumberFormatException e) {
      resp.getWriter().append("입력값이 없습니다.");
    }
  }
}
