/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.controller.dao;

import co.edu.usbbog.dbd.colegio.model.AcudienteDTO;
import java.util.List;

/**
 *
 * @author diego
 */
public interface AcudienteDAO {
    public boolean create(AcudienteDTO acudiente);
    public boolean update(AcudienteDTO acudiente);
    public boolean delete(Integer id_acu);
    public AcudienteDTO read(Integer id_acu);
    public List<AcudienteDTO> readAll();
}
