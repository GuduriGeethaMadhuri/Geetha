package com.cars.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.encapsulated.carsentity;

//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CarServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public CarServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException {

		response.setContentType("text/html");

		HttpSession session = request.getSession();
		Object obj = session.getAttribute("carObject");

		carsentity car = null;
		if(obj!=null) {
			car = (carsentity) obj;
		}
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<style>\r\n"
				+ "	body{\r\n"
				+ "		background-image: url(\"https://www.carpro.com/hubfs/car-review-blog/2020-mercedes-amg-glc43-exterior1-min.jpg\");\r\n"
				+ "		background-repeat: no-repeat;\r\n"
				+ "		background-attachment: fixed;\r\n"
				+ "		background-position: center bottom;\r\n"
				+ "		background-size:cover;\r\n"
				
				+ "		margin: 0;\r\n"
				+ "		padding: 0;\n"
				
				+ "	}\r\n"
				+ "	th{\r\n"
				+ "			background-color:linen;\r\n"
				+ "			border: 2px solid hsla(165, 55%,65%,0.6);;\r\n"
				+ "            padding: 8px;\r\n"
				+ "            text-align: center;\r\n"
				+ "            }\r\n"
				+ "            h1{\r\n"
				+ "				text-align: center;\r\n"
				+ "				border-radius:0%;;\r\n"
				+ "				\r\n"
				+ "			}\r\n"
				+ "</style>");
		out.print("<table align='center'>");
		out.print("<tr><th>carmodelname :</th><th>carvariants :</th><th>Price :</th> <th>Topspeed :</th><th>FuelType :</th></tr>");
		out.print("<tr><td>"+car.getCarmodelname()+"</td>");
		out.print("<tr><td>"+car.getCarvariants()+"</td>");
		out.print("<tr><td>"+car.getPrice()+"</td>");
		out.print("<tr><td>"+car.getTopspeed()+"</td></tr>");
		out.print("<tr><td>"+car.getFuelType()+"</td></tr>");
		out.print("<tr><td><button><a href = 'Index.html'>Back To Home Page</button>");
		out.print("</table></body></html>");

	}
}