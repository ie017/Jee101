package controllers;

import com.jee101.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProduitController extends Controller {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("product");
        request.getRequestDispatcher("produit.jsp").forward(request, response);
    }
}
