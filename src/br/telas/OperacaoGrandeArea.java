package br.telas;

import br.beans.GrandeAreaBeans;
import br.persistencia.GrandeAreaDAO;
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
public class OperacaoGrandeArea extends javax.swing.JDialog {
    int botao = 0;
    public OperacaoGrandeArea(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        tfGAreaId.setVisible(false);
        
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);

        setLocationRelativeTo(null);
                    
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoGrandeArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnGAreaIncluir = new javax.swing.JButton();
        btnGAreaSalvar = new javax.swing.JButton();
        btnGAreaAlterar = new javax.swing.JButton();
        btnGAreaConsultar = new javax.swing.JButton();
        btnGAreaExcluir = new javax.swing.JButton();
        btnGAreaCancela = new javax.swing.JButton();
        btnGAreaSair = new javax.swing.JButton();
        tfGAreaId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tfGAreaNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ftfGAreaCodigo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Grande Area do Conhecimento (CNPq)");
        setResizable(false);

        jToolBar1.setRollover(true);

        btnGAreaIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7657_64x64.png"))); // NOI18N
        btnGAreaIncluir.setFocusable(false);
        btnGAreaIncluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGAreaIncluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGAreaIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarIncluir(evt);
            }
        });
        jToolBar1.add(btnGAreaIncluir);

        btnGAreaSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7658_64x64.png"))); // NOI18N
        btnGAreaSalvar.setEnabled(false);
        btnGAreaSalvar.setFocusable(false);
        btnGAreaSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGAreaSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGAreaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSalvar(evt);
            }
        });
        jToolBar1.add(btnGAreaSalvar);

        btnGAreaAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7661_64x64.png"))); // NOI18N
        btnGAreaAlterar.setEnabled(false);
        btnGAreaAlterar.setFocusable(false);
        btnGAreaAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGAreaAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGAreaAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });
        jToolBar1.add(btnGAreaAlterar);

        btnGAreaConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7670_64x64.png"))); // NOI18N
        btnGAreaConsultar.setFocusable(false);
        btnGAreaConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGAreaConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGAreaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });
        jToolBar1.add(btnGAreaConsultar);

        btnGAreaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7669_64x64.png"))); // NOI18N
        btnGAreaExcluir.setEnabled(false);
        btnGAreaExcluir.setFocusable(false);
        btnGAreaExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGAreaExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGAreaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });
        jToolBar1.add(btnGAreaExcluir);

        btnGAreaCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7660_64x64.png"))); // NOI18N
        btnGAreaCancela.setEnabled(false);
        btnGAreaCancela.setFocusable(false);
        btnGAreaCancela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGAreaCancela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGAreaCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancela(evt);
            }
        });
        jToolBar1.add(btnGAreaCancela);

        btnGAreaSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7672_64x64.png"))); // NOI18N
        btnGAreaSair.setFocusable(false);
        btnGAreaSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGAreaSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGAreaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jToolBar1.add(btnGAreaSair);

        tfGAreaId.setBorder(null);
        tfGAreaId.setEnabled(false);
        jToolBar1.add(tfGAreaId);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfGAreaNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfGAreaNome.setEnabled(false);
        tfGAreaNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aoSairdoNome(evt);
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
                "CODIGO CNPq", "GRANDE AREA DO CONHECIMENTO"
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
                OperacaoGrandeArea.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ftfGAreaCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ftfGAreaCodigo.setColumns(14);
        try {
            ftfGAreaCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.##.##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfGAreaCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftfGAreaCodigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ftfGAreaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfGAreaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGAreaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfGAreaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
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
            GrandeAreaDAO dao = new GrandeAreaDAO();
            ArrayList<GrandeAreaBeans> listar = dao.todasAreas();
            
            for (GrandeAreaBeans area : listar) {
               modelo.addRow(new Object[] { area.getG_areaCodigo(),area.getG_areaNome()} );    
            }
    }
    
    private void filtrarTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            GrandeAreaDAO dao = new GrandeAreaDAO();
            ArrayList<GrandeAreaBeans> listar = dao.filtrarAreas(nome);            
            for (GrandeAreaBeans area : listar) {
               modelo.addRow(new Object[] { area.getG_areaCodigo(),area.getG_areaNome()} );    
            }
    }
    
    
    
    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        dispose();
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSalvar
        botao = 1;
        if (!"".equals(ftfGAreaCodigo.getText()) && !"".equals(tfGAreaNome.getText())) {                
            try {
                GrandeAreaDAO con = new GrandeAreaDAO();
                GrandeAreaBeans garea = new GrandeAreaBeans();
                garea.setG_areaNome(tfGAreaNome.getText());
                garea.setG_areaCodigo(ftfGAreaCodigo.getText());               
                con.salvar(garea);
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

    private void aoClicarCancela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarCancela
        botao = 5;        
        btnGAreaSalvar.setEnabled(false);btnGAreaIncluir.setEnabled(true);btnGAreaExcluir.setEnabled(false);
        btnGAreaCancela.setEnabled(false);btnGAreaAlterar.setEnabled(false);        
        ftfGAreaCodigo.setEnabled(false); tfGAreaNome.setEnabled(false);    
        ftfGAreaCodigo.setText(""); tfGAreaNome.setText(""); 
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aoClicarCancela

    private void aoClicarIncluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarIncluir
        botao = 1;
            btnGAreaIncluir.setEnabled(false); btnGAreaCancela.setEnabled(true);btnGAreaSalvar.setEnabled(true);             
            ftfGAreaCodigo.setEnabled(true);tfGAreaNome.setEnabled(true); 
            ftfGAreaCodigo.setText("");tfGAreaNome.setText("");ftfGAreaCodigo.requestFocus();            
    }//GEN-LAST:event_aoClicarIncluir

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
         try {
                GrandeAreaDAO con = new GrandeAreaDAO();
                GrandeAreaBeans area = new GrandeAreaBeans();
                area.setG_areaId(Integer.parseInt(tfGAreaId.getText()));               
                area.setG_areaNome(tfGAreaNome.getText());
                area.setG_areaCodigo(ftfGAreaCodigo.getText());                
                con.atualizar(area);                
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
                GrandeAreaDAO dao = new GrandeAreaDAO();                                                                     
                GrandeAreaBeans garea = dao.procurarArea(procuraNome);                             
                btnGAreaIncluir.setEnabled(false); btnGAreaExcluir.setEnabled(true); 
                btnGAreaCancela.setEnabled(true); btnGAreaAlterar.setEnabled(true);
                ftfGAreaCodigo.setEnabled(true); tfGAreaNome.setEnabled(true);                
                ftfGAreaCodigo.setText(String.valueOf(garea.getG_areaCodigo()));
                tfGAreaNome.setText(String.valueOf(garea.getG_areaNome()));                
                tfGAreaId.setText(String.valueOf(garea.getG_areaId()));        
                ftfGAreaCodigo.requestFocus();
                
                filtrarTabela(procuraNome);
            } catch (Exception e) {                       
            }
        }        
    }//GEN-LAST:event_aoClicarConsultar

    private void aoClicarExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarExcluir
        int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir","Exclusão", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if (resp==0)
        {        
        try {
              GrandeAreaDAO con = new GrandeAreaDAO();
              GrandeAreaBeans garea = new GrandeAreaBeans();              
              garea.setG_areaNome(tfGAreaNome.getText());                          
              con.excluir(garea);
              JOptionPane.showMessageDialog(rootPane,"Operação concluida com sucesso!");                                
              aoClicarCancela(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro!");
        }
        aoClicarCancela(evt);
        }
    }//GEN-LAST:event_aoClicarExcluir

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
            tfGAreaNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString());             
            buscaDaLista(tfGAreaNome.getText());
        }
        else {
            ftfGAreaCodigo.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            tfGAreaNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString()); 
        }     
    }//GEN-LAST:event_mouseClicked

    private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
                GrandeAreaDAO dao = new GrandeAreaDAO();                                                                     
                GrandeAreaBeans garea = dao.procurarArea(nome);                             
                btnGAreaIncluir.setEnabled(false); btnGAreaExcluir.setEnabled(true); 
                btnGAreaCancela.setEnabled(true); btnGAreaAlterar.setEnabled(true);
                ftfGAreaCodigo.setEnabled(true); tfGAreaNome.setEnabled(true);                
                ftfGAreaCodigo.setText(String.valueOf(garea.getG_areaCodigo()));
                tfGAreaNome.setText(String.valueOf(garea.getG_areaNome()));                
                tfGAreaId.setText(String.valueOf(garea.getG_areaId()));        
                ftfGAreaCodigo.requestFocus();
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
                OperacaoGrandeArea dialog = new OperacaoGrandeArea(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGAreaAlterar;
    private javax.swing.JButton btnGAreaCancela;
    private javax.swing.JButton btnGAreaConsultar;
    private javax.swing.JButton btnGAreaExcluir;
    private javax.swing.JButton btnGAreaIncluir;
    private javax.swing.JButton btnGAreaSair;
    private javax.swing.JButton btnGAreaSalvar;
    private javax.swing.JFormattedTextField ftfGAreaCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfGAreaId;
    private javax.swing.JTextField tfGAreaNome;
    // End of variables declaration//GEN-END:variables
}
