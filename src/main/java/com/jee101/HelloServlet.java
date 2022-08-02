package com.jee101;

import java.io.*;
import javax.servlet.ServletException;
import javax .servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name="HelloServlet",urlPatterns={"/HelloServlet", "*.ie"})
public class HelloServlet extends HttpServlet {
    private Controller contrioller;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        String message = "Hello and welcome with our first Servlet";
        int result = a + b;
        request.setAttribute("number1", a);
        request.setAttribute("number2", b);
        request.setAttribute("sum", result);
        request.setAttribute("message", message);

        request.getRequestDispatcher("Result.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Dans le MVC il'y a une seule controleur qui peut gere pleusieurs vues.
        // How we can do it using concept path:
        String path = request.getServletPath();
        //if (path.equals("/produit.ie")){
            /*
            * Traitements
            */
        //    request.getRequestDispatcher("produit.jsp").forward(request, response);
        //}else if(path.equals("/client.ie")){
            /*
             * Traitements
             */
           // request.getRequestDispatcher("client.jsp").forward(request, response);
        //}else if (path.equals("/manager.ie")){
            /*
             * Traitements
             */
        //    request.getRequestDispatcher("manager.jsp").forward(request, response);
        //} else{
            /*
             * Traitements
             */
        //    response.sendError(HttpServletResponse.SC_NOT_FOUND);// Erreur 404
        //}
        /*
        *Le probleme est si il'y a bouceaup des IF ELSE et aussi il'y a des traitements
        * au niveau de chaque condition.
        */
        /*String viewName = path.substring(0,path.indexOf(".ie"));
        String pageName = viewName+".jsp";
        System.out.println(viewName);
        System.out.println(pageName);
        request.getRequestDispatcher(pageName).forward(request, response);
        /*
        *Cette operation fait correctement mais il reste le probleme des traitements.
        * Solution : Creation de la classe abstract pour controller les classes de chaque page jsp
         */
        String path1 = request.getServletPath();
        String controllerClassName = path1.substring(1, path1.indexOf(".ie"));
        try {
            contrioller = (Controller) Class.forName("controllers." + controllerClassName + "Controller").newInstance();
            contrioller.execute(request, response);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}