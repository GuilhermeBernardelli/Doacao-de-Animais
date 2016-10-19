package view;

/**
 * Frame criado para cadastro de doadores no sistema de doação de animais.
 * @author Guilherme Bernardelli
 * @since Iniciada 04/04/2016
 */

import controller.ControlaDoação;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Doador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrameDoador extends javax.swing.JFrame {
    
    Doador doador;
    ControlaDoação manterDoador = new ControlaDoação();
    
    
    public FrameDoador() {
        initComponents();
        cbEstado.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbRg = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        lbCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");
            tfCpf = new javax.swing.JFormattedTextField(cpf);
        }
        catch(Exception e){
        }
        PanelEndereço = new javax.swing.JPanel();
        lbEndereço = new javax.swing.JLabel();
        tfEndereço = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        lbEstado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##)####-####");
            tfTelefone = new javax.swing.JFormattedTextField(telefone);
        }
        catch(Exception e){
        }
        lbTelefoneCelular = new javax.swing.JLabel();
        tfTelefoneCelular = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##)#####-####");
            tfTelefoneCelular = new javax.swing.JFormattedTextField(telefone);
        }
        catch(Exception e){
        }
        lbTelefoneOutro = new javax.swing.JLabel();
        tfTelefoneOutro = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(##)#####-####");
            tfTelefoneOutro = new javax.swing.JFormattedTextField(telefone);
        }
        catch(Exception e){
        }
        PanelTelefone = new javax.swing.JPanel();
        lbQuantosAnimais = new javax.swing.JLabel();
        tfQuantosAnimais = new javax.swing.JTextField();
        lbAnimaisDoados = new javax.swing.JLabel();
        tfAnimaisDoados = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de doadores");
        setLocation(new java.awt.Point(400, 100));
        setResizable(false);

        lbNome.setText("Nome completo:");

        lbRg.setText("RG:");

        lbCpf.setText("CPF:");

        PanelEndereço.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Endereço"));
        PanelEndereço.setPreferredSize(new java.awt.Dimension(513, 126));

        lbEndereço.setText("Nome rua, avenida, travessa...:");

        lbNumero.setText("Número:");

        lbComplemento.setText("Complemento:");

        lbCidade.setText("Cidade:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AM", "BA", "DF", "PE", "PR", "SC", "SP", "RR", " ", " " }));

        lbEstado.setText("Estado:");

        jLabel1.setText("Bairro:");

        javax.swing.GroupLayout PanelEndereçoLayout = new javax.swing.GroupLayout(PanelEndereço);
        PanelEndereço.setLayout(PanelEndereçoLayout);
        PanelEndereçoLayout.setHorizontalGroup(
            PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEndereçoLayout.createSequentialGroup()
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEndereço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEndereçoLayout.createSequentialGroup()
                        .addComponent(lbNumero)
                        .addContainerGap())
                    .addComponent(tfNumero)))
            .addGroup(PanelEndereçoLayout.createSequentialGroup()
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbComplemento)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCidade)
                    .addGroup(PanelEndereçoLayout.createSequentialGroup()
                        .addComponent(lbCidade)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEstado)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PanelEndereçoLayout.setVerticalGroup(
            PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEndereçoLayout.createSequentialGroup()
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEndereço)
                    .addComponent(lbNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEndereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbComplemento)
                    .addComponent(lbCidade)
                    .addComponent(lbEstado)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel2.setText("Telefone residencial:");

        lbTelefoneCelular.setText("Telefone Celular:");

        lbTelefoneOutro.setText("Telefone Outro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefoneCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTelefoneOutro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfTelefoneOutro)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbTelefoneCelular)
                    .addComponent(lbTelefoneOutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefoneOutro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        lbQuantosAnimais.setText("Quantos animais possuí:");

        lbAnimaisDoados.setText("Quantos animais doados:");

        javax.swing.GroupLayout PanelTelefoneLayout = new javax.swing.GroupLayout(PanelTelefone);
        PanelTelefone.setLayout(PanelTelefoneLayout);
        PanelTelefoneLayout.setHorizontalGroup(
            PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTelefoneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbQuantosAnimais)
                    .addComponent(tfQuantosAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAnimaisDoados)
                    .addComponent(tfAnimaisDoados, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        PanelTelefoneLayout.setVerticalGroup(
            PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTelefoneLayout.createSequentialGroup()
                .addGroup(PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantosAnimais)
                    .addComponent(lbAnimaisDoados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuantosAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAnimaisDoados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSalvar)
                .addGap(18, 18, 18)
                .addComponent(btBuscar)
                .addGap(18, 18, 18)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btBuscar)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btVoltar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelEndereço, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(lbRg)
                            .addComponent(tfRg))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCpf)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRg)
                    .addComponent(lbCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelEndereço, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        doador = new Doador();
        doador.setNome(tfNome.getText());
        doador.setRg(tfRg.getText());
        doador.setCpf(tfCpf.getText());
        doador.setEndereço(tfEndereço.getText());
        doador.setNumero(tfNumero.getText());
        doador.setComplemento(tfComplemento.getText());
        doador.setBairro(tfBairro.getText());
        doador.setCidade(tfCidade.getText());
        doador.setEstado(cbEstado.getItemAt(cbEstado.getSelectedIndex()));
        doador.setTelefone(tfTelefone.getText());
        doador.setTelefoneCelular(tfTelefoneCelular.getText());
        doador.setTelefoneOutro(tfTelefoneOutro.getText());
        doador.setAnimaisDoados(tfAnimaisDoados.getText());
        doador.setQuantosAnimais(tfQuantosAnimais.getText());
        try {
            manterDoador.criarDoador(doador);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(FrameDoador.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        btLimparActionPerformed(evt);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        ResultSet rs;
        try{
            if( manterDoador.buscarDoador(tfNome.getText())== null){
                JOptionPane.showMessageDialog(this,"Nenhum doador cadastrado");
            }
            else{
                rs = manterDoador.buscarDoador(tfNome.getText());
                tfRg.setText(rs.getString("rg"));
                tfCpf.setText(rs.getString("cpf"));
                tfEndereço.setText(rs.getString("endereço"));
                tfNumero.setText(rs.getString("endereço"));
                tfComplemento.setText(rs.getString("complemento"));
                tfBairro.setText(rs.getString("bairro"));
                tfCidade.setText(rs.getString("cidade"));
                cbEstado.setSelectedItem(rs.getString("estado"));
                tfTelefone.setText(rs.getString("telefone"));
                tfTelefoneCelular.setText(rs.getString("telefoneCelular"));
                tfTelefoneOutro.setText(rs.getString("telefoneOutro"));
                tfAnimaisDoados.setText(rs.getString("animaisDoados"));
                tfQuantosAnimais.setText(Integer.toString(rs.getInt("quantosAnimais")));
                btSalvar.setEnabled(false);
            }
        }
        catch(ClassNotFoundException | SQLException | HeadlessException ex){
             Logger.getLogger(FrameDoação.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfNome.setText("");
        tfRg.setText("");
        tfCpf.setText("");
        tfEndereço.setText("");
        tfNumero.setText("");
        tfComplemento.setText("");
        tfBairro.setText("");
        tfCidade.setText("");
        cbEstado.setSelectedIndex(-1);
        tfTelefone.setText("");
        tfTelefoneCelular.setText("");
        tfTelefoneOutro.setText("");
        tfAnimaisDoados.setText("");
        tfQuantosAnimais.setText("");
        btSalvar.setEnabled(true);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        try{
            doador = new Doador();
            doador.setNome(tfNome.getText());
            doador.setRg(tfRg.getText());
            doador.setCpf(tfCpf.getText());
            doador.setEndereço(tfEndereço.getText());
            doador.setNumero(tfNumero.getText());
            doador.setComplemento(tfComplemento.getText());
            doador.setBairro(tfBairro.getText());
            doador.setCidade(tfCidade.getText());
            doador.setEstado(cbEstado.getItemAt(cbEstado.getSelectedIndex()));
            doador.setTelefone(tfTelefone.getText());
            doador.setTelefoneCelular(tfTelefoneCelular.getText());
            doador.setTelefoneOutro(tfTelefoneOutro.getText());
            doador.setAnimaisDoados(tfAnimaisDoados.getText());
            doador.setQuantosAnimais(tfQuantosAnimais.getText());
            manterDoador.receberDoadorAtualizar(doador, tfNome.getText());
        
        }
        catch(NumberFormatException | ClassNotFoundException | SQLException ex){
             Logger.getLogger(FrameDoação.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        try{
            manterDoador.receberExcluirDoador(tfNome.getText());
            btSalvar.setEnabled(true);
            btAlterar.setEnabled(true);
            btBuscar.setEnabled(true);
            btLimparActionPerformed(evt);
        }
        catch(ClassNotFoundException | SQLException | HeadlessException ex){
             Logger.getLogger(FrameDoação.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameDoador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDoador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDoador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDoador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrameDoador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEndereço;
    private javax.swing.JPanel PanelTelefone;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbAnimaisDoados;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEndereço;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbQuantosAnimais;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbTelefoneCelular;
    private javax.swing.JLabel lbTelefoneOutro;
    private javax.swing.JTextField tfAnimaisDoados;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEndereço;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfQuantosAnimais;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfTelefoneCelular;
    private javax.swing.JTextField tfTelefoneOutro;
    // End of variables declaration//GEN-END:variables
}
