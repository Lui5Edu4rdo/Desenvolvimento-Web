/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import ConexaoDAO.JDBCproduto;
import ConexaoDAO.ProdutoDAO;

public class DAOFactory {
  
   public static ProdutoDAO createProdutoDAO(){
    return new JDBCproduto();

}

}
