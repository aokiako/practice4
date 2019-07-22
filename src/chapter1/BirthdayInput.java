package chapter1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BirthdayInput
 */
/**
 * @author a_aoki
 *
 */
@WebServlet("/BirthdayInput")
public class BirthdayInput extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>おみくじ</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>おみくじ</h1>");
		out.println("<h3>誕生日を入力してください</h3>");
		//エラーメッセージの表示
		String message = (String) request.getAttribute("message");
		//フォームに文字が入っているかの確認
		if (message != null && !message.isEmpty()) {
			out.println("<p>" + message + "</p>");
		}
		out.println("<form action=\"/omikuji2.0/OmikujiResult\">");
		out.println("<input type=\"text\" name=\"birthday\"><br/>");
		out.println("<input type=\"submit\" value=\"おみくじを引く\"></input>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	}
}
