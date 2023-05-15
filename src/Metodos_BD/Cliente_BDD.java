/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos_BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Milto
 */
public class Cliente_BDD {
    ConexionSql conec = new ConexionSql();
    
    Connection con;
    PreparedStatement ps;
    
    public boolean RegistrarCliente(Cliente cliente){
        String sql = "INSERT INTO clientes (dni,nombre,telefono,direccion) VALUES (?,?,?,?)";
        try{
            con = conec.conectar();
            ps = con.prepareStatement(sql);
           ps.setString(1, cliente.getDni());
           ps.setString(2,cliente.getNombre());
           ps.setInt(3,cliente.getTelefono());
           ps.setString(4,cliente.getDireccion());
           ps.execute();
           return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try{
                
            
            con.close();
        }catch(SQLException e){
                System.out.println(e.toString());
        }
    }
    }
    
}
