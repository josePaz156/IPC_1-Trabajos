/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.practica2_202201185;

import static ipc1.practica2_202201185.Inicio.deserializeArray;
import java.util.Arrays;

/**
 *
 * @author andre
 */
public class IPC1Practica2_202201185 {
    
    public static int inContador;
    public static historialPedidos[] historial = new historialPedidos[300];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lastNonNullIndex = -1;
        historialPedidos[] deserializedArray = deserializeArray("./Respaldo.txt");

// Verificar si el arreglo deserializado no es nulo
        if (deserializedArray != null) {
            // Copiar los elementos del arreglo deserializado al arreglo existente
            historial = Arrays.copyOf(deserializedArray, deserializedArray.length);
        }
        for (int i = historial.length - 1; i >= 0; i--) {
            if (historial[i] != null) {
                lastNonNullIndex = i;
                System.out.println(lastNonNullIndex);
                break; // Se encontró un elemento no nulo, salir del bucle
            }
        }
        inContador = lastNonNullIndex;
        System.out.println(inContador);
        Inicio open = new Inicio();
        open.setVisible(true);
    }

}
