/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import data.ClienteData;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.PieChart.Data;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author PC
 */
public class JFCadCliente extends javax.swing.JInternalFrame {
    
    private Cliente objCliente;
    private ClienteData DAO;
    private ArrayList<Cliente> listaDeClientes;
    int acao = 0;
    /**
     * Creates new form JFCadUsuario
     */
    public JFCadCliente() {
        initComponents();
        objCliente = new Cliente();
        listaDeClientes = new ArrayList<>();
        
        ActionEvent evt = null;
        
        jbCancelarActionPerformed(evt);
        
        try {
            DAO = new ClienteData();
        } catch (Exception ex) {
            Logger.getLogger(JFCadCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlId = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfTelefone = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jlPesquisa = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlIdCliente = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setTitle("Cliente");

        jlId.setText("ID");

        jlNome.setText("Nome");

        jlTelefone.setText("Telefone");

        jlEndereco.setText("Endereço");

        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jtfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelefoneActionPerformed(evt);
            }
        });

        jtfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEnderecoActionPerformed(evt);
            }
        });

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus_32.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_32.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil_32.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jlPesquisa.setText("Pesquisa");

        jtfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPesquisaActionPerformed(evt);
            }
        });
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyReleased(evt);
            }
        });

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Endereco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCliente);
        if (jtCliente.getColumnModel().getColumnCount() > 0) {
            jtCliente.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tick_32.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/block_32.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlIdCliente.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlEndereco)
                            .addGap(18, 18, 18)
                            .addComponent(jtfEndereco))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlId)
                                .addComponent(jlNome)
                                .addComponent(jlTelefone))
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfNome)
                                .addComponent(jtfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                .addComponent(jlIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditar)
                        .addGap(17, 17, 17)
                        .addComponent(jbExcluir)
                        .addGap(38, 38, 38)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlId)
                    .addComponent(jlIdCliente))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEndereco)
                    .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesquisa)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jtfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelefoneActionPerformed

    private void jtfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEnderecoActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
    
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        
        jtfPesquisa.setEnabled(false);           
        jtCliente.setEnabled(false);
        
        jtfNome.setEnabled(true);
        jtfTelefone.setEnabled(true);
        jtfEndereco.setEnabled(true);
        jtfNome.setText("");
        jtfTelefone.setText("");
        jtfEndereco.setText("");
        acao = 1;
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
    try {
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o registro?") == JOptionPane.YES_OPTION) {
                if (DAO.excluir(Integer.parseInt(jlIdCliente.getText()))) {
                    JOptionPane.showMessageDialog(this, "Excluído.");
                    jbCancelarActionPerformed(evt);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir: " + e.getMessage());
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        acao = 2; //editar
        jtfNome.setEnabled(true);
        jtfTelefone.setEnabled(true);
        jtfEndereco.setEnabled(true);
        
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbNovo.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);

    }//GEN-LAST:event_jbEditarActionPerformed

    private void jtfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyReleased
        try {
            listaDeClientes = DAO.pesquisar(jtfPesquisa.getText());
            DefaultTableModel mp = (DefaultTableModel) jtCliente.getModel();
            mp.setNumRows(0);
            for (Cliente u : listaDeClientes) {
                mp.addRow(new String[]{"" + u.getIdCliente(), u.getNomeCliente(), u.getTelefone(), u.getEndereco()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar:" + e.getMessage());
        }
    }//GEN-LAST:event_jtfPesquisaKeyReleased

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    if (acao == 1) {
                        if (DAO.incluir(objCliente)) {
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso!",
                                    "Meu sistema", JOptionPane.INFORMATION_MESSAGE);
                            //salvar no banco
                            jbCancelarActionPerformed(evt);
                        }
                    }
                    if (acao == 2) {
                        if (DAO.editar(objCliente)) {
                            JOptionPane.showMessageDialog(this, "Editado com sucesso!",
                                    "Meu sistema", JOptionPane.INFORMATION_MESSAGE);
                            //salvar no banco
                            jbCancelarActionPerformed(evt);
                        }
                    }
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar:" + erro.getMessage(), "Sistema", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtfPesquisa.setEnabled(true);
        jtCliente.setEnabled(true);
        jtfNome.setEnabled(false);
        jtfTelefone.setEnabled(false);
        jtfEndereco.setEnabled(false);
        jtfNome.setText("");
        jtfTelefone.setText("");
        jtfEndereco.setText("");
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPesquisaActionPerformed

    private void jtClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClienteMouseClicked
    int linhaSelecionada = jtCliente.getSelectedRow();
        if (linhaSelecionada > -1) {
            jlIdCliente.setText("" + listaDeClientes.get(linhaSelecionada).getIdCliente());
            jtfNome.setText(listaDeClientes.get(linhaSelecionada).getNomeCliente());
            jtfTelefone.setText(listaDeClientes.get(linhaSelecionada).getTelefone());
            jtfEndereco.setText(listaDeClientes.get(linhaSelecionada).getEndereco());
            jbEditar.setEnabled(true);
            jbExcluir.setEnabled(true);
        } else {
            jbEditar.setEnabled(false);
            jbExcluir.setEnabled(false);
        }
    }//GEN-LAST:event_jtClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlIdCliente;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
    private boolean validarCampos() {
        String msg = new String();
        if (jtfNome.getText().trim().length() < 3) {
            msg = "\nVerifique o nome!";
        }
        
        if (msg.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "erros" + msg,
                    "\nValidação", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
    
        private boolean preencherObjeto() throws Exception { 
        objCliente.setIdCliente(Integer.parseInt(jlIdCliente.getText()));
        objCliente.setNomeCliente(jtfNome.getText());
        objCliente.setTelefone(jtfTelefone.getText());
        objCliente.setEndereco(jtfEndereco.getText());

        return true;
        }

    private void Dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
