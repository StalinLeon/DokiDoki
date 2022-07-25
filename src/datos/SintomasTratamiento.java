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
public class SintomasTratamiento {
    private String iDSintomaTratamiento;  
    private String Fecha;
    private String Peso;
    private String Sintomas;
    private String Tratamiento;
    private String Receta;

    public SintomasTratamiento() {
    }

    public SintomasTratamiento(String codigoSintomaTratamiento, String Fecha, String Peso, String Sintomas, String Tratamiento, String Receta) {
        this.iDSintomaTratamiento = codigoSintomaTratamiento;
        this.Fecha = Fecha;
        this.Peso = Peso;
        this.Sintomas = Sintomas;
        this.Tratamiento = Tratamiento;
        this.Receta = Receta;
    }

    public String getCodigoSintomaTratamiento() {
        return iDSintomaTratamiento;
    }

    public void setCodigoSintomaTratamiento(String codigoSintomaTratamiento) {
        this.iDSintomaTratamiento = codigoSintomaTratamiento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String Peso) {
        this.Peso = Peso;
    }

    public String getSintomas() {
        return Sintomas;
    }

    public void setSintomas(String Sintomas) {
        this.Sintomas = Sintomas;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }

    public String getReceta() {
        return Receta;
    }

    public void setReceta(String Receta) {
        this.Receta = Receta;
    }
     
    
}
