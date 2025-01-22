/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Logica.Pokemones;

import Logica.Ataques.Ataque;
import Logica.Ataques.AtaqueElectrico1;
import Logica.Ataques.AtaqueNormal1;
import Logica.Ataques.AtaqueNormal2;
import Logica.Ataques.AtaqueNormal3;
import javax.swing.ImageIcon;


public class Pikachu extends Pokemon {

    public Pikachu(int vida, String tipo, String nombre, ImageIcon fotoPokemon) {
        super(vida, tipo, nombre, fotoPokemon);
        ataques[0] = new AtaqueNormal1();
        ataques[1] = new AtaqueNormal2();
        ataques[2] = new AtaqueNormal3();
        ataques[3] = new AtaqueElectrico1();
    }

    @Override
    public void utilizarAtaques(Ataque ataque) {
        System.out.println("Pikachu ha utilizado el ataque: " + ataque.getNombre());
        
    }
    
}
