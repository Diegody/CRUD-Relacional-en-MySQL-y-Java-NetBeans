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
public class EstudianteDTO {
    private Integer id_est;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String grado;
    
    public EstudianteDTO() {
        this.id_est = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.grado = "";
    }
    
    public EstudianteDTO(Integer id_est) {
        this.id_est = id_est;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.grado = "";
    }
    
    public EstudianteDTO(Integer id_est, String nombre, String apellido, String grado) {
        this.id_est = id_est;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 0;
        this.grado = grado;
    }
    
    public EstudianteDTO(Integer id_est, String nombre, String apellido, Integer edad, String grado) {
        this.id_est = id_est;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.grado = grado;
    }

    public Integer getId_est() {
        return id_est;
    }

    public void setId_est(Integer id_est) {
        this.id_est = id_est;
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id_est);
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.apellido);
        hash = 23 * hash + Objects.hashCode(this.edad);
        hash = 23 * hash + Objects.hashCode(this.grado);
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
        final EstudianteDTO other = (EstudianteDTO) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.grado, other.grado)) {
            return false;
        }
        if (!Objects.equals(this.id_est, other.id_est)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante: | " + "ID: " + id_est + " | Nombre: " + nombre + " | Apellido: " + apellido + " | Edad: " + edad + " | Grado: " + grado + " |";
    } 
    
    
}
