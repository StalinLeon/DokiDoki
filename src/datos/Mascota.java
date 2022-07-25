/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author USUARIO
 */
public class Mascota {
    private String iDMascota;
    private String tipoAnimal;
    private String raza;
    private String nombre;
    private String color;
    private String fechaNacimiento;

    public Mascota() {
    }

    public Mascota(String iDMascota, String tipoAnimal, String raza, String nombre, String color, String fechaNacimiento) {
        this.iDMascota = iDMascota;
        this.tipoAnimal = tipoAnimal;
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getIdMascota() {
        return iDMascota;
    }

    public void setIdMascota(String codigoMascota) {
        this.iDMascota = codigoMascota;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
}
