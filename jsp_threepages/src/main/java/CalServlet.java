import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cal")
public class CalServlet extends HttpServlet {

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html; charset=UTF-8");
//    CalServlet (query parameter 2개 )
//    1. num1 = 3  2. (+, -) 3. num2 = 4 (num1,num2 는 모두 integer)
//
//    결과가 +, - 연산을 해주는 프로그램
    int num1 = 0, num2= 0;
    String op = "";
    int res = 0;
    try {
      num1 = Integer.parseInt(req.getParameter("num1"));
      op = req.getParameter("op");
      System.out.println(op);
      num2 = Integer.parseInt(req.getParameter("num2"));
      if (op.equals("+")) {
        res = num1 + num2;
      } else if (op.equals("-")) {
        res = num1 - num2;
      }
      String result = num1 + "" + op + "" + num2 + " = "+res;
      resp.getWriter().append(result);
    } catch (NumberFormatException e) {
      resp.getWriter().append("입력값에 오류가 있습니다.");
    }
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/html; charset=UTF-8");
//    CalServlet (query parameter 2개 )
//    1. num1 = 3  2. (+, -) 3. num2 = 4 (num1,num2 는 모두 integer)
//
//    결과가 +, - 연산을 해주는 프로그램
    int num1 = 0, num2= 0;
    String op = "";
    int res = 0;
    try {
      num1 = Integer.parseInt(req.getParameter("num1"));
      op = req.getParameter("op");
      System.out.println(op);
      num2 = Integer.parseInt(req.getParameter("num2"));
      if (op.equals("+")) {
        res = num1 + num2;
      } else if (op.equals("-")) {
        res = num1 - num2;
      }
      String result = num1 + "" + op + "" + num2 + " = "+res;
      resp.getWriter().append(result);
    } catch (NumberFormatException e) {
      resp.getWriter().append("입력값에 오류가 있습니다.");
    }
  }
}
