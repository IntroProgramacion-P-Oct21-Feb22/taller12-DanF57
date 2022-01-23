/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] suma = new double[5];

        for (int i = 0; i < datos.length; i++) {
            suma[i] = obtenerSuma(datos[i], datos2[i]);
            System.out.printf("%.0f\n", suma[i]);
        }
    }

    public static double obtenerSuma(double dato1, double dato2) {
        if (dato2 == 0) {
            return dato1;
        } else {
            if (dato1 == 0) {
                return dato2;
            } else {
                return 1 + obtenerSuma(dato1, dato2 - 1);
            }
        }
    }
}
