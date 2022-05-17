/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author SALA H
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[][] miMatriz = new int[3][3];

        int[][] miMatriz1 = {{2, 4, 3}, {8, 7, 6}, {3, 6, 0}, {4, 8, 9}};
        int mayor = miMatriz1[0][0];
        int menor = miMatriz1[0][0];
        String maP = "0,0";
        String meP = "0,0";

        for (int i = 0; i < miMatriz1.length; i++) {
            System.out.println("");
            for (int j = 0; j < miMatriz1[i].length; j++) {
                System.out.print(miMatriz1[i][j] + " ");

                if (miMatriz1[i][j] > mayor) {
                    mayor = miMatriz1[i][j];
                    maP = i + "," + j;
                }
                if (miMatriz1[i][j] < menor) {
                    menor = miMatriz1[i][j];
                    meP = i + "," + j;
                }

            }

        }
        System.out.println("\n\nEl número mayor de la matriz es " + mayor + " en la posición " + maP);
        System.out.println("El número menor de la matriz es " + menor + " en la posición " + meP);
    }

}
