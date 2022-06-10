/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.logic;

import co.edu.usbbog.dbd.colegio.controller.dao.EstudianteDAO;
import co.edu.usbbog.dbd.colegio.controller.dao.EstudianteDAOImp;
import co.edu.usbbog.dbd.colegio.model.EstudianteDTO;
import java.util.List;

/**
 *
 * @author diego
 */
public class EstudianteBO {
    
    private EstudianteDAO edao;
    
    public EstudianteBO() {
        this.edao = new EstudianteDAOImp();
    }
    
    public List<EstudianteDTO> mostrarE() {
        return edao.readAll();
    }
    
    public String crearEstudiante(Integer id_est, String nombre, String apellido, Integer edad, String grado) {
        EstudianteDTO estudiante = new EstudianteDTO(id_est, nombre, apellido, edad, grado);
        if (edao.create(estudiante)) {
            return "Se creó el Estudiante";
        } else {
            return "No se creó el Estudiante";
        }
    }
    
    public String buscarEstudiante(Integer id_est) {
        EstudianteDTO estudiante  = edao.read(id_est);
        return "Datos del Estudiante: " + estudiante.toString();
    }
    
    public String actualizarEstudiante(Integer id_est, String nombre, String apellido, Integer edad, String grado) {
        EstudianteDTO estudiante = new EstudianteDTO(id_est, nombre, apellido, edad, grado);
        if (edao.update(estudiante)) {
            return "Se actualizó el Estudiante";
        } else {
            return "No se actualizó el Estudiante";
        }
    }
    
    public String eliminarEstudiante(Integer id_est) {
        boolean del  = edao.delete(id_est);
        if ((edao.delete(id_est))) {
            return id_est.toString();
        } else {
            return null;
        }
    }
    
}
