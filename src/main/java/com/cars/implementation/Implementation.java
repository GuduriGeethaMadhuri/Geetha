package com.cars.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.servlet.encapsulated.carsentity;
import com.servlet.jdbc.jdbc;

public class Implementation {
	Connection connect;
	PreparedStatement ps;
	ResultSet rs;
	Statement s;
	
	public Implementation() {
		connect=jdbc.getinstance();
	}
		public int insertmethod(carsentity entity) {
			System.out.println("Implemention class triggered");
			int result=0;
			
			String query="insert into MercedesBenz values(?,?,?,?,?)";
			try {
				ps=connect.prepareStatement(query);
				ps.setString(1,entity.getCarmodelname());
				ps.setInt(2, entity.getCarvariants());
				ps.setString(3,entity.getPrice());
				ps.setString(4,entity.getTopspeed());
				ps.setString(5,entity.getFuelType());
				result=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
		public carsentity Search(int en) {
			carsentity entity =null;
			System.out.println("Implementation Class Read Method Triggered");
			String ec= String.valueOf(en);
			
			
			try {
				String query ="select * from MercedesBenz where carvariants= ?";
				ps = connect.prepareStatement(query);
				ps.setString(1, ec);
				rs = ps.executeQuery();

				while(rs.next()) {
					entity = new carsentity();
					entity.setCarmodelname(rs.getString(1));
					entity.setCarvariants(rs.getInt(2));
					entity.setPrice(rs.getString(3));
					entity.setTopspeed(rs.getString(4));
					entity.setFuelType(rs.getString(5));
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return entity;

		}
		public List<carsentity>Fetch(){
			List<carsentity> listcars=new ArrayList<carsentity>();
			
			System.out.println("Fetch servlet is triggered");
			String query="select * from MercedesBenz";
			carsentity en=null;
			try {
				ps=connect.prepareStatement(query);
				rs=ps.executeQuery();
				 while(rs.next()) {
					  en=new carsentity();
					  en.setCarmodelname(rs.getString(1));
					  en.setCarvariants(rs.getInt(2));
					  en.setPrice(rs.getString(3));
					  en.setTopspeed(rs.getString(4));
					  en.setFuelType(rs.getString(5));
					  listcars.add(en);
				 }
				
				
			}catch(SQLException e) {
				System.out.println("");
				
			}
			return listcars;
			
			
		}
}