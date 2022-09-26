package arts.ch5.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	public void init() throws ServletException {
	      System.out.println("init 2");
	   }

	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
	      System.out.println("doGet 2");
	   } 

	   public void destroy() {
	      System.out.println("destroy 2");
	   }
}
