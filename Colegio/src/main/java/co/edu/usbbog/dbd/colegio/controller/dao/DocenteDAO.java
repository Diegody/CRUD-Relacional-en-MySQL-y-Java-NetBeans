/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.dao;

import co.edu.usbbog.dbd.colegio.model.DocenteDTO;
import java.util.List;

/**
 *
 * @author diego
 */
public interface DocenteDAO {
    public boolean create(DocenteDTO docente);
    public boolean update(DocenteDTO docente);
    public boolean delete(Integer id_doc);
    public DocenteDTO read(Integer id_doc);
    public List<DocenteDTO> readAll();    
}
