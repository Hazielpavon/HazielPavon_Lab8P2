
package hazielpavon_lab8p2;

import java.io.Serializable;


public class Evento implements Serializable{
    private String evento; 
    private double tiempo, distancia; 

    public Evento(String evento, double tiempo, double distancia) {
        this.evento = evento;
        this.tiempo = tiempo;
        this.distancia = distancia;
    }

    public Evento() {
    }

    
    
    
    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Evento: \n" + "evento: " + evento + "\n tiempo: " + tiempo + "\n distancia=" + distancia;
    }
    
    
    
    
    
}
