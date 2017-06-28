/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoDAO;

import Model.Produto;
import util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luiz Eduardo
 */
public class JDBCproduto implements ProdutoDAO{
    
    public static boolean sessao ;
    
    Connection connection;
    public JDBCproduto(){
     connection = (Connection) ConnectionFactory.getConnection();
    }
    
    public JDBCproduto(Connection connection) {
        this.connection = connection;
    }
    

    @Override
    public void InserirProduto(Produto produto) {
        try 
        {
            String SQL = "INSERT INTO PRODUTO(ID, NOME, PRECO, UNIDADE , QUANTIDADE) VALUES (?,?,?,?,?)";
            PreparedStatement us = (PreparedStatement) connection.prepareStatement(SQL);
            
            us.setInt(1, produto.getID());
            us.setString(2, produto.getNOME());
            us.setDouble(3, produto.getPRECO());
            us.setString(4, produto.getUNIDADE());
            us.setInt(5, produto.getQUANTIDADE());
            
            us.executeUpdate();
            
            us.close();
            connection.close();
        
        } 
        catch (SQLException ex) {
            Logger.getLogger(JDBCproduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void RemoverProduto(Produto produto) {
        
        try 
        {
            String SQL = "DELETE FROM PRODUTO where ID=?";
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(SQL);
            pstmt.setInt(1, produto.getID());
            int deleteCount = pstmt.executeUpdate();
        } 
            catch (SQLException ex) {
            Logger.getLogger(JDBCproduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public ArrayList<Produto> listar() {
        List<Produto> produtos = new ArrayList<Produto>();
        try {
            String SQL = "SELECT * FROM Produto";
            PreparedStatement us = (PreparedStatement) connection.prepareStatement(SQL);
            ResultSet rs = us.executeQuery();
            while (rs.next()){
                
                Produto produto = new Produto();
                produto.setID(rs.getInt("ID"));
                produto.setNOME(rs.getString("NOME"));
                produto.setPRECO(rs.getDouble("PRECO"));
                produto.setQUANTIDADE(rs.getInt("QUANTIDADE"));
                produto.setUNIDADE(rs.getString("UNIDADE"));
                
                produtos.add(produto);
            }
            return (ArrayList<Produto>) produtos;
        } catch (SQLException e) {
            Logger.getLogger(JDBCproduto.class.getName()).log(Level.SEVERE, null, e);
            throw new RuntimeException("Falha ao Listar Usuários!");
        }      
    } 
}
