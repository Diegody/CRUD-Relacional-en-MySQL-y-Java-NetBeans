/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.dao;

import co.edu.usbbog.dbd.colegio.model.EstudianteDTO;
import java.util.List;

/**
 *
 * @author diego
 */
public interface EstudianteDAO {
    public boolean create(EstudianteDTO estudiante);
    public boolean update(EstudianteDTO estudiante);
    public boolean delete(Integer id_est);
    public EstudianteDTO read(Integer id_est);
    public List<EstudianteDTO> readAll(); 
}
