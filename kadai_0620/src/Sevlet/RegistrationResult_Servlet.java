package Sevlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Dao;
import Dto.Dto;


/**
 * Servlet implementation class RegistrationResult_Servlet
 */
@WebServlet("/RegistrationResult_Servlet")
public class RegistrationResult_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationResult_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.setCharacterEncoding("UTF-8");
		String id  = request.getParameter("id");
		int ID = Integer.parseInt(id);
		String NAME = request.getParameter("name");
		String price = request.getParameter("price");
		int PRICE = Integer.parseInt(price);
		String day  = request.getParameter("day");
		int DAY = Integer.parseInt(day);


		Dto d = new Dto(ID,NAME,PRICE,DAY);

		Dao.Add(d);



		String view = "/WEB-INF/view/RegistrationResult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request,response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
