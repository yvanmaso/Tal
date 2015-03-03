package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.jersey.EntreeService;


@WebServlet(name="editentree",urlPatterns={"/EditEntree"})
public class EditEntree extends HttpServlet{
	private EntreeService service;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=new PrintWriter(resp.getWriter());
		

		
	
		service=new EntreeService();
		long id=Long.parseLong(req.getParameter("id"));
		String nom=req.getParameter("nom");
		String prenom=req.getParameter("prenom");
		String pays=req.getParameter("pays");
		String ville=req.getParameter("ville");
		String rue=req.getParameter("rue");
		
		String zip=req.getParameter("zip");
	

	  service.updateCarnent(id, nom, prenom, ville, rue, zip, pays);
	 
	 
	  getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		
	  
	}
}
