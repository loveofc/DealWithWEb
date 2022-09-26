package servlet.sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	
	// 클라이언트가 /second URL정보를 보내면
	// inti(ServletConfig) => service(servletRequest,servletResponse) =>service(HttpServletRequest, HttpServletResponse) => doGet(HttpServletRequest, HttpServletResponse)
	//순으로 호출된다.
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("SecondServlet!!");
	}
}
