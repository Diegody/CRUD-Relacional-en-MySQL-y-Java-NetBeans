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
public class DocenteDTO {
    private Integer id_doc;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String curso;
    private Integer estudiante_id_est;
    
    public DocenteDTO() {
        this.id_doc = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.curso = "";
        this.estudiante_id_est = 0;
    }
    
    public DocenteDTO(Integer id_doc) {
        this.id_doc = id_doc;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.curso = "";
        this.estudiante_id_est = 0;
    }
    
    public DocenteDTO(Integer id_doc, Integer estudiante_id_est, String nombre, String apellido, String curso) {
        this.id_doc = id_doc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 0;
        this.curso = curso;
        this.estudiante_id_est = estudiante_id_est;
    }
    
    public DocenteDTO(Integer id_doc, Integer estudiante_id_est, String nombre, String apellido, Integer edad, String curso) {
        this.id_doc = id_doc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
        this.estudiante_id_est = estudiante_id_est;
    }

    public Integer getId_doc() {
        return id_doc;
    }

    public void setId_doc(Integer id_doc) {
        this.id_doc = id_doc;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getEstudiante_id_est() {
        return estudiante_id_est;
    }

    public void setEstudiante_id_est(Integer estudiante_id_est) {
        this.estudiante_id_est = estudiante_id_est;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id_doc);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.apellido);
        hash = 97 * hash + Objects.hashCode(this.edad);
        hash = 97 * hash + Objects.hashCode(this.curso);
        hash = 97 * hash + Objects.hashCode(this.estudiante_id_est);
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
        final DocenteDTO other = (DocenteDTO) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.id_doc, other.id_doc)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.estudiante_id_est, other.estudiante_id_est)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Docente: | " + "ID: " + id_doc + " | Nombre: " + nombre + " | Apellido: " + apellido + " | Edad: " + edad + " | Curso: " + curso + " | ID del estudiante: " + estudiante_id_est + " |";
    }
     
}
