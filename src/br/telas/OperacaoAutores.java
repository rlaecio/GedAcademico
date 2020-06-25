package br.telas;

import br.beans.AutoresBeans;
import br.persistencia.AutoresDAO;
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
public class OperacaoAutores extends javax.swing.JDialog {

    /** Creates new form OperacaoAutores */
    public OperacaoAutores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        setLocationRelativeTo(null);
        tfAutorId.setVisible(false);
        
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfAutorNome = new javax.swing.JTextField();
        tfAutorEmail = new javax.swing.JTextField();
        tfAutorEndereco = new javax.swing.JTextField();
        tfAutorCidade = new javax.swing.JTextField();
        ftfAutorTelefone = new javax.swing.JFormattedTextField();
        ftfAutorCelular = new javax.swing.JFormattedTextField();
        lbAutorNome = new javax.swing.JLabel();
        lbAutorEmail = new javax.swing.JLabel();
        lbAutorEndereco = new javax.swing.JLabel();
        lbAutorCidade = new javax.swing.JLabel();
        lbAutorTelefone = new javax.swing.JLabel();
        lbAutorCelular = new javax.swing.JLabel();
        tfAutorId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAutorNovo = new javax.swing.JButton();
        btnAutorSalvar = new javax.swing.JButton();
        btnAutorAlterar = new javax.swing.JButton();
        btnAutorConsultar = new javax.swing.JButton();
        btnAutorExcluir = new javax.swing.JButton();
        btnAutorCancela = new javax.swing.JButton();
        btnAutorFechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administração de Autores");
        setName("AutoresAdmin"); // NOI18N
        setResizable(false);
        setUndecorated(isDefaultLookAndFeelDecorated());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setEnabled(false);

        tfAutorNome.setColumns(45);
        tfAutorNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfAutorNome.setEnabled(false);

        tfAutorEmail.setColumns(30);
        tfAutorEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfAutorEmail.setEnabled(false);

        tfAutorEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfAutorEndereco.setEnabled(false);

        tfAutorCidade.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfAutorCidade.setEnabled(false);

        ftfAutorTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ftfAutorTelefone.setColumns(16);
        try {
            ftfAutorTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfAutorTelefone.setEnabled(false);

        ftfAutorCelular.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ftfAutorCelular.setColumns(16);
        try {
            ftfAutorCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfAutorCelular.setEnabled(false);

        lbAutorNome.setText("Nome :");

        lbAutorEmail.setText("E-Mail:");

        lbAutorEndereco.setText("Endereço:");

        lbAutorCidade.setText("Cidade:");

        lbAutorTelefone.setText("Telefone:");

        lbAutorCelular.setText("Celular:");

        tfAutorId.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAutorTelefone)
                    .addComponent(lbAutorNome)
                    .addComponent(lbAutorEndereco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfAutorEndereco)
                    .addComponent(tfAutorNome, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(ftfAutorTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAutorEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAutorCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAutorCelular, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfAutorEmail)
                        .addComponent(tfAutorCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ftfAutorCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(tfAutorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAutorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAutorNome)
                    .addComponent(lbAutorEmail)
                    .addComponent(tfAutorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutorEndereco)
                    .addComponent(lbAutorCidade)
                    .addComponent(tfAutorCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAutorEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutorTelefone)
                    .addComponent(lbAutorCelular)
                    .addComponent(ftfAutorTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfAutorCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAutorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        btnAutorNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7657_64x64.png"))); // NOI18N
        btnAutorNovo.setToolTipText("Inserir Novo");
        btnAutorNovo.setFocusable(false);
        btnAutorNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutorNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAutorNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarInserir(evt);
            }
        });
        jToolBar1.add(btnAutorNovo);

        btnAutorSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7658_64x64.png"))); // NOI18N
        btnAutorSalvar.setToolTipText("Salvar Registro");
        btnAutorSalvar.setEnabled(false);
        btnAutorSalvar.setFocusable(false);
        btnAutorSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutorSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAutorSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConfirma(evt);
            }
        });
        jToolBar1.add(btnAutorSalvar);

        btnAutorAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7661_64x64.png"))); // NOI18N
        btnAutorAlterar.setEnabled(false);
        btnAutorAlterar.setFocusable(false);
        btnAutorAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutorAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAutorAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAlterar(evt);
            }
        });
        jToolBar1.add(btnAutorAlterar);

        btnAutorConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7670_64x64.png"))); // NOI18N
        btnAutorConsultar.setToolTipText("Localizar Registro");
        btnAutorConsultar.setFocusable(false);
        btnAutorConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutorConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAutorConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });
        jToolBar1.add(btnAutorConsultar);

        btnAutorExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7669_64x64.png"))); // NOI18N
        btnAutorExcluir.setToolTipText("Excluir Registro");
        btnAutorExcluir.setEnabled(false);
        btnAutorExcluir.setFocusable(false);
        btnAutorExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutorExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAutorExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarExcluir(evt);
            }
        });
        jToolBar1.add(btnAutorExcluir);

        btnAutorCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7660_64x64.png"))); // NOI18N
        btnAutorCancela.setToolTipText("Cancelar");
        btnAutorCancela.setEnabled(false);
        btnAutorCancela.setFocusable(false);
        btnAutorCancela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutorCancela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAutorCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancela(evt);
            }
        });
        jToolBar1.add(btnAutorCancela);

        btnAutorFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/7672_64x64.png"))); // NOI18N
        btnAutorFechar.setToolTipText("Sair da Janela");
        btnAutorFechar.setFocusable(false);
        btnAutorFechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAutorFechar.setPreferredSize(new java.awt.Dimension(48, 48));
        btnAutorFechar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAutorFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jToolBar1.add(btnAutorFechar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Telefone", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setIntercellSpacing(new java.awt.Dimension(3, 1));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OperacaoAutores.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela() throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            AutoresDAO dao = new AutoresDAO();
            ArrayList<AutoresBeans> listar = dao.todosAutores();            
            for (AutoresBeans autor : listar) {
               modelo.addRow(new Object[] { autor.getAutorNome(),autor.getAutorEmail(),autor.getAutorFone(),autor.getAutorCelular()} );    
            }
    }
    
    private void filtraTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            AutoresDAO dao = new AutoresDAO();
            ArrayList<AutoresBeans> listar = dao.filtraAutores(nome);            
            for (AutoresBeans autor : listar) {
               modelo.addRow(new Object[] { autor.getAutorNome(),autor.getAutorEmail(),autor.getAutorFone(),autor.getAutorCelular()} );    
            }
    }
    
    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        dispose();
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarConsultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConsultar
        String procuraNome = JOptionPane.showInputDialog(rootPane, "Digite um nome de autor:","Consulta",JOptionPane.QUESTION_MESSAGE);        
        if (!(procuraNome==null || procuraNome.equals(""))) {
            try {
                AutoresDAO dao = new AutoresDAO();                                                                     
                AutoresBeans aut1 = dao.procurarAutores(procuraNome);                             
                btnAutorNovo.setEnabled(false); btnAutorExcluir.setEnabled(true); 
                btnAutorCancela.setEnabled(true); btnAutorAlterar.setEnabled(true);
                tfAutorNome.setEnabled(true); tfAutorEmail.setEnabled(true);
                tfAutorEndereco.setEnabled(true); tfAutorCidade.setEnabled(true);
                ftfAutorTelefone.setEnabled(true); ftfAutorCelular.setEnabled(true);       
                tfAutorNome.setText(String.valueOf(aut1.getAutorNome()));
                tfAutorEmail.setText(String.valueOf(aut1.getAutorEmail()));
                tfAutorEndereco.setText(String.valueOf(aut1.getAutorEndereco()));
                tfAutorCidade.setText(String.valueOf(aut1.getAutorCidade()));
                ftfAutorTelefone.setText(String.valueOf(aut1.getAutorFone()));
                ftfAutorCelular.setText(String.valueOf(aut1.getAutorCelular()));  
                tfAutorId.setText(String.valueOf(aut1.getAutorId()));                   
                
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
              AutoresDAO con = new AutoresDAO();
              AutoresBeans aut1 = new AutoresBeans();              
              aut1.setAutorNome(tfAutorNome.getText());                          
              con.excluir(aut1);
              JOptionPane.showMessageDialog(rootPane,"Operação concluida com sucesso!");                                
              aoClicarCancela(evt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro!");
        }
        }
    }//GEN-LAST:event_aoClicarExcluir

    private void aoClicarInserir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarInserir
            btnAutorNovo.setEnabled(false); btnAutorCancela.setEnabled(true);
            btnAutorSalvar.setEnabled(true); tfAutorNome.setEnabled(true);
            tfAutorEmail.setEnabled(true); tfAutorEndereco.setEnabled(true);
            tfAutorCidade.setEnabled(true); ftfAutorTelefone.setEnabled(true);
            ftfAutorCelular.setEnabled(true);       
            tfAutorNome.setText("");tfAutorEmail.setText("");tfAutorEndereco.setText("");
            tfAutorCidade.setText("");ftfAutorTelefone.setText("");ftfAutorCelular.setText("");        
            tfAutorNome.requestFocus(true);   
    }//GEN-LAST:event_aoClicarInserir

    private void aoClicarConfirma(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConfirma
          if (!"".equals(tfAutorNome.getText()) && !"".equals(tfAutorEmail.getText())) {                
            try {
                AutoresDAO con = new AutoresDAO();
                AutoresBeans aut1 = new AutoresBeans();
                aut1.setAutorNome(tfAutorNome.getText());
                aut1.setAutorEmail(tfAutorEmail.getText());
                aut1.setAutorEndereco(tfAutorEndereco.getText());
                aut1.setAutorCidade(tfAutorCidade.getText());
                aut1.setAutorFone(ftfAutorTelefone.getText());
                aut1.setAutorCelular(ftfAutorCelular.getText());
                con.salvar(aut1);
                JOptionPane.showMessageDialog(rootPane,"Operação concluida com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na inclusão!");
            }  
            aoClicarCancela(evt);
          }
    }//GEN-LAST:event_aoClicarConfirma

    private void aoClicarCancela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarCancela
            btnAutorSalvar.setEnabled(false);btnAutorNovo.setEnabled(true);btnAutorExcluir.setEnabled(false);
            tfAutorNome.requestFocus(); btnAutorCancela.setEnabled(false);btnAutorAlterar.setEnabled(false);
            tfAutorNome.setText(""); tfAutorEmail.setText("");
            tfAutorEndereco.setText(""); tfAutorCidade.setText("");
            ftfAutorTelefone.setText(""); ftfAutorCelular.setText("");
            tfAutorNome.setEnabled(false);  tfAutorEmail.setEnabled(false);
            tfAutorEndereco.setEnabled(false); tfAutorCidade.setEnabled(false);
            ftfAutorTelefone.setEnabled(false); ftfAutorCelular.setEnabled(false);         
        try {
            preencherTabela();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aoClicarCancela

    private void aoClicarAlterar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAlterar
           try {
                AutoresDAO con = new AutoresDAO();
                AutoresBeans aut1 = new AutoresBeans();                
                aut1.setAutorId(Integer.parseInt(tfAutorId.getText()));               
                aut1.setAutorNome(tfAutorNome.getText());
                aut1.setAutorEmail(tfAutorEmail.getText());
                aut1.setAutorEndereco(tfAutorEndereco.getText());
                aut1.setAutorCidade(tfAutorCidade.getText());
                aut1.setAutorFone(ftfAutorTelefone.getText());
                aut1.setAutorCelular(ftfAutorCelular.getText());
                con.atualizar(aut1);                
                JOptionPane.showMessageDialog(rootPane,"Registro alterados com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na Alteração!");
            }  
            aoClicarCancela(evt);
    }//GEN-LAST:event_aoClicarAlterar

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        if (evt.getClickCount() == 2) {                           
            tfAutorNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString());             
            buscaDaLista(tfAutorNome.getText());
        }
        else {            
            tfAutorNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()); 
            buscaDaLista2(tfAutorNome.getText()); 
        }   
    }//GEN-LAST:event_mouseClicked

    private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
                AutoresDAO dao = new AutoresDAO();                                                                     
                AutoresBeans aut1 = dao.procurarAutores(nome);                             
                btnAutorNovo.setEnabled(false); btnAutorExcluir.setEnabled(true); 
                btnAutorCancela.setEnabled(true); btnAutorAlterar.setEnabled(true);
                tfAutorNome.setEnabled(true); tfAutorEmail.setEnabled(true);
                tfAutorEndereco.setEnabled(true); tfAutorCidade.setEnabled(true);
                ftfAutorTelefone.setEnabled(true); ftfAutorCelular.setEnabled(true);       
                tfAutorNome.setText(String.valueOf(aut1.getAutorNome()));
                tfAutorEmail.setText(String.valueOf(aut1.getAutorEmail()));
                tfAutorEndereco.setText(String.valueOf(aut1.getAutorEndereco()));
                tfAutorCidade.setText(String.valueOf(aut1.getAutorCidade()));
                ftfAutorTelefone.setText(String.valueOf(aut1.getAutorFone()));
                ftfAutorCelular.setText(String.valueOf(aut1.getAutorCelular()));  
                tfAutorId.setText(String.valueOf(aut1.getAutorId()));       
                tfAutorNome.requestFocus();
            } catch (Exception e) {                       
            }
        }        
    }
    private void buscaDaLista2(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
                AutoresDAO dao = new AutoresDAO();                                                                     
                AutoresBeans aut1 = dao.procurarAutores(nome);                                                 
                tfAutorNome.setText(String.valueOf(aut1.getAutorNome()));
                tfAutorEmail.setText(String.valueOf(aut1.getAutorEmail()));
                tfAutorEndereco.setText(String.valueOf(aut1.getAutorEndereco()));
                tfAutorCidade.setText(String.valueOf(aut1.getAutorCidade()));
                ftfAutorTelefone.setText(String.valueOf(aut1.getAutorFone()));
                ftfAutorCelular.setText(String.valueOf(aut1.getAutorCelular()));  
                tfAutorId.setText(String.valueOf(aut1.getAutorId()));                                                                                  
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

            @Override
            public void run() {
                OperacaoAutores dialog = new OperacaoAutores(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAutorAlterar;
    private javax.swing.JButton btnAutorCancela;
    private javax.swing.JButton btnAutorConsultar;
    private javax.swing.JButton btnAutorExcluir;
    private javax.swing.JButton btnAutorFechar;
    private javax.swing.JButton btnAutorNovo;
    private javax.swing.JButton btnAutorSalvar;
    private javax.swing.JFormattedTextField ftfAutorCelular;
    private javax.swing.JFormattedTextField ftfAutorTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbAutorCelular;
    private javax.swing.JLabel lbAutorCidade;
    private javax.swing.JLabel lbAutorEmail;
    private javax.swing.JLabel lbAutorEndereco;
    private javax.swing.JLabel lbAutorNome;
    private javax.swing.JLabel lbAutorTelefone;
    private javax.swing.JTextField tfAutorCidade;
    private javax.swing.JTextField tfAutorEmail;
    private javax.swing.JTextField tfAutorEndereco;
    private javax.swing.JTextField tfAutorId;
    private javax.swing.JTextField tfAutorNome;
    // End of variables declaration//GEN-END:variables
}