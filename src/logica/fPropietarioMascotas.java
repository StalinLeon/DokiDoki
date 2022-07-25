/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.PropietarioMascota;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class fPropietarioMascotas {

    public Integer totalRegistro;
    public DefaultTableModel modelo;

    public DefaultTableModel mostrar(JTable table) {

//        String[] titualos = {"id", "Nombre", "Cedula", "Telefono", "Direccion"};
        String[] registro = new String[5];
        totalRegistro = 0;

//        modelo = new DefaultTableModel(null, titualos);
        modelo = (DefaultTableModel) table.getModel();

        try {
            File file = new File("ListaPropietarioMascota.txt");
            FileReader reader = new FileReader(file);
            BufferedReader obj = new BufferedReader(reader);
            String strng;
            while ((strng = obj.readLine()) != null) {
                System.out.println(strng);
                String[] split = strng.split(";", -1);
                for (int i = 0; i < split.length; i++) {
                    if (i == 0) {
                        registro[0] = split[i];
                    }
                    if (i == 1) {
                        registro[1] = split[i];
                    }
                    if (i == 2) {
                        registro[2] = split[i];
                    }
                    if (i == 3) {
                        registro[3] = split[i];
                    }
                    if (i == 4) {
                        registro[4] = split[i];
                    }
                }
                totalRegistro = totalRegistro + 1;
                modelo.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return modelo;
    }

    public void insertar(JTable table, PropietarioMascota pm) {
        modelo = (DefaultTableModel) table.getModel();
        Object[] registro = new Object[5];
//        totalRegistro = 0;
        registro[0] = pm.getIdPropietarioMasca();
        registro[1] = pm.getNombre();
        registro[2] = pm.getNumCedula();
        registro[3] = pm.getNumTelfono();
        registro[4] = pm.getDireccion();
        modelo.addColumn(registro);

//        try {
//            File file = new File("ListaPropietarioMascota.txt");
//            if (file.exists() == false) {
//                file.createNewFile();
//            }
//            FileReader reader = new FileReader(file);
//            BufferedReader obj = new BufferedReader(reader);
//            String strng;
//            while ((strng = obj.readLine()) != null) {
//                totalRegistro = totalRegistro + 1;
//            }
//            FileOutputStream fos = new FileOutputStream(file, true);
//            OutputStreamWriter osw = new OutputStreamWriter(fos);
//            BufferedWriter bw = new BufferedWriter(osw);
//            bw.write(String.valueOf(totalRegistro+1) + ";" + pm.getNombre() + ";" + pm.getNumCedula() + ";" + pm.getNumTelfono() + ";" + pm.getDireccion());
//            bw.write("\n");
//            bw.close();
//            System.out.println("La persona fue ingresada");
//
//        } catch (Exception e) {
//            JOptionPane.showConfirmDialog(null, e);
//            return false;
//        }
//        return true;
    }

    public boolean eliminar(PropietarioMascota pm) {
        System.out.println("Funcion Eliminar en contruccion");
        return true;
    }

    public boolean editar(PropietarioMascota pm) {
        System.out.println("Funcion Editar en contruccion");
        return true;
    }

    public boolean guardartablaPropitario(PropietarioMascota pm) {
        totalRegistro = 0;

        try {
            File file = new File("ListaPropietarioMascota.txt");
            if (file.exists() == false) {
                file.createNewFile();
            }
            FileReader reader = new FileReader(file);
            BufferedReader obj = new BufferedReader(reader);
            String strng;
            while ((strng = obj.readLine()) != null) {
                totalRegistro = totalRegistro + 1;
            }

            FileOutputStream fos = new FileOutputStream(file, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(String.valueOf(totalRegistro + 1) + ";" + pm.getNombre() + ";" + pm.getNumCedula() + ";" + pm.getNumTelfono() + ";" + pm.getDireccion());
            bw.write("\n");
            bw.close();
            System.out.println("La persona fue ingresada");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }

}
