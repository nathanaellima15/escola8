/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.escola8.visao;
import com.mycompany.escola8.entits.Professor8;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ProfessorF8 extends javax.swing.JFrame {

    /**
     * Creates new form alunoF8
     */
    private void resetCamps(boolean flag){
        txtName.setEnabled(flag);
        txtSexo.setEnabled(flag);
        txtIdade.setEnabled(flag);
        txtCpf.setEnabled(flag); 
        
        if (!flag){

            txtName.setText("");
            txtSexo.setText("");
            txtIdade.setText("");  
            txtCpf.setText("");
        }
    }
    private ArrayList<Professor8> lista;
    private int indiceDeEdicao;
    private int NewOrEdit;
    public ProfessorF8() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        lista = new ArrayList<>();
        indiceDeEdicao = -1;
        this.resetCamps(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btNew = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        btEdit = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        btClean = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btNew.setText("New");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setText("Cadastrar Professor");

        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btClean.setText("Clean");
        btClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCleanActionPerformed(evt);
            }
        });

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        btSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btSaveKeyPressed(evt);
            }
        });

        jLabel2.setText("Name");

        txtName.setText(" ");
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        jLabel3.setText("Sexo");

        txtSexo.setText(" ");
        txtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSexoKeyReleased(evt);
            }
        });

        jLabel4.setText("idade");

        txtIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdadeKeyReleased(evt);
            }
        });

        jLabel5.setText("CPF");

        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btNew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btClean)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSave))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtName)))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancel)
                    .addComponent(btEdit)
                    .addComponent(btClean)
                    .addComponent(btSave)
                    .addComponent(btNew))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15))
        );

        Result.setColumns(20);
        Result.setRows(5);
        jScrollPane1.setViewportView(Result);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        this.resetCamps(true);
        txtName.requestFocus();
        
    }//GEN-LAST:event_btNewActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        this.resetCamps(false);
        
    }//GEN-LAST:event_btCancelActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        Professor8 a = this.copiarCamposParaLista();
        int b = 0;
        String nome = txtName.getText();
        if (nome.isEmpty()) {
          JOptionPane.showMessageDialog(null, "Campo 'Nome' não pode estar vazio.");
          b = 1;
          return; // Retorna sem prosseguir, aguardando que o usuário corrija o campo
          
        }
        a.setNome(nome);
        // Validação do campo "sexo"
        String sexo = txtSexo.getText();
        if (sexo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo 'Sexo' não pode estar vazio.");
            b = 1;
            return;
        }
        char sexoChar = sexo.charAt(0); // Obtém o primeiro caractere do campo
        a.setSexo(sexoChar);
        // Validação do campo "idade"
        String idadeStr = txtIdade.getText();
        if (idadeStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo 'Idade' não pode estar vazio.");
            b = 1;
            return;
        }
        try {
        int idade = Integer.parseInt(idadeStr);
        if (idade < 0) {
            JOptionPane.showMessageDialog(null, "Campo 'Idade' deve ser um valor positivo.");
            b = 1;
            return;
        }
        if (idade > 120) {
            JOptionPane.showMessageDialog(null, "Campo 'Idade' deve ser de alguem vivo");
            b = 1;
            return;
        }
        a.setIdade(idade);
        } catch (NumberFormatException e) {
              JOptionPane.showMessageDialog(null, "Campo 'Idade' deve ser um número inteiro válido.");
              b = 1;
              return;
        }
        String cpfStr = txtCpf.getText();
        if (cpfStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo 'Cpf' não pode estar vazio.");
            b = 1;
            return;
        }
        try {
             a.setCpf(cpfStr);
        } catch (IllegalArgumentException e) {
             JOptionPane.showMessageDialog(null, "Campo 'CPF' deve conter apenas números.");
             b =1;
             return;
        }
        if (cpfStr.length() != 11) {
            JOptionPane.showMessageDialog(null, "Cpf Invalido.");
            b = 1 ;
            return;
        }
        
        if (NewOrEdit==0){
            if (b==0){ 
                this.lista.add(a);
            }
        }else if(NewOrEdit ==1){
            Professor8 c = this.lista.get(indiceDeEdicao);
            c.setNome(a.getNome());
            c.setSexo(a.getSexo());
            c.setIdade(a.getIdade());
            c.setCpf(a.getCpf());
        }
        
        Result.setText(this.mostrarlista()); //mostra o resultado
        this.resetCamps(false); 
    }//GEN-LAST:event_btSaveActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER){
            txtSexo.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtSexoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyReleased
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER){
            txtIdade.requestFocus();
        } 
    }//GEN-LAST:event_txtSexoKeyReleased

    private void txtIdadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdadeKeyReleased
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER){
            txtCpf.requestFocus();
        }
    }//GEN-LAST:event_txtIdadeKeyReleased

    private void txtCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyReleased
        if(evt.getKeyChar() == java.awt.event.KeyEvent.VK_ENTER){
            btSave.requestFocus();
        }
    }//GEN-LAST:event_txtCpfKeyReleased

    private void btSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btSaveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSaveKeyPressed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        this.NewOrEdit = 1;
        
        String cpfInformado = JOptionPane.showInputDialog("Informe o Professor a ser editado", "<informe o cpf>");
        indiceDeEdicao = this.pesquisarAluno(cpfInformado);
        
        this.copiarDaListaParaCampos(indiceDeEdicao);
        this.resetCamps(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btEditActionPerformed

    private void btCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCleanActionPerformed
        String cpfInformado = JOptionPane.showInputDialog("Informe o Professor a ser excluido", "<informe o cpf>");

        int index = this.pesquisarAluno(cpfInformado);
        this.lista.remove(index);

        Result.setText(this.mostrarlista());
        this.resetCamps(false);
// TODO add your handling code here:
    }//GEN-LAST:event_btCleanActionPerformed

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
            java.util.logging.Logger.getLogger(ProfessorF8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorF8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorF8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorF8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorF8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Result;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btClean;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
    private String mostrarlista() {
        String listaCompleta = "";
        for (int i=0; i <= lista.size()-1; i++){
            Professor8 aux = lista.get(i);
            listaCompleta = listaCompleta + aux.toString();
        }
        return listaCompleta;
    }

    private int pesquisarAluno(String cpfInformado) {
        for (int i=0; i<= this.lista.size()-1;i++){
            if (this.lista.get(i).getCpf().equals(cpfInformado)){
                return i;
            }
        }
        return -1;
    }

    private void copiarDaListaParaCampos(int index) {
        Professor8 a = this.lista.get(index);
        txtName.setText(a.getNome());
        txtSexo.setText(a.getSexo()+"");
        txtIdade.setText(a.getIdade()+"");
        txtCpf.setText(a.getCpf());
    }

    public Professor8 copiarCamposParaLista() {
        Professor8 a = new Professor8();
        a.setNome(txtName.getText());
        a.setSexo(txtSexo.getText().charAt(0));

        //Testa se o campo idade foi preenchido
        String idadeLida = txtIdade.getText();
        if (!idadeLida.isEmpty()) {
            int aux = Integer.parseInt(idadeLida);
            a.setIdade(aux);
        } else {
            JOptionPane.showMessageDialog(this, "Campo Idade obrigatório. ");
        }

        a.setCpf(txtCpf.getText());
        return a;
    }
    

}
