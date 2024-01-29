/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author User
 */
public class koneksi {
    private static Connection conn;
    private static Statement stm;
    private static ResultSet rs;
    public static Connection ambilKoneksi(){
        try{
        conn=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Baybayu1234");
        }catch(SQLException e){
        }
        return conn;
    }
}
