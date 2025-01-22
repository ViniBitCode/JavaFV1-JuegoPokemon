/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazUsuario.Interfaz;

import Logica.Pokemones.Bulbasaur;
import Logica.Pokemones.Charmander;
import Logica.Pokemones.Pikachu;
import Logica.Pokemones.Pokemon;
import Logica.Pokemones.Squirtle;
import static Utils.UtilsGlobales.pokemons;

public class PantallaInicial extends javax.swing.JFrame {
  
    private Pokemon elegido;
    
    public PantallaInicial() {
        initComponents();
        
        pokemons[0] = new Bulbasaur(50, "Planta", "Bulbasaur", new javax.swing.ImageIcon(getClass().getResource("/InterfazUsuario/Imagenes/001.png")));
        pokemons[1] = new Pikachu(60, "Electrico", "Pikachu", new javax.swing.ImageIcon(getClass().getResource("/InterfazUsuario/Imagenes/002.png")));
        pokemons[2] = new Squirtle(35, "Agua", "Squirtle", new javax.swing.ImageIcon(getClass().getResource("/InterfazUsuario/Imagenes/003.png")));
        pokemons[3] = new Charmander(60, "Fuego", "Charmander", new javax.swing.ImageIcon(getClass().getResource("/InterfazUsuario/Imagenes/004.png")));
        // Todos los pokemons tienen su variable 'vivo' en true por default y 'elegido' en false.
        inicializarJuego();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleText = new javax.swing.JLabel();
        DescriptionText = new javax.swing.JLabel();
        versionText = new javax.swing.JLabel();
        opc1 = new javax.swing.JButton();
        opc2 = new javax.swing.JButton();
        opc3 = new javax.swing.JButton();
        opc4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleText.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TitleText.setText("POKEMON");

        DescriptionText.setText("Elegí a tu inicial para comenzar el juego");

        versionText.setText("V0.1");

        opc1.setFocusable(false);
        opc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        opc2.setFocusable(false);
        opc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        opc3.setFocusable(false);
        opc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        opc4.setFocusable(false);
        opc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opc1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(opc2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(opc3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(opc4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescriptionText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(versionText)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(versionText)
                .addGap(29, 29, 29)
                .addComponent(TitleText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DescriptionText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opc1)
                    .addComponent(opc2)
                    .addComponent(opc3)
                    .addComponent(opc4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Molesta a la vista sea todo tan repetitivo... ni idea si puedo hacer esto con una función al ser todos Jbuttons...
    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc1ActionPerformed
        pokemons[0].setElegido(true);
        System.out.println("Se ha elegido a " + pokemons[0].getNombre());
        iniciarJuego(0);
    }//GEN-LAST:event_opc1ActionPerformed

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc2ActionPerformed
        pokemons[1].setElegido(true);
        System.out.println("Se ha elegido a " + pokemons[1].getNombre());
        iniciarJuego(1);
    }//GEN-LAST:event_opc2ActionPerformed

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc3ActionPerformed
        pokemons[2].setElegido(true);
        System.out.println("Se ha elegido a " + pokemons[2].getNombre());
        iniciarJuego(2);
    }//GEN-LAST:event_opc3ActionPerformed

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc4ActionPerformed
        pokemons[3].setElegido(true);
        System.out.println("Se ha elegido a " + pokemons[3].getNombre());
        iniciarJuego(3);
    }//GEN-LAST:event_opc4ActionPerformed

    private void iniciarJuego(int opc) {
        elegido = pokemons[opc];
        SeleccionRival pRivales = new SeleccionRival(elegido);
        pRivales.setVisible(rootPaneCheckingEnabled);
        pRivales.setLocationRelativeTo(null);
        this.dispose();
    }
   
    private void inicializarJuego() {
        opc1.setIcon(pokemons[0].getFotoPokemon());
        opc2.setIcon(pokemons[1].getFotoPokemon());
        opc3.setIcon(pokemons[2].getFotoPokemon());
        opc4.setIcon(pokemons[3].getFotoPokemon());        
        for (int i = 0; i < pokemons.length; i++) {
            pokemons[i].setElegido(false);
            pokemons[i].setVivo(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescriptionText;
    private javax.swing.JLabel TitleText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton opc1;
    private javax.swing.JButton opc2;
    private javax.swing.JButton opc3;
    private javax.swing.JButton opc4;
    private javax.swing.JLabel versionText;
    // End of variables declaration//GEN-END:variables
}
