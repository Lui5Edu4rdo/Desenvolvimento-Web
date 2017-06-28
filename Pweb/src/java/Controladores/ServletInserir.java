/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ConexaoDAO.ProdutoDAO;
import Model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import util.DAOFactory;

/**
 *
 * @author Luiz Eduardo
 */
@WebServlet(urlPatterns = {"/ServletInserir"})
public class ServletInserir extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List lista = null;
        
        Produto p1 = new Produto();
        String Id = request.getParameter("id");
        int id1 = Integer.parseInt(Id);
        String Nome = request.getParameter("nome");
        String Preco = request.getParameter("preco");
        int p2 = (int) Double.parseDouble(Preco);     
        String Quantidade = request.getParameter("qtd");
        int q1 = Integer.parseInt(Quantidade);
        String Unidm = request.getParameter("unidademed");
        
        p1.setID(id1);
        p1.setNOME(Nome);
        p1.setPRECO(p2);
        p1.setQUANTIDADE(q1);
        p1.setUNIDADE(Unidm);
        
        ProdutoDAO us = DAOFactory.createProdutoDAO();
        us.InserirProduto(p1);
        
        response.sendRedirect("Listar.jsp");      
        
    }
        
    
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
