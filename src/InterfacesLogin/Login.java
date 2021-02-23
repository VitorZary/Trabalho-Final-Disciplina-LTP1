/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesLogin;

import Classes.Dependente;
import Classes.Titular;
import Classes.Usuario;
import OutrasInterfaces.JanelaPrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TURUGO
 */
public class Login extends javax.swing.JFrame {
    private char senha;
    /**
     * Creates new form JanelaPrincipal
     */
    public Login() {
        initComponents();
        
        senha = txtPassSenha.getEchoChar();
        
        Usuario usuario = new Usuario();
        usuario.cadastrar("usuario", "123senha", "usuario");
        Usuario.usuario.add(usuario);
        
        Dependente dependente1 = new Dependente();
        dependente1.cadastrar("Maria", "MG", "Arinos", "Centro", "Rua Peixoto", 1212,
                              "Casa", "99980300", "25958037005", true);
        Dependente.listaDep.add(dependente1);
        
        Dependente dependente2 = new Dependente();
        dependente2.cadastrar("Paulo", "", "", "", "", 0,
                              "", "997475492", "25958037004", false);
        Dependente.listaDep.add(dependente2);
        
        Dependente dependente3 = new Dependente();
        dependente3.cadastrar("Amanda", "", "", "", "", 0,
                              "", "991451245", "72154230008", false);
        Dependente.listaDep.add(dependente3);
        
        Dependente dependente4 = new Dependente();
        dependente4.cadastrar("Matheus", "MG", "Buritis", "Veredas", "Rua Limões", 154,
                              "ap2", "99456123784", "25958037003", true);
        Dependente.listaDep.add(dependente4);
        
        Dependente dependente5 = new Dependente();
        dependente5.cadastrar("Enzo", "", "", "", "", 0,
                              "", "998213456", "81811465064", false);
        Dependente.listaDep.add(dependente5);

        
        ArrayList<Integer> codDependente1 = new ArrayList<>();
        codDependente1.add(2);
        codDependente1.add(3);
        codDependente1.add(5);
        
        Titular titular1 = new Titular();
        titular1.cadastrar("Vitor", "MG", "Arinos", "Centro", "Rua Peixoto", 777, "Casa",
                            "999542332", "15468712355", codDependente1);
        Titular.titular.add(titular1);
        
        
        ArrayList<Integer> codDependente2 = new ArrayList<>();
        codDependente2.add(1);
        codDependente2.add(4);
        Titular titular2 = new Titular();
        titular2.cadastrar("Paulo", "MG", "Buritis", "Planalto", "Av Santos", 145, "Casa",
                            "998746213", "56412347892", codDependente2);
        Titular.titular.add(titular2);
        
        
        ArrayList<Integer> codDependente = new ArrayList<>();
        Titular titular3 = new Titular();
        titular3.cadastrar("Ana", "MG", "Unai", "Alvorada", "Rua Floriano Lima", 1456, "Ap 3",
                            "99916299", "89403457031", codDependente);
        Titular.titular.add(titular3);
        
        Titular titular4 = new Titular();
        titular4.cadastrar("Rafaela", "MG", "Urucuia", "Veredas", "Rua Matos", 785, "Casa",
                            "99988617", "53523487099", codDependente);
        Titular.titular.add(titular4);
        
        Titular titular5 = new Titular();
        titular5.cadastrar("Fernanda", "MG", "Arinos", "Canaã", "Rua Ameixas", 245, "Casa",
                            "99361517", "92196158003", codDependente);
        Titular.titular.add(titular5);
        
        Titular titular6 = new Titular();
        titular6.cadastrar("Gilberto", "MG", "Arinos", "Centro", "Rua Pedro Valadares", 321, "Ap 2",
                            "99788242", "43843242003", codDependente);
        Titular.titular.add(titular6);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        txtPassSenha = new javax.swing.JPasswordField();
        checkboxMostrarS = new javax.swing.JCheckBox();
        lblMostrarsenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/identificador.png"))); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/senha.png"))); // NOI18N
        jLabel4.setText("Senha:");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        txtPassSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassSenhaActionPerformed(evt);
            }
        });

        checkboxMostrarS.setText("Mostrar Senha");
        checkboxMostrarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxMostrarSActionPerformed(evt);
            }
        });

        lblMostrarsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exibirSenha.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassSenha)
                            .addComponent(txtUsuario)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMostrarsenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxMostrarS))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 177, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOk)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkboxMostrarS)
                            .addComponent(lblMostrarsenha))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void login(){
        boolean achou = false;
        
        String sEnha = new String(txtPassSenha.getPassword());
        
        for(int i = 0; i < Usuario.usuario.size(); i++){
            if((txtUsuario.getText().equals(Usuario.usuario.get(i).getLogin())==true)&&
               (sEnha.equals(Usuario.usuario.get(i).getSenha())==true)){
               achou = true;
            } 
        }
        
        if(achou==false){
            JOptionPane.showMessageDialog(this, "Usuário e/ou Senha NÃO ENCONTRADO(S)!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else{
            JanelaPrincipal janelaPrivada = new JanelaPrincipal();
            janelaPrivada.setVisible(true);
            this.dispose(); 
        }
        
    }
    
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        login();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        login();
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtPassSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassSenhaActionPerformed
        login();
    }//GEN-LAST:event_txtPassSenhaActionPerformed

    private void checkboxMostrarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxMostrarSActionPerformed
        if (checkboxMostrarS.isSelected()){
            txtPassSenha.setEchoChar('\u0000');
            lblMostrarsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ocultarSenha.png")));
        }else{
            txtPassSenha.setEchoChar(senha);
            lblMostrarsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/exibirSenha.png")));
        }
    }//GEN-LAST:event_checkboxMostrarSActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox checkboxMostrarS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblMostrarsenha;
    private javax.swing.JPasswordField txtPassSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
