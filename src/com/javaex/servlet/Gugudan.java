package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
     
	//field
	
	//constructor
    public Gugudan() {
    }

    //method g.s
    
    //method general
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//언어 안 깨지게
		
		//parameter 꺼내기
		//파라미터 주소창에 요청 안하면 에러
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		PrintWriter out = response.getWriter();
		
		for(int i=1; i<=9; i++) {
		out.println("<table border='1'>");
		out.println("	<tr>");
		out.println("		<td>"+dan+"</td>");
		out.println("		<td>"+i+"</td>");
		out.println("		<td>"+dan*i+"</td>");
		out.println("	</tr>");
	}
		out.println("	</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
