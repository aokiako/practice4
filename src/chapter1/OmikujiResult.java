package chapter1;

import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Omikuji;
import dao.OmikujiDao;
import dao.ResultDao;

/**
 * Servlet implementation class OmikujiResult
 */
/**
 * @author a_aoki
 */
@WebServlet("/OmikujiResult")
public class OmikujiResult extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//入力項目を取得
		String birthday = request.getParameter("birthday");

		//入力チェック
		Pattern p = Pattern.compile("^(\\d{4})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])$");
		Matcher match = null;

		match = p.matcher(birthday);
		if (!match.find()) {
			request.setAttribute("message", "形式が不正です。(例：19960730)");
			RequestDispatcher rd = request.getRequestDispatcher("/BirthdayInput");
			rd.forward(request, response);
		} else {

		}
		//omikujiidの生成
		ResultDao resultDao = new ResultDao();
		int omikujiId = resultDao.selectByBirthday(birthday);

		OmikujiDao omikujiDao = new OmikujiDao();
		int max = omikujiDao.selectCount();
		if (omikujiId == -1) {
			// ランダムの処理
			Random rand2 = new Random();
			omikujiId = rand2.nextInt(max);
		}

		Omikuji omikuji = omikujiDao.selectById(omikujiId);

		resultDao.insert(omikuji, birthday);

		request.setAttribute("omikuji", omikuji);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/result.jsp");
		rd.forward(request, response);

	}

}
