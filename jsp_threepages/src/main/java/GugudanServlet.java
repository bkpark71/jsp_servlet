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
    resp.setContentType("text/html; charset=UTF-8");
    System.out.println(req.getMethod());
    System.out.println(req.getRequestURL());
    System.out.println(req.getRequestURI());
    // query parameters 로 넘어온 매개변수를 변수에 저장한 후
    // 2단 이면 2단을 출력 , 3단 이면 3단을 출력
    int dan = 0;
    try {
      dan = Integer.parseInt(req.getParameter("dan")); // 여기에서 numberformatexception 발생
      String gugudan = dan + " 단을 출력합니다.";
      String gugudan2 = dan + "X 1 =" + (dan*1) ;
      resp.getWriter().append("<body><h2>"+gugudan +"</h2>" + gugudan2 + "</body>");
    } catch (NumberFormatException e) {
      resp.getWriter().append("입력값이 없습니다.");
    }
  }
}
