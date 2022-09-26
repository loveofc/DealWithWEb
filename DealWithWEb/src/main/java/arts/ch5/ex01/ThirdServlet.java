package arts.ch5.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/art3")
public class ThirdServlet extends HttpServlet {
	public void init() throws ServletException {
	      System.out.println("init 3 어노테이션");
	   }

	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
	      System.out.println("doGet 3 어노테이션");
	   } 

	   public void destroy() {
	      System.out.println("destroy 3 어노테이션");
	   }
}
