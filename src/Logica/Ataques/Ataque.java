/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Logica.Ataques;

import javax.swing.ImageIcon;


public abstract class Ataque {

    protected int usos;
    protected int danio;
    protected String nombre;
    protected String tipoAtaque;

    public Ataque(int usos, int danio, String nombre, String tipoAtaque) {
        this.usos = usos;
        this.danio = danio;
        this.nombre = nombre;
        this.tipoAtaque = tipoAtaque;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }
    
    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
