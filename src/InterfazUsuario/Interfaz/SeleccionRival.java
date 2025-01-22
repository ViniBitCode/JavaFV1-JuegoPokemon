package InterfazUsuario.Interfaz;

import Logica.Pokemones.Pokemon;
import Logica.Pokemones.Snorlax;
import Utils.UtilsGlobales;
import static Utils.UtilsGlobales.pokemons;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class SeleccionRival extends javax.swing.JFrame {

    private final JButton imagenesEnemigos[] = new JButton[3];
    private final Pokemon enemigosPokemon[] = new Pokemon[3];
    private final Pokemon elegido;
    
    public SeleccionRival(Pokemon elegido) {
        initComponents();
        this.elegido = elegido;
        
        imagenesEnemigos[0] = Enemigo1;
        imagenesEnemigos[1] = Enemigo2;
        imagenesEnemigos[2] = Enemigo3;
        
        ponerImagen();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagenPersonaje = new javax.swing.JLabel();
        Enemigo1 = new javax.swing.JButton();
        Enemigo2 = new javax.swing.JButton();
        Enemigo3 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnFinalBattle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Enemigo1.setFocusable(false);
        Enemigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enemigo1ActionPerformed(evt);
            }
        });

        Enemigo2.setFocusable(false);
        Enemigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enemigo2ActionPerformed(evt);
            }
        });

        Enemigo3.setFocusable(false);
        Enemigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enemigo3ActionPerformed(evt);
            }
        });

        btnBack.setText("VOLVER");
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnFinalBattle.setText("BATALLA FINAL");
        btnFinalBattle.setEnabled(false);
        btnFinalBattle.setFocusable(false);
        btnFinalBattle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalBattleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(imagenPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Enemigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Enemigo2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(btnFinalBattle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(Enemigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnFinalBattle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Enemigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enemigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enemigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(imagenPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Enemigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enemigo1ActionPerformed
        generarBatalla(enemigosPokemon[0]);
    }//GEN-LAST:event_Enemigo1ActionPerformed

    private void Enemigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enemigo2ActionPerformed
        generarBatalla(enemigosPokemon[1]);
    }//GEN-LAST:event_Enemigo2ActionPerformed

    private void Enemigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enemigo3ActionPerformed
        generarBatalla(enemigosPokemon[2]);
    }//GEN-LAST:event_Enemigo3ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        PantallaInicial pantallaInicial = new PantallaInicial();
        pantallaInicial.setVisible(rootPaneCheckingEnabled);
        pantallaInicial.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnFinalBattleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalBattleActionPerformed
        this.dispose();
        UtilsGlobales.iniciarPantalla(new BatallaFinal(elegido, new Snorlax(200, "Normal", "Snorlax", new javax.swing.ImageIcon(getClass().getResource("/InterfazUsuario/Imagenes/005.png")))));
    }//GEN-LAST:event_btnFinalBattleActionPerformed

    private void generarBatalla(Pokemon enemigo) {
        this.dispose();
        Batalla batalla = new Batalla(enemigo, elegido);
        System.out.println("El enemigo elegido es: " + enemigo.getNombre());
        batalla.setVisible(rootPaneCheckingEnabled);
        batalla.setLocationRelativeTo(null);
    }
    
    private void ponerImagen(){
        int i = 0, contImg = 0, contMuerto = 0;
        do {
            if(pokemons[i].isElegido() == true) {
                imagenPersonaje.setIcon(pokemons[i].getFotoPokemon());
            } else {
                imagenesEnemigos[contImg].setIcon(pokemons[i].getFotoPokemon());
                if(!pokemons[i].isVivo()) {
                    imagenesEnemigos[contImg].setEnabled(false);
                    contMuerto++;
                }
                enemigosPokemon[contImg] = pokemons[i];
                contImg++;
            }
            i++;
        }while(i < pokemons.length);
        if(contMuerto == enemigosPokemon.length) {
            btnFinalBattle.setEnabled(true);
        }
 
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enemigo1;
    private javax.swing.JButton Enemigo2;
    private javax.swing.JButton Enemigo3;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFinalBattle;
    private javax.swing.JLabel imagenPersonaje;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
   
}

