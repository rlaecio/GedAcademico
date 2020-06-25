package br.telas;

import br.beans.IdiomaBeans;
import br.persistencia.IdiomaDAO;
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
public class OperacaoIdioma extends javax.swing.JDialog {
    int botao = 0;
    public OperacaoIdioma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

        setLocationRelativeTo(null);
        
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoIdioma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfIdiomaId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfIdiomaNome = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        btnIdiomaIncluir = new javax.swing.JButton();
        btnIdiomaSalvar = new javax.swing.JButton();
        btnIdiomaAltera = new javax.swing.JButton();
        btnIndiomaConsultar = new javax.swing.JButton();
        btnIdiomaExcluir = new javax.swing.JButton();
        btnIdiomaCancelar = new javax.swing.JButton();
        btnIdiomaSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Idiomas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfIdiomaId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfIdiomaId.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfIdiomaId.setEnabled(false);

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
                "CODIGO", "IDIOMAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.setIntercellSpacing(new java.awt.Dimension(3, 2));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperacaoIdioma.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfIdiomaNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfIdiomaNome.setEnabled(false);
        tfIdiomaNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aoSairdoNome(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tfIdiomaId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfIdiomaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfIdiomaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdiomaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jToolBar1.setRollover(true);

        btnIdiomaIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7657_64x64.png"))); // NOI18N
        btnIdiomaIncluir.setFocusable(false);
        btnIdiomaIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIdiomaIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIdiomaIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarIncluir(evt);
            }
        });
        jToolBar1.add(btnIdiomaIncluir);

        btnIdiomaSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7658_64x64.png"))); // NOI18N
        btnIdiomaSalvar.setEnabled(false);
        btnIdiomaSalvar.setFocusable(false);
        btnIdiomaSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIdiomaSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIdiomaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSalvar(evt);
            }
        });
        jToolBar1.add(btnIdiomaSalvar);

        btnIdiomaAltera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7661_64x64.png"))); // NOI18N
        btnIdiomaAltera.setEnabled(false);
        btnIdiomaAltera.setFocusable(false);
        btnIdiomaAltera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIdiomaAltera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIdiomaAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });
        jToolBar1.add(btnIdiomaAltera);

        btnIndiomaConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7670_64x64.png"))); // NOI18N
        btnIndiomaConsultar.setFocusable(false);
        btnIndiomaConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIndiomaConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIndiomaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });
        jToolBar1.add(btnIndiomaConsultar);

        btnIdiomaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7669_64x64.png"))); // NOI18N
        btnIdiomaExcluir.setEnabled(false);
        btnIdiomaExcluir.setFocusable(false);
        btnIdiomaExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIdiomaExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIdiomaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });
        jToolBar1.add(btnIdiomaExcluir);

        btnIdiomaCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7660_64x64.png"))); // NOI18N
        btnIdiomaCancelar.setEnabled(false);
        btnIdiomaCancelar.setFocusable(false);
        btnIdiomaCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIdiomaCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIdiomaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancela(evt);
            }
        });
        jToolBar1.add(btnIdiomaCancelar);

        btnIdiomaSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7672_64x64.png"))); // NOI18N
        btnIdiomaSair.setFocusable(false);
        btnIdiomaSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIdiomaSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIdiomaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jToolBar1.add(btnIdiomaSair);

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
            IdiomaDAO dao = new IdiomaDAO();
            ArrayList<IdiomaBeans> listar = dao.todasIdiomas();
            
            for (IdiomaBeans idioma : listar) {
                modelo.addRow(new Object[] { idioma.getIdiomaId(),idioma.getIdiomaNome()} );    
            }
    }
    
    private void filtraTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            IdiomaDAO dao = new IdiomaDAO();
            ArrayList<IdiomaBeans> listar = dao.filtraIdiomas(nome);
            
            for (IdiomaBeans area : listar) {
               modelo.addRow(new Object[] { area.getIdiomaId(),area.getIdiomaNome()} );    
            }
    }
    
    
    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        dispose();
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarIncluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarIncluir
        botao = 1;
        btnIdiomaIncluir.setEnabled(false); btnIdiomaCancelar.setEnabled(true);btnIdiomaSalvar.setEnabled(true);             
        tfIdiomaNome.setEnabled(true);
        tfIdiomaNome.setText("");tfIdiomaId.setText("");tfIdiomaNome.requestFocus();            
    }//GEN-LAST:event_aoClicarIncluir

    private void aoClicarSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSalvar
        botao = 1;
        if (!"".equals(tfIdiomaNome.getText())) {                
            try {
                IdiomaDAO con = new IdiomaDAO();
                IdiomaBeans idioma = new IdiomaBeans();
                idioma.setIdiomaNome(tfIdiomaNome.getText());                             
                con.salvar(idioma);
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
                IdiomaDAO con = new IdiomaDAO();
                IdiomaBeans idioma = new IdiomaBeans();
                idioma.setIdiomaId(Integer.parseInt(tfIdiomaId.getText()));               
                idioma.setIdiomaNome(tfIdiomaNome.getText());                               
                con.atualizar(idioma);                
                JOptionPane.showMessageDialog(rootPane,"Registro alterados com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na Alteração!");
            }  
            aoClicarCancela(evt);
    }//GEN-LAST:event_aoClicarAlterar

    private void aoClicarConsultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConsultar
        String procuraNome = JOptionPane.showInputDialog(rootPane, "Digite um nome da Idioma:","Consulta",JOptionPane.QUESTION_MESSAGE);        
        if (!(procuraNome==null || procuraNome.equals(""))) {
            try {
                IdiomaDAO dao = new IdiomaDAO();                                                                     
                IdiomaBeans idioma = dao.procurarIdioma(procuraNome);                             
                btnIdiomaIncluir.setEnabled(false); btnIdiomaExcluir.setEnabled(true); 
                btnIdiomaCancelar.setEnabled(true); btnIdiomaAltera.setEnabled(true);
                tfIdiomaNome.setEnabled(true); tfIdiomaNome.setEnabled(true);                
                tfIdiomaId.setText(String.valueOf(idioma.getIdiomaId()));
                tfIdiomaNome.setText(String.valueOf(idioma.getIdiomaNome()));  
                tfIdiomaNome.requestFocus();
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
              IdiomaDAO con = new IdiomaDAO();
              IdiomaBeans idioma = new IdiomaBeans();              
              idioma.setIdiomaNome(tfIdiomaNome.getText());                          
              con.excluir(idioma);
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
        btnIdiomaSalvar.setEnabled(false);btnIdiomaIncluir.setEnabled(true);btnIdiomaExcluir.setEnabled(false);
        btnIdiomaCancelar.setEnabled(false);btnIdiomaAltera.setEnabled(false);        
        tfIdiomaNome.setEnabled(false); tfIdiomaId.setEnabled(false);    
        tfIdiomaNome.setText(""); tfIdiomaId.setText(""); 
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
                aoClicarIncluir(null);
            }
            else {
                aoClicarCancela(null);
            }
        }
    }//GEN-LAST:event_aoSairdoNome

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
         if (evt.getClickCount() == 2) {                           
            tfIdiomaNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString());             
            buscaDaLista(tfIdiomaNome.getText());
        }
        else {
            tfIdiomaId.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            tfIdiomaNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString()); 
        }       
    }//GEN-LAST:event_mouseClicked
  private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
              IdiomaDAO dao = new IdiomaDAO();                                                                     
                IdiomaBeans idioma = dao.procurarIdioma(nome);                             
                btnIdiomaIncluir.setEnabled(false); btnIdiomaExcluir.setEnabled(true); 
                btnIdiomaCancelar.setEnabled(true); btnIdiomaAltera.setEnabled(true);
                tfIdiomaNome.setEnabled(true); tfIdiomaNome.setEnabled(true);                
                tfIdiomaId.setText(String.valueOf(idioma.getIdiomaId()));
                tfIdiomaNome.setText(String.valueOf(idioma.getIdiomaNome()));  
                tfIdiomaNome.requestFocus();
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
                OperacaoIdioma dialog = new OperacaoIdioma(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnIdiomaAltera;
    private javax.swing.JButton btnIdiomaCancelar;
    private javax.swing.JButton btnIdiomaExcluir;
    private javax.swing.JButton btnIdiomaIncluir;
    private javax.swing.JButton btnIdiomaSair;
    private javax.swing.JButton btnIdiomaSalvar;
    private javax.swing.JButton btnIndiomaConsultar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfIdiomaId;
    private javax.swing.JTextField tfIdiomaNome;
    // End of variables declaration//GEN-END:variables
}
