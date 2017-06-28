/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luiz Eduardo
 */
public class ConnectionFactory {
    public static Connection getConnection(){
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                return (Connection)DriverManager.getConnection("jdbc:derby://localhost:1527/pweb", "pweb", "prova");
            } catch (SQLException e) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
            } catch (ClassNotFoundException e){
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
                throw new RuntimeException("Erro ClassNotFoundException em ConnectionFactory", e);
            }
        return null;
    }   
}
