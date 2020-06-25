package br.telas;

import br.beans.CategoriaBeans;
import br.persistencia.CategoriaDAO;
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
public class OperacaoCategoria extends javax.swing.JDialog {
    int botao = 0;

    public OperacaoCategoria(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();    
        tfCategoriaId.setVisible(false);
        
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        
        setLocationRelativeTo(null);
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfCategoriaNome = new javax.swing.JTextField();
        ftfCategoriaCodigo = new javax.swing.JFormattedTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnCategoriaIncluir = new javax.swing.JButton();
        btnCategoriaSalvar = new javax.swing.JButton();
        btnCategoriaAlterar = new javax.swing.JButton();
        btnCategoriaConsultar = new javax.swing.JButton();
        btnCategoriaExcluir = new javax.swing.JButton();
        btnCategoriaCancelar = new javax.swing.JButton();
        btnCategoriaSair = new javax.swing.JButton();
        tfCategoriaId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sub-Area de Conhecimento (CNPq)");
        setResizable(false);

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
                "CODIGO CNPq", "SUB AREA DO CONHECIMENTO"
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
                OperacaoCategoria.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfCategoriaNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfCategoriaNome.setEnabled(false);
        tfCategoriaNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aoSairdoNome(evt);
            }
        });

        ftfCategoriaCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ftfCategoriaCodigo.setColumns(14);
        try {
            ftfCategoriaCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.##.##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCategoriaCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftfCategoriaCodigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ftfCategoriaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfCategoriaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCategoriaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfCategoriaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        btnCategoriaIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7657_64x64.png"))); // NOI18N
        btnCategoriaIncluir.setFocusable(false);
        btnCategoriaIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoriaIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarInserir(evt);
            }
        });
        jToolBar1.add(btnCategoriaIncluir);

        btnCategoriaSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7658_64x64.png"))); // NOI18N
        btnCategoriaSalvar.setEnabled(false);
        btnCategoriaSalvar.setFocusable(false);
        btnCategoriaSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoriaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSalvar(evt);
            }
        });
        jToolBar1.add(btnCategoriaSalvar);

        btnCategoriaAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7661_64x64.png"))); // NOI18N
        btnCategoriaAlterar.setEnabled(false);
        btnCategoriaAlterar.setFocusable(false);
        btnCategoriaAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoriaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });
        jToolBar1.add(btnCategoriaAlterar);

        btnCategoriaConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7670_64x64.png"))); // NOI18N
        btnCategoriaConsultar.setFocusable(false);
        btnCategoriaConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoriaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });
        jToolBar1.add(btnCategoriaConsultar);

        btnCategoriaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7669_64x64.png"))); // NOI18N
        btnCategoriaExcluir.setEnabled(false);
        btnCategoriaExcluir.setFocusable(false);
        btnCategoriaExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoriaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });
        jToolBar1.add(btnCategoriaExcluir);

        btnCategoriaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7660_64x64.png"))); // NOI18N
        btnCategoriaCancelar.setEnabled(false);
        btnCategoriaCancelar.setFocusable(false);
        btnCategoriaCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoriaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancela(evt);
            }
        });
        jToolBar1.add(btnCategoriaCancelar);

        btnCategoriaSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7672_64x64.png"))); // NOI18N
        btnCategoriaSair.setFocusable(false);
        btnCategoriaSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCategoriaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jToolBar1.add(btnCategoriaSair);

        tfCategoriaId.setBorder(null);
        tfCategoriaId.setEnabled(false);
        jToolBar1.add(tfCategoriaId);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void preencherTabela() throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            CategoriaDAO dao = new CategoriaDAO();
            ArrayList<CategoriaBeans> listar = dao.todasCategorias();
            
            for (CategoriaBeans categoria : listar) {
               modelo.addRow(new Object[] { categoria.getCategoriaCodigo(),categoria.getCategoriaNome()} );    
            }
    }
    
    private void filtraTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            CategoriaDAO dao = new CategoriaDAO();
            ArrayList<CategoriaBeans> listar = dao.filtraCategoria(nome);
            
            for (CategoriaBeans categoria : listar) {
               modelo.addRow(new Object[] { categoria.getCategoriaCodigo(),categoria.getCategoriaNome()} );    
            }
    }

    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        dispose();
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarCancela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarCancela
        botao = 5;        
        btnCategoriaSalvar.setEnabled(false);btnCategoriaIncluir.setEnabled(true);btnCategoriaExcluir.setEnabled(false);
        btnCategoriaCancelar.setEnabled(false);btnCategoriaAlterar.setEnabled(false);        
        ftfCategoriaCodigo.setEnabled(false); tfCategoriaNome.setEnabled(false);     
        ftfCategoriaCodigo.setText(""); tfCategoriaNome.setText(""); 
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoArea.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_aoClicarCancela

    private void aoClicarConsultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConsultar
        String procuraNome = JOptionPane.showInputDialog(rootPane, "Digite um nome da Sub-Area:","Consulta",JOptionPane.QUESTION_MESSAGE);        
        if (!(procuraNome==null || procuraNome.equals(""))) {
            try {
                CategoriaDAO dao = new CategoriaDAO();                                                                     
                CategoriaBeans categoria = dao.procurarCategoria(procuraNome);
                btnCategoriaIncluir.setEnabled(false); btnCategoriaExcluir.setEnabled(true); 
                btnCategoriaCancelar.setEnabled(true); btnCategoriaAlterar.setEnabled(true);
                ftfCategoriaCodigo.setEnabled(true); tfCategoriaNome.setEnabled(true);                
                ftfCategoriaCodigo.setText(String.valueOf(categoria.getCategoriaCodigo()));
                tfCategoriaNome.setText(String.valueOf(categoria.getCategoriaNome()));                
                tfCategoriaId.setText(String.valueOf(categoria.getCategoriaId()));                   
                ftfCategoriaCodigo.requestFocus();
                filtraTabela(procuraNome);
            } catch (Exception e) {                       
            }
        }        


    }//GEN-LAST:event_aoClicarConsultar

    private void aoClicarInserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarInserir
        botao = 1;
        btnCategoriaIncluir.setEnabled(false); btnCategoriaCancelar.setEnabled(true);btnCategoriaSalvar.setEnabled(true);             
        ftfCategoriaCodigo.setEnabled(true);tfCategoriaNome.setEnabled(true); 
        ftfCategoriaCodigo.setText("");tfCategoriaNome.setText("");ftfCategoriaCodigo.requestFocus();
    }//GEN-LAST:event_aoClicarInserir

    private void aoClicarSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSalvar
        botao = 1;
        if (!"".equals(ftfCategoriaCodigo.getText()) && !"".equals(tfCategoriaNome.getText())) {                
            try {
                CategoriaDAO con = new CategoriaDAO();
                CategoriaBeans categoria = new CategoriaBeans();
                categoria.setCategoriaNome(tfCategoriaNome.getText());
                categoria.setCategoriaCodigo(ftfCategoriaCodigo.getText());               
                con.salvar(categoria);
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

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
        try {
                CategoriaDAO con = new CategoriaDAO();
                CategoriaBeans categoria = new CategoriaBeans();
                categoria.setCategoriaId(Integer.parseInt(tfCategoriaId.getText()));               
                categoria.setCategoriaNome(tfCategoriaNome.getText());
                categoria.setCategoriaCodigo(ftfCategoriaCodigo.getText());                
                con.atualizar(categoria);                
                JOptionPane.showMessageDialog(rootPane,"Registro alterados com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na Alteração!");
            }  
            aoClicarCancela(evt);
    }//GEN-LAST:event_aoClicarAlterar

    private void aoClicarExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarExcluir
        int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir","Exclusão", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if (resp==0)
        {        
        try {
              CategoriaDAO con = new CategoriaDAO();
              CategoriaBeans categoria = new CategoriaBeans();              
              categoria.setCategoriaNome(tfCategoriaNome.getText());                          
              con.excluir(categoria);
              JOptionPane.showMessageDialog(rootPane,"Operação concluida com sucesso!");                                
              aoClicarCancela(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro!");
        }
        aoClicarCancela(evt);
        }
    }//GEN-LAST:event_aoClicarExcluir

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        if (evt.getClickCount() == 2) {                           
            tfCategoriaNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString());             
            buscaDaLista(tfCategoriaNome.getText());
        }
        else {
            ftfCategoriaCodigo.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            tfCategoriaNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString()); 
        }   
    }//GEN-LAST:event_mouseClicked

    private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
                CategoriaDAO dao = new CategoriaDAO();                                                                     
                CategoriaBeans categoria = dao.procurarCategoria(nome);
                btnCategoriaIncluir.setEnabled(false); btnCategoriaExcluir.setEnabled(true); 
                btnCategoriaCancelar.setEnabled(true); btnCategoriaAlterar.setEnabled(true);
                ftfCategoriaCodigo.setEnabled(true); tfCategoriaNome.setEnabled(true);                
                ftfCategoriaCodigo.setText(String.valueOf(categoria.getCategoriaCodigo()));
                tfCategoriaNome.setText(String.valueOf(categoria.getCategoriaNome()));                
                tfCategoriaId.setText(String.valueOf(categoria.getCategoriaId()));                   
                ftfCategoriaCodigo.requestFocus();
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
                OperacaoCategoria dialog = new OperacaoCategoria(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCategoriaAlterar;
    private javax.swing.JButton btnCategoriaCancelar;
    private javax.swing.JButton btnCategoriaConsultar;
    private javax.swing.JButton btnCategoriaExcluir;
    private javax.swing.JButton btnCategoriaIncluir;
    private javax.swing.JButton btnCategoriaSair;
    private javax.swing.JButton btnCategoriaSalvar;
    private javax.swing.JFormattedTextField ftfCategoriaCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfCategoriaId;
    private javax.swing.JTextField tfCategoriaNome;
    // End of variables declaration//GEN-END:variables
}
