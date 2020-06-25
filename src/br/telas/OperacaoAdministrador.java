package br.telas;

import br.beans.AdministradorBeans;
import br.persistencia.AdministradorDAO;
import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rlaecio
 */
public class OperacaoAdministrador extends javax.swing.JDialog {
    int botao = 0;
    public OperacaoAdministrador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        tfAdminId.setVisible(false);
        
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoAdministrador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfAdminNome = new javax.swing.JTextField();
        tfAdminLogon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pfAdminSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAdminIncluir = new javax.swing.JButton();
        btnAdminSalvar = new javax.swing.JButton();
        btnAdminAlterar = new javax.swing.JButton();
        btnAdminConsultar = new javax.swing.JButton();
        btnAdminExcluir = new javax.swing.JButton();
        btnAdminCancelar = new javax.swing.JButton();
        btnAdminSair = new javax.swing.JButton();
        tfAdminId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administradores");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfAdminNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfAdminNome.setEnabled(false);

        tfAdminLogon.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfAdminLogon.setEnabled(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NOME DO USUARIO", "LOGON"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setIntercellSpacing(new java.awt.Dimension(3, 2));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperacaoAdministrador.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        pfAdminSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pfAdminSenha.setEnabled(false);
        pfAdminSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aoSairdeSenha(evt);
            }
        });

        jLabel1.setText(" Nome do Usuario ");

        jLabel2.setText("Logon");

        jLabel3.setText("Senha do Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addComponent(tfAdminLogon, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(pfAdminSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3))))
                    .addComponent(tfAdminNome, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfAdminNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfAdminLogon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pfAdminSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jToolBar1.setRollover(true);

        btnAdminIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7657_64x64.png"))); // NOI18N
        btnAdminIncluir.setFocusable(false);
        btnAdminIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarIncluir(evt);
            }
        });
        jToolBar1.add(btnAdminIncluir);

        btnAdminSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7658_64x64.png"))); // NOI18N
        btnAdminSalvar.setEnabled(false);
        btnAdminSalvar.setFocusable(false);
        btnAdminSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSalvar(evt);
            }
        });
        jToolBar1.add(btnAdminSalvar);

        btnAdminAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7661_64x64.png"))); // NOI18N
        btnAdminAlterar.setEnabled(false);
        btnAdminAlterar.setFocusable(false);
        btnAdminAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });
        jToolBar1.add(btnAdminAlterar);

        btnAdminConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7670_64x64.png"))); // NOI18N
        btnAdminConsultar.setFocusable(false);
        btnAdminConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });
        jToolBar1.add(btnAdminConsultar);

        btnAdminExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7669_64x64.png"))); // NOI18N
        btnAdminExcluir.setEnabled(false);
        btnAdminExcluir.setFocusable(false);
        btnAdminExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });
        jToolBar1.add(btnAdminExcluir);

        btnAdminCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7660_64x64.png"))); // NOI18N
        btnAdminCancelar.setEnabled(false);
        btnAdminCancelar.setFocusable(false);
        btnAdminCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancela(evt);
            }
        });
        jToolBar1.add(btnAdminCancelar);

        btnAdminSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7672_64x64.png"))); // NOI18N
        btnAdminSair.setFocusable(false);
        btnAdminSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jToolBar1.add(btnAdminSair);

        tfAdminId.setBorder(null);
        tfAdminId.setEnabled(false);
        jToolBar1.add(tfAdminId);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela() throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            AdministradorDAO dao = new AdministradorDAO();
            ArrayList<AdministradorBeans> listar = dao.todosAdministradores();            
            for (AdministradorBeans admin : listar) {
               modelo.addRow(new Object[] {admin.getAdmNome(),admin.getAdmLogon()} );    
            }
    }
    private void filtraTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            AdministradorDAO dao = new AdministradorDAO();
            ArrayList<AdministradorBeans> listar = dao.listarAdministradores(nome);            
            for (AdministradorBeans admin : listar) {
               modelo.addRow(new Object[] {admin.getAdmNome(),admin.getAdmLogon()} );    
            }
    }
    
    
    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        dispose();
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarIncluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarIncluir
        botao = 1;
        btnAdminIncluir.setEnabled(false); btnAdminCancelar.setEnabled(true);btnAdminSalvar.setEnabled(true);             
        tfAdminNome.setEnabled(true);tfAdminLogon.setEnabled(true);pfAdminSenha.setEnabled(true);
        tfAdminNome.setText("");tfAdminLogon.setText("");
        pfAdminSenha.setText("");tfAdminNome.requestFocus();            
    }//GEN-LAST:event_aoClicarIncluir

    private void aoClicarSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSalvar
        botao = 1;
        if (!"".equals(tfAdminNome.getText()) && !"".equals(tfAdminLogon.getText())) {                
            try {
                AdministradorDAO con = new AdministradorDAO();
                AdministradorBeans admin = new AdministradorBeans();
                admin.setAdmNome(tfAdminNome.getText());
                admin.setAdmLogon(tfAdminId.getText()); 
                admin.setAdmLogon(tfAdminLogon.getText());
                admin.setAdmSenha(pfAdminSenha.getToolTipText());
                con.salvar(admin);
                JOptionPane.showMessageDialog(rootPane,"Operação concluida com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na inclusão!");
            }  
            aoClicarCancela(evt);
            try {
                preencherTabela();
            } catch (Exception ex) {
                Logger.getLogger(OperacaoAdministrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_aoClicarSalvar

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
        try {
                AdministradorDAO con = new AdministradorDAO();
                AdministradorBeans admin = new AdministradorBeans();
                admin.setAdmId(Integer.parseInt(tfAdminId.getText()));               
                admin.setAdmNome(tfAdminNome.getText());
                admin.setAdmLogon(tfAdminLogon.getText());                                
                admin.setAdmSenha(pfAdminSenha.getToolTipText());
                con.atualizar(admin);                
                JOptionPane.showMessageDialog(rootPane,"Registro alterados com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na Alteração!");
            }  
            aoClicarCancela(evt);
    }//GEN-LAST:event_aoClicarAlterar

    private void aoClicarConsultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConsultar
        String procuraNome = JOptionPane.showInputDialog(rootPane, "Digite um nome do Admin:","Consulta",JOptionPane.QUESTION_MESSAGE);        
        if (!(procuraNome==null || procuraNome.equals(""))) {
            try {
                AdministradorDAO dao = new AdministradorDAO();                                                                     
                AdministradorBeans admin = dao.procurarAdministradores(procuraNome);                             
                btnAdminIncluir.setEnabled(false); btnAdminExcluir.setEnabled(true); 
                btnAdminCancelar.setEnabled(true); btnAdminAlterar.setEnabled(true);
                tfAdminNome.setEnabled(true); tfAdminLogon.setEnabled(true);pfAdminSenha.setEnabled(true);               
                tfAdminId.setText(String.valueOf(admin.getAdmId()));
                tfAdminLogon.setText(String.valueOf(admin.getAdmLogon()));                
                tfAdminNome.setText(String.valueOf(admin.getAdmNome()));
                pfAdminSenha.setText(String.valueOf(admin.getAdmSenha()));                   
                
                filtraTabela(procuraNome);
            } catch (Exception e) {                       
            }
        }        
    }//GEN-LAST:event_aoClicarConsultar

    private void aoClicarExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarExcluir
        int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir","Exclusão", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if (resp==0)
        {        
        try {
              AdministradorDAO con = new AdministradorDAO();
              AdministradorBeans admin = new AdministradorBeans();              
              admin.setAdmNome(tfAdminNome.getText());                          
              con.excluir(admin);
              JOptionPane.showMessageDialog(rootPane,"Operação concluida com sucesso!");                                
              aoClicarCancela(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro!");
        }
        aoClicarCancela(evt);
        }
    }//GEN-LAST:event_aoClicarExcluir

    private void aoClicarCancela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarCancela
        botao = 5;        
        btnAdminSalvar.setEnabled(false);btnAdminIncluir.setEnabled(true);btnAdminExcluir.setEnabled(false);
        btnAdminCancelar.setEnabled(false);btnAdminAlterar.setEnabled(false);        
        tfAdminLogon.setEnabled(false); tfAdminNome.setEnabled(false); pfAdminSenha.setEnabled(false);
        tfAdminLogon.setText(""); tfAdminNome.setText(""); pfAdminSenha.setEnabled(false);
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aoClicarCancela

    private void aoSairdeSenha(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aoSairdeSenha
        if (botao == 1) {
            aoClicarSalvar(null);
            int resp = JOptionPane.showConfirmDialog(rootPane, "Cadastrar outro?","Confirmação",JOptionPane.OK_CANCEL_OPTION);
            if (resp==0) {
                aoClicarIncluir(null);
            }
            else {
                aoClicarCancela(null);
            }
        }
    }//GEN-LAST:event_aoSairdeSenha

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
         if (evt.getClickCount() == 2) {                 
            tfAdminNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            buscaDaLista(tfAdminNome.getText());              
        }
        else {
            tfAdminNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            tfAdminLogon.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString()); 
        }         
    }//GEN-LAST:event_mouseClicked
    
    private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
                AdministradorDAO dao = new AdministradorDAO();                                                                     
                AdministradorBeans admin = dao.procurarAdministradores(nome);                             
                btnAdminIncluir.setEnabled(false); btnAdminExcluir.setEnabled(true); 
                btnAdminCancelar.setEnabled(true); btnAdminAlterar.setEnabled(true);
                tfAdminNome.setEnabled(true); tfAdminLogon.setEnabled(true);pfAdminSenha.setEnabled(true);               
                tfAdminId.setText(String.valueOf(admin.getAdmId()));
                tfAdminLogon.setText(String.valueOf(admin.getAdmLogon()));                
                tfAdminNome.setText(String.valueOf(admin.getAdmNome()));
                pfAdminSenha.setText(String.valueOf(admin.getAdmSenha()));                                                 
                tfAdminNome.requestFocus();
                
            } catch (Exception e) {                       
            }
        }        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Bloco LookAndFeel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Não foi possivel alterar a L&F");
        }
        //Fim do bloco de look */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                OperacaoAdministrador dialog = new OperacaoAdministrador(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAlterar;
    private javax.swing.JButton btnAdminCancelar;
    private javax.swing.JButton btnAdminConsultar;
    private javax.swing.JButton btnAdminExcluir;
    private javax.swing.JButton btnAdminIncluir;
    private javax.swing.JButton btnAdminSair;
    private javax.swing.JButton btnAdminSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPasswordField pfAdminSenha;
    private javax.swing.JTextField tfAdminId;
    private javax.swing.JTextField tfAdminLogon;
    private javax.swing.JTextField tfAdminNome;
    // End of variables declaration//GEN-END:variables
}
