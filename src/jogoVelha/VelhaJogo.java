/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoVelha;

import java.awt.Color;

/**
 *
 * @author diven
 */
public class VelhaJogo extends javax.swing.JFrame {
    public boolean j1 = true;
    public boolean j2 = true;
    public int j=0, i=0;
    public int contador=0;
    int es;
    public String l1,l2,l3,c1,c2,c3,d1,d2;
    String[][] ve = new String[3][3];
    /**
     * Creates new form VelhaJogo
     */
    public VelhaJogo() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);    
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btReiniciar = new javax.swing.JButton();
        caixaTexto = new javax.swing.JTextField();
        bt00 = new javax.swing.JToggleButton();
        bt01 = new javax.swing.JToggleButton();
        bt02 = new javax.swing.JToggleButton();
        bt10 = new javax.swing.JToggleButton();
        bt11 = new javax.swing.JToggleButton();
        bt12 = new javax.swing.JToggleButton();
        bt20 = new javax.swing.JToggleButton();
        bt21 = new javax.swing.JToggleButton();
        bt22 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btReiniciar.setBackground(new java.awt.Color(255, 51, 51));
        btReiniciar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btReiniciar.setText("REINICIAR");
        btReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReiniciarActionPerformed(evt);
            }
        });

        caixaTexto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        caixaTexto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        bt00.setBackground(java.awt.Color.green);
        bt00.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt00ActionPerformed(evt);
            }
        });

        bt01.setBackground(java.awt.Color.cyan);
        bt01.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt01ActionPerformed(evt);
            }
        });

        bt02.setBackground(java.awt.Color.pink);
        bt02.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt02ActionPerformed(evt);
            }
        });

        bt10.setBackground(java.awt.Color.red);
        bt10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt10ActionPerformed(evt);
            }
        });

        bt11.setBackground(java.awt.Color.magenta);
        bt11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt11ActionPerformed(evt);
            }
        });

        bt12.setBackground(new java.awt.Color(153, 153, 255));
        bt12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt12ActionPerformed(evt);
            }
        });

        bt20.setBackground(java.awt.Color.orange);
        bt20.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt20ActionPerformed(evt);
            }
        });

        bt21.setBackground(java.awt.Color.white);
        bt21.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt21ActionPerformed(evt);
            }
        });

        bt22.setBackground(new java.awt.Color(153, 153, 153));
        bt22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixaTexto)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt00, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt02, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt00, bt01, bt02, bt10, bt11, bt12, bt20, bt21, bt22});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt01, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt02, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt00, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt22, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt20, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt21, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(caixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt00, bt01, bt02, bt10, bt11, bt12, bt20, bt21, bt22});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void verifica(){
        if(j1&&j2){
            this.es=1;
            j1=false;
            j2=true;
            caixaTexto.setText("Vez do jogador O");
        }else if (j1&&j2==false){
            this.es=1;
            j1=false;
            j2=true;
            caixaTexto.setText("Vez do jogador O");
        }else{
            this.es=2;
            j1=true;
            j2=false;
            caixaTexto.setText("Vez do jogador X");
        }
    }   

    public void vencedor(){
        l1=ve[0][0]+ve[0][1]+ve[0][2];
        l2=ve[1][0]+ve[1][1]+ve[1][2];
        l3=ve[2][0]+ve[2][1]+ve[2][2];
        c1=ve[0][0]+ve[1][0]+ve[2][0];
        c2=ve[0][1]+ve[1][1]+ve[2][1];
        c3=ve[0][2]+ve[1][2]+ve[2][2];
        d1=ve[0][0]+ve[1][1]+ve[2][2];
        d2=ve[0][2]+ve[1][1]+ve[2][0];
        
        if(l1.equals("XXX")|l2.equals("XXX")|l3.equals("XXX")
                |c1.equals("XXX")|c2.equals("XXX")|c3.equals("XXX")
                |d1.equals("XXX")|d2.equals("XXX")){
            caixaTexto.setText("O vencedor é X");
            desativa();
        }else 
        if(l1.equals("OOO")|l2.equals("OOO")|l3.equals("OOO")
                |c1.equals("OOO")|c2.equals("OOO")|c3.equals("OOO")
                |d1.equals("OOO")|d2.equals("OOO")){
            caixaTexto.setText("O vencedor é O");
            desativa();
        }else if(contador==9){
            caixaTexto.setText("Reinicie");
        }
    }    

    public void desativa(){
        bt00.setEnabled(false);
        bt01.setEnabled(false);
        bt02.setEnabled(false);
        bt10.setEnabled(false);
        bt11.setEnabled(false);
        bt12.setEnabled(false);
        bt20.setEnabled(false);
        bt21.setEnabled(false);
        bt22.setEnabled(false);
    }

    public void limpar(){
        for(i=0; i<3;i++){
            for(j=0;j<3;j++){
                ve[i][j]="";
            }
        }
    }    
    
    public void quantPosicao(){
        contador = 0;
        for(i=0; i<3;i++){
            for(j=0;j<3;j++){
                if ("X".equals(ve[i][j])|"O".equals(ve[i][j])){
                    contador+=1;
                }
            }
        }
    }     
    
    private void btReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReiniciarActionPerformed
        // TODO add your handling code here:
        bt00.setText("");
        bt00.setEnabled(true);
        bt01.setText("");
        bt01.setEnabled(true);
        bt02.setText("");
        bt02.setEnabled(true);
        bt10.setText("");
        bt10.setEnabled(true);
        bt11.setText("");
        bt11.setEnabled(true);
        bt12.setText("");
        bt12.setEnabled(true);
        bt20.setText("");
        bt20.setEnabled(true);
        bt21.setText("");
        bt21.setEnabled(true);
        bt22.setText("");
        bt22.setEnabled(true);
        limpar();
        caixaTexto.setText("");
        j1=true;
        j2=false;

    }//GEN-LAST:event_btReiniciarActionPerformed

    private void bt00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt00ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt00.setText("X");
            ve[0][0]="X";
        }else{
            bt00.setText("O");
            ve[0][0]="O";
        }
        bt00.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt00ActionPerformed

    private void bt01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt01ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt01.setText("X");
            ve[0][1]="X";
        }else{
            bt01.setText("O");
            ve[0][1]="O";
        }
        bt01.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt01ActionPerformed

    private void bt02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt02ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt02.setText("X");
            ve[0][2]="X";
        }else{
            bt02.setText("O");
            ve[0][2]="O";
        }
        bt02.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt02ActionPerformed

    private void bt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt10ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt10.setText("X");
            ve[1][0]="X";
        }else{
            bt10.setText("O");
            ve[1][0]="O";
        }
        bt10.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt10ActionPerformed

    private void bt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt11ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt11.setText("X");
            ve[1][1]="X";
        }else{
            bt11.setText("O");
            ve[1][1]="O";
        }
        bt11.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt11ActionPerformed

    private void bt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt12ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt12.setText("X");
            ve[1][2]="X";
        }else{
            bt12.setText("O");
            ve[1][2]="O";
        }
        bt12.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt12ActionPerformed

    private void bt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt20ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt20.setText("X");
            ve[2][0]="X";
        }else{
            bt20.setText("O");
            ve[2][0]="O";
        }
        bt20.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt20ActionPerformed

    private void bt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt21ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt21.setText("X");
            ve[2][1]="X";
        }else{
            bt21.setText("O");
            ve[2][1]="O";
        }
        bt21.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt21ActionPerformed

    private void bt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt22ActionPerformed
        // TODO add your handling code here:
        verifica();
        if(es==1){
            bt22.setText("X");
            ve[2][2]="X";
        }else{
            bt22.setText("O");
            ve[2][2]="O";
        }
        bt22.setEnabled(false);
        quantPosicao();
        vencedor();
    }//GEN-LAST:event_bt22ActionPerformed

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
            java.util.logging.Logger.getLogger(VelhaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VelhaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VelhaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VelhaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VelhaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bt00;
    private javax.swing.JToggleButton bt01;
    private javax.swing.JToggleButton bt02;
    private javax.swing.JToggleButton bt10;
    private javax.swing.JToggleButton bt11;
    private javax.swing.JToggleButton bt12;
    private javax.swing.JToggleButton bt20;
    private javax.swing.JToggleButton bt21;
    private javax.swing.JToggleButton bt22;
    private javax.swing.JButton btReiniciar;
    private javax.swing.JTextField caixaTexto;
    // End of variables declaration//GEN-END:variables
}
