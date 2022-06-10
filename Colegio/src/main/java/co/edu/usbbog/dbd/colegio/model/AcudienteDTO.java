/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.model;

import java.util.Objects;

/**
 *
 * @author diego
 */
public class AcudienteDTO {
    private Integer id_acu;
    private String nombre;
    private String apellido;
    private String tipo;
    private Integer telefono;
    private Integer estudiante_id_est;
    
    public AcudienteDTO() {
        this.id_acu = 0;
        this.nombre = "";
        this.apellido = "";
        this.tipo = "";
        this.telefono = 0;
        this.estudiante_id_est = 0;
    }
        
    public AcudienteDTO(Integer id_acu) {
        this.id_acu = id_acu;
        this.nombre = "";
        this.apellido = "";
        this.tipo = "";
        this.telefono = 0;
        this.estudiante_id_est = 0;
    }
    
    public AcudienteDTO(Integer id_acu, String nombre, String apellido, String tipo, Integer telefono, Integer estudiante_id_est) {
        this.id_acu = id_acu;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.telefono = telefono;
        this.estudiante_id_est = estudiante_id_est;
    }

    public Integer getId_acu() {
        return id_acu;
    }

    public void setId_acu(Integer id_acu) {
        this.id_acu = id_acu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getEstudiante_id_est() {
        return estudiante_id_est;
    }

    public void setEstudiante_id_est(Integer estudiante_id_est) {
        this.estudiante_id_est = estudiante_id_est;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id_acu);
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + Objects.hashCode(this.apellido);
        hash = 47 * hash + Objects.hashCode(this.tipo);
        hash = 47 * hash + Objects.hashCode(this.telefono);
        hash = 47 * hash + Objects.hashCode(this.estudiante_id_est);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AcudienteDTO other = (AcudienteDTO) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.id_acu, other.id_acu)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.estudiante_id_est, other.estudiante_id_est)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Acudiente: | " + "ID: " + id_acu + " | Nombre: " + nombre + " | Apellido: " + apellido + " | Tipo: " + tipo + " | Teléfono: " + telefono + " | ID del estudiante" + estudiante_id_est + " |";
    }
    
    
}
