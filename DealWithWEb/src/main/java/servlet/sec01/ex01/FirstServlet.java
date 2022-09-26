package servlet.sec01.ex01;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//http 프로토콜을 이용해 서비스를 처리하기 위해 반드시 상속받아야 하는 클래스
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service() 실행됨!");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 실행됨!");
	}
	
}
