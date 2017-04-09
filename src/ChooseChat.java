
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession.*;
import javax.servlet.http.HttpServletRequest.*;
import javax.servlet.http.HttpSessionAttributeListener.*;

import javax.swing.text.html.*;
import javax.swing.text.html.Option;

import com.sun.xml.internal.txw2.Document;

import javax.servlet.ServletOutputStream;

/**
 * Servlet implementation class ChooseChat
 */
@WebServlet("/Choosechat")
public class ChooseChat extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChooseChat() {
		super();
		// TODO Auto-generated constructor stub
	}


	ArrayList<HttpSession>session = new ArrayList< HttpSession>();
	public static int num = 0;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	private Map<HttpSession, String> sessions = new ConcurrentHashMap<HttpSession, String>();
	private ArrayList<String> onlines = new ArrayList<String>();
	private Set<String> users = new HashSet<String>();
	private Map<String, String> use = new ConcurrentHashMap<String, String>();
	String user;
	String pass;


	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		session.add(num, request.getSession());
		// if (!session[num].isNew()) {
		// System.out.println("not new");
		// session[num].}
		user = request.getParameter("user");
		pass = request.getParameter("pass");
		// } else {
		// user = (String) session[num].getAttribute("username");
		// pass = (String) session[num].getAttribute("password");
		//
		// }
		// ******
		for (int i = 0; i < 7; i++) {
			users.add(i + "");
			use.put(i + "", i + "");
		}
		// ******
		if (use.containsKey(user)) {
			if (use.get(user).equals(pass)) {
				if (!onlines.contains(user))
					onlines.add(user);
				session.get(num).setAttribute("username", user);
				session.get(num).setAttribute("password", pass);
				// request.setAttribute("list", onlines);
				// request.setAttribute("session", session);

				String log = "";
				log += "<html><body><form  action='Chatting'>" + "<select name='ChatPartner' id='ChatPartner' multiple>";
				for (int i = 0; i < onlines.size(); i++) {

					log += "<option name ='"+ onlines.get(i) +"'value='true' id='option'>" + onlines.get(i) + "</option>";
				}

				log += "</select>"
						+ ""
						+ "<input type='submit' value='Start Chat'  onclic='salam' />"
						+ "</form></body></html>";

				response.getWriter().append(log);

				num++;
				//response.getWriter().write("User chose: " + request.getParameter("ChatPartner"));

				// System.out.println(request.getParameter("option"));
				//// for (var i = 0; i < x.options.length; i++) {
				// if (x.options[i].selected == true) {

				// var y = x.options[i].value;

				// }}

			} else {
				String log = "";
				log += "<html><body><form action='Choosechat'>" + " <center><fieldset>"
						+ " <p id='demo'> Wrong Password </p></fieldset></center></form></body></html>";
				response.getWriter().append(log);
				System.out.println("Incorrect password");
			}

		} else {
			String log = "";
			log += "<html><body><form action='Choosechat'>" + " <center><fieldset>"
					+ " <p id='demo'> This username has not been registered yet! </p></fieldset></center></form></body></html>";
			response.getWriter().append(log);
			System.out.println("not EXIST");
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
