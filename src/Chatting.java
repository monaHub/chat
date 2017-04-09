
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chatting
 */
@WebServlet("/Chatting")
public class Chatting extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Chatting() {
		super();
		// TODO Auto-generated constructor stub
	}

	private ArrayList<String> chooes_onlineList = new ArrayList<String>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().write("User chose: " +
		// request.getParameter("ChatPartner"));
		String[] assignedResources = request.getParameterValues("ChatPartner");
		String l= assignedResources.length+"";
		response.getWriter().write(l);
		// String chooes = request.getParameter("ChatPartner");
		for (int i = 0; i < assignedResources.length; i++) {
			if (assignedResources[i].equals("true")) {
			//	response.getWriter().write("User chose: " +
				/// assignedResources[i]);
				
				
		///		chooes_onlineList.add(user);
//				String l= chooes_onlineList.size()+"";
//				response.getWriter().write(l);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
