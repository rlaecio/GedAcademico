package br.telas;

import br.beans.GrauBeans;
import br.persistencia.GrauDAO;
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
public class OperacaoGrau extends javax.swing.JDialog {
     int botao = 0;
    
    public OperacaoGrau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

        setLocationRelativeTo(null);
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoGrau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfGrauNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfGrauId = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnGrauIncluir = new javax.swing.JButton();
        btnGrauSalvar = new javax.swing.JButton();
        btnGrauAlterar = new javax.swing.JButton();
        btnGrauConsultar = new javax.swing.JButton();
        btnGrauExcluir = new javax.swing.JButton();
        btnGrauCancelar = new javax.swing.JButton();
        btnGrauSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grau de Titulação Academica");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfGrauNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfGrauNome.setEnabled(false);
        tfGrauNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aoSairdeNome(evt);
            }
        });

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
                "REGISTRO", "TITULACAO ACADEMICA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setIntercellSpacing(new java.awt.Dimension(3, 2));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperacaoGrau.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfGrauId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfGrauId.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfGrauId.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tfGrauId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfGrauNome, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGrauId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfGrauNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        btnGrauIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7657_64x64.png"))); // NOI18N
        btnGrauIncluir.setFocusable(false);
        btnGrauIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrauIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrauIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarIncluir(evt);
            }
        });
        jToolBar1.add(btnGrauIncluir);

        btnGrauSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7658_64x64.png"))); // NOI18N
        btnGrauSalvar.setEnabled(false);
        btnGrauSalvar.setFocusable(false);
        btnGrauSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrauSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrauSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSalvar(evt);
            }
        });
        jToolBar1.add(btnGrauSalvar);

        btnGrauAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7661_64x64.png"))); // NOI18N
        btnGrauAlterar.setEnabled(false);
        btnGrauAlterar.setFocusable(false);
        btnGrauAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrauAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrauAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });
        jToolBar1.add(btnGrauAlterar);

        btnGrauConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7670_64x64.png"))); // NOI18N
        btnGrauConsultar.setFocusable(false);
        btnGrauConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrauConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrauConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });
        jToolBar1.add(btnGrauConsultar);

        btnGrauExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7669_64x64.png"))); // NOI18N
        btnGrauExcluir.setEnabled(false);
        btnGrauExcluir.setFocusable(false);
        btnGrauExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrauExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrauExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });
        jToolBar1.add(btnGrauExcluir);

        btnGrauCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7660_64x64.png"))); // NOI18N
        btnGrauCancelar.setEnabled(false);
        btnGrauCancelar.setFocusable(false);
        btnGrauCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrauCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrauCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancela(evt);
            }
        });
        jToolBar1.add(btnGrauCancelar);

        btnGrauSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7672_64x64.png"))); // NOI18N
        btnGrauSair.setFocusable(false);
        btnGrauSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrauSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrauSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jToolBar1.add(btnGrauSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void preencherTabela() throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            GrauDAO dao = new GrauDAO();
            ArrayList<GrauBeans> listar = dao.todasGraus();
            
            for (GrauBeans area : listar) {
               modelo.addRow(new Object[] { area.getGrauId(),area.getGrauNome()} );    
            }
    }
    
    private void filtraTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            GrauDAO dao = new GrauDAO();
            ArrayList<GrauBeans> listar = dao.filtraGraus(nome);
            
            for (GrauBeans area : listar) {
               modelo.addRow(new Object[] { area.getGrauId(),area.getGrauNome()} );    
            }
    }
   
    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        dispose();
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarIncluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarIncluir
        botao = 1;
        btnGrauIncluir.setEnabled(false); btnGrauCancelar.setEnabled(true);btnGrauSalvar.setEnabled(true);             
        tfGrauNome.setEnabled(true);
        tfGrauNome.setText("");tfGrauId.setText("");tfGrauNome.requestFocus();            
    }//GEN-LAST:event_aoClicarIncluir

    private void aoClicarSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSalvar
        botao = 1;
        if (!"".equals(tfGrauNome.getText())) {                
            try {
                GrauDAO con = new GrauDAO();
                GrauBeans grau = new GrauBeans();
                grau.setGrauNome(tfGrauNome.getText());                             
                con.salvar(grau);
                JOptionPane.showMessageDialog(rootPane,"Operação concluida com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na inclusão!");
            }  
            aoClicarCancela(evt);
            try {
                preencherTabela();
            } catch (Exception ex) {
                Logger.getLogger(OperacaoGrandeArea.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_aoClicarSalvar

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
        try {
                GrauDAO con = new GrauDAO();
                GrauBeans grau = new GrauBeans();
                grau.setGrauId(Integer.parseInt(tfGrauId.getText()));               
                grau.setGrauNome(tfGrauNome.getText());                               
                con.atualizar(grau);                
                JOptionPane.showMessageDialog(rootPane,"Registro alterados com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na Alteração!");
            }  
            aoClicarCancela(evt);
    }//GEN-LAST:event_aoClicarAlterar

    private void aoClicarConsultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConsultar
        String procuraNome = JOptionPane.showInputDialog(rootPane, "Digite um nome da Grau:","Consulta",JOptionPane.QUESTION_MESSAGE);        
        if (!(procuraNome==null || procuraNome.equals(""))) {
            try {
                GrauDAO dao = new GrauDAO();                                                                     
                GrauBeans grau = dao.procurarGrau(procuraNome);                             
                btnGrauIncluir.setEnabled(false); btnGrauExcluir.setEnabled(true); 
                btnGrauCancelar.setEnabled(true); btnGrauAlterar.setEnabled(true);
                tfGrauNome.setEnabled(true);                 
                tfGrauId.setText(String.valueOf(grau.getGrauId()));
                tfGrauNome.setText(String.valueOf(grau.getGrauNome()));      
                tfGrauNome.requestFocus();
                
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
              GrauDAO con = new GrauDAO();
              GrauBeans grau = new GrauBeans();              
              grau.setGrauNome(tfGrauNome.getText());                          
              con.excluir(grau);
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
        btnGrauSalvar.setEnabled(false);btnGrauIncluir.setEnabled(true);btnGrauExcluir.setEnabled(false);
        btnGrauCancelar.setEnabled(false);btnGrauAlterar.setEnabled(false);        
        tfGrauNome.setEnabled(false); tfGrauId.setEnabled(false);    
        tfGrauNome.setText(""); tfGrauId.setText(""); 
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aoClicarCancela

    private void aoSairdeNome(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aoSairdeNome
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
    }//GEN-LAST:event_aoSairdeNome

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
         if (evt.getClickCount() == 2) {                           
            tfGrauNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString());             
            buscaDaLista(tfGrauNome.getText());
        }
        else {
            tfGrauId.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            tfGrauNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString()); 
        }         
    }//GEN-LAST:event_mouseClicked

    private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
                GrauDAO dao = new GrauDAO();                                                                     
                GrauBeans grau = dao.procurarGrau(nome);                             
                btnGrauIncluir.setEnabled(false); btnGrauExcluir.setEnabled(true); 
                btnGrauCancelar.setEnabled(true); btnGrauAlterar.setEnabled(true);
                tfGrauNome.setEnabled(true);                 
                tfGrauId.setText(String.valueOf(grau.getGrauId()));
                tfGrauNome.setText(String.valueOf(grau.getGrauNome()));      
                tfGrauNome.requestFocus();
                
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
                OperacaoGrau dialog = new OperacaoGrau(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrauAlterar;
    private javax.swing.JButton btnGrauCancelar;
    private javax.swing.JButton btnGrauConsultar;
    private javax.swing.JButton btnGrauExcluir;
    private javax.swing.JButton btnGrauIncluir;
    private javax.swing.JButton btnGrauSair;
    private javax.swing.JButton btnGrauSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfGrauId;
    private javax.swing.JTextField tfGrauNome;
    // End of variables declaration//GEN-END:variables
}
