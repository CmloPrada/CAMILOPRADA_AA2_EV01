package com.evidencia.evidenciajava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EvidenciaJava {

    protected static Connection initializeDatabase() throws SQLException, ClassNotFoundException{
    //variables de entorno
    String dbDriver = "com.mysql.cj.jdbc.Driver" ;
    String dbURL = "jdbc:mysql://localhost:3306/";
    String dbName = "PruebaJava";
    String dbUsername = "root";
    String dbPassword = "";
    //ejecucion del driver
    Class.forName(dbDriver);
    
    return DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword);
    }
    
    
    
  //clase principal para ejecutar
    public static void main(String[] args) {
        
        
        /*Insertar un registro
         try {
             
            Connection con = initializeDatabase();
            PreparedStatement st = con.prepareStatement("INSERT INTO personas(nombre,apellido) VALUES (?,?)");
            
            st.setString(1,"Camilo");
            st.setString(2,"Prada");
            
            st.executeUpdate();
            
            System.out.println("Se agrego el registro");
            

        } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error al insertar datos:"+ e.getMessage());
        }*/
        
        
        
        /*Consultar Registros
        try {
             
            Connection con = initializeDatabase();
            PreparedStatement st = con.prepareStatement("SELECT * FROM personas");
            
            ResultSet rs = st.executeQuery();
                    
            while(rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                System.out.println("Id: "+id+" Nombre: "+nombre+" Apellido: "+apellido);
            }

        } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("Error al Mostrar los datos:"+ e.getMessage());
        }*/
        
        
        
        
        
        /*Eliminar registros
        int idToDelete = 1;
       
        try {
             
            Connection con = initializeDatabase();
            PreparedStatement st = con.prepareStatement("DELETE FROM personas WHERE id = ?");
            
            st.setInt(1,idToDelete);
                    
            int rowsAffected= st.executeUpdate();
                   
            if(rowsAffected > 0){
             System.out.println("Registro eliminado");
            }else{
                System.out.println("No se encontro el registro");
            } 
        }catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("No se encuentra el id en la base de datos:"+ e.getMessage());
        }*/
       
        //Actualizar registro
        try {
             
            Connection con = initializeDatabase();
            PreparedStatement st = con.prepareStatement("UPDATE personas SET nombre = ? WHERE id = ?");
            
          st.setString(1, "Pedro"); 
          st.setString(2, "3"); 
          st.executeUpdate();
          
            System.out.println("Se actualizo el registro");
        }catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println("No se pudo actualizar el registro:"+ e.getMessage());
        }
    }
}

