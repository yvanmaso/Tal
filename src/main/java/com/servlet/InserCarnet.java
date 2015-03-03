package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.jersey.EntreeService;


@WebServlet(name="insercarnet",urlPatterns={"/InserCarnet"})
public class InserCarnet  extends HttpServlet{

	private EntreeService service;
	public InserCarnet() 
	
	{
		// TODO Auto-generated constructor stub
	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	
	{
		// TODO Auto-generated method stub
		/*
		resp.setContentType("text/html");
	PrintWriter out=new PrintWriter(resp.getWriter());
     String table="<html>\n"
     		+ ""
     		+ ""
     		+ ""
     		+ ""
     		+ "<Body>\n" +
			"<H1>Liste des Tous les Carnets d'Adresses</H1>\n";
     out.print(table);
	out.print("<table border:"
			+"1px solid black;"
			+ "border-collapse: collapse;"
			+
			"<tr><th>Id</th>"
			+
			"<th>Nom</th>"
			+
			"<th>Pays</th>"
			+
			"<th>Prenom</th>"
			+
			"<th>Rue</th> "
	        +
	        "<th>Ville</th>"
	        +
	        "<th>ZIP</th> <tr>");
	
service=new EntreeService();
	
	List<Carnet>carnets=service.getAllCarnets();
	
	for(Carnet c : carnets)
	{
		out.print(
		
					"<tr><td>"
	                 +
					c.getId()+
					"</td><td>"
					+
					c.getNom()
					+
					"</td><td>"
					+c.getPays()
					+
					"</td><td>"
					+
					c.getPrenom()
					+
					"</td><td>"
					+
					c.getRue()
					+
					"</td><td>"
					+
					c.getVille()
					+
					"</td><td>"
					+
					c.getZip()
					+
					"</td></tr>");
	}
	out.print("</table></Body></html>");
	
	
	
	*/
		
		 getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		
		
		
		
		
		
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException 
	
	{
		// TODO Auto-generated method stub

		service=new EntreeService();
		String nom=req.getParameter("nom");
		String prenom=req.getParameter("prenom");
		String pays=req.getParameter("pays");
		String ville=req.getParameter("ville");
		String rue=req.getParameter("rue");
		
		String zip=req.getParameter("zip");
		
		

		PrintWriter out=new PrintWriter(resp.getWriter());
	service.createCarnet(nom, prenom, ville, rue, zip, pays);
		
		
		 getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		
	}
}
