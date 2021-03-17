package com.google.sps.servlets;

import java.io.IOException;
import java.util.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  List<String> rand_str = new ArrayList<>();
  String new_york = "New York";
  String chipotle = "Chipotle";

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    rand_str.add(new_york);
    rand_str.add(chipotle);
    response.setContentType("text/html;");
    response.getWriter().println("<h1>Hello world!</h1>");
    Random rand = new Random();
    String randomElement = rand_str.get(rand.nextInt(rand_str.size()));
    response.getWriter().println(randomElement);
  }
}
