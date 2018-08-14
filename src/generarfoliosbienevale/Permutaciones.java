package generarfoliosbienevale;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anthony Tepach
 */
public class Permutaciones {

    String preguntas[] = {"¿Cuál es la fecha y Año de la Fundación de Caja Oblatos?", "¿Cuál fue el nombre del Fundador de Caja Oblatos?", "¿Qué es un Agiotista ?", "¿Cuál fue el primer nombre de la Caja?", "¿Cuántos fueron los Fundadores de Caja Oblatos?", "¿De qué cantidad fue la aportación de los fundadores?", "¿En qué tiempo se entregó el 1er préstamo?", "¿Por qué al principio la Caja se llamó XI de Mayo?",
        "¿En qué década se construyó el primer edificio de la Caja?", "¿En qué año nos cambiamos al edificio actual?", "¿Con cuántos socios contamos actualmente?", "¿Cuántos ahorradores menores tenemos actualmente?", "¿En cuántos estados de la República tenemos sucursales?", "¿En qué fecha fue  autorizada ante la CNBV nuestra Caja?", "¿Para qué nos sirve el Ahorro?", "¿Qué es Cooperar?",
        "¿Por qué guardan alimento las hormiguitas?", "¿Para qué sirve el ahorro que deposita el socio?", "¿En donde nació el cooperativismo?", "¿Cuántos fueron los pioneros de Rochdale?", "¿Cuál fue el objetivo de los  Pioneros de Rochdale?", "¿Qué se les ocurrió hacer a los Pioneros de Rochdale?", "¿Cómo se llamó la Cooperativa de los Pioneros de Rochdale?", "¿Cuál fue el secreto del éxito  los Pioneros de Rochdale?",
        "¿Cuál es el primer Principio cooperativo?", "¿Cuál es el segundo Principio Cooperativo?", "¿Cuál es el tercer principio cooperativo?", "¿Cuál es el Cuarto Principio Cooperativo?", "¿Cuál es el Quinto Principio Cooperativo?", "El Principio Cooperación entre Cooperativas es...", "¿A qué se refiere el principio Compromiso con la Comunidad?", "¿Cómo se llama la mascota de Caja Oblatos?"};
    ArrayList<String> conjunto = new ArrayList<>();

    public Permutaciones() {
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");
    }

    public static void escribe(String a, ArrayList<String> conjunto) {
        String mensaje;
        if (conjunto.size() == 1) {
            mensaje = a + "|" + conjunto.get(0);
            System.out.println(mensaje);

        }
        for (int i = 0; i < conjunto.size(); i++) {
            String b = conjunto.remove(i);
            escribe(a + "|" + b, conjunto);
            conjunto.add(i, b);
        }
    }

    public static void main(String[] args) {
        try {
            new Permutaciones().muestraContenido("C:\\Users\\inspector\\Desktop\\LINUX\\Libro3.csv");
        } catch (IOException ex) {
            Logger.getLogger(Permutaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void Metodo() {
        for (int i = 0; i < preguntas.length; i++) {
            escribe(i + 1 + "|" + preguntas[i], conjunto);
        }

    }

    void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        
        FileReader f = new FileReader(archivo);
        BufferedReader b;
        b= new BufferedReader(f);
        String cadena=b.readLine();
            ArrayList<String> alista=new ArrayList<>();
            while ((cadena=b.readLine())!=null) {
                alista.add(cadena);
            }
             b.close();
        for (int i = 0; i < alista.size(); i++) {
            
            //System.out.println(i+".-"+alista.get(i));   
            for (int j = 0; j < 116; j++) {
                int que_linea=new Random().nextInt(191);
            int linea_ant=que_linea;
            if (linea_ant==que_linea) {
                que_linea=new Random().nextInt(191);
            }
                System.out.println(alista.get(que_linea));
            }
            
          
        }

    }
}
