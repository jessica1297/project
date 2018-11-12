/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp-pc
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

   public class login extends HttpServlet {

   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
   {
              PrintWriter out = res.getWriter();

       String name = req.getParameter("name");
       String password = req.getParameter("password");
       if(name.equals("jessica")&&password.equals("jessica@12"))
       {
           out.println("successfull login");
       }
       //out.println("hello "+name);
       else
       {
           out.println("unsuccessfull login");
           
       }
}
   }
}
