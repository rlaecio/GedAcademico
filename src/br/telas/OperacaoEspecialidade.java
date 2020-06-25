package br.telas;

import br.beans.EspecialidadeBeans;
import br.persistencia.EspecialidadeDAO;
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
public class OperacaoEspecialidade extends javax.swing.JDialog {
    int botao = 0;
    public OperacaoEspecialidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tfEspecialidadeId.setVisible(false);

        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        
        setLocationRelativeTo(null);
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoEspecialidade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnEspecialidadeIncluir = new javax.swing.JButton();
        btnEspecialidadeSalvar = new javax.swing.JButton();
        btnEspecialidadeAlterar = new javax.swing.JButton();
        btnEspecialidadeConsultar = new javax.swing.JButton();
        btnEspecialidadeExcluir = new javax.swing.JButton();
        btnEspecialidadeCancelar = new javax.swing.JButton();
        btnEspecialidadeSair = new javax.swing.JButton();
        tfEspecialidadeId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfEspecialidadeNome = new javax.swing.JTextField();
        ftfEspecialidadeCodigo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Especialidades  (CNPq)");
        setResizable(false);

        jToolBar1.setRollover(true);

        btnEspecialidadeIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7657_64x64.png"))); // NOI18N
        btnEspecialidadeIncluir.setFocusable(false);
        btnEspecialidadeIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialidadeIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialidadeIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarInserir(evt);
            }
        });
        jToolBar1.add(btnEspecialidadeIncluir);

        btnEspecialidadeSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7658_64x64.png"))); // NOI18N
        btnEspecialidadeSalvar.setEnabled(false);
        btnEspecialidadeSalvar.setFocusable(false);
        btnEspecialidadeSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialidadeSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialidadeSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSalvar(evt);
            }
        });
        jToolBar1.add(btnEspecialidadeSalvar);

        btnEspecialidadeAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7661_64x64.png"))); // NOI18N
        btnEspecialidadeAlterar.setEnabled(false);
        btnEspecialidadeAlterar.setFocusable(false);
        btnEspecialidadeAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialidadeAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialidadeAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });
        jToolBar1.add(btnEspecialidadeAlterar);

        btnEspecialidadeConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7670_64x64.png"))); // NOI18N
        btnEspecialidadeConsultar.setFocusable(false);
        btnEspecialidadeConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialidadeConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialidadeConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });
        jToolBar1.add(btnEspecialidadeConsultar);

        btnEspecialidadeExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7669_64x64.png"))); // NOI18N
        btnEspecialidadeExcluir.setEnabled(false);
        btnEspecialidadeExcluir.setFocusable(false);
        btnEspecialidadeExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialidadeExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialidadeExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });
        jToolBar1.add(btnEspecialidadeExcluir);

        btnEspecialidadeCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7660_64x64.png"))); // NOI18N
        btnEspecialidadeCancelar.setEnabled(false);
        btnEspecialidadeCancelar.setFocusable(false);
        btnEspecialidadeCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialidadeCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialidadeCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancela(evt);
            }
        });
        jToolBar1.add(btnEspecialidadeCancelar);

        btnEspecialidadeSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7672_64x64.png"))); // NOI18N
        btnEspecialidadeSair.setFocusable(false);
        btnEspecialidadeSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEspecialidadeSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEspecialidadeSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jToolBar1.add(btnEspecialidadeSair);

        tfEspecialidadeId.setBorder(null);
        tfEspecialidadeId.setEnabled(false);
        jToolBar1.add(tfEspecialidadeId);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

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
                "CODIGO CNPq", "ESPECIALIDADE"
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
                OperacaoEspecialidade.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfEspecialidadeNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfEspecialidadeNome.setEnabled(false);
        tfEspecialidadeNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aoSairdoNome(evt);
            }
        });

        ftfEspecialidadeCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ftfEspecialidadeCodigo.setColumns(14);
        try {
            ftfEspecialidadeCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.##.##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfEspecialidadeCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftfEspecialidadeCodigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ftfEspecialidadeCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEspecialidadeNome, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEspecialidadeNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfEspecialidadeCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
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
            EspecialidadeDAO dao = new EspecialidadeDAO();
            ArrayList<EspecialidadeBeans> listar = dao.todasEspecialidades();
            
            for (EspecialidadeBeans especialidade : listar) {
               modelo.addRow(new Object[] { especialidade.getEspecialidadeCodigo(),especialidade.getEspecialidadeNome()} );    
            }
    }
    
    private void filtraTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            EspecialidadeDAO dao = new EspecialidadeDAO();
            ArrayList<EspecialidadeBeans> listar = dao.filtrarEspecialidades(nome);
            
            for (EspecialidadeBeans especialidade : listar) {
               modelo.addRow(new Object[] { especialidade.getEspecialidadeCodigo(),especialidade.getEspecialidadeNome()} );    
            }
    }
    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        dispose();
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarInserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarInserir
        botao = 1;
        btnEspecialidadeIncluir.setEnabled(false); btnEspecialidadeCancelar.setEnabled(true);btnEspecialidadeSalvar.setEnabled(true);             
        ftfEspecialidadeCodigo.setEnabled(true);tfEspecialidadeNome.setEnabled(true); 
        ftfEspecialidadeCodigo.requestFocus(); ftfEspecialidadeCodigo.setText("");tfEspecialidadeNome.setText("");            
    }//GEN-LAST:event_aoClicarInserir

    private void aoClicarSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSalvar
         botao = 1;
        if (!"".equals(ftfEspecialidadeCodigo.getText()) && !"".equals(tfEspecialidadeNome.getText())) {                
            try {
                EspecialidadeDAO con = new EspecialidadeDAO();
                EspecialidadeBeans especialidade = new EspecialidadeBeans();
                especialidade.setEspecialidadeNome(tfEspecialidadeNome.getText());
                especialidade.setEspecialidadeCodigo(ftfEspecialidadeCodigo.getText());               
                con.salvar(especialidade);
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
                EspecialidadeDAO con = new EspecialidadeDAO();
                EspecialidadeBeans especialidade = new EspecialidadeBeans();
                especialidade.setEspecialidadeId(Integer.parseInt(tfEspecialidadeId.getText()));               
                especialidade.setEspecialidadeNome(tfEspecialidadeNome.getText());
                especialidade.setEspecialidadeCodigo(ftfEspecialidadeCodigo.getText());                
                con.atualizar(especialidade);                
                JOptionPane.showMessageDialog(rootPane,"Registro alterados com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na Alteração!");
            }  
            aoClicarCancela(evt);
    }//GEN-LAST:event_aoClicarAlterar

    private void aoClicarConsultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConsultar
        String procuraNome = JOptionPane.showInputDialog(rootPane, "Digite um nome da Area:","Consulta",JOptionPane.QUESTION_MESSAGE);        
        if (!(procuraNome==null || procuraNome.equals(""))) {
            try {
                EspecialidadeDAO dao = new EspecialidadeDAO();                                                                     
                EspecialidadeBeans especialidade = dao.procurarEspecialidade(procuraNome);
                btnEspecialidadeIncluir.setEnabled(false); btnEspecialidadeExcluir.setEnabled(true); 
                btnEspecialidadeCancelar.setEnabled(true); btnEspecialidadeConsultar.setEnabled(true);
                ftfEspecialidadeCodigo.setEnabled(true); tfEspecialidadeNome.setEnabled(true);                
                ftfEspecialidadeCodigo.setText(String.valueOf(especialidade.getEspecialidadeCodigo()));
                tfEspecialidadeNome.setText(String.valueOf(especialidade.getEspecialidadeNome()));                
                tfEspecialidadeId.setText(String.valueOf(especialidade.getEspecialidadeId()));     
                ftfEspecialidadeCodigo.requestFocus();
                
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
              EspecialidadeDAO con = new EspecialidadeDAO();
              EspecialidadeBeans especilidade = new EspecialidadeBeans();              
              especilidade.setEspecialidadeNome(tfEspecialidadeNome.getText());                          
              con.excluir(especilidade);
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
        btnEspecialidadeSalvar.setEnabled(false);btnEspecialidadeIncluir.setEnabled(true);btnEspecialidadeExcluir.setEnabled(false);
        btnEspecialidadeCancelar.setEnabled(false);btnEspecialidadeAlterar.setEnabled(false);        
        ftfEspecialidadeCodigo.setText(""); tfEspecialidadeNome.setText(""); 
        ftfEspecialidadeCodigo.setEnabled(false); tfEspecialidadeNome.setEnabled(false);   
        
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aoClicarCancela

    private void aoSairdoNome(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aoSairdoNome
         if (botao == 1) {
            aoClicarSalvar(null);
            int resp = JOptionPane.showConfirmDialog(rootPane, "Cadastrar outro?","Confirmação",JOptionPane.OK_CANCEL_OPTION);
            if (resp==0) {
                aoClicarInserir(null);
            }
            else {
                aoClicarCancela(null);
            }
        }
    }//GEN-LAST:event_aoSairdoNome

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        if (evt.getClickCount() == 2) {                           
            tfEspecialidadeNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString());             
            buscaDaLista(tfEspecialidadeNome.getText());
        }
        else {
            ftfEspecialidadeCodigo.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            tfEspecialidadeNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString()); 
        }    
    }//GEN-LAST:event_mouseClicked

     private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
                EspecialidadeDAO dao = new EspecialidadeDAO();                                                                     
                EspecialidadeBeans especialidade = dao.procurarEspecialidade(nome);
                btnEspecialidadeIncluir.setEnabled(false); btnEspecialidadeExcluir.setEnabled(true); 
                btnEspecialidadeCancelar.setEnabled(true); btnEspecialidadeConsultar.setEnabled(true);
                ftfEspecialidadeCodigo.setEnabled(true); tfEspecialidadeNome.setEnabled(true);                
                ftfEspecialidadeCodigo.setText(String.valueOf(especialidade.getEspecialidadeCodigo()));
                tfEspecialidadeNome.setText(String.valueOf(especialidade.getEspecialidadeNome()));                
                tfEspecialidadeId.setText(String.valueOf(especialidade.getEspecialidadeId()));     
                ftfEspecialidadeCodigo.requestFocus();
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
                OperacaoEspecialidade dialog = new OperacaoEspecialidade(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEspecialidadeAlterar;
    private javax.swing.JButton btnEspecialidadeCancelar;
    private javax.swing.JButton btnEspecialidadeConsultar;
    private javax.swing.JButton btnEspecialidadeExcluir;
    private javax.swing.JButton btnEspecialidadeIncluir;
    private javax.swing.JButton btnEspecialidadeSair;
    private javax.swing.JButton btnEspecialidadeSalvar;
    private javax.swing.JFormattedTextField ftfEspecialidadeCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfEspecialidadeId;
    private javax.swing.JTextField tfEspecialidadeNome;
    // End of variables declaration//GEN-END:variables
}
