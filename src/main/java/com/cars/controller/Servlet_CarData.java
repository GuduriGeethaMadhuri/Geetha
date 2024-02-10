package com.cars.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.servlet.encapsulated.carsentity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Servlet_CarData extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
		public Servlet_CarData() {
			super();
		}
		protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException {

			response.setContentType("text/html");

			// session.setAttribute("carObject", entity);

			HttpSession session = request.getSession();
			Object obj = session.getAttribute("carObject");

			carsentity car = null;
			if(obj!=null) {
				car = (carsentity) obj;
			}
			RequestDispatcher rd = request.getRequestDispatcher("/CarServlet");
			session.setAttribute("Servlet_CarData", rd);

			PrintWriter out = response.getWriter();
			out.print("<html><body><table>");
			out.print("<button>");
			out.print("<a href = 'CarServlet'>Data</a>");
			out.print("</button>");
			out.print("</table></body></html>");


		}


	}