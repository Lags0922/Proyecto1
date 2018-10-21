/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LuisGarro
 */
// tenemos al clase principal con la biblioteca grafica para java
public class calculadora extends javax.swing.JFrame {

    //metodo calculadora
    public calculadora() {
        /*este metodo hace que se cargue todos los objetos del JFrame -> 
     JPanel al momento de ejecutar el programa es por eso que va dentro de el contructor de la clase.*/
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtsegundonumero = new javax.swing.JTextField();
        txtprimernumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtresultado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnsuma = new javax.swing.JButton();
        btndivicion = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnmultiplicacion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));

        txtsegundonumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsegundonumeroKeyTyped(evt);
            }
        });

        txtprimernumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprimernumeroActionPerformed(evt);
            }
        });
        txtprimernumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprimernumeroKeyTyped(evt);
            }
        });

        jLabel1.setText("1ER Numero");

        jLabel2.setText("2DO Numero");

        jLabel3.setText("  Resultado");

        btnsuma.setText("Suma");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        btndivicion.setText("Division");
        btndivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivicionActionPerformed(evt);
            }
        });

        btnresta.setText("Resta");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        btnmultiplicacion.setText("Multiplicacion");
        btnmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacionActionPerformed(evt);
            }
        });

        jLabel4.setText("       Bienvenidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtprimernumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsegundonumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnresta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmultiplicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndivicion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprimernumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsegundonumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsuma)
                    .addComponent(btnresta)
                    .addComponent(btnmultiplicacion)
                    .addComponent(btndivicion))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprimernumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprimernumeroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtprimernumeroActionPerformed

    // boton suma
    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        // TODO add your handling code here:

        int Primernumero = Integer.parseInt(txtprimernumero.getText());
        int Segundonumero = Integer.parseInt(txtsegundonumero.getText());
        double Resultado = Primernumero + Segundonumero;
        String Valor = Double.toString(Resultado);

        txtresultado.setText(Valor);

    }//GEN-LAST:event_btnsumaActionPerformed
    //boton resta
    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        // TODO add your handling code here:
        int Primernumero = Integer.parseInt(txtprimernumero.getText());
        int Segundonumero = Integer.parseInt(txtsegundonumero.getText());
        double Resultado = Primernumero - Segundonumero;
        String Valor = Double.toString(Resultado);

        txtresultado.setText(Valor);
    }//GEN-LAST:event_btnrestaActionPerformed
    //boton multiplicacion
    private void btnmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacionActionPerformed
        // TODO add your handling code here:
        int Primernumero = Integer.parseInt(txtprimernumero.getText());
        int Segundonumero = Integer.parseInt(txtsegundonumero.getText());
        double Resultado = Primernumero * Segundonumero;
        String Valor = Double.toString(Resultado);

        txtresultado.setText(Valor);
    }//GEN-LAST:event_btnmultiplicacionActionPerformed
    //boton division
    private void btndivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivicionActionPerformed
        // TODO add your handling code here:
        int Primernumero = Integer.parseInt(txtprimernumero.getText());
        int Segundonumero = Integer.parseInt(txtsegundonumero.getText());
        float Resultado = (float) Primernumero / (float) Segundonumero;
        String Valor = Float.toString(Resultado);

        txtresultado.setText(Valor);
    }//GEN-LAST:event_btndivicionActionPerformed

// controlamos excepciones para que solo puedan ser ingresados numeros
    private void txtprimernumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimernumeroKeyTyped
        // TODO add your handling code here:
        char numero1 = evt.getKeyChar();
        if ((numero1 < '0' || numero1 > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtprimernumeroKeyTyped
// controlamos excepciones para que solo puedan ser ingresados numeros
    private void txtsegundonumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundonumeroKeyTyped
        // TODO add your handling code here:
        char numero1 = evt.getKeyChar();
        if ((numero1 < '0' || numero1 > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtsegundonumeroKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndivicion;
    private javax.swing.JButton btnmultiplicacion;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtprimernumero;
    private javax.swing.JTextField txtresultado;
    private javax.swing.JTextField txtsegundonumero;
    // End of variables declaration//GEN-END:variables

}
