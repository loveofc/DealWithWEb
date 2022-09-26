package servlet.sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/third")
public class ThirdServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 한글 제대로 표시하기
		resp.setContentType("text/html;charset=utf-8");//데이터타입과 문자셋 설정
		PrintWriter out = resp.getWriter();
		out.println("방가방가");
		out.close();
	}

}
