/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.logic;

import co.edu.usbbog.dbd.colegio.controller.dao.DocenteDAO;
import co.edu.usbbog.dbd.colegio.controller.dao.DocenteDAOImp;
import co.edu.usbbog.dbd.colegio.model.DocenteDTO;
import java.util.List;

/**
 *
 * @author diego
 */
public class DocenteBO {
    
    private DocenteDAO ddao;
    
    public DocenteBO() {
        this.ddao = new DocenteDAOImp();
    }
    
    public List<DocenteDTO> mostrarD() {
        return ddao.readAll();
    }
    
    public String crearDocente(Integer id_doc, Integer estudiante_id_est, String nombre, String apellido, Integer edad, String curso) {
        DocenteDTO docente = new DocenteDTO(id_doc, estudiante_id_est, nombre, apellido, edad, curso);
        if (ddao.create(docente)) {
            return "Se creó el Docente";
        } else {
            return "No se creó el Docente";
        }
    }
    
    public String buscarDocente(Integer id_doc) {
        DocenteDTO docente  = ddao.read(id_doc);
        return "Datos del Docente: " + docente.toString();
    }
    
    public String actualizarDocente(Integer id_doc, Integer estudiante_id_est, String nombre, String apellido, Integer edad, String curso) {
        DocenteDTO docente = new DocenteDTO(id_doc, estudiante_id_est, nombre, apellido, edad, curso);
        if (ddao.update(docente)) {
            return "Se actualizó el Docente";
        } else {
            return "No se actualizó el Docente";
        }
    }
    
    public String eliminarDocente(Integer id_doc) {
        boolean del  = ddao.delete(id_doc);
        if ((ddao.delete(id_doc))) {
            return id_doc.toString();
        } else {
            return null;
        }
    }

}