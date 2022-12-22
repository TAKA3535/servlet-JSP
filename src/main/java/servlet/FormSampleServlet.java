package servlet;
// P151
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//アノテーション
@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doPost(HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    // リクエストパラメータを取得,formSample.jspのformを下で受け取っている
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String gender = request.getParameter("gender");
    String pref = request.getParameter("pref");
    // リクエストパラメータをチェック
    String errorMsg = "";
    if (name == null || name.length() == 0) {
      errorMsg += "名前が入力されていません<br>";
    }
    if (gender == null || gender.length() == 0) {
      errorMsg += "性別が選択されていません<br>";
    } else {
      if (gender.equals("0")) {
    	  //0が送られたらgenderの中に男性を入れる
        gender = "男性";
      }
      else if (gender.equals("1")) {
        gender = "女性";
      }
      else if (gender.equals("2")) {
    	gender = "回答なし";
      }
    }
    if (pref == null || pref.length() == 0) {
        errorMsg += "出身地方が入力されていません<br>";
    }
    
    // 表示するメッセージを設定
    String msg = "名前：" + name + "さん<br>性別：" + gender + "<br>出身：" + pref + "<br>を登録しました";
    
    if (errorMsg.length() != 0) {
      msg = errorMsg;
    }

    // HTMLを出力
    response.setContentType("text/html; charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("<!DOCTYPE html >");
    out.println("<html>");
    out.println("<head>");
    //							↓\\(エスケープ処理)をして外と中の""を区別している
    out.println("<meta charset=\"UTF-8\">");
    out.println("<title>ユーザー登録結果5-4 P152</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<p>" + msg + "</p>");
    out.println("</body>");
    out.println("</html>");
  }
}
