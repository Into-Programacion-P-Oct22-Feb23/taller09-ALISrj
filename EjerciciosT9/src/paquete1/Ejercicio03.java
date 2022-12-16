/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double sumaarreglo = 0;
        double promedio;
        int elementosArribaMedia = 0;
        int elementosAbajoMedia =  0;
        
        
        for (int i = 0; i < arreglo.length; i++) {
            sumaarreglo = sumaarreglo + arreglo[i];
        }
        promedio = sumaarreglo/arreglo.length;
        
        
        for (int i = 0; i < arreglo.length; i++) {
            
            if ((arreglo[i] >= promedio) ) {
                elementosArribaMedia = elementosArribaMedia + 1;
            } else {
                elementosAbajoMedia = elementosAbajoMedia + 1;
            }
        }
        
      
        System.out.printf("Valores Arriba de la media - %d\n"
                + "Valores Abajo de la media - %d\n"
                ,elementosArribaMedia,elementosAbajoMedia);
        
        
        
        
        
        

    }

}
