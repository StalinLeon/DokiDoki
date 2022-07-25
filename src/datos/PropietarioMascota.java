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
public class PropietarioMascota {
    private int iDPropietarioMasca;
    private String nombre;
    private String numCedula;
    private String numTelefono;
    private String direccion;

    public PropietarioMascota() {
    }

    public PropietarioMascota(int iDPropietarioMasca, String nombre, String numCedula, String numTelefono, String direccion) {
        this.iDPropietarioMasca = iDPropietarioMasca;
        this.nombre = nombre;
        this.numCedula = numCedula;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
    }

    public int getIdPropietarioMasca() {
        return iDPropietarioMasca;
    }

    public void setIdPropietarioMasca(int codigoPropietarioMasca) {
        this.iDPropietarioMasca = codigoPropietarioMasca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public String getNumTelfono() {
        return numTelefono;
    }

    public void setNumTelfono(String numTelfono) {
        this.numTelefono = numTelfono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    

}
