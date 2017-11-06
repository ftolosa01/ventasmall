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
public class VentasMall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        double acum = 0;
        System.out.println("remuneracion");
        for (int i = 1; i < 5; i++) {
            NewClass nuevo = new NewClass ();
            nuevo.ingresarHoras();
            nuevo.ingresarVentas();
            acum = acum + nuevo.remuneracion();
            System.out.println("sueldo semana N "+ i +" es "+ nuevo.remuneracion());
        }
        System.out.println("sueldo mes es "+ acum);
    }
    
}
