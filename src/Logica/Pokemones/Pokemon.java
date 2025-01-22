/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Logica.Pokemones;

import Logica.Ataques.Ataque;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class Pokemon {

    private int vida;
    private String tipo;
    private String nombre;
    public Ataque ataques[] = new Ataque[4];
    private ImageIcon fotoPokemon;
    
    private boolean vivo;
    private boolean elegido;
    

    public Pokemon() {
    }

    public Pokemon(int vida, String tipo, String nombre, ImageIcon fotoPokemon) {
        this.vida = vida;
        this.tipo = tipo;
        this.nombre = nombre;
        this.fotoPokemon = fotoPokemon;
        vivo = true;
        elegido = false;
    }

    public abstract void utilizarAtaques(Ataque ataque);

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ataque[] getAtaques() {
        return ataques;
    }

    public void setAtaques(Ataque[] ataques) {
        this.ataques = ataques;
    }

    public Icon getFotoPokemon() {
        return fotoPokemon;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isElegido() {
        return elegido;
    }

    public void setElegido(boolean elegido) {
        this.elegido = elegido;
    }

    
    
    
    
}
