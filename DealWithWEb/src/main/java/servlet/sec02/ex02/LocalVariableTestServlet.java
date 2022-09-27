package servlet.sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/localV")
public class LocalVariableTestServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		int number = 0;
		String str = req.getParameter("msg");
		out.println("<h2>처리 결과(지역변수)</h2>");
		while(number++<10) {
			out.print(str+" : "+number+"<br/>");
			out.flush();
			System.out.println(str+" : "+number);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		out.println("<h2>Done "+str+" !!</h2>");
		out.close();
		
	}
}
