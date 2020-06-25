
package br.consultas;

import br.beans.AreaBeans;
import br.persistencia.AreaDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rlaecio
 */
public class ConsultaAreas extends javax.swing.JDialog {
    public int areaId;
    public String areaNome;

    public ConsultaAreas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         
        initComponents();        
        setLocationRelativeTo(null);
        
        try {
            preencherArea();
        } catch (Exception ex) {
            Logger.getLogger(ConsultaAreas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfAutorNome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecione uma area da Lista");
        setModalityType(java.awt.Dialog.ModalityType.TOOLKIT_MODAL);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tfAutorNome.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/imagens/icones/lupa.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aoClicarConsultar(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tfAutorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfAutorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setIntercellSpacing(new java.awt.Dimension(5, 1));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultaAreas.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
         if (evt.getClickCount() == 2) {                           
            tfAutorNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString());             
            buscaDaLista(tfAutorNome.getText());                     
        }
        else {            
            tfAutorNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString());             
        }   
    }//GEN-LAST:event_mouseClicked

    private void aoClicarConsultar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aoClicarConsultar
        areaNome = tfAutorNome.getText();
        if (!(areaNome==null || areaNome.equals(""))) {
            try {
                AreaDAO dao = new AreaDAO();                                                                     
                AreaBeans aut1 = dao.procurarArea(areaNome);                                                   
                tfAutorNome.setText(String.valueOf(aut1.getAreaNome()));                                           
                filtraTabela(areaNome);
            } catch (Exception e) {                       
            }
        }        
    }//GEN-LAST:event_aoClicarConsultar
    
    private void buscaDaLista(String nome) {       
        if (!(nome==null || nome.equals(""))) {
            try {
                AreaDAO dao = new AreaDAO();                                                                     
                AreaBeans aut1 = dao.procurarArea(nome);                                            
                areaId = aut1.getAreaId();   
                areaNome = aut1.getAreaNome();
                this.dispose();                
            } catch (Exception e) {                       
            }
        }        
    }
    
     private void filtraTabela(String nome) throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            AreaDAO dao = new AreaDAO();
            ArrayList<AreaBeans> listar = dao.filtraAreas(nome);            
            for (AreaBeans autor : listar) {
               modelo.addRow(new Object[] { autor.getAreaNome()} );    
            }
    }
     
    private void preencherArea() throws Exception {                 
            DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();   
            modelo.setNumRows(0);   
            AreaDAO dao = new AreaDAO();
            ArrayList<AreaBeans> listar = dao.todasAreas();            
            for (AreaBeans area : listar) {
               modelo.addRow(new Object[] { area.getAreaNome()});    
            }
    }
    
    
  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                ConsultaAreas dialog = new ConsultaAreas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfAutorNome;
    // End of variables declaration//GEN-END:variables
}
