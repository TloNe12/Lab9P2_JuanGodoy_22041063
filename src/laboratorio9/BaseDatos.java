/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio9;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class BaseDatos {

    Usuario u;
    ArrayList<Usuario> us = new ArrayList();
    Dba db = new Dba("./Usuarios.mdb");

    public void crearU(String usuario, String nombre, String contrasena, int edad, String tipo) {
        db.conectar();
        try {
            //Chequea que el usuario sea unico
            for (int i = 0; i < 10; i++) {
                usuario = JOptionPane.showInputDialog("Usuario");
            }
            nombre = JOptionPane.showInputDialog("Nombre");
            //Chequea que el tipo sea el correcto
            if (tipo.equals(u.getTipo())) {
                tipo = JOptionPane.showInputDialog("Tipo");
            }
            edad = Integer.parseInt(JOptionPane.showInputDialog(""));

            db.query.execute("INSERT INTO usuario"
                    + " (usuario,nombre,contrasena,edad,tipo)"
                    + " VALUES ('" + usuario + "', '" + nombre + "', '" +contrasena+" ', '" +edad+"', '"
            + tipo +"')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();

    }

    public void modifficarU() {

    }

    public void eliminarU() {

    }

}
