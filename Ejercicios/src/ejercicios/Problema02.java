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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos3 = new double[4][3];

        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {

                datos3[i][j] = obtenerSuma(datos1[i][j], datos2[i][j]);
                System.out.printf("Suma posición [%s][%s] es: %.0f\n",
                        i, j, datos3[i][j]);
            }
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
