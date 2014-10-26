package praveen.sankar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderReaderServlet
 */
public class HeaderReaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderReaderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> a = request.getHeaderNames();
		PrintWriter outt = response.getWriter();
		outt.append(request.getRemoteAddr());
		outt.append("\n \n");
		outt.append(request.getProtocol());
		outt.append("\n \n");
		outt.append(request.getRemoteHost());
		outt.append("\n \n");
		while(a.hasMoreElements()){
			String b=a.nextElement();
			System.out.println(b);
			
			outt.append("\n \n");
			outt.append(request.getHeader(b));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
