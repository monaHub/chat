
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LogIn
 */
@WebServlet("/LogIn")
public class LogInChat extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInChat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String log="";
		log += "<html><body><form action='Choosechat'>"
				+ " <center><fieldset>"
+    "<legend align=center>LogIn Form</legend> <br /><br /> UserName:  <input type='String' name='user' id='user' ><br /><br />"+
	" Password:  <input type='String' name='pass' id='pass'><br /><br />"+
	" <button type='submit'>LogIn</button></fieldset>"+
	"<p id='demo'></p></center></form></body></html>";
		response.getWriter().append(log);
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
