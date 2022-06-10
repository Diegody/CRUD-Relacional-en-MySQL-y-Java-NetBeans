/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.logic;

import co.edu.usbbog.dbd.colegio.controller.dao.AcudienteDAO;
import co.edu.usbbog.dbd.colegio.controller.dao.AcudienteDAOImp;
import co.edu.usbbog.dbd.colegio.model.AcudienteDTO;
import java.util.List;

/**
 *
 * @author diego
 */
public class AcudienteBO {
    
    private AcudienteDAO adao;
    
    public AcudienteBO() {
        this.adao = new AcudienteDAOImp();
    }
    
    public List<AcudienteDTO> mostrarA() {
        return adao.readAll();
    }
    
    public String crearAcudiente(Integer id_acu, String nombre, String apellido, String tipo, Integer telefono, Integer estudiante_id_est) {
        AcudienteDTO acudiente = new AcudienteDTO(id_acu, nombre, apellido, tipo, telefono, estudiante_id_est);
        if (adao.create(acudiente)) {
            return "Se creó el Acudiente";
        } else {
            return "No se creó el Acudiente";
        }
    }
    
    public String buscarAcudiente(Integer id_acu) {
        AcudienteDTO acudiente  = adao.read(id_acu);
        return "Datos del Acudiente: " + acudiente.toString();
    }
    
    public String actualizarAcudiente(Integer id_acu, String nombre, String apellido, String tipo, Integer telefono, Integer estudiante_id_est) {
        AcudienteDTO acudiente = new AcudienteDTO(id_acu, nombre, apellido, tipo, telefono, estudiante_id_est);
        if (adao.update(acudiente)) {
            return "Se actualizó el Acudiente";
        } else {
            return "No se actualizó el Acudiente";
        }  
    }
    
    public String eliminarAcudiente(Integer id_acu) {
        boolean del  = adao.delete(id_acu);
        if ((adao.delete(id_acu))) {
            return id_acu.toString();
        } else {
            return null;
        }
    }
    
}
