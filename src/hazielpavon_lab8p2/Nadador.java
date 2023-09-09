package hazielpavon_lab8p2;

import java.io.Serializable;
import java.util.Random;
import javax.swing.JOptionPane;

public class Nadador implements Serializable {

    private int estatura, edad, numerodemedallas;
    private String nombre, nacionalidad;
    private double tiempo, disrancia;
    private String estilo;

    public Nadador(double tiempo, int estatura, int edad, String nombre, String nacionalidad, double disrancia, int numerodemedallas, String estilo1) {
        this.estatura = estatura;
        this.edad = edad;
        this.numerodemedallas = numerodemedallas;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tiempo = tiempo;
        this.disrancia = disrancia;

    }

    public Nadador() {
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumerodemedallas() {
        return numerodemedallas;
    }

    public void setNumerodemedallas(int numerodemedallas) {
        this.numerodemedallas = numerodemedallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getDisrancia() {
        return disrancia;
    }

    public void setDisrancia(double disrancia) {
        this.disrancia = disrancia;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Nadador: \n" + "estatura: " + estatura + "\n edad: " + edad + "\n numerodemedallas: " + numerodemedallas + "\n nombre: " + nombre + "\n nacionalidad: " + nacionalidad + "\n tiempo: " + tiempo + "\n disrancia: " + disrancia + "\n estilo: " + estilo;
    }

}
    