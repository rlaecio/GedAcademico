
package br.telas;

import br.beans.DocumentoBeans;
import br.consultas.ConsultaAreas;
import br.consultas.ConsultaAutor;
import br.consultas.ConsultaEspecialidade;
import br.consultas.ConsultaGrandeArea;
import br.consultas.ConsultaLingua;
import br.consultas.ConsultaSubArea;
import br.consultas.ConsultaTitulacao;
import br.persistencia.DocumentoDAO;
import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author rlaecio
 */
public class OperacaoDocumento extends javax.swing.JDialog {
    int admId = 1, botao = 0;
    protected int docId, autorId, areaId, especialidadeId, idiomaId, grauId, g_areaId, categoriaId;
    protected String autorNome, areaNome, especialidadeNome, idiomaNome, grauNome,
            g_areaNome, categoriaNome, novoNome,docNomeArquivoOrigem, docNomeArquivoIndice;
    protected String caminhoArquivo;
    protected String novoCaminho;
    private int codigo;
   
    public OperacaoDocumento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);               
        setLocationRelativeTo(null);
        
        try {
            calcularCodigo();
        } catch (Exception ex) {
            Logger.getLogger(OperacaoDocumento.class.getName()).log(Level.SEVERE, null, ex);
        }
   
                                    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        blAutor = new javax.swing.JLabel();
        tfAutorNome = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        tfDocAno = new javax.swing.JTextField();
        lbPaginas = new javax.swing.JLabel();
        tfPaginas = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        lbLingua = new javax.swing.JLabel();
        tfIdiomaNome = new javax.swing.JTextField();
        lbBanca = new javax.swing.JLabel();
        tfBanca = new javax.swing.JTextField();
        lbPalavrasChave = new javax.swing.JLabel();
        tfPalavrasChaves = new javax.swing.JTextField();
        lbRodade = new javax.swing.JLabel();
        tfRodape = new javax.swing.JTextField();
        lbTitulacao = new javax.swing.JLabel();
        tfTifulacao = new javax.swing.JTextField();
        btnPesuisaAutor = new javax.swing.JButton();
        btnPesquisaLingua = new javax.swing.JButton();
        btnPesquisaTitulacao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbGArea = new javax.swing.JLabel();
        tfGrandeArea = new javax.swing.JTextField();
        tfArea = new javax.swing.JTextField();
        lbArea = new javax.swing.JLabel();
        lbSubArea = new javax.swing.JLabel();
        tfSubArea = new javax.swing.JTextField();
        tfEspecialidade = new javax.swing.JTextField();
        lbEspecialidade = new javax.swing.JLabel();
        btnPesquisaSubArea = new javax.swing.JButton();
        btnPesquisaGrandeArea = new javax.swing.JButton();
        btnPesquisaArea = new javax.swing.JButton();
        btnPesquisaEspecialidade = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfNomeAtual = new javax.swing.JTextField();
        lbEnderecoArquivo = new javax.swing.JLabel();
        lbNomeArquivo = new javax.swing.JLabel();
        tfNomeNovo = new javax.swing.JTextField();
        btnArquivar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDocFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administração dos Documentos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        blAutor.setText("Autor");

        tfAutorNome.setText("Seleciona um Autor, clicando na lupa ao lado.");
        tfAutorNome.setToolTipText("Clique na Lupa ao Lado para Pesquisar Autores");
        tfAutorNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfAutorNome.setFocusable(false);

        lbAno.setText("Ano de Entrega");

        tfDocAno.setColumns(4);
        tfDocAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDocAno.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbPaginas.setText("Paginas");

        tfPaginas.setColumns(6);
        tfPaginas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbTitulo.setText("Titulo do Trabalho");

        tfTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbLingua.setText("Lingua");

        tfIdiomaNome.setText("Selecione uma lingua");
        tfIdiomaNome.setToolTipText("Clique na Lupa ao lado para pesquisar Linguas");
        tfIdiomaNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfIdiomaNome.setFocusable(false);

        lbBanca.setText("Membros da Banca");

        tfBanca.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbPalavrasChave.setText("Palavras Chave");

        tfPalavrasChaves.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbRodade.setText("Notas de Rodapé");

        tfRodape.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbTitulacao.setText("Titulação");

        tfTifulacao.setText("Escolha uma titulação academica");
        tfTifulacao.setToolTipText("Clique na Lupa para pesquisar as titulações");
        tfTifulacao.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfTifulacao.setFocusable(false);

        btnPesuisaAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/lupa.png"))); // NOI18N
        btnPesuisaAutor.setBorder(null);
        btnPesuisaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaAutor(evt);
            }
        });

        btnPesquisaLingua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/lupa.png"))); // NOI18N
        btnPesquisaLingua.setBorder(null);
        btnPesquisaLingua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaLingua(evt);
            }
        });

        btnPesquisaTitulacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/lupa.png"))); // NOI18N
        btnPesquisaTitulacao.setBorder(null);
        btnPesquisaTitulacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaTitulacao(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(blAutor)
                        .addGap(555, 555, 555)
                        .addComponent(lbAno)
                        .addGap(31, 31, 31)
                        .addComponent(lbPaginas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfAutorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnPesuisaAutor)
                        .addGap(43, 43, 43)
                        .addComponent(tfDocAno, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(488, 488, 488)
                        .addComponent(lbLingua))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfIdiomaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesquisaLingua))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbBanca)
                        .addGap(406, 406, 406)
                        .addComponent(lbTitulacao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfBanca, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tfTifulacao, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesquisaTitulacao))
                    .addComponent(lbPalavrasChave)
                    .addComponent(tfPalavrasChaves, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRodade)
                    .addComponent(tfRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blAutor)
                    .addComponent(lbAno)
                    .addComponent(lbPaginas))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfAutorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesuisaAutor)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfDocAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbLingua)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdiomaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaLingua))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBanca)
                    .addComponent(lbTitulacao))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBanca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTifulacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaTitulacao))
                .addGap(4, 4, 4)
                .addComponent(lbPalavrasChave)
                .addGap(6, 6, 6)
                .addComponent(tfPalavrasChaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lbRodade)
                .addGap(6, 6, 6)
                .addComponent(tfRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Segundo CNPq"));

        lbGArea.setText("Grande Area");

        tfGrandeArea.setText("Selecione uma Grande Area do Conhecimento, clicando no botão");
        tfGrandeArea.setToolTipText("Clique na Lupa para pesquisar a Grande Area do Conhecimento");
        tfGrandeArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfGrandeArea.setFocusable(false);

        tfArea.setText("Selecione uma Area de Conchecimento, clicando no botão");
        tfArea.setToolTipText("Clique na lupara para pesquisar a Area");
        tfArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfArea.setFocusable(false);

        lbArea.setText("Area de Conhecimento");

        lbSubArea.setText("Sub-Area do Conhecimento");

        tfSubArea.setText("Selecione uma Sub-Area do Conhecimento, clicando no botão");
        tfSubArea.setToolTipText("Clique na Lupa para pesquisar a Sub Area");
        tfSubArea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfSubArea.setFocusable(false);

        tfEspecialidade.setText("Selecione uma Especialidade, clicando no botão");
        tfEspecialidade.setToolTipText("Clique na Lupa para pesquisar as Especialidades");
        tfEspecialidade.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfEspecialidade.setFocusable(false);

        lbEspecialidade.setText("Especialidade ");

        btnPesquisaSubArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/lupa.png"))); // NOI18N
        btnPesquisaSubArea.setBorder(null);
        btnPesquisaSubArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaSubArea(evt);
            }
        });

        btnPesquisaGrandeArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/lupa.png"))); // NOI18N
        btnPesquisaGrandeArea.setBorder(null);
        btnPesquisaGrandeArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaGrandeArea(evt);
            }
        });

        btnPesquisaArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/lupa.png"))); // NOI18N
        btnPesquisaArea.setBorder(null);
        btnPesquisaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaArea(evt);
            }
        });

        btnPesquisaEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/lupa.png"))); // NOI18N
        btnPesquisaEspecialidade.setBorder(null);
        btnPesquisaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaEspecialidade(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbGArea)
                        .addGap(353, 353, 353)
                        .addComponent(lbArea))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfGrandeArea, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesquisaGrandeArea)
                        .addGap(33, 33, 33)
                        .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnPesquisaArea))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbSubArea)
                        .addGap(283, 283, 283)
                        .addComponent(lbEspecialidade))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfSubArea, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesquisaSubArea)
                        .addGap(33, 33, 33)
                        .addComponent(tfEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnPesquisaEspecialidade))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbGArea)
                    .addComponent(lbArea))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfGrandeArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisaGrandeArea)
                    .addComponent(tfArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaArea))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSubArea)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lbEspecialidade)))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfSubArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisaSubArea)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tfEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnPesquisaEspecialidade))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Arquivamento"));

        tfNomeAtual.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfNomeAtual.setFocusable(false);

        lbEnderecoArquivo.setText("Nome Original do Arquivo");

        lbNomeArquivo.setText("Nome para Indexação");

        tfNomeNovo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tfNomeNovo.setFocusable(false);

        btnArquivar.setText("Arquivar");
        btnArquivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarArquivar(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEnderecoArquivo)
                    .addComponent(tfNomeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbNomeArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addComponent(btnArquivar)
                .addGap(71, 71, 71))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbNomeArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNomeNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnArquivar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbEnderecoArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setPreferredSize(new java.awt.Dimension(846, 58));
        jPanel5.setRequestFocusEnabled(false);

        btnRegistrar.setText("Registrar Documento");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoRegistrar(evt);
            }
        });

        btnCancelar.setText("Cancelar Tudo");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCancelar(evt);
            }
        });

        btnDocFechar.setText("Fechar ");
        btnDocFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarFechar(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRegistrar)
                .addGap(51, 51, 51)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                .addComponent(btnDocFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnRegistrar});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocFechar)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void calcularCodigo() throws Exception {                
                DocumentoDAO dao = new DocumentoDAO();
                int cod = dao.ultimoRegistro();
                codigo = cod+1;                        
    }
    
    
    protected void pesquisaAutor() {        
        ConsultaAutor dialogo = new ConsultaAutor(null, rootPaneCheckingEnabled);
        dialogo.setVisible(rootPaneCheckingEnabled);
        autorNome = (dialogo.autorNome);      
        autorId = (dialogo.autorId);
        tfAutorNome.setText(String.valueOf(dialogo.autorNome));  
        tfDocAno.requestFocus();
    }
    
    protected void pesquisaLingua()  {        
        ConsultaLingua dialogo = new ConsultaLingua(null, rootPaneCheckingEnabled);
        dialogo.setVisible(rootPaneCheckingEnabled);
        idiomaNome = (dialogo.idiomaNome);      
        idiomaId = (dialogo.idiomaId);
        tfIdiomaNome.setText(String.valueOf(dialogo.idiomaNome));  
        tfBanca.requestFocus();
    }
    
    protected void pesquisaTitulacao() {        
        ConsultaTitulacao dialogo = new ConsultaTitulacao(null, rootPaneCheckingEnabled);
        dialogo.setVisible(rootPaneCheckingEnabled);
        grauNome = (dialogo.grauNome);      
        grauId = (dialogo.grauId);
        tfTifulacao.setText(String.valueOf(dialogo.grauNome));  
        tfPalavrasChaves.requestFocus();
    }

    protected void pesquisaG_Area() {        
        ConsultaGrandeArea dialogo = new ConsultaGrandeArea(null, rootPaneCheckingEnabled);
        dialogo.setVisible(rootPaneCheckingEnabled);
        g_areaNome = (dialogo.g_areaNome);      
        g_areaId = (dialogo.g_areaId);
        tfGrandeArea.setText(String.valueOf(dialogo.g_areaNome));  
        tfArea.requestFocus();
    }

    protected void pesquisaArea() {        
        ConsultaAreas dialogo = new ConsultaAreas(null, rootPaneCheckingEnabled);
        dialogo.setVisible(rootPaneCheckingEnabled);
        areaNome = (dialogo.areaNome);      
        areaId = (dialogo.areaId);
        tfArea.setText(String.valueOf(dialogo.areaNome));  
        tfSubArea.requestFocus();
    }
    
    protected void pesquisaSubArea() {        
        ConsultaSubArea dialogo = new ConsultaSubArea(null, rootPaneCheckingEnabled);
        dialogo.setVisible(rootPaneCheckingEnabled);
        categoriaNome = (dialogo.subAreaNome);      
        categoriaId = (dialogo.subAreaId);
        tfSubArea.setText(String.valueOf(dialogo.subAreaNome));  
        tfEspecialidade.requestFocus();
    }
    
    protected void pesquisaEspecialidade() {        
        ConsultaEspecialidade dialogo = new ConsultaEspecialidade(null, rootPaneCheckingEnabled);
        dialogo.setVisible(rootPaneCheckingEnabled);
        especialidadeId = (dialogo.especialidadeId);      
        especialidadeNome = (dialogo.especialidadeNome);
        tfEspecialidade.setText(String.valueOf(dialogo.especialidadeNome));  
        tfNomeAtual.requestFocus();
    }

    private void arquivar() {             
        JFileChooser arquivo = new JFileChooser();
        int retorno = arquivo.showOpenDialog(null);                
        arquivo.setFileFilter(new javax.swing.filechooser.FileFilter() {        
        @Override
        public boolean accept(File f) {
            return f.getName().toLowerCase().endsWith(".pdf") || f.isDirectory();
        }        
        @Override
        public String getDescription() {
            return "Arquivos do Acrobat(.pdf)";
        }
        } );
        if (retorno==JFileChooser.APPROVE_OPTION) {
            caminhoArquivo = arquivo.getSelectedFile().getAbsolutePath();            
            String nome = arquivo.getSelectedFile().getName();                        
            novoNome = codigo+"-"+g_areaId+""+areaId+""+categoriaId+""+especialidadeId+"-"+autorId+".pdf";
            tfNomeAtual.setText(nome);
            tfNomeNovo.setText(novoNome);
            btnRegistrar.setEnabled(true); btnArquivar.setEnabled(false);
            novoCaminho = "C:\\Documentos\\"+novoNome;            
            
        }
    }
    
    private void salvarDados() {                     
            try {
                DocumentoDAO con = new DocumentoDAO();
                DocumentoBeans doc = new DocumentoBeans();                             
                doc.setAutorId(autorId);       
                doc.setDocAno(Integer.parseInt(tfPaginas.getText())); 
                doc.setAreaId(areaId);
                doc.setG_areaId(g_areaId);
                doc.setIdiomaId(idiomaId);
                doc.setDocBancaDefesa(String.valueOf(tfBanca.getText()));
                doc.setCategoriaId(categoriaId);
                doc.setDocQtPaginas(Integer.parseInt(tfPaginas.getText()));
                doc.setDocPalavrasChaves(String.valueOf(tfPalavrasChaves.getText()));     
                doc.setDocRodape(String.valueOf(tfRodape.getText()));
                doc.setGrauId(grauId);
                doc.setDocTitulo(String.valueOf(tfTitulo.getText()));
                doc.setAdmId(admId);
                doc.setEspecialidadeId(especialidadeId);  
                doc.setDocNomeArquivoOrigem(String.valueOf(tfNomeAtual.getText()));
                doc.setDocNomeArquivoIndice(String.valueOf(tfNomeNovo.getText()));                
                con.salvar(doc);
                JOptionPane.showMessageDialog(rootPane,"Operação concluida com sucesso!");                                                                    
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane,"Ocorreu um erro na inclusão! "+e);
            }  
          
            try {                
            } catch (Exception ex) {
                Logger.getLogger(OperacaoGrandeArea.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }
    
    private void salvarArquivo() throws FileNotFoundException, IOException {
            File arquivar = new File(caminhoArquivo);
            File arquivado = new File(novoCaminho);            
            InputStream in = new FileInputStream(arquivar);
            OutputStream out = new FileOutputStream(arquivado);
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();            
    }
    
    private void limpaCampos() {
        tfArea.setText("");tfAutorNome.setText("");tfBanca.setText("");tfDocAno.setText("");
        tfEspecialidade.setText("");tfGrandeArea.setText("");tfIdiomaNome.setText("");tfNomeAtual.setText("");
        tfNomeNovo.setText("");tfPaginas.setText("");tfPalavrasChaves.setText("");tfRodape.setText("");
        tfSubArea.setText("");tfTifulacao.setText("");tfTitulo.setText("");
        btnArquivar.setEnabled(true);btnRegistrar.setEnabled(false);
    }
    
    private void aoClicarFechar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarFechar
        dispose();          
    }//GEN-LAST:event_aoClicarFechar

    private void buscaAutor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaAutor
        pesquisaAutor();        
    }//GEN-LAST:event_buscaAutor

    private void buscaLingua(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaLingua
        pesquisaLingua();
    }//GEN-LAST:event_buscaLingua

    private void buscaTitulacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaTitulacao
        pesquisaTitulacao();
    }//GEN-LAST:event_buscaTitulacao

    private void aoRegistrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoRegistrar
    if (!"".equals(tfAutorNome.getText()) || !"".equals(tfIdiomaNome.getText()) || 
            !"".equals(tfTifulacao.getText()) || !"".equals(tfGrandeArea.getText()) || 
            !"".equals(tfArea.getText()) || !"".equals(tfSubArea.getText()) || 
            !"".equals(tfEspecialidade.getText())) {     
            try {
                salvarDados();
                salvarArquivo();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(OperacaoDocumento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(OperacaoDocumento.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            int resp = JOptionPane.showConfirmDialog(rootPane, "Cadastrar outro?","Confirmação",JOptionPane.OK_CANCEL_OPTION);
            if (resp==0) {  
                aoClicarCancelar(evt);                
            }
            else {
                aoClicarFechar(evt);
            }                    
    }
    else 
        JOptionPane.showMessageDialog(rootPane,"Todos os Campos devem ser Preenchidos");
        
    }//GEN-LAST:event_aoRegistrar
    
    private void buscaGrandeArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaGrandeArea
        pesquisaG_Area();
    }//GEN-LAST:event_buscaGrandeArea

    private void buscaArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaArea
        pesquisaArea();
    }//GEN-LAST:event_buscaArea

    private void pesquisaSubArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaSubArea
        pesquisaSubArea();
    }//GEN-LAST:event_pesquisaSubArea

    private void pesquisaEspecialidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaEspecialidade
        pesquisaEspecialidade();
    }//GEN-LAST:event_pesquisaEspecialidade

    private void aoClicarArquivar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarArquivar
        arquivar();
    }//GEN-LAST:event_aoClicarArquivar

    private void aoClicarCancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarCancelar
        limpaCampos();
    }//GEN-LAST:event_aoClicarCancelar

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
                OperacaoDocumento dialog = new OperacaoDocumento(new javax.swing.JFrame(), true);                                                
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
    private javax.swing.JLabel blAutor;
    private javax.swing.JButton btnArquivar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDocFechar;
    private javax.swing.JButton btnPesquisaArea;
    private javax.swing.JButton btnPesquisaEspecialidade;
    private javax.swing.JButton btnPesquisaGrandeArea;
    private javax.swing.JButton btnPesquisaLingua;
    private javax.swing.JButton btnPesquisaSubArea;
    private javax.swing.JButton btnPesquisaTitulacao;
    private javax.swing.JButton btnPesuisaAutor;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbBanca;
    private javax.swing.JLabel lbEnderecoArquivo;
    private javax.swing.JLabel lbEspecialidade;
    private javax.swing.JLabel lbGArea;
    private javax.swing.JLabel lbLingua;
    private javax.swing.JLabel lbNomeArquivo;
    private javax.swing.JLabel lbPaginas;
    private javax.swing.JLabel lbPalavrasChave;
    private javax.swing.JLabel lbRodade;
    private javax.swing.JLabel lbSubArea;
    private javax.swing.JLabel lbTitulacao;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField tfArea;
    private javax.swing.JTextField tfAutorNome;
    private javax.swing.JTextField tfBanca;
    private javax.swing.JTextField tfDocAno;
    private javax.swing.JTextField tfEspecialidade;
    private javax.swing.JTextField tfGrandeArea;
    private javax.swing.JTextField tfIdiomaNome;
    private javax.swing.JTextField tfNomeAtual;
    private javax.swing.JTextField tfNomeNovo;
    private javax.swing.JTextField tfPaginas;
    private javax.swing.JTextField tfPalavrasChaves;
    private javax.swing.JTextField tfRodape;
    private javax.swing.JTextField tfSubArea;
    private javax.swing.JTextField tfTifulacao;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
