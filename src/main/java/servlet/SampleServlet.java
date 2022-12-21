package servlet;
//コード3-4　占い結果をHTMLでレスポンスするサーブレットクラス P94
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SampleServlet")

public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 運勢をランダムで決定
		String[] luckArray = { "超スッキリ", "スッキリ", "最悪" };
		int index = (int) (Math.random() * 3);
		String luck = luckArray[index];

		int index2 = (int) (Math.random() * 3);
		String luck2 = luckArray[index2];
		
		int index3 = (int) (Math.random() * 3);
		String luck3 = luckArray[index3];

		// 実行日を取得
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
		String today = sdf.format(date);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, 1);
		
		date = calendar.getTime();
		String tomorrow = sdf.format(date);
		
		calendar.add(Calendar.DATE, 1);
		date = calendar.getTime();
		String dayAfterTomorrow = sdf.format(date);
		
		// HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>スッキリ占い</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p style=\"font-size:60px\">今日：" + today + "の運勢は\n「" + luck + "」です</p>");
		out.println("<p style=\"font-size:60px\">明日：" + tomorrow + "の運勢は\n「" + luck2 + "」です</p>");
		out.println("<p style=\"font-size:60px\">明後日：" + dayAfterTomorrow + "の運勢は\n「" + luck3 + "」です</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
