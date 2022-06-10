/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.dao;

import co.edu.usbbog.dbd.colegio.controller.config.Connect;
import co.edu.usbbog.dbd.colegio.model.EstudianteDTO;
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
public class EstudianteDAOImp implements EstudianteDAO {

    private final Connect conexion;

    public EstudianteDAOImp() {
        this.conexion = new Connect();
    }

    @Override
    public boolean create(EstudianteDTO estudiante) {
        boolean seHizo = false;
        try {
            String query = "INSERT INTO estudiante (id_est, nombre, apellido, edad, grado) VALUES ("
                    + estudiante.getId_est() + ", "
                    + "'" + estudiante.getNombre() + "', "
                    + "'" + estudiante.getApellido() + "', "
                    + estudiante.getEdad() + ", "
                    + "'" + estudiante.getGrado() + "');";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se insertó el Estudiante");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se insertó el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se insertó el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public boolean update(EstudianteDTO estudiante) {
        boolean seHizo = false;
        try {
            String query = "UPDATE estudiante SET "
                    + "id_est = " + estudiante.getId_est() + ", "
                    + "nombre = " + "'" + estudiante.getNombre() + "', "
                    + "apellido = " + "'" + estudiante.getApellido() + "', "
                    + "edad = " + estudiante.getEdad() + ", "
                    + "curso = " + "'" + estudiante.getGrado() + "' "
                    + "WHERE id_est = " + estudiante.getId_est() + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se actualizó el Estudiante");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se actualizó el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se actualizó el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public boolean delete(Integer id_est) {
        boolean seHizo = false;
        try {
            String query = "DELETE FROM estudiante WHERE id_est = "
                    + id_est + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se eliminó el Estudiante");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se eliminó el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se eliminó el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public EstudianteDTO read(Integer id_est) {
        EstudianteDTO estudiante = null;
        try {

            String query = "SELECT * FROM estudiante WHERE id_est = "
                    + id_est + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            estudiante = new EstudianteDTO(
                    rs.getInt("id_est"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("edad"),
                    rs.getString("grado")
            );
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Estudiante encontrado");
        } catch (SQLTimeoutException e) {
            estudiante = null;
            System.out.println("No se encontro el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            estudiante = null;
            System.out.println("No se encontro el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return estudiante;
    }

    @Override
    public List<EstudianteDTO> readAll() {
        List<EstudianteDTO> estudiantes = new ArrayList();
        EstudianteDTO estudiante = null;
        try {

            String query = "SELECT * FROM estudiante;";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            estudiante = new EstudianteDTO(
                    rs.getInt("id_est"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("edad"),
                    rs.getString("grado")
            );
            estudiantes.add(estudiante);
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Estudiante encontrado");
        } catch (SQLTimeoutException e) {
            estudiantes = null;
            System.out.println("No se encontró el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            estudiantes = null;
            System.out.println("No se encontró el Estudiante");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return estudiantes;
    }

}
