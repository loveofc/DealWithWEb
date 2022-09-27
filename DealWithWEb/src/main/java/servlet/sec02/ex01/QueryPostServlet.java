package servlet.sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/postQuery")
public class QueryPostServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");//클라이언트에서 받아오는 문자를 utf-8로 서버에서 사용하라는 뜻
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		ServletInputStream input = req.getInputStream(); // 요청정보 몸체의 정보를 읽어오는 객체
		int len = req.getContentLength(); //요청정보 몸체에 담겨있는 문자열의 길이 반환
		byte[] buf = new byte[len];// 요청정보 길이 len만큼 byte 배열을 생성, 배열의 시작 주소값을 변수 buf에 저장
		input.readLine(buf, 0, len); // 한줄씩 읽어 배열의 0번째부터 len길이만큼 저장하라는 뜻
		String s = new String(buf); //  buf에 byte 데이터를 String 타입으로 데이터로 생성, 생성된 주소는 변수 s에 저장
		out.println("전체 문자열");
		out.print(s);
		out.close();
	}
	
	
}
