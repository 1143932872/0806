package com.offcn.utils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Userservlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		User u = new User();
		u.setUsername(username);
		u.setPassword(pass);
		Userservice us = new Userservice();
		try {
			User user = us.login(u);
			if (user==null) {
				/*response.getWriter().println("buchenggong");*/
				request.setAttribute("duzhe", "用户名或者密码错误");
				request.getRequestDispatcher("/login111.jsp").forward(request, response);
			}else {
				response.getWriter().println("chenggong");
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	                 doGet(request, response);
		}
}
