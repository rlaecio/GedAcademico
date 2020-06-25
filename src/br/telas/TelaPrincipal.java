
package br.telas;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author rlaecio
 */
public class TelaPrincipal extends javax.swing.JFrame {
    //Barra de progresso do splahs
   
    /** Creates new form TelaPrincipal */
    public TelaPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //inicia tela principal em modo maximizado
        //setSize(1024,700);
        setLocationRelativeTo(null);
        //new TelaLogon(this, rootPaneCheckingEnabled).setVisible(true);//inicia a tela de logon
        HashSet conj = new HashSet(getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS)); 
        boolean add = conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento Eletronico de documentos Tecnico Cientificos");
        setAlwaysOnTop(true);

        jMenu1.setText("Operações");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Administradores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAdmin(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Autores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarAutores(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Documentos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarDocumentos(evt);
            }
        });
        jMenu1.add(jMenuItem8);
        jMenu1.add(jSeparator1);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Grande Area");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarGArea(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Area");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarArea(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Sub-Area");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarCategoria(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setText("Especialidade");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarEspecialidade(evt);
            }
        });
        jMenu1.add(jMenuItem11);
        jMenu1.add(jSeparator3);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Grau");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarGrau(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("Idiomas");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarIdiomas(evt);
            }
        });
        jMenu1.add(jMenuItem10);
        jMenu1.add(jSeparator2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Sair");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSair(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatorios");

        jMenuItem3.setText("Teste");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Sobre");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarSobre(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aoClicarSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSair
        System.exit(0);
    }//GEN-LAST:event_aoClicarSair

    private void aoClicarAdmin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAdmin
        new OperacaoAdministrador(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarAdmin

    private void aoClicarSobre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarSobre
        new CaixaSobre(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarSobre

    private void aoClicarDocumentos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarDocumentos
        new OperacaoDocumento(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);     
    }//GEN-LAST:event_aoClicarDocumentos

    private void aoClicarAutores(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarAutores
        new OperacaoAutores(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarAutores

    private void aoClicarArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarArea
        new OperacaoArea(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarArea

    private void aoClicarCategoria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarCategoria
        new OperacaoCategoria(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarCategoria

    private void aoClicarGrau(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarGrau
        new OperacaoGrau(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarGrau

    private void aoClicarIdiomas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarIdiomas
        new OperacaoIdioma(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarIdiomas

    private void aoClicarGArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarGArea
        new OperacaoGrandeArea(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarGArea

    private void aoClicarEspecialidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarEspecialidade
        new OperacaoEspecialidade(this, rootPaneCheckingEnabled).setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_aoClicarEspecialidade

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
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}