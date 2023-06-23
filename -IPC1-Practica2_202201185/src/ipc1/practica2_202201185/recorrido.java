/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.practica2_202201185;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 *
 * @author andre
 */
public class recorrido extends Thread {
    JLabel vehiculo;
    int distancia;
    boolean regreso;
    
    final int posDestino = verRecorrido.destinoLbl.getLocation().x;
    
    Icon iconoIda = new ImageIcon("C:\\Users\\andre\\OneDrive\\Escritorio\\Tareas\\Introduccion a la programacion\\Proyectos\\Proyectos\\-IPC1-Practica2_202201185\\src\\imagenes\\ida.jpg");
    Icon iconoRegreso = new ImageIcon("C:\\Users\\andre\\OneDrive\\Escritorio\\Tareas\\Introduccion a la programacion\\Proyectos\\Proyectos\\-IPC1-Practica2_202201185\\src\\imagenes\\vuelta.jpg");

    public recorrido(JLabel vehiculo, int distancia) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.regreso = false;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                //delay
                sleep(10*distancia);
                //obtener posicion del vehiculo en x
                int vehiculoPosX = vehiculo.getLocation().x;
                
                if(!regreso){
                    if(vehiculoPosX<posDestino-100){
                        vehiculo.setLocation(vehiculoPosX+10,vehiculo.getLocation().y);
                    }else{
                        regreso=true;
                    }
                }else{
                    if(vehiculoPosX>100){
                        vehiculo.setLocation(vehiculoPosX-10,vehiculo.getLocation().y);
                    }else{
                        break;
                    }
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

  
}
