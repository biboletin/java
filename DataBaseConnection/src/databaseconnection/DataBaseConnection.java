/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnection;
import java.sql.*;
/**
 *
 * @author Bilyan Ivanov <biboletin87@gmail.com>
 */
public class DataBaseConnection {

    public static void main(String[] args) {
        // TODO code application logic here

        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
            System.out.println("Connected to DataBase...");
        }catch(SQLException e){
            System.out.println("Can't connect right now...");
        }
    }
    
}