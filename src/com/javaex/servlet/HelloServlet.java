package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")//주소 요청
public class HelloServlet extends HttpServlet {
	
	//field
	private static final long serialVersionUID = 1L;//static field
       
	//constructor
    public HelloServlet() {
    }//기본 생성자 생략 가능

    //method -gs(x)
    
    //method - general
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//언어 안 깨지게
		
		//코드 작성
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<meta charset='UTF-8'>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h1> servlet: hello world </h1>");
		out.println("	</body>");
		out.println("<html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
