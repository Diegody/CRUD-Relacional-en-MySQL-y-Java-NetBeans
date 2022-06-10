/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.dao;

import co.edu.usbbog.dbd.colegio.controller.config.Connect;
import co.edu.usbbog.dbd.colegio.model.DocenteDTO;
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
public class DocenteDAOImp implements DocenteDAO {

    private final Connect conexion;

    public DocenteDAOImp() {
        this.conexion = new Connect();
    }

    @Override
    public boolean create(DocenteDTO docente) {
        boolean seHizo = false;
        try {
            String query = "INSERT INTO docente (id_doc, nombre, apellido, edad, curso, estudiante_id_est) VALUES ("
                    + docente.getId_doc() + ", "
                    + "'" + docente.getNombre() + "', "
                    + "'" + docente.getApellido() + "', "
                    + docente.getEdad() + ", "
                    + "'" + docente.getCurso() + "', "
                    + docente.getEstudiante_id_est() + ");";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se insertó el Docente");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se insertó el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se insertó el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public boolean update(DocenteDTO docente) {
        boolean seHizo = false;
        try {
            String query = "UPDATE docente SET "
                    + "id_acu = " + docente.getId_doc() + ", "
                    + "nombre = " + "'" + docente.getNombre() + "', "
                    + "apellido = " + "'" + docente.getApellido() + "', "
                    + "edad = " + docente.getEdad() + ", "
                    + "curso = " + "'" + docente.getCurso() + "', "
                    + "estudiante_id_est = " + docente.getEstudiante_id_est() + " "
                    + "WHERE id_doc = " + docente.getId_doc() + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se actualizó el Docente");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se actualizó el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se actualizó el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public boolean delete(Integer id_doc) {
        boolean seHizo = false;
        try {
            String query = "DELETE FROM docente WHERE id_doc = "
                    + id_doc + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Se eliminó el Docente");
            seHizo = true;
        } catch (SQLTimeoutException e) {
            seHizo = false;
            System.out.println("No se eliminó el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            seHizo = false;
            System.out.println("No se eliminó el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return seHizo;
    }

    @Override
    public DocenteDTO read(Integer id_doc) {
        DocenteDTO docente = null;
        try {

            String query = "SELECT * FROM docente WHERE id_doc = "
                    + id_doc + ";";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            docente = new DocenteDTO(
                    rs.getInt("id_doc"),
                    rs.getInt("estudiante_id_est"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("edad"),
                    rs.getString("curso")
            );
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Docente encontrado");
        } catch (SQLTimeoutException e) {
            docente = null;
            System.out.println("No se encontró el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            docente = null;
            System.out.println("No se encontró el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return docente;
    }

    @Override
    public List<DocenteDTO> readAll() {
        List<DocenteDTO> docentes = new ArrayList();
        DocenteDTO docente = null;
        try {

            String query = "SELECT * FROM docente;";
            System.out.println(query);
            this.conexion.conectar();
            Statement stmt = this.conexion.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            docente = new DocenteDTO(
                    rs.getInt("id_doc"),
                    rs.getInt("estudiante_id_est"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("edad"),
                    rs.getString("curso")
            );
            docentes.add(docente);
            rs.close();
            stmt.close();
            this.conexion.desconectar();
            System.out.println("Docente encontrado");
        } catch (SQLTimeoutException e) {
            docentes = null;
            System.out.println("No se encontró el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        } catch (SQLException e) {
            docentes = null;
            System.out.println("No se encontró el Docente");
            System.out.println("Causa: " + e.getMessage());
            System.out.println("Causa: " + e.getSQLState());
        }
        return docentes;
    }

}
