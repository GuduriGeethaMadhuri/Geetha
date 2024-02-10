package com.cars.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.cars.implementation.Implementation;
import com.servlet.encapsulated.carsentity;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class FetchServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FetchServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get method triggered in fetch");
		Implementation imp=new Implementation();
		List<carsentity> result= imp.Fetch();
		HttpSession session= request.getSession(); 
		session.setAttribute("Details", result);
		RequestDispatcher r1= request.getRequestDispatcher("/Details.jsp");
		r1.forward(request, response);
		
	}
}