package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.jersey.EntreeService;

@WebServlet(name="deleteentree",urlPatterns={"/DeleteEntree"})
public class DeleteEntree extends HttpServlet {
	private EntreeService service;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		service=new EntreeService();
		long id=Long.parseLong(req.getParameter("id"));
		service.deleteCarnet(id);
		 getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
	}
}
