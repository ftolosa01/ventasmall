/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasmall;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class NewClass {
     private int horas;
     private int ventas;
    public int ingresarHoras (){
        Scanner intro = new Scanner(System.in);
        System.out.println("ingrese horas");
        do{
        horas = intro.nextInt();
        if (horas < 40 || horas > 50){
            System.out.println("ingrese horas entre 40 y 50");
        }
        }while(horas < 40 || horas > 50);
        return horas;
    }
    public void ingresarVentas(){
        Scanner intro = new Scanner(System.in);
        System.out.println("ingrese ventas");
        ventas = intro.nextInt();
    }
    public int horasextras () {
       int horasextras = 0;
       if (horas > 40){
           horasextras = horas - 40;
       }
       return horasextras;
    }
    public double bonificacion (){
        double bono;
        if (ventas > 300000){
            bono = ventas * 0.05;
        }else
        if(ventas > 500000){
            bono = ventas * 0.1;
        }else{ 
        bono = 0;    
        }
        return bono;
    }
    public double remuneracion (){
        double remuneracion = (80000 + horasextras()*3000 + bonificacion());
        return remuneracion;
    }

}
