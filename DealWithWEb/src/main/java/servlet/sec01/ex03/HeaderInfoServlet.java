package servlet.sec01.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/urlinfo")
public class HeaderInfoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Request 정보 출력 Servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>요청 방식과 프로토콜 정보</h3>");
		out.print("Request URI : "+req.getRequestURI()+"<br/>"); // 포트번호 뒤에부터 경로
		out.print("Request URL : "+req.getRequestURL()+"<br/>"); //전체 url
		out.print("Context Path : "+req.getContextPath()+"<br/>"); //웹 애플리케이션 경로 정보
		out.print("Request Protocol : "+req.getProtocol()+"<br/>"); // 프로토콜 방식
		out.print("Servlet Path : "+req.getServletPath()); //서블릿 경로
		out.print("</body>");
		out.print("</html>");
		
		out.close();
		
	}
}
