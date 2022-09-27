package servlet.sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("get방식");
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String likes = req.getParameter("likes");
		String intro = req.getParameter("introduction");
		
		out.print("id : " + id+"<br/>");
		out.print("password : " + password+"<br/>");
		out.print("name : " + name+"<br/>");
		for(int i =0; i<hobbies.length;i++) {
			out.print("hobby : " + hobbies[i]+"<br/>");
		}
		out.print("gender : " + gender+"<br/>");
		out.print("likes : " + likes+"<br/>");
		out.print("intro : " + intro+"<br/>");
		out.print("전체 query : "+ req.getQueryString());
		out.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("post방식");
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String name = req.getParameter("name");
		String[] hobbies = req.getParameterValues("hobby");
		String gender = req.getParameter("gender");
		String likes = req.getParameter("likes");
		String intro = req.getParameter("introduction");
		
		out.print("id : " + id+"<br/>");
		out.print("password : " + password+"<br/>");
		out.print("name : " + name+"<br/>");
		for(int i =0; i<hobbies.length;i++) {
			out.print("hobby : " + hobbies[i]+"<br/>");
		}
		out.print("gender : " + gender+"<br/>");
		out.print("likes : " + likes+"<br/>");
		out.print("intro : " + intro+"<br/>");
		out.close();
		
	}
}
