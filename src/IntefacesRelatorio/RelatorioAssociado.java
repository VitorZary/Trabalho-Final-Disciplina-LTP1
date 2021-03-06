/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntefacesRelatorio;

import Classes.Titular;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TURUGO
 */
public class RelatorioAssociado extends javax.swing.JFrame {
    /**
     * Creates new form Relatorio
     */
    public RelatorioAssociado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableRelatorio = new javax.swing.JTable();
        lblRelatorio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Telefone", "Estado", "Cidade", "Bairro", "Rua", "Numero", "Complemento", "Status"
            }
        ));
        jScrollPane1.setViewportView(tableRelatorio);

        lblRelatorio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/printer.png"))); // NOI18N
        lblRelatorio.setText("Relatório XXX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblRelatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblRelatorio)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RelatorioAssociado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioAssociado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioAssociado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioAssociado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioAssociado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRelatorio;
    private javax.swing.JTable tableRelatorio;
    // End of variables declaration//GEN-END:variables
    
    public void recebendo(boolean opcao){
        DefaultTableModel dtm = (DefaultTableModel) tableRelatorio.getModel();
        String status;
        
        if(opcao==true){
            lblRelatorio.setText("Relatório Cadastros Ativos");
            for (int i = 0; i < Titular.titular.size(); i++) {
            
                if(Titular.titular.get(i).isQuitacao()==true){
                    status = "Adimplente";
                }else{
                    status = "Inadimplente";
                }
                if(Titular.titular.get(i).isSituacao()==true){
                    dtm.addRow(new Object[]{Titular.titular.get(i).getNome(),Titular.titular.get(i).getCpf(),
                    Titular.titular.get(i).getTelefone(), Titular.titular.get(i).getEstado(), Titular.titular.get(i).getCidade(),
                    Titular.titular.get(i).getBairro(), Titular.titular.get(i).getRua(),
                    Titular.titular.get(i).getNumero(), Titular.titular.get(i).getComplemento(), status});
                }
                
            }
        }else{
            lblRelatorio.setText("Relatório Inadimplentes");
            for (int i = 0; i < Titular.titular.size(); i++) {
                if(Titular.titular.get(i).isQuitacao()==false&&
                   Titular.titular.get(i).isSituacao()==true){
                    status = "Inadimplente";
                    
                    dtm.addRow(new Object[]{Titular.titular.get(i).getNome(),Titular.titular.get(i).getCpf(),
                    Titular.titular.get(i).getTelefone(), Titular.titular.get(i).getEstado(), Titular.titular.get(i).getCidade(),
                    Titular.titular.get(i).getBairro(), Titular.titular.get(i).getRua(),
                    Titular.titular.get(i).getNumero(), Titular.titular.get(i).getComplemento(), status
                    });
                }

            }
        }
        
        
    }


}
