package PRINCIPAL.PERFIL;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import VARIAVEIS.User;
import VARIAVEIS.PERFIL.*;

import METODOS.MEUser;
import METODOS.PERFIL.*;

public class IfrmUser extends javax.swing.JInternalFrame {

    private static IfrmUser ifrmUser;
    private int idUser;
    private String tipo;
    private MEUser meUser = new MEUser();
    private MEAutonomo meAut = new MEAutonomo();
    private MEColaborador meCol = new MEColaborador();
    private MEEmpresa meEmp = new MEEmpresa();
    private MEJAprendiz meJap = new MEJAprendiz();

    public static IfrmUser getInstance() {
        if (ifrmUser == null) {
            ifrmUser = new IfrmUser();
        }
        return ifrmUser;
    }

    public void abreFecha() {
        if (ifrmUser.isVisible()) {
            ifrmUser.setVisible(false);
        } else {
            ifrmUser.setVisible(true);
        }
    }

    public void encerra() {
        ifrmUser.dispose();
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public IfrmUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrPainelUser = new javax.swing.JScrollPane();
        pnlUser = new javax.swing.JPanel();
        lblFormatado = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEdita1 = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblBio = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEdita1 = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtFormatado = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        cbxEstado = new javax.swing.JComboBox<>();
        mnuBio = new javax.swing.JScrollPane();
        txtBio = new javax.swing.JTextArea();
        lblGuardaDados = new javax.swing.JLabel();
        lblEdita2 = new javax.swing.JLabel();
        lblCbx = new javax.swing.JLabel();
        txtEdita2 = new javax.swing.JTextField();
        cbxEdita = new javax.swing.JComboBox<>();
        lblImagem = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        lblFilho = new javax.swing.JLabel();
        txtFilho = new javax.swing.JTextField();
        lblEstagio = new javax.swing.JLabel();
        cbxEstagio = new javax.swing.JComboBox();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        pnlUser.setBackground(new java.awt.Color(0, 0, 0));
        pnlUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Meus Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlUser.setForeground(new java.awt.Color(255, 255, 255));
        pnlUser.setPreferredSize(new java.awt.Dimension(200, 900));

        lblFormatado.setBackground(new java.awt.Color(0, 0, 0));
        lblFormatado.setForeground(new java.awt.Color(255, 255, 255));
        lblFormatado.setText("lblFormatado");

        lblNome.setBackground(new java.awt.Color(0, 0, 0));
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome:");

        lblEdita1.setBackground(new java.awt.Color(0, 0, 0));
        lblEdita1.setForeground(new java.awt.Color(255, 255, 255));
        lblEdita1.setText("lblEdita1");

        lblBairro.setBackground(new java.awt.Color(0, 0, 0));
        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setText("Bairro:");

        lblTelefone.setBackground(new java.awt.Color(0, 0, 0));
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone:");

        lblEstado.setBackground(new java.awt.Color(0, 0, 0));
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado:");

        lblCidade.setBackground(new java.awt.Color(0, 0, 0));
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("Cidade:");

        lblBio.setBackground(new java.awt.Color(0, 0, 0));
        lblBio.setForeground(new java.awt.Color(255, 255, 255));
        lblBio.setText("Bio:");

        try {
            txtFormatado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE:", "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        txtBio.setColumns(20);
        txtBio.setRows(5);
        txtBio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBioKeyReleased(evt);
            }
        });
        mnuBio.setViewportView(txtBio);

        lblEdita2.setBackground(new java.awt.Color(0, 0, 0));
        lblEdita2.setForeground(new java.awt.Color(255, 255, 255));
        lblEdita2.setText("lblEdita2");

        lblCbx.setBackground(new java.awt.Color(0, 0, 0));
        lblCbx.setForeground(new java.awt.Color(255, 255, 255));
        lblCbx.setText("lblCbx");

        cbxEdita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PROCURANDO OPORTUNIDADES", "TRABALHANDO" }));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Sem-foto.jpeg"))); // NOI18N

        lblData.setBackground(new java.awt.Color(0, 0, 0));
        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data de nascimento:");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblFilho.setBackground(new java.awt.Color(0, 0, 0));
        lblFilho.setForeground(new java.awt.Color(255, 255, 255));
        lblFilho.setText("Nº de filhos:");

        lblEstagio.setBackground(new java.awt.Color(0, 0, 0));
        lblEstagio.setForeground(new java.awt.Color(255, 255, 255));
        lblEstagio.setText("Você oferece estágios:");

        cbxEstagio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        lblEmail.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("E-mail:");

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblCbx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblEdita1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdita1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblEdita2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdita2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(lblGuardaDados))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblFormatado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImagem)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblFilho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilho, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblBio))
                    .addComponent(mnuBio, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblEstagio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserLayout.createSequentialGroup()
                .addComponent(lblImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormatado)
                    .addComponent(txtFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFilho)
                    .addComponent(txtFilho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdita1)
                    .addComponent(txtEdita1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdita2)
                    .addComponent(txtEdita2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCbx)
                    .addComponent(cbxEdita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstagio)
                    .addComponent(cbxEstagio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblBio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnuBio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblGuardaDados)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        scrPainelUser.setViewportView(pnlUser);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrPainelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrPainelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        ifrmUser.setSize(350, 850);
        preencheDados();
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        verificaVazios();
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtBioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBioKeyReleased
        txtBio.setLineWrap(true);
    }//GEN-LAST:event_txtBioKeyReleased
    private void preencheDados() {
        String data;
        String dataF;
        String[] dataCort;
        String ano;
        String mes;
        String dia;
        ArrayList<User> user = meUser.pesquisarUser(idUser);
        for (User us : user) {
            tipo = us.getTipoUser();
            if (us.getFotoUser() != null) {
                lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/PERFIL/" + us.getFotoUser())));
            } else {
                lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Sem-foto.jpeg")));
            }

            switch (tipo) {

                case "Autônomo":
                    cpnj("Cpf");
                    txtFormatado.setText(us.getCpfUser());
                    txtNome.setText(us.getNomeUser());
                    txtEmail.setText(us.getEmailUser());
                    txtTelefone.setText(us.getTelefoneUser());
                    cbxEstado.setSelectedItem(us.getEstadoUser());
                    txtCidade.setText(us.getCidadeUser());
                    txtBairro.setText(us.getBairroUser());
                    txtFilho.setText(us.getFilhoUser());
                    txtBio.setText(us.getBioUser());

                    data = us.getDataUser();
                    if (data != null) {
                        dataCort = data.split("-");
                        ano = dataCort[0];
                        mes = dataCort[1];
                        dia = dataCort[2];
                        dataF = dia + "/" + mes + "/" + ano;
                        txtData.setText(dataF);
                    } else {
                        txtData.setText("");
                    }

                    lblCbx.setVisible(false);
                    cbxEdita.setVisible(false);
                    lblEstagio.setVisible(false);
                    cbxEstagio.setVisible(false);
                    preencheAutonomo();
                    break;

                case "Colaborador":
                    cpnj("Cpf");
                    txtFormatado.setText(us.getCpfUser());
                    txtNome.setText(us.getNomeUser());
                    txtEmail.setText(us.getEmailUser());
                    txtTelefone.setText(us.getTelefoneUser());
                    cbxEstado.setSelectedItem(us.getEstadoUser());
                    txtCidade.setText(us.getCidadeUser());
                    txtBairro.setText(us.getBairroUser());
                    txtFilho.setText(us.getFilhoUser());
                    txtBio.setText(us.getBioUser());

                    data = us.getDataUser();
                    if (data != null) {
                        dataCort = data.split("-");
                        ano = dataCort[0];
                        mes = dataCort[1];
                        dia = dataCort[2];
                        dataF = dia + "/" + mes + "/" + ano;
                        txtData.setText(dataF);
                    } else {
                        txtData.setText("");
                    }

                    lblEdita2.setVisible(false);
                    txtEdita2.setVisible(false);
                    lblEstagio.setVisible(false);
                    cbxEstagio.setVisible(false);
                    preencheColaborador();
                    break;

                case "Empresa":
                    cpnj("Cnpj");
                    txtFormatado.setText(us.getCnpjUser());
                    txtNome.setText(us.getNomeUser());
                    txtEmail.setText(us.getEmailUser());
                    txtTelefone.setText(us.getTelefoneUser());
                    cbxEstado.setSelectedItem(us.getEstadoUser());
                    txtCidade.setText(us.getCidadeUser());
                    txtBairro.setText(us.getBairroUser());
                    txtBio.setText(us.getBioUser());

                    lblCbx.setVisible(false);
                    lblData.setVisible(false);
                    lblFilho.setVisible(false);
                    cbxEdita.setVisible(false);
                    lblEdita2.setVisible(false);
                    txtEdita2.setVisible(false);
                    txtData.setVisible(false);
                    txtFilho.setVisible(false);
                    preencheEmpresa();
                    break;

                case "Jovem Aprendiz":
                    cpnj("Cpf");
                    txtFormatado.setText(us.getCpfUser());
                    txtNome.setText(us.getNomeUser());
                    txtEmail.setText(us.getEmailUser());
                    txtTelefone.setText(us.getTelefoneUser());
                    cbxEstado.setSelectedItem(us.getEstadoUser());
                    txtCidade.setText(us.getCidadeUser());
                    txtBairro.setText(us.getBairroUser());
                    txtBio.setText(us.getBioUser());

                    data = us.getDataUser();
                    if (data != null) {
                        dataCort = data.split("-");
                        ano = dataCort[0];
                        mes = dataCort[1];
                        dia = dataCort[2];
                        dataF = dia + "/" + mes + "/" + ano;
                        txtData.setText(dataF);
                    } else {
                        txtData.setText("");
                    }

                    lblCbx.setVisible(false);
                    cbxEdita.setVisible(false);
                    lblEstagio.setVisible(false);
                    cbxEstagio.setVisible(false);
                    lblFilho.setVisible(false);
                    txtFilho.setVisible(false);
                    preencheJAprendiz();
                    break;
            }
            setLabels(tipo);
        }
    }

    private void cpnj(String tipo) {
        int igual = tipo.compareTo("Cpf");
        if (igual == 0) {
            try {
                MaskFormatter format = new MaskFormatter("###.###.###-##");
                txtFormatado.setValue(null);
                txtFormatado.setFormatterFactory(new DefaultFormatterFactory(format));
            } catch (ParseException err) {
                System.err.println("Erro np cpnj -> cpf: " + err);
            }
        } else {
            try {
                MaskFormatter format = new MaskFormatter("##.###.###/####-##");
                txtFormatado.setValue(null);
                txtFormatado.setFormatterFactory(new DefaultFormatterFactory(format));
            } catch (ParseException err) {
                System.err.println("Erro no cpnj -> cnpj: " + err);
            }
        }
    }

    private void preencheAutonomo() {
        ArrayList<Autonomo> auto = meAut.pesquisarAutonomo(idUser);
        for (Autonomo au : auto) {
            txtEdita1.setText(au.getProfissaoAutonomo());
            txtEdita2.setText(au.getAvaliacaoAutonomo());
        }

    }

    private void preencheColaborador() {
        ArrayList<Colaborador> col = meCol.pesquisarColaborador(idUser);
        for (Colaborador co : col) {
            txtEdita1.setText(co.getAreaColaborador());
            cbxEdita.setSelectedItem(co.getSituacaoColaborador());
        }
    }

    private void preencheEmpresa() {
        ArrayList<Empresa> emp = meEmp.pesquisarEmpresa(idUser);
        for (Empresa em : emp) {
            txtEdita1.setText(em.getTrabalhoEmpresa());
            cbxEstagio.setSelectedItem(em.getEstagioEmpresa());
        }
    }

    private void preencheJAprendiz() {
        ArrayList<JAprendiz> apr = meJap.pesquisarJAprendiz(idUser);
        for (JAprendiz ap : apr) {
            txtEdita1.setText(ap.getAreaAprendiz());
            txtEdita2.setText(ap.getInstituicaoAprendiz());
        }
    }

    private void setLabels(String tipo) {
        switch (tipo) {
            case "Autônomo":
                lblFormatado.setText("Cpf:");
                lblEdita1.setText("Profissão:");
                lblEdita2.setText("Avaliação");
                break;
            case "Colaborador":
                lblFormatado.setText("Cpf:");
                lblEdita1.setText("Área de atuação:");
                lblCbx.setText("Situação atual:");
                break;
            case "Empresa":
                lblFormatado.setText("Cnpj:");
                lblEdita1.setText("Trabalhos ofertados:");
                break;
            case "Jovem Aprendiz":
                lblFormatado.setText("Cpf:");
                lblEdita1.setText("Área:");
                lblEdita2.setText("Instituição:");
                break;
        }
    }

    private void verificaVazios() {
        switch (tipo) {
            case "Autônomo":
                if (txtData.getText().equals("  /  /    ") || txtFilho.getText() == null) {
                    JOptionPane.showMessageDialog(null, "Alguns dados estão vazios!\n"
                            + "Preencha-os para manter seu perfil completo", "Dados vazios", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Colaborador":
                if (txtData.getText().equals("  /  /    ") || txtFilho.getText() == null) {
                    JOptionPane.showMessageDialog(null, "Alguns dados estão vazios!\n"
                            + "Preencha-os para manter seu perfil completo", "Dados vazios", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case "Empresa":
                if (txtBio.getText() == null) {
                    JOptionPane.showMessageDialog(null, "Alguns dados estão vazios!\n"
                            + "Preencha-os para manter seu perfil completo", "Dados vazios", JOptionPane.INFORMATION_MESSAGE);
                }

                break;
            case "Jovem Aprendiz":
                if (txtData.getText().equals("  /  /    ")) {
                    JOptionPane.showMessageDialog(null, "Alguns dados estão vazios!\n"
                            + "Preencha-os para manter seu perfil completo", "Dados vazios", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxEdita;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox cbxEstagio;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBio;
    private javax.swing.JLabel lblCbx;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblEdita1;
    private javax.swing.JLabel lblEdita2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstagio;
    private javax.swing.JLabel lblFilho;
    private javax.swing.JLabel lblFormatado;
    private javax.swing.JLabel lblGuardaDados;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JScrollPane mnuBio;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JScrollPane scrPainelUser;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextArea txtBio;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEdita1;
    private javax.swing.JTextField txtEdita2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFilho;
    private javax.swing.JFormattedTextField txtFormatado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
