package servlet.sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/headerinfo")
public class URLInfoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Request 정보 출력 Servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		Enumeration<String> em = req.getHeaderNames(); //모든 헤더 이름 가져오는 메서드
		while(em.hasMoreElements()) {
			String s = em.nextElement();
			out.print(s+" : "+req.getHeader(s)+"<br/>");
		}
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
	}
}
