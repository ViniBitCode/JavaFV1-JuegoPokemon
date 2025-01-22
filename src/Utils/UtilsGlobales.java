/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Utils;

import InterfazUsuario.Interfaz.BatallaFinal;
import InterfazUsuario.Interfaz.EscenaFinal;
import InterfazUsuario.Interfaz.PantallaInicial;
import InterfazUsuario.Interfaz.SeleccionRival;
import Logica.Pokemones.Pokemon;

public class UtilsGlobales {

    public static Pokemon pokemons[] = new Pokemon[4];
    
    public static void iniciarPantalla(SeleccionRival p) {
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
    
    public static void iniciarPantalla(PantallaInicial p) {
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
    
    public static void iniciarPantalla(BatallaFinal p) {
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
    
    public static void iniciarPantalla(EscenaFinal p) {
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }
}
