/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasfecha;

import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author Jesús Durántez Prieto
 */
public class PruebasFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date testDate = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fecha;
        //String date;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        fecha = teclado.nextLine();
        //date = fecha;
        try{
            testDate = formatoFecha.parse(fecha);
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, " + testDate);
        } catch (Exception e){ System.out.println("invalid format");}

        if (!formatoFecha.format(testDate).equals(fecha)){
            System.out.println("Fecha invalida");
            
        } else {
            System.out.println("Fecha valida: " + fecha);
        }

    }
}