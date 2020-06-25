package br.telas;

import br.beans.AreaBeans;
import br.persistencia.AreaDAO;
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
public class OperacaoArea extends javax.swing.JDialog {
    int botao = 0;
    
    public OperacaoArea(java.awt.Frame parent, boolean modal) {
        super(parent, modal);    
        initComponents();        
        setLocationRelativeTo(null);
        tfAreaId.setVisible(false);
        
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        
        try {
            preencherTabela();            
        } catch (Exception ex) {
            Logger.getLogger(OperacaoArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAreaNovo = new javax.swing.JButton();
        btnAreaSalvar = new javax.swing.JButton();
        btnAreaAltera = new javax.swing.JButton();
        bntAreaConcultar = new javax.swing.JButton();
        btnAreaExcluir = new javax.swing.JButton();
        btnAreaCancela = new javax.swing.JButton();
        btnAreaSair = new javax.swing.JButton();
        tfAreaId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tfAreaNome = new javax.swing.JTextField();
        ftfAreaCodigo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Area de Conhecimento (CNPq)");
        setResizable(false);

        jToolBar1.setRollover(true);

        btnAreaNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7657_64x64.png"))); // NOI18N
        btnAreaNovo.setFocusable(false);
        btnAreaNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAreaNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAreaNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarIncluir(evt);
            }
        });
        jToolBar1.add(btnAreaNovo);

        btnAreaSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7658_64x64.png"))); // NOI18N
        btnAreaSalvar.setEnabled(false);
        btnAreaSalvar.setFocusable(false);
        btnAreaSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAreaSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAreaSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSalvar(evt);
            }
        });
        jToolBar1.add(btnAreaSalvar);

        btnAreaAltera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7661_64x64.png"))); // NOI18N
        btnAreaAltera.setEnabled(false);
        btnAreaAltera.setFocusable(false);
        btnAreaAltera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAreaAltera.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAreaAltera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAltera(evt);
            }
        });
        jToolBar1.add(btnAreaAltera);

        bntAreaConcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7670_64x64.png"))); // NOI18N
        bntAreaConcultar.setFocusable(false);
        bntAreaConcultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntAreaConcultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bntAreaConcultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });
        jToolBar1.add(bntAreaConcultar);

        btnAreaExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7669_64x64.png"))); // NOI18N
        btnAreaExcluir.setEnabled(false);
        btnAreaExcluir.setFocusable(false);
        btnAreaExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAreaExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAreaExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });
        jToolBar1.add(btnAreaExcluir);

        btnAreaCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7660_64x64.png"))); // NOI18N
        btnAreaCancela.setEnabled(false);
        btnAreaCancela.setFocusable(false);
        btnAreaCancela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAreaCancela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAreaCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancela(evt);
            }
        });
        jToolBar1.add(btnAreaCancela);

        btnAreaSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7672_64x64.png"))); // NOI18N
        btnAreaSair.setFocusable(false);
        btnAreaSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAreaSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAreaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jToolBar1.add(btnAreaSair);

        tfAreaId.setBorder(null);
        tfAreaId.setEnabled(false);
        jToolBar1.add(tfAreaId);

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
                "CODIGO CNPq", "AREA DE CONHECIMENTO"
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
                OperacaoArea.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tfAreaNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfAreaNome.setEnabled(false);
        tfAreaNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aoSairdoNome(evt);
            }
        });

        ftfAreaCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ftfAreaCodigo.setColumns(14);
        try {
            ftfAreaCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.##.##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfAreaCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftfAreaCodigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ftfAreaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAreaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAreaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfAreaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
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
            AreaDAO dao = new AreaDAO();
            ArrayList<AreaBeans> listar = dao.todasAreas();            
            for (AreaBeans area : listar) {
               modelo.addRow(new Object[] { area.getAreaCodigo(),area.getAreaNome()} );    
            }                             
    }
    
    private void filtraTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            AreaDAO dao = new AreaDAO();
            ArrayList<AreaBeans> listar = dao.filtraAreas(nome);
            
            for (AreaBeans area : listar) {
               modelo.addRow(new Object[] { area.getAreaCodigo(),area.getAreaNome()} );    
            }
    }
    
    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        dispose();
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSalvar
        botao = 1;
        if (!"".equals(ftfAreaCodigo.getText()) && !"".equals(tfAreaNome.getText())) {                
            try {
                AreaDAO con = new AreaDAO();
                AreaBeans area = new AreaBeans();
                area.setAreaNome(tfAreaNome.getText());
                area.setAreaCodigo(ftfAreaCodigo.getText());               
                con.salvar(area);
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
            btnAreaSalvar.setEnabled(false);btnAreaNovo.setEnabled(true);btnAreaExcluir.setEnabled(false);
            btnAreaCancela.setEnabled(false);btnAreaAltera.setEnabled(false);        
            ftfAreaCodigo.setEnabled(false); tfAreaNome.setEnabled(false);    
            ftfAreaCodigo.setText(""); tfAreaNome.setText(""); 
            try {
                preencherTabela();
            } catch (Exception ex) {
                Logger.getLogger(OperacaoArea.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_aoClicarCancela

    private void aoClicarIncluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarIncluir
            botao = 1;
            btnAreaNovo.setEnabled(false); btnAreaCancela.setEnabled(true);btnAreaSalvar.setEnabled(true);             
            ftfAreaCodigo.setEnabled(true);tfAreaNome.setEnabled(true); 
            ftfAreaCodigo.setText("");tfAreaNome.setText("");ftfAreaCodigo.requestFocus();            
    }//GEN-LAST:event_aoClicarIncluir

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

    private void aoClicarConsultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConsultar
        String procuraNome = JOptionPane.showInputDialog(rootPane, "Digite um nome da Area:","Consulta",JOptionPane.QUESTION_MESSAGE);        
        if (!(procuraNome==null || procuraNome.equals(""))) {
            try {
                AreaDAO dao = new AreaDAO();                                                                     
                AreaBeans area = dao.procurarArea(procuraNome);                             
                btnAreaNovo.setEnabled(false); btnAreaExcluir.setEnabled(true); 
                btnAreaCancela.setEnabled(true); btnAreaAltera.setEnabled(true);
                ftfAreaCodigo.setEnabled(true); tfAreaNome.setEnabled(true);                
                ftfAreaCodigo.setText(String.valueOf(area.getAreaCodigo()));
                tfAreaNome.setText(String.valueOf(area.getAreaNome()));                
                tfAreaId.setText(String.valueOf(area.getAreaId()));                   
                ftfAreaCodigo.requestFocus();
                filtraTabela(procuraNome);
            } catch (Exception e) {                       
            }
        }        
    }//GEN-LAST:event_aoClicarConsultar

    private void aoClicarAltera(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAltera
        try {
                AreaDAO con = new AreaDAO();
                AreaBeans area = new AreaBeans();
                area.setAreaId(Integer.parseInt(tfAreaId.getText()));               
                area.setAreaNome(tfAreaNome.getText());
                area.setAreaCodigo(ftfAreaCodigo.getText());                
                con.atualizar(area);                
                JOptionPane.showMessageDialog(rootPane,"Registro alterados com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na Alteração!");
            }  
            aoClicarCancela(evt);
    }//GEN-LAST:event_aoClicarAltera

    private void aoClicarExcluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarExcluir
        int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja Realmente Excluir","Exclusão", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if (resp==0)
        {        
        try {
              AreaDAO con = new AreaDAO();
              AreaBeans area = new AreaBeans();              
              area.setAreaNome(tfAreaNome.getText());                          
              con.excluir(area);
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
            tfAreaNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString());             
            buscaDaLista(tfAreaNome.getText());
        }
        else {
            ftfAreaCodigo.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            tfAreaNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),1).toString()); 
        }                   
    }//GEN-LAST:event_mouseClicked

    private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
               AreaDAO dao = new AreaDAO();                                                                     
               AreaBeans area = dao.procurarArea(nome);                             
               btnAreaNovo.setEnabled(false); btnAreaExcluir.setEnabled(true); 
               btnAreaCancela.setEnabled(true); btnAreaAltera.setEnabled(true);
               ftfAreaCodigo.setEnabled(true); tfAreaNome.setEnabled(true);                
               ftfAreaCodigo.setText(String.valueOf(area.getAreaCodigo()));
               tfAreaNome.setText(String.valueOf(area.getAreaNome()));                
               tfAreaId.setText(String.valueOf(area.getAreaId()));  
               ftfAreaCodigo.requestFocus();
            } catch (Exception e) {                       
            }
        }        
    }
 
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
                OperacaoArea dialog = new OperacaoArea(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bntAreaConcultar;
    private javax.swing.JButton btnAreaAltera;
    private javax.swing.JButton btnAreaCancela;
    private javax.swing.JButton btnAreaExcluir;
    private javax.swing.JButton btnAreaNovo;
    private javax.swing.JButton btnAreaSair;
    private javax.swing.JButton btnAreaSalvar;
    private javax.swing.JFormattedTextField ftfAreaCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField tfAreaId;
    private javax.swing.JTextField tfAreaNome;
    // End of variables declaration//GEN-END:variables
}
