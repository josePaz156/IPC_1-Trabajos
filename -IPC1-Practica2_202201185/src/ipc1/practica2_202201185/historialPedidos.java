/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.practica2_202201185;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author andre
 */
public class historialPedidos implements Serializable{
    String vehiculo;
    int distancia;
    int monto;
    String horaCreacion;

    public historialPedidos(String vehiculo, int distancia, int monto, String horaCreacion) {
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.monto = monto;
        this.horaCreacion = horaCreacion;
    }

}
