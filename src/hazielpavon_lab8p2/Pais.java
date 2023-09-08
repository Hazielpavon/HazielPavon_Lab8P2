/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hazielpavon_lab8p2;

import java.io.Serializable;
import java.util.ArrayList;

public class Pais implements Serializable {

    private ArrayList<Nadador> jugadores = new ArrayList();
    private String nombre;
    private int medallas;

    public Pais(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public Pais() {
    }

    public ArrayList<Nadador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Nadador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return "Pais: \n" + "jugadores: " + jugadores + "\n nombre: " + nombre + "\n medallas: " + medallas;
    }

}
