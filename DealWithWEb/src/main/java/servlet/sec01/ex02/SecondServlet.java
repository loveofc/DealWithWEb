package servlet.sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/outprint")
public class SecondServlet extends HttpServlet{
	
	//출력 응답
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("출력 연습");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>TEST</title></head>");
		out.print("<body><h1>Have a nice day</h1></body></html>");
		out.close();
	}
}
