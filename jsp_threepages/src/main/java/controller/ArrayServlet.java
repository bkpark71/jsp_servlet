package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/array")
public class ArrayServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //1. 배열 을 작성한다.
    String[] nameArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};
    System.out.println("doPost() ==>" + nameArr);
    //2. request객체의 attribute 에 배열을 저장한다.
    req.setAttribute("nameArr", nameArr);
    //3. dispatcher에게 배열을 넘기면서 작업을 forward 한다.
    req.getRequestDispatcher("/array.jsp").forward(req, resp);

  }
}
