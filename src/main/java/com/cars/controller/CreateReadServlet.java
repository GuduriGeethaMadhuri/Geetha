//package com.cars.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//import com.cars.implementation.Implementation;
//import com.servlet.encapsulated.carsentity;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
////@WebServlet("CreatedServlet")
//public class CreateReadServlet extends HttpServlet {
//
//	private static final long serialVersionUID = 1L;
//	public CreateReadServlet() {
//		super();
//	}
//	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("post method triggered");
//		String carmodelname=request.getParameter("carmodelname");
//		String carvariants=request.getParameter("carvariants");
//		int FEvariants=0;
//		try {
//			FEvariants=Integer.parseInt(carvariants);
//		}
//		catch(Exception e) {
//			FEvariants=0;
//		}
//		String price=request.getParameter("price");
//		String Topspeed=request.getParameter("Topspeed");
//		String FuelType=request.getParameter("FuelType");
//		
//		
//		carsentity car=new carsentity();
//		car.setCarmodelname(carmodelname);
//		car.setCarvariants(FEvariants);
//		car.setPrice(price);
//		car.setTopspeed(Topspeed);
//		car.setFuelType(FuelType);
//		
//		
//		Implementation imp=new Implementation();
//		int result=imp.insertmethod(car);
//		HttpSession session=request.getSession();
//		session.setAttribute("carsinsert", car);
//		RequestDispatcher success=request.getRequestDispatcher("/Success.html");
//		RequestDispatcher failure=request.getRequestDispatcher("/Failure.html");
//		
//		if(result>0) {
//			success.forward(request, response);
//		}
//		else {
//			failure.forward(request, response);
//		
//		}
//		}
//	protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Get Method Triggered");
//
//		String id = request.getParameter("carvariants");
//
//		int cvariants=0;
//		try {
//			cvariants= Integer.parseInt(id);
//		}catch(Exception e) {
//			cvariants=0;
//		}
//		carsentity car = new carsentity();
//		car.setCarvariants(cvariants);
//
//		Implementation imp =new Implementation();
//
//		carsentity entity = imp.Search(cvariants);
//
//		HttpSession session = request.getSession();
//		session.setAttribute("carObject", entity);
//
//		RequestDispatcher success = request.getRequestDispatcher("/CarServlet");
//		RequestDispatcher failed = request.getRequestDispatcher("Failure.html");
//
//		if(entity!=null) {
//			success.forward(request, response);
//
//		}
//		else {
//			failed.forward(request, response);
//		}
//
//
//
//
//	}
//
//	}
//
