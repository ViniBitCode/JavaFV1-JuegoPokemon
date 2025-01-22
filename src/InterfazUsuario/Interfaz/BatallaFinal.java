/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazUsuario.Interfaz;

import Logica.Ataques.Ataque;
import Logica.Pokemones.Pokemon;
import Utils.UtilsGlobales;
import static Utils.UtilsGlobales.pokemons;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author facun
 */
public class BatallaFinal extends javax.swing.JFrame {

    private final Pokemon elegido, enemigo;
    Random ataqueRandom = new Random();
    
    public BatallaFinal(Pokemon elegido, Pokemon enemigo) {
        this.elegido = elegido;
        this.enemigo = enemigo;
        initComponents();
        inicializarEscenario();
    }
    
    private void inicializarEscenario(){
        imagenPersonaje.setIcon(elegido.getFotoPokemon());
        vidaElegido.setValue(elegido.getVida());
        EnemigoImagen.setIcon(enemigo.getFotoPokemon());
        vidaEnemigo.setValue(enemigo.getVida());
        inicializarBotonAtaque(Ataque1, elegido.ataques[0]);
        inicializarBotonAtaque(Ataque2, elegido.ataques[1]);
        inicializarBotonAtaque(Ataque3, elegido.ataques[2]);
        inicializarBotonAtaque(Ataque4, elegido.ataques[3]);
    }
    
    private void inicializarBotonAtaque(JButton botonAtaque, Ataque ataque) {
        botonAtaque.setText(ataque.getNombre() + " | Usos: " + ataque.getUsos());
        if(ataque.getUsos() == 0) {
            botonAtaque.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EscenarioBatalla = new javax.swing.JPanel();
        EnemigoImagen = new javax.swing.JLabel();
        imagenPersonaje = new javax.swing.JLabel();
        vidaElegido = new javax.swing.JProgressBar();
        vidaEnemigo = new javax.swing.JProgressBar();
        btnCurar = new javax.swing.JButton();
        lblDescCurar = new javax.swing.JLabel();
        lblContCurar = new javax.swing.JLabel();
        PanelAtaques = new javax.swing.JPanel();
        Ataque1 = new javax.swing.JButton();
        Ataque2 = new javax.swing.JButton();
        Ataque3 = new javax.swing.JButton();
        Ataque4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCurar.setText("CURAR");
        btnCurar.setFocusable(false);
        btnCurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurarActionPerformed(evt);
            }
        });

        lblDescCurar.setText("USOS:");

        lblContCurar.setText("20");

        javax.swing.GroupLayout EscenarioBatallaLayout = new javax.swing.GroupLayout(EscenarioBatalla);
        EscenarioBatalla.setLayout(EscenarioBatallaLayout);
        EscenarioBatallaLayout.setHorizontalGroup(
            EscenarioBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscenarioBatallaLayout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(EscenarioBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vidaElegido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(EscenarioBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCurar)
                    .addGroup(EscenarioBatallaLayout.createSequentialGroup()
                        .addComponent(lblDescCurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblContCurar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscenarioBatallaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EscenarioBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscenarioBatallaLayout.createSequentialGroup()
                        .addComponent(vidaEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscenarioBatallaLayout.createSequentialGroup()
                        .addComponent(EnemigoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314))))
        );
        EscenarioBatallaLayout.setVerticalGroup(
            EscenarioBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscenarioBatallaLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(EnemigoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vidaEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EscenarioBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCurar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagenPersonaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EscenarioBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vidaElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(EscenarioBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDescCurar)
                        .addComponent(lblContCurar)))
                .addGap(26, 26, 26))
        );

        Ataque1.setFocusable(false);
        Ataque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ataque1ActionPerformed(evt);
            }
        });

        Ataque2.setFocusable(false);
        Ataque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ataque2ActionPerformed(evt);
            }
        });

        Ataque3.setFocusable(false);
        Ataque3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ataque3ActionPerformed(evt);
            }
        });

        Ataque4.setFocusable(false);
        Ataque4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ataque4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAtaquesLayout = new javax.swing.GroupLayout(PanelAtaques);
        PanelAtaques.setLayout(PanelAtaquesLayout);
        PanelAtaquesLayout.setHorizontalGroup(
            PanelAtaquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAtaquesLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(PanelAtaquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ataque1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ataque2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAtaquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ataque3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ataque4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );
        PanelAtaquesLayout.setVerticalGroup(
            PanelAtaquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtaquesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAtaquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ataque1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ataque4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAtaquesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ataque3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ataque2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscenarioBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelAtaques, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EscenarioBatalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAtaques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Ataque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ataque1ActionPerformed
        realizarAtaque(0, enemigo, elegido);
    }//GEN-LAST:event_Ataque1ActionPerformed

    private void Ataque4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ataque4ActionPerformed
        realizarAtaque(3, enemigo, elegido);
    }//GEN-LAST:event_Ataque4ActionPerformed

    private void Ataque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ataque2ActionPerformed
       realizarAtaque(1, enemigo, elegido);
    }//GEN-LAST:event_Ataque2ActionPerformed

    private void Ataque3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ataque3ActionPerformed
        realizarAtaque(2, enemigo, elegido);
    }//GEN-LAST:event_Ataque3ActionPerformed

    private void btnCurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurarActionPerformed
        int contCurasRestantes = Integer.parseInt(lblContCurar.getText());
        elegido.setVida(elegido.getVida() + 20);
        contCurasRestantes--;
        if(elegido.getVida() > 100) {
            elegido.setVida(100);
        }
        if(contCurasRestantes == 0) {
            btnCurar.setEnabled(false);
        }
        lblContCurar.setText(String.valueOf(contCurasRestantes));
        enemigoAtaca(enemigo, elegido);
    }//GEN-LAST:event_btnCurarActionPerformed

    private void realizarAtaque(int numeroAtaque, Pokemon rival, Pokemon elegido) {
        restarUsoAtaque(numeroAtaque, elegido);         // Elegido ataca Enemigo
        controlarVida(numeroAtaque, rival, elegido);    // Se resta en -1 el ataque seleccionado
        vidaEnemigo.setValue(rival.getVida());
        
        if(rival.getVida() <= 0) {
            this.dispose();
            UtilsGlobales.iniciarPantalla(new EscenaFinal());
        }
        
        enemigoAtaca(rival, elegido);
    }
    
    private void enemigoAtaca(Pokemon rival, Pokemon elegido) {
        int ataqueEnemigo = ataqueRandom.nextInt(4);
        restarUsoAtaque(ataqueEnemigo, rival);    
        controlarVida(ataqueEnemigo, elegido, rival);
        if(elegido.getVida() <= 0) {
            this.dispose();
            UtilsGlobales.iniciarPantalla(new PantallaInicial());
        }
        
        vidaElegido.setValue(elegido.getVida());
    }
    
    private void restarUsoAtaque(int numeroAtaque, Pokemon pokemon) {
        pokemon.utilizarAtaques(elegido.ataques[numeroAtaque]);                             // Tira por consola el ataque que se usa
        pokemon.ataques[numeroAtaque].setUsos(elegido.ataques[numeroAtaque].getUsos() - 1); // Resta en 1 los usos del ataque
        switch(numeroAtaque){                                                               
            case 0 -> controlarUsosAtaque(Ataque1, numeroAtaque);
            case 1 -> controlarUsosAtaque(Ataque2, numeroAtaque);
            case 2 -> controlarUsosAtaque(Ataque3, numeroAtaque);
            case 3 -> controlarUsosAtaque(Ataque4, numeroAtaque);
        }
        System.out.println(pokemon.getNombre() + " ha utilizado " + pokemon.ataques[numeroAtaque].getNombre()); 
    }
    
    private void controlarVida(int numeroAtaque, Pokemon recibeDanio, Pokemon haceDanio) {
        recibeDanio.setVida(recibeDanio.getVida() - haceDanio.ataques[numeroAtaque].getDanio());
    }
    
    private void controlarUsosAtaque(javax.swing.JButton botonAtaque, int numeroAtaque) {
        botonAtaque.setText(elegido.ataques[numeroAtaque].getNombre() + " | Usos: " + elegido.ataques[numeroAtaque].getUsos());
        if(elegido.ataques[numeroAtaque].getUsos() <= 0) {
             botonAtaque.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ataque1;
    private javax.swing.JButton Ataque2;
    private javax.swing.JButton Ataque3;
    private javax.swing.JButton Ataque4;
    private javax.swing.JLabel EnemigoImagen;
    private javax.swing.JPanel EscenarioBatalla;
    private javax.swing.JPanel PanelAtaques;
    private javax.swing.JButton btnCurar;
    private javax.swing.JLabel imagenPersonaje;
    private javax.swing.JLabel lblContCurar;
    private javax.swing.JLabel lblDescCurar;
    private javax.swing.JProgressBar vidaElegido;
    private javax.swing.JProgressBar vidaEnemigo;
    // End of variables declaration//GEN-END:variables

}