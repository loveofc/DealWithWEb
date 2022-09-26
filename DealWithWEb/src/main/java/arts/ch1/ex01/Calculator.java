package arts.ch1.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RateServlet
 */
@WebServlet("/calc")
public class Calculator extends HttpServlet {
	private static float USD_RATE= 0.00070F;
	private static float JPY_RATE = 0.10F;
	private static float CNY_RATE = 0.0050F;
	private static float GBP_RATE = 0.00065F;
	private static float EUR_RATE = 0.00072F;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request,response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();
			String command=request.getParameter("command");
			String won=request.getParameter("won");
			String operator=request.getParameter("operator");
			
			if(command!= null && command.equals("calculate")){
				String result = calculate(Float.parseFloat(won),operator);
				pw.print("<html><font size=10>변환결과</font><br>");
				pw.print("<html><font size=10>"+result+"</font><br><br><br>");
				pw.print("<a href='/DealWithWEb/calc'>환율 계산기 </a>");
				return;
			}
			
			pw.print("<html><title>환율 계산기 </title>");
			pw.print("<font size=5>환율 계산기 </font><br>");
			pw.print("<form  name='frmCalc' method='post'  action='/DealWithWEb/calc'  />  ");
			pw.print("<input type='text' name='won' size=10  />  ");
			pw.print("<select name='operator' >");
			pw.print("<option value='dollar'>달러</option>");
			pw.print("<option value='en'>엔화</option>");
			pw.print("<option value='wian'>위안</option>");
			pw.print("<option value='pound'>파운드</option>");
			pw.print("<option value='euro'>유로</option>");
			pw.print("</select>");
			pw.print("<input type='hidden' name='command' value='calculate'  />  ");
			pw.println("<input type='submit' value='변환'  />");
			pw.println("</form>");
			pw.print("</html>");
			pw.close();
	}

	
	private static  String calculate(float won ,String operator){
		String result=null;
		if(operator.equals("dollar")){
			result=String.format("%.2f",won/USD_RATE);
		}else if(operator.equals("en")){
			result=String.format("%.2f",won/JPY_RATE);
		}else if(operator.equals("wian")){
			result=String.format("%.2f",won/CNY_RATE);
		}else if(operator.equals("pound")) {
			result=String.format("%.2f",won/GBP_RATE);
		}else if(operator.equals("euro")) {
			result=String.format("%.2f",won/EUR_RATE);
		}
		return result;
	}
}
