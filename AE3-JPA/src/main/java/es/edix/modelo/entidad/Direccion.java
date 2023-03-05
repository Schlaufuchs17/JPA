package es.edix.modelo.entidad;

import javax.persistence.Embeddable;


@Embeddable
public class Direccion {

    private String pais;
    private String ciudad;
    private String calle;
    private String cp;

    //DIRECCION
    public Direccion() {
        super();
    }

    
    public Direccion(String pais, String ciudad, String calle, String cp) {
        super();
        this.pais = pais;
        this.ciudad = ciudad;
        this.calle = calle;
        this.cp = cp;
    }

    //PAIS
    public String getPais() {
        return pais;
    }

    
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    //CIUDAD
    public String getCiudad() {
        return ciudad;
    }

   
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
    //CALLE
    public String getCalle() {
        return calle;
    }

    
    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    //CODIGO POSTAL
    public String getCp() {
        return cp;
    }

    
    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Direccion{" + "pais=" + pais + ", ciudad=" + ciudad + ", calle=" + calle + ", cp=" + cp + '}';
    }

}