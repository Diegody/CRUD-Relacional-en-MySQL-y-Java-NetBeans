/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.dao;

import co.edu.usbbog.dbd.colegio.controller.config.Connect;
import co.edu.usbbog.dbd.colegio.model.AcudienteDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class AcudienteDAOImp implements AcudienteDAO {
    
    private final Connect conexion;
    
    public AcudienteDAOImp() {
        this.conexion = new Connect();
    }

    @Override
    public boolean create(AcudienteDTO acudiente) {
        boolean seHizo = false;
        try {
            String query = "INSERT INTO acudiente (id_acu, nombre, apellido, tipo, telefono, estudiante_id_est) VALUES ("
                    + acudiente.getId_acu() + ","
                    + "'" + acudiente.getNombre() + "',"
                    + "'" + acudiente.getApellido() + "',"
                    + "'" + acudiente.getTipo() + "',"
                    + acudiente.getTelefono() + ","
                    + acudiente.getEstudiante_id_est() + ");";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se insertó el Acudiente");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se insertó el Acudiente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        catch (SQLException e) {
            seHizo = false;
            System.out.println("No se insertó el Acudiente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());    
        }
        return seHizo;
    }

    @Override
    public boolean update(AcudienteDTO acudiente) {
        boolean seHizo = false;
        try {
            String query = "UPDATE acudiente SET "
                    + "id_acu = " + acudiente.getId_acu() + ", "
                    + "nombre = " + "'" + acudiente.getNombre()+ "', "
                    + "apellido = " + "'" + acudiente.getApellido()+ "', "
                    + "tipo = " + "'" + acudiente.getTipo()+ "', "
                    + "telefono = " + acudiente.getTelefono()+ ", "
                    + "estudiante_id_est = " + acudiente.getEstudiante_id_est() + " "
                    + "WHERE id_acu = " + acudiente.getId_acu() + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se actualizó el Acudiente");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se actualizó el libro");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se actualizó el libro");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public boolean delete(Integer id_acu) {
        boolean seHizo = false;
        try {
            String query = "DELETE FROM acudiente WHERE id_acu = "
                    + id_acu + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se eliminó el Acudiente");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se eliminó el Acudiente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se eliminó el Acudiente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public AcudienteDTO read(Integer id_acu) {
        AcudienteDTO acudiente = null;
        try {
            
            String query = "SELECT * FROM acudiente WHERE id_acu = "
                    + id_acu + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            acudiente = new AcudienteDTO(
                    rs.getInt("id_acu"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("tipo"),
                    rs.getInt("telefono"),
                    rs.getInt("estudiante_id_est")
            );
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Acudiente encontrado");
        } catch (SQLTimeoutException e) {
            acudiente = null;
            System.out.println("No se encontro el Acudiente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            acudiente = null;
            System.out.println("No se encontro el Acudiente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return acudiente;
    }

    @Override
    public List<AcudienteDTO> readAll() {
        List<AcudienteDTO> acudientes = new ArrayList();
        AcudienteDTO acudiente = null;
        try {
            
            String query = "SELECT * FROM acudiente;"; 
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            acudiente = new AcudienteDTO(
                    rs.getInt("id_acu"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("tipo"),
                    rs.getInt("telefono"),
                    rs.getInt("estudiante_id_est")
            );
            acudientes.add(acudiente);
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Acudiente encontrado");
        } catch (SQLTimeoutException e) {
            acudientes = null;
            System.out.println("No se encontró el Acudiente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            acudientes = null;
            System.out.println("No se encontró el Acudiente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return acudientes;
    }
    
}
