/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generarfoliosbienevale;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author Anthony Tepach
 */
public class GenerarFoliosBienevale {

    

    protected void paraImpresion(HashMap<String, String> data, JRootPane f) {
        int inicio = Integer.parseInt(data.get("fol_ini"));
        int fin = Integer.parseInt(data.get("fol_fin"));
        int contp = 0;
        int num_planilla = 1;
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(data.get("ruta"));
            pw = new PrintWriter(fichero);
            for (int i = inicio; i < fin + 1; i++) {
                String textto = String.valueOf(i);
                int d1 = Integer.parseInt(textto.substring(0, 1)),
                        d2 = Integer.parseInt(textto.substring(1, 2)) * 1,
                        d3 = Integer.parseInt(textto.substring(2, 3)) * 2,
                        d4 = Integer.parseInt(textto.substring(3, 4)) * 3,
                        d5 = Integer.parseInt(textto.substring(4, 5)) * 4,
                        d6 = Integer.parseInt(textto.substring(5, 6)) * 5,
                        d7 = Integer.parseInt(textto.substring(6, 7)) * 6,
                        d8 = Integer.parseInt(textto.substring(7, 8)) * 7,
                        d9 = Integer.parseInt(textto.substring(8)) * 8;
                int suma = d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9;
                int resuido = suma % 11;
                int dv;
                if (String.valueOf(resuido).length() > 1) {
                    dv = Integer.parseInt(String.valueOf(resuido).substring(0, 1));
                } else {
                    dv = resuido;
                }
                contp++;
                String fol = data.get("inicia_en") + data.get("serie") + data.get("vigencia") + i + "" + dv;
                pw.println(fol + "\t" + String.format("%07d", num_planilla));
                if (contp == 12) {
                    num_planilla++;
                    contp = 0;
                }
            }
            fichero.close();
            JOptionPane.showMessageDialog(f, "Se guardando en: \n" + data.get("ruta"), "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
   
    protected void paraRepos(HashMap<String, String> data, JRootPane f) {
        int inicio = Integer.parseInt(data.get("fol_ini"));
        int fin = Integer.parseInt(data.get("fol_fin"));
        int contp = 0;
        int num_planilla = 1;
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(data.get("ruta"));
            pw = new PrintWriter(fichero);
            for (int i = inicio; i < fin + 1; i++) {
                String textto = String.valueOf(i);
                int d1 = Integer.parseInt(textto.substring(0, 1)),
                        d2 = Integer.parseInt(textto.substring(1, 2)) * 1,
                        d3 = Integer.parseInt(textto.substring(2, 3)) * 2,
                        d4 = Integer.parseInt(textto.substring(3, 4)) * 3,
                        d5 = Integer.parseInt(textto.substring(4, 5)) * 4,
                        d6 = Integer.parseInt(textto.substring(5, 6)) * 5,
                        d7 = Integer.parseInt(textto.substring(6, 7)) * 6,
                        d8 = Integer.parseInt(textto.substring(7, 8)) * 7,
                        d9 = Integer.parseInt(textto.substring(8)) * 8;
                int suma = d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9;
                int resuido = suma % 11;
                int dv;
                if (String.valueOf(resuido).length() > 1) {
                    dv = Integer.parseInt(String.valueOf(resuido).substring(0, 1));
                } else {
                    dv = resuido;
                }
                contp++;
                String fol = data.get("inicia_en") + data.get("serie") + data.get("vigencia") + i + "" + dv;
                pw.print(fol + "\t");
                if (contp == 12) {
                    pw.print(String.format("%07d", num_planilla));
                    num_planilla++;
                    contp = 0;
                    pw.println();
                }
            }
            fichero.close();
            JOptionPane.showMessageDialog(f, "Se guardando en: \n" + data.get("ruta"), "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

}
