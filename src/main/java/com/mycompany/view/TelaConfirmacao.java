/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.view;

import com.mycompany.model.bean.Aluno;
import com.mycompany.model.bean.Pedido;
import com.mycompany.model.dao.PedidoDAO;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author suporte
 */
public class TelaConfirmacao extends javax.swing.JFrame {
boolean lanche =false;
boolean almoco = false;
Aluno alu;

    /**
     * Creates new form TelaConfirmacao
     */
    public TelaConfirmacao() {
        
       
        
        initComponents();
       
        datas();
        
       
        
    }
    public void recebe(Aluno aluno){
            jLmatricula.setText(aluno.getMatricula());
            jlId.setText(aluno.getId().toString());
            jLNome.setText(aluno.getNome());
            jLTurno.setText(aluno.getTurno());
            alu = aluno;
        }
    
    
     public void datas(){
                 
         
    jLhora.setBounds(10,12,70,20);
    jLhora.setBounds(10,37,60,20);
    Thread th = new Thread(new Runnable() { //cria uma thread
        public void run() {
            while(true) { //roda indefinidamente
                Date data = Calendar.getInstance().getTime();
                DateFormat d = DateFormat.getDateInstance();
                DateFormat h = DateFormat.getTimeInstance();
                jLdata.setText(d.format(data));
                jLhora.setText(h.format(data));     
                
                
                try {
                    Thread.sleep(1000); //espera 1 segundo para fazer a nova evolução
                } catch(InterruptedException ex){
                }
            }
        }
    }); th.start();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLmatricula = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLdata = new javax.swing.JLabel();
        jLhora = new javax.swing.JLabel();
        jBlanche = new javax.swing.JButton();
        jBalmoco = new javax.swing.JButton();
        jLresposta = new javax.swing.JLabel();
        jBconfirmar = new javax.swing.JButton();
        jlId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLTurno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Matricula:");

        jLmatricula.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLmatricula.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jLNome.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLNome.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setText("DATA:");

        jLdata.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLdata.setText("jLabel6");

        jLhora.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        jLhora.setText("HORA");

        jBlanche.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jBlanche.setText("SOLICITAR LANCHE");
        jBlanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlancheActionPerformed(evt);
            }
        });

        jBalmoco.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jBalmoco.setText("SOLICITAR ALMOÇO");
        jBalmoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalmocoActionPerformed(evt);
            }
        });

        jLresposta.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLresposta.setForeground(new java.awt.Color(255, 0, 0));

        jBconfirmar.setText("CONFIRMAR");
        jBconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmarActionPerformed(evt);
            }
        });

        jlId.setText("jLabel2");

        jLabel2.setText("Turno:");

        jLTurno.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jBlanche, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBalmoco, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLhora)
                    .addComponent(jBconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLresposta)
                .addContainerGap(592, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jlId)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTurno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLmatricula)
                            .addComponent(jLNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(41, 41, 41)
                        .addComponent(jLdata)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jlId)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLmatricula)
                    .addComponent(jLabel5)
                    .addComponent(jLdata))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLTurno))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBalmoco, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBlanche, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLhora)
                .addGap(51, 51, 51)
                .addComponent(jLresposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBconfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(858, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBlancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlancheActionPerformed
        String complemento;
        complemento = jLresposta.getText();
        jLresposta.setText("Lanche Solicitado \n" +"; \n "+ complemento);
        jBlanche.setEnabled(false);
        lanche = true;
    }//GEN-LAST:event_jBlancheActionPerformed

    private void jBalmocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalmocoActionPerformed
        String complemento;
        complemento = jLresposta.getText();
        jLresposta.setText("Almoço Solicitado \n" +"; \n "+ complemento);
        jBalmoco.setEnabled(false);
        almoco =true;
    }//GEN-LAST:event_jBalmocoActionPerformed

    private void jBconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmarActionPerformed
       
        
        try{
        Pedido pedido = new Pedido();
        
        pedido.setAluno(alu);
        pedido.setDia(jLdata.getText());
        pedido.setHora(jLhora.getText());
        pedido.setAlmoco(almoco);
        pedido.setLanche(lanche);
        
        PedidoDAO pdao = new PedidoDAO();
        List<Pedido> listaa = pdao.Buscar(alu.getId(), pedido.getDia());
            
        if(listaa.size()<1){
        pdao.salvar(pedido);
        JOptionPane.showMessageDialog(null,jLresposta.getText() + " Confirmado" + jLhora.getText());
        }else{
         JOptionPane.showMessageDialog(null,"Pedido ja realizado NEsta data");
        
        }
        
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        LoginAluno log = new LoginAluno();
       log.setVisible(true);
       log.setExtendedState(MAXIMIZED_BOTH);
       this.dispose();
    }//GEN-LAST:event_jBconfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfirmacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfirmacao().setVisible(true);
                
                
        
            }
        });
        
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalmoco;
    private javax.swing.JButton jBconfirmar;
    private javax.swing.JButton jBlanche;
    public javax.swing.JLabel jLNome;
    public javax.swing.JLabel jLTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLdata;
    private javax.swing.JLabel jLhora;
    public javax.swing.JLabel jLmatricula;
    private javax.swing.JLabel jLresposta;
    public javax.swing.JLabel jlId;
    // End of variables declaration//GEN-END:variables
}
