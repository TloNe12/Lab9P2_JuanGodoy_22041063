/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio9;

/**
 *
 * @author jcgol
 */
public class Usuario {
    private String usuario;
    private String nombre;
    private String contra;
    private int edad;
    private String tipo;

    public Usuario(String usuario, String nombre, String contra, int edad, String tipo) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contra = contra;
        this.edad = edad;
        setTipo(tipo);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if(tipo.equals("Personal") || tipo.equals("Cliente")){
            this.tipo=tipo;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", nombre=" + nombre + ", contra=" + contra + ", edad=" + edad + ", tipo=" + tipo + '}';
    }
    
    
    
}
