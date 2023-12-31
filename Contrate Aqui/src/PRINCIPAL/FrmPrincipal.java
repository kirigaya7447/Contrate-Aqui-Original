package PRINCIPAL;

import CONEXAO.Conectar;
import JANELA.Janelas;

import METODOS.*;

import PRINCIPAL.PERFIL.*;
import PRINCIPAL.POSTS.*;

import VARIAVEIS.*;
import VARIAVEIS.PERFIL.*;
import java.awt.Dimension;

import java.awt.Image;
import java.awt.Toolkit;

import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;

public class FrmPrincipal extends javax.swing.JFrame {

    private Connection conecta;
    private Janelas abreJanela;

    private int cadastro;
    private int idTable;

    private Autonomo aut = new Autonomo();
    private Colaborador col = new Colaborador();
    private Empresa emp = new Empresa();
    private JAprendiz apr = new JAprendiz();
    private Login lo = new Login();
    private Posts posts = new Posts();
    private User user = new User();

    private MELogin melo = new MELogin();
    private MEPosts mePost = new MEPosts();
    private MEUser meUser = new MEUser();

    private IfrmAlterar ifrmAlterar = new IfrmAlterar();
    private IfrmAlterarFoto ifrmFoto = new IfrmAlterarFoto();
    private IfrmUser ifrmUser = new IfrmUser();

    private boolean userAberto = false;
    private boolean alterarAberto = false;
    private boolean alteraFotoAberto = false;
    private boolean postarAberto = false;

    Properties properties = System.getProperties();

    File arquivo;

    public FrmPrincipal() {
        initComponents();
        this.abreJanela = new Janelas(dkpPrincipal);
        this.conecta = new Conectar().getConexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpPrincipal = new javax.swing.JDesktopPane();
        ifrmLogin = new javax.swing.JInternalFrame();
        pnlLogin = new javax.swing.JPanel();
        lblOla = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        chbVisualizar = new javax.swing.JCheckBox();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblGuardaDados = new javax.swing.JLabel();
        lblGuardaAtuacao = new javax.swing.JLabel();
        lblErroLog = new javax.swing.JLabel();
        btnVerPosts = new javax.swing.JButton();
        ifrmCadastro = new javax.swing.JInternalFrame();
        pnlCadastro = new javax.swing.JPanel();
        lblDados = new javax.swing.JLabel();
        txtDados = new javax.swing.JTextField();
        lblFormatado = new javax.swing.JLabel();
        txtFormatado = new javax.swing.JFormattedTextField();
        txtFormatado2 = new javax.swing.JFormattedTextField();
        lblFormatado2 = new javax.swing.JLabel();
        lblCbx = new javax.swing.JLabel();
        cbxDados = new javax.swing.JComboBox<>();
        txtDados2 = new javax.swing.JTextField();
        lblDados2 = new javax.swing.JLabel();
        lblErro1 = new javax.swing.JLabel();
        lblErro2 = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();
        lblSenha2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtSenha2 = new javax.swing.JPasswordField();
        txtSenha1 = new javax.swing.JPasswordField();
        ckxSenha1 = new javax.swing.JCheckBox();
        ckxSenha2 = new javax.swing.JCheckBox();
        btnProximo = new javax.swing.JButton();
        ifrmPostagens = new javax.swing.JInternalFrame();
        pnlPrincipalPosts = new javax.swing.JPanel();
        scrTable = new javax.swing.JScrollPane();
        tblTabel = new javax.swing.JTable();
        lblAviso1 = new javax.swing.JLabel();
        lblAviso2 = new javax.swing.JLabel();
        pnlAcoesPosts = new javax.swing.JPanel();
        btnPostar = new javax.swing.JButton();
        btnNoticia = new javax.swing.JButton();
        btnVerPerfil = new javax.swing.JButton();
        mnbMenu = new javax.swing.JMenuBar();
        mnuOpcoes = new javax.swing.JMenu();
        mniSenha = new javax.swing.JMenuItem();
        mniAlterar = new javax.swing.JMenuItem();
        mniFoto = new javax.swing.JMenuItem();
        mniVoltar = new javax.swing.JMenuItem();
        mniSair = new javax.swing.JMenuItem();
        mnuPosts = new javax.swing.JMenu();
        mniPosts = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ifrmLogin.setVisible(true);

        pnlLogin.setBackground(new java.awt.Color(0, 0, 0));
        pnlLogin.setForeground(new java.awt.Color(255, 255, 255));

        lblOla.setBackground(new java.awt.Color(0, 0, 0));
        lblOla.setForeground(new java.awt.Color(255, 255, 255));
        lblOla.setText("Seja bem vindo!");

        lblEmail.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");

        lblSenha.setBackground(new java.awt.Color(0, 0, 0));
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha:");

        lblCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        lblCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrar.setText("Não tem uma conta ? Cadastre-se");

        chbVisualizar.setBackground(new java.awt.Color(0, 0, 0));
        chbVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        chbVisualizar.setText("Visualizar");
        chbVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbVisualizarActionPerformed(evt);
            }
        });

        btnLogin.setText("Entrar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastre-se");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblErroLog.setBackground(new java.awt.Color(0, 0, 0));
        lblErroLog.setForeground(new java.awt.Color(255, 0, 0));

        btnVerPosts.setText("Ver postagens");
        btnVerPosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPostsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblGuardaDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblGuardaAtuacao)
                .addGap(46, 46, 46))
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblOla))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErroLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlLoginLayout.createSequentialGroup()
                                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblSenha)
                                            .addComponent(lblEmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlLoginLayout.createSequentialGroup()
                                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(chbVisualizar))
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnlLoginLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(btnLogin)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnVerPosts)))
                                .addGap(52, 52, 52))))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(btnCadastrar))
                            .addComponent(lblCadastrar))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addComponent(lblOla)
                .addGap(3, 3, 3)
                .addComponent(lblErroLog, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(chbVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnVerPosts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addGap(28, 28, 28)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblGuardaDados)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addComponent(lblGuardaAtuacao)
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout ifrmLoginLayout = new javax.swing.GroupLayout(ifrmLogin.getContentPane());
        ifrmLogin.getContentPane().setLayout(ifrmLoginLayout);
        ifrmLoginLayout.setHorizontalGroup(
            ifrmLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ifrmLoginLayout.setVerticalGroup(
            ifrmLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ifrmCadastro.setBackground(new java.awt.Color(0, 0, 0));
        ifrmCadastro.setForeground(new java.awt.Color(255, 255, 255));
        ifrmCadastro.setVisible(true);

        pnlCadastro.setBackground(new java.awt.Color(0, 0, 0));
        pnlCadastro.setForeground(new java.awt.Color(255, 255, 255));

        lblDados.setBackground(new java.awt.Color(0, 0, 0));
        lblDados.setForeground(new java.awt.Color(255, 255, 255));
        lblDados.setText("Dados1");

        lblFormatado.setBackground(new java.awt.Color(0, 0, 0));
        lblFormatado.setForeground(new java.awt.Color(255, 255, 255));
        lblFormatado.setText("Formatado");

        try {
            txtFormatado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtFormatado2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtFormatado2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFormatado2KeyReleased(evt);
            }
        });

        lblFormatado2.setBackground(new java.awt.Color(0, 0, 0));
        lblFormatado2.setForeground(new java.awt.Color(255, 255, 255));
        lblFormatado2.setText("Formatado2");

        lblCbx.setBackground(new java.awt.Color(255, 255, 255));
        lblCbx.setForeground(new java.awt.Color(255, 255, 255));
        lblCbx.setText("Cbx");

        cbxDados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE:" }));

        lblDados2.setBackground(new java.awt.Color(0, 0, 0));
        lblDados2.setForeground(new java.awt.Color(255, 255, 255));
        lblDados2.setText("Dados2");

        lblErro1.setBackground(new java.awt.Color(0, 0, 0));
        lblErro1.setForeground(new java.awt.Color(255, 0, 0));
        lblErro1.setText("Erro");

        lblErro2.setBackground(new java.awt.Color(0, 0, 0));
        lblErro2.setForeground(new java.awt.Color(255, 0, 0));
        lblErro2.setText("Erro");

        lblSenha1.setBackground(new java.awt.Color(0, 0, 0));
        lblSenha1.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha1.setText("Senha1");

        lblSenha2.setBackground(new java.awt.Color(0, 0, 0));
        lblSenha2.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha2.setText("Senha2");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtSenha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenha2KeyReleased(evt);
            }
        });

        txtSenha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenha1KeyReleased(evt);
            }
        });

        ckxSenha1.setBackground(new java.awt.Color(0, 0, 0));
        ckxSenha1.setForeground(new java.awt.Color(255, 255, 255));
        ckxSenha1.setText("Visualizar");
        ckxSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckxSenha1ActionPerformed(evt);
            }
        });

        ckxSenha2.setBackground(new java.awt.Color(0, 0, 0));
        ckxSenha2.setForeground(new java.awt.Color(255, 255, 255));
        ckxSenha2.setText("Visualizar");
        ckxSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckxSenha2ActionPerformed(evt);
            }
        });

        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProximo))
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlCadastroLayout.createSequentialGroup()
                                    .addComponent(lblDados)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDados, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlCadastroLayout.createSequentialGroup()
                                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFormatado)
                                        .addComponent(lblFormatado2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFormatado2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFormatado))))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(lblDados2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDados2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addComponent(lblCbx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblErro1)
                            .addComponent(lblErro2)
                            .addGroup(pnlCadastroLayout.createSequentialGroup()
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSenha1)
                                    .addComponent(lblSenha2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSenha1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ckxSenha1)
                                    .addComponent(ckxSenha2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDados)
                    .addComponent(txtDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormatado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFormatado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormatado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCbx)
                    .addComponent(cbxDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDados2)
                    .addComponent(txtDados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha1)
                    .addGroup(pnlCadastroLayout.createSequentialGroup()
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckxSenha1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckxSenha2)
                            .addComponent(lblSenha2))))
                .addGap(18, 18, 18)
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnProximo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ifrmCadastroLayout = new javax.swing.GroupLayout(ifrmCadastro.getContentPane());
        ifrmCadastro.getContentPane().setLayout(ifrmCadastroLayout);
        ifrmCadastroLayout.setHorizontalGroup(
            ifrmCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ifrmCadastroLayout.setVerticalGroup(
            ifrmCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ifrmPostagens.setPreferredSize(new java.awt.Dimension(700, 450));
        ifrmPostagens.setVisible(true);

        pnlPrincipalPosts.setBackground(new java.awt.Color(0, 0, 0));
        pnlPrincipalPosts.setForeground(new java.awt.Color(255, 255, 255));

        tblTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data:", "@:", "Mensagem:", "Finalizado:", "Interessados:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTabelMouseClicked(evt);
            }
        });
        scrTable.setViewportView(tblTabel);

        lblAviso1.setBackground(new java.awt.Color(0, 0, 0));
        lblAviso1.setForeground(new java.awt.Color(255, 255, 255));
        lblAviso1.setText("Posts recentes:");

        lblAviso2.setBackground(new java.awt.Color(0, 0, 0));
        lblAviso2.setForeground(new java.awt.Color(255, 255, 255));
        lblAviso2.setText("Clique no post para mais detalhes.");

        javax.swing.GroupLayout pnlPrincipalPostsLayout = new javax.swing.GroupLayout(pnlPrincipalPosts);
        pnlPrincipalPosts.setLayout(pnlPrincipalPostsLayout);
        pnlPrincipalPostsLayout.setHorizontalGroup(
            pnlPrincipalPostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalPostsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrincipalPostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrTable, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(pnlPrincipalPostsLayout.createSequentialGroup()
                        .addGroup(pnlPrincipalPostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAviso1)
                            .addComponent(lblAviso2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPrincipalPostsLayout.setVerticalGroup(
            pnlPrincipalPostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalPostsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAviso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAviso2)
                .addGap(18, 18, 18)
                .addComponent(scrTable, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAcoesPosts.setBackground(new java.awt.Color(102, 102, 102));
        pnlAcoesPosts.setForeground(new java.awt.Color(255, 255, 255));

        btnPostar.setText("Criar Postagem");
        btnPostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostarActionPerformed(evt);
            }
        });

        btnNoticia.setText("Notícia temporária");

        btnVerPerfil.setText("Ver Perfil");
        btnVerPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAcoesPostsLayout = new javax.swing.GroupLayout(pnlAcoesPosts);
        pnlAcoesPosts.setLayout(pnlAcoesPostsLayout);
        pnlAcoesPostsLayout.setHorizontalGroup(
            pnlAcoesPostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcoesPostsLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnPostar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoticia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerPerfil)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        pnlAcoesPostsLayout.setVerticalGroup(
            pnlAcoesPostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAcoesPostsLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(pnlAcoesPostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPostar)
                    .addComponent(btnNoticia)
                    .addComponent(btnVerPerfil))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout ifrmPostagensLayout = new javax.swing.GroupLayout(ifrmPostagens.getContentPane());
        ifrmPostagens.getContentPane().setLayout(ifrmPostagensLayout);
        ifrmPostagensLayout.setHorizontalGroup(
            ifrmPostagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipalPosts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAcoesPosts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ifrmPostagensLayout.setVerticalGroup(
            ifrmPostagensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ifrmPostagensLayout.createSequentialGroup()
                .addComponent(pnlPrincipalPosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAcoesPosts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dkpPrincipal.setLayer(ifrmLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpPrincipal.setLayer(ifrmCadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpPrincipal.setLayer(ifrmPostagens, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpPrincipalLayout = new javax.swing.GroupLayout(dkpPrincipal);
        dkpPrincipal.setLayout(dkpPrincipalLayout);
        dkpPrincipalLayout.setHorizontalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ifrmLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ifrmCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ifrmPostagens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dkpPrincipalLayout.setVerticalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ifrmLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifrmCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifrmPostagens, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(591, Short.MAX_VALUE))
        );

        mnuOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/iconOptions.png"))); // NOI18N
        mnuOpcoes.setText("Opções ");
        mnuOpcoes.setToolTipText("");
        mnuOpcoes.setEnabled(false);
        mnuOpcoes.setMinimumSize(new java.awt.Dimension(54, 24));
        mnuOpcoes.setPreferredSize(new java.awt.Dimension(100, 24));

        mniSenha.setText("Alterar Senha");
        mnuOpcoes.add(mniSenha);

        mniAlterar.setText("Alterar Perfil");
        mniAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAlterarActionPerformed(evt);
            }
        });
        mnuOpcoes.add(mniAlterar);

        mniFoto.setText("Alterar Imagem");
        mniFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFotoActionPerformed(evt);
            }
        });
        mnuOpcoes.add(mniFoto);

        mniVoltar.setText("Voltar");
        mniVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVoltarActionPerformed(evt);
            }
        });
        mnuOpcoes.add(mniVoltar);

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        mnuOpcoes.add(mniSair);

        mnbMenu.add(mnuOpcoes);

        mnuPosts.setText(" Posts ");
        mnuPosts.setEnabled(false);
        mnuPosts.setPreferredSize(new java.awt.Dimension(100, 24));

        mniPosts.setText("Abrir");
        mniPosts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPostsActionPerformed(evt);
            }
        });
        mnuPosts.add(mniPosts);

        mnbMenu.add(mnuPosts);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dkpPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dkpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            lblGuardaDados.setVisible(false);
            lblGuardaAtuacao.setVisible(false);
            String email = txtEmail.getText();
            String senha = String.valueOf(txtSenha.getPassword());
            senha = hashingSenha(senha);
            if (email == null || email.equals(" ") || senha == null || senha.equals(" ")) {
                lblErroLog.setText("Usuário ou senha inválidos");
            } else {
                lblErroLog.setText("");
                if (meUser.pesquisarEmailSenha(email, senha)) {
                    ArrayList<User> id = meUser.pesquisarId(email, senha);
                    for (User u : id) {
                        lblGuardaDados.setText(u.getIdUser());
                        lblGuardaAtuacao.setText(u.getTipoUser());
                    }
                    lo.setIdUserLogin(lblGuardaDados.getText());
                    lo.setTipoLogin(lblGuardaAtuacao.getText());
                    lo.setHoraLogin(horaEData());
                    melo.inserirLogin(lo);

                    txtEmail.setText("");
                    txtSenha.setText("");
                    escreverId();
                    preencheIdAtuacao();
                    abrePerfil();
                } else {
                    lblErroLog.setText("Usuário ou senha inválidos");
                }
            }
        } catch (RuntimeException err) {
            lblErroLog.setText("Usuário ou senha inválidos");
            throw new RuntimeException("Erro no login do FrmPrincipal: " + err);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ifrmCadastro.setVisible(true);
        ifrmLogin.setVisible(false);
        cadastro = 0;
        proximo();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void chbVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbVisualizarActionPerformed
        if (chbVisualizar.isSelected()) {
            txtSenha.setEchoChar((char) 0);
        } else {
            txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_chbVisualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Image logo = Toolkit.getDefaultToolkit().getImage("src/ICONES/logoApp.jpg");
        this.setIconImage(logo);

        cadastro = 0;

        esconder();

        ifrmCadastro.setVisible(false);
        ifrmPostagens.setVisible(false);
        lblGuardaAtuacao.setVisible(false);
        lblGuardaDados.setVisible(false);

        if (properties.getProperty("os.name").equals("Linux")) {
            arquivo = new File("/home/joao4774/Contrate-Aqui/Contrate Aqui/src/DADOS/Dados.txt");
        } else {
            arquivo = new File("C:\\Contrate-Aqui\\Contrate Aqui\\src\\DADOS\\Dados.txt");
        }

        IfrmAlterarFoto.getInstance().setSystem(properties.getProperty("os.name"));

        if (arquivo.exists()) {
            preencheIdAtuacao();
            abrePerfil();
        }
        //idUser de IfrmPost, IfrmUser, IfrmFoto e IfrmAlterar
    }//GEN-LAST:event_formWindowOpened

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        fechaPerfil();

        if (arquivo.exists()) {
            arquivo.delete();
        }
    }//GEN-LAST:event_mniSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCad();
        cadastro = cadastro - 1;
        voltar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void ckxSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckxSenha1ActionPerformed
        if (ckxSenha1.isSelected()) {
            txtSenha1.setEchoChar((char) 0);
        } else {
            txtSenha1.setEchoChar((char) '*');
        }
    }//GEN-LAST:event_ckxSenha1ActionPerformed

    private void ckxSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckxSenha2ActionPerformed
        if (ckxSenha2.isSelected()) {
            txtSenha2.setEchoChar((char) 0);
        } else {
            txtSenha2.setEchoChar((char) '*');
        }
    }//GEN-LAST:event_ckxSenha2ActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if (cadVazio()) {

        } else {
            cadastro = cadastro + 1;
            proximo();
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void mniPostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPostsActionPerformed
        if (mniPosts.getText().equals("Abrir")) {
            abrePost();
        } else {
            fechaPost();
        }
    }//GEN-LAST:event_mniPostsActionPerformed

    private void btnVerPostsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPostsActionPerformed
        abrePost();
    }//GEN-LAST:event_btnVerPostsActionPerformed

    private void tblTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTabelMouseClicked
        ArrayList<Posts> id = mePost.pesquisarId(tblTabel.getValueAt(tblTabel.getSelectedRow(), 1).toString(), tblTabel.getValueAt(tblTabel.getSelectedRow(), 0).toString());
        for (Posts pos : id) {
            idTable = Integer.parseInt(pos.getIdPost());
            System.out.println("Setou o idTable: " + idTable);

            IfrmVerPost.getInstance().setIdPost(idTable);
            System.out.println("Setou o id lá no IfrmVerPost");
            IfrmVerPost.getInstance().setEmailPost(tblTabel.getValueAt(tblTabel.getSelectedRow(), 1).toString());
        }
        abreJanela.abreCentro(IfrmVerPost.getInstance());
    }//GEN-LAST:event_tblTabelMouseClicked

    private void txtFormatado2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFormatado2KeyReleased
        if (user.getTipoUser().equals("Empresa")) {
            //12.345.678/0001-90
            int num1 = Character.getNumericValue(txtFormatado2.getText().charAt(0));
            int num2 = Character.getNumericValue(txtFormatado2.getText().charAt(1));
            int num3 = Character.getNumericValue(txtFormatado2.getText().charAt(3));
            int num4 = Character.getNumericValue(txtFormatado2.getText().charAt(4));
            int num5 = Character.getNumericValue(txtFormatado2.getText().charAt(5));
            int num6 = Character.getNumericValue(txtFormatado2.getText().charAt(7));
            int num7 = Character.getNumericValue(txtFormatado2.getText().charAt(8));
            int num8 = Character.getNumericValue(txtFormatado2.getText().charAt(9));
            int num9 = Character.getNumericValue(txtFormatado2.getText().charAt(11));
            int num10 = Character.getNumericValue(txtFormatado2.getText().charAt(12));
            int num11 = Character.getNumericValue(txtFormatado2.getText().charAt(13));
            int num12 = Character.getNumericValue(txtFormatado2.getText().charAt(14));
            int num13 = Character.getNumericValue(txtFormatado2.getText().charAt(16));
            int num14 = Character.getNumericValue(txtFormatado2.getText().charAt(17));

            int soma = num12 * 2 + num11 * 3 + num10 * 4 + num9 * 5 + num8 * 6 + num7 * 7
                    + num6 * 8 + num5 * 9 + num4 * 2 + num3 * 3 + num2 * 4 + num1 * 5;

            int rest1 = 11 - (soma % 11);

            if (rest1 >= 10) {
                rest1 = 0;
            }

            soma = num13 * 2 + num12 * 3 + num11 * 4 + num10 * 5 + num9 * 6 + num8 * 7 + num7 * 8
                    + num6 * 9 + num5 * 2 + num4 * 3 + num3 * 4 + num2 * 5 + num1 * 6;

            int rest2 = 11 - (soma % 11);

            if (rest2 >= 10) {
                rest2 = 0;
            }

            if (rest1 == num13 && rest2 == num14) {
                lblErro1.setText("");
                btnProximo.setEnabled(true);
            } else {
                lblErro1.setText("Cnpj inválido");
                btnProximo.setEnabled(false);
            }

        } else {
            //123.456.789.01
            int num1 = Character.getNumericValue(txtFormatado2.getText().charAt(0));
            int num2 = Character.getNumericValue(txtFormatado2.getText().charAt(1));
            int num3 = Character.getNumericValue(txtFormatado2.getText().charAt(2));
            int num4 = Character.getNumericValue(txtFormatado2.getText().charAt(4));
            int num5 = Character.getNumericValue(txtFormatado2.getText().charAt(5));
            int num6 = Character.getNumericValue(txtFormatado2.getText().charAt(6));
            int num7 = Character.getNumericValue(txtFormatado2.getText().charAt(8));
            int num8 = Character.getNumericValue(txtFormatado2.getText().charAt(9));
            int num9 = Character.getNumericValue(txtFormatado2.getText().charAt(10));
            int num10 = Character.getNumericValue(txtFormatado2.getText().charAt(12));
            int num11 = Character.getNumericValue(txtFormatado2.getText().charAt(13));

            int soma = num9 * 2 + num8 * 3 + num7 * 4 + num6 * 5 + num5 * 6 + num4 * 7
                    + num3 * 8 + num2 * 9 + num1 * 10;

            int rest1 = 11 - (soma % 11);

            if (rest1 >= 10) {
                rest1 = 0;
            }

            soma = num10 * 2 + num9 * 3 + num8 * 4 + num7 * 5 + num6 * 6 + num5 * 7
                    + num4 * 8 + num3 * 9 + num2 * 10 + num1 * 11;

            int rest2 = 11 - (soma % 11);

            if (rest2 >= 10) {
                rest2 = 0;
            }

            if (rest1 == num10 && rest2 == num11) {
                lblErro1.setText("");
                btnProximo.setEnabled(true);
            } else {
                lblErro1.setText("Cpf inválido");
                btnProximo.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtFormatado2KeyReleased

    private void txtSenha1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenha1KeyReleased
        senhaTam();
    }//GEN-LAST:event_txtSenha1KeyReleased

    private void txtSenha2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenha2KeyReleased
        senhasIguais();
    }//GEN-LAST:event_txtSenha2KeyReleased

    private void mniAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAlterarActionPerformed
        abreJanela.abrePerfil(IfrmAlterar.getInstance());
        alterarAberto = true;
        ifrmUser.abreFecha();
    }//GEN-LAST:event_mniAlterarActionPerformed

    private void mniFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFotoActionPerformed
        abreJanela.abrePerfil(IfrmAlterarFoto.getInstance());
        alteraFotoAberto = true;
        ifrmUser.abreFecha();
    }//GEN-LAST:event_mniFotoActionPerformed

    private void mniVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVoltarActionPerformed
        if (ifrmAlterar.isVisible()) {
            ifrmAlterar.setVisible(false);
        } else if (ifrmFoto.isVisible()) {
            ifrmFoto.setVisible(false);
        }
        ifrmUser.abreFecha();
    }//GEN-LAST:event_mniVoltarActionPerformed

    private void btnPostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostarActionPerformed
        abreJanela.abreCentro(IfrmPost.getInstance());
    }//GEN-LAST:event_btnPostarActionPerformed

    private void btnVerPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPerfilActionPerformed
        abreJanela.abreCentro(IfrmVerPerfil.getInstance());
    }//GEN-LAST:event_btnVerPerfilActionPerformed
    private void limparCad() {
        lblDados.setText("");
        lblDados2.setText("");
        lblCbx.setText("");
        lblFormatado.setText("");
        lblFormatado2.setText("");

        txtDados.setText("");
        txtFormatado.setValue(null);
        txtFormatado2.setValue(null);
        txtDados2.setText("");
        txtSenha1.setText(null);
        txtSenha2.setText(null);

        cbxDados.removeAllItems();
    }

    private boolean cadVazio() {
        //verificar nome, estado, e-mail, cpf/cnpj e senha
        boolean vazio = false;
        switch (cadastro) {
            case 0:
                if (lblDados.getText().equals("Nome:") && txtDados.getText() == null
                        || txtDados.getText().equals("")) {
                    vazio = true;
                }
                break;
            case 1:
                if (lblCbx.getText().equals("Estado:") && cbxDados.getSelectedItem().equals("SELECIONE:")) {
                    vazio = true;
                }
                break;
            case 3:
                if (lblDados.getText().equals("Email:") && txtDados.getText() == null
                        || txtDados.getText().equals("")
                        || txtFormatado2.getText().equals("   .   .   -  ")
                        || txtFormatado2.getText().equals("  .   .   /    -  ")) {
                    vazio = true;
                }
                break;
        }
        return vazio;
    }

    private void esconder() {
        txtDados.setVisible(false);
        txtDados2.setVisible(false);
        txtFormatado.setVisible(false);
        txtFormatado2.setVisible(false);
        txtSenha1.setVisible(false);
        txtSenha2.setVisible(false);
        ckxSenha1.setVisible(false);
        ckxSenha2.setVisible(false);
        cbxDados.setVisible(false);

        lblDados.setVisible(false);
        lblDados2.setVisible(false);
        lblFormatado.setVisible(false);
        lblFormatado2.setVisible(false);
        lblErro1.setVisible(false);
        lblErro2.setVisible(false);
        lblCbx.setVisible(false);
        lblSenha1.setVisible(false);
        lblSenha2.setVisible(false);
    }

    public void proximo() {
        switch (cadastro) {
            case 0:
                ifrmCadastro.setVisible(true);
                limparCad();
                esconder();
                abreCad1();
                break;
            case 1:
                user.setNomeUser(txtDados.getText());
                user.setTelefoneUser(txtFormatado.getText());
                limparCad();
                esconder();
                abreCad2();
                break;
            case 2:
                user.setEstadoUser(cbxDados.getSelectedItem().toString());
                user.setCidadeUser(txtDados.getText());
                user.setBairroUser(txtDados2.getText());
                limparCad();
                esconder();
                abreCad3();
                break;
            case 3:
                user.setTipoUser(cbxDados.getSelectedItem().toString());
                limparCad();
                esconder();
                abreCad4();
                break;
            case 4:
                if (user.getTipoUser().equals("Empresa")) {
                    user.setCnpjUser(txtFormatado2.getText());
                } else {
                    user.setCpfUser(txtFormatado2.getText());
                }
                user.setEmailUser(txtDados.getText());
                limparCad();
                esconder();
                abreCad5();
                break;
            case 5:
                switch (user.getTipoUser()) {
                    case "Autônomo":
                        aut.setProfissaoAutonomo(txtDados.getText());
                        break;
                    case "Colaborador":
                        col.setAreaColaborador(txtDados.getText());
                        break;
                    case "Empresa":
                        emp.setTrabalhoEmpresa(txtDados.getText());
                        emp.setEstagioEmpresa(cbxDados.getSelectedItem().toString());
                        break;
                    case "Jovem Aprendiz":
                        apr.setInstituicaoAprendiz(txtDados.getText());
                        apr.setAreaAprendiz(txtDados2.getText());
                        break;
                }
                limparCad();
                esconder();
                abreCadSen();
                break;
            case 6:
                String senha = String.valueOf(txtSenha1.getPassword());
                senha = hashingSenha(senha);
                user.setSenhaUser(senha);
                limparCad();
                esconder();
                meUser.inserir(user, aut, col, emp, apr);
                ifrmCadastro.setVisible(false);
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
                lblGuardaAtuacao.setText(user.getTipoUser());

                ArrayList<User> id = meUser.pesquisarId(user.getEmailUser(), senha);
                for (User u : id) {
                    lblGuardaDados.setText(u.getIdUser());
                }

                lo.setIdUserLogin(lblGuardaDados.getText());
                lo.setTipoLogin(lblGuardaAtuacao.getText());
                lo.setHoraLogin(horaEData());
                melo.inserirLogin(lo);

                escreverId();
                abrePerfil();
                break;
        }
    }

    private void voltar() {
        switch (cadastro) {
            case -1:
                ifrmCadastro.setVisible(false);
                ifrmLogin.setVisible(true);
                limparCad();
                break;
            case 0:
                esconder();
                abreCad1();
                txtDados.setText(user.getNomeUser());
                txtFormatado.setText(user.getTelefoneUser());
                break;
            case 1:
                esconder();
                abreCad2();
                txtDados.setText(user.getCidadeUser());
                cbxDados.setSelectedItem(user.getEstadoUser());
                txtDados2.setText(user.getBairroUser());
                break;
            case 2:
                esconder();
                abreCad3();
                cbxDados.setSelectedItem(user.getTipoUser());
                break;
            case 3:
                esconder();
                abreCad4();
                txtDados.setText(user.getEmailUser());
                if (user.getTipoUser().equals("Empresa")) {
                    txtFormatado2.setText(user.getCnpjUser());
                } else {
                    txtFormatado2.setText(user.getCpfUser());
                }
                break;
            case 4:
                esconder();
                abreCad5();
                switch (user.getTipoUser()) {
                    case "Autônomo":
                        txtDados.setText(aut.getProfissaoAutonomo());
                        break;
                    case "Colaborador":
                        txtDados.setText(col.getAreaColaborador());
                        break;
                    case "Empresa":
                        txtDados.setText(emp.getTrabalhoEmpresa());
                        break;
                    case "Jovem Aprendiz":
                        txtDados.setText(apr.getInstituicaoAprendiz());
                        txtDados2.setText(apr.getAreaAprendiz());
                        break;
                }
                break;
            case 5:
                cadastro = cadastro - 1;
                voltar();
                break;
            case 6:
                cadastro = cadastro - 1;
                proximo();
                break;
        }
    }

    private void abreCad1() {
        ifrmCadastro.setSize(250, 185);
        lblDados.setVisible(true);
        txtDados.setVisible(true);
        lblFormatado.setVisible(true);
        txtFormatado.setVisible(true);
        lblFormatado.setText("Telefone:");
        lblDados.setText("Nome:");
        btnProximo.setText("Próximo");
        btnCancelar.setText("Cancelar");
        telefone();
    }

    private void abreCad2() {
        ifrmCadastro.setSize(315, 220);
        txtDados.setVisible(true);
        txtDados2.setVisible(true);
        cbxDados.setVisible(true);
        lblDados.setVisible(true);
        lblDados2.setVisible(true);
        lblCbx.setVisible(true);

        btnProximo.setText("Próximo");
        btnCancelar.setText("Voltar");
        lblDados.setText("Cidade:");
        lblDados2.setText("Bairro:");
        lblCbx.setText("Estado:");
        cbxDados.removeAllItems();
        cbxDados.addItem("SELECIONE:");
        cbxDados.addItem("AC");
        cbxDados.addItem("AP");
        cbxDados.addItem("AM");
        cbxDados.addItem("BA");
        cbxDados.addItem("CE");
        cbxDados.addItem("ES");
        cbxDados.addItem("GO");
        cbxDados.addItem("MA");
        cbxDados.addItem("MG");
        cbxDados.addItem("MS");
        cbxDados.addItem("MT");
        cbxDados.addItem("PA");
        cbxDados.addItem("PB");
        cbxDados.addItem("PR");
        cbxDados.addItem("PE");
        cbxDados.addItem("PI");
        cbxDados.addItem("RJ");
        cbxDados.addItem("RN");
        cbxDados.addItem("RS");
        cbxDados.addItem("RO");
        cbxDados.addItem("RR");
        cbxDados.addItem("SC");
        cbxDados.addItem("SP");
        cbxDados.addItem("SE");
        cbxDados.addItem("TO");
    }

    private void abreCad3() {
        ifrmCadastro.setSize(445, 225);
        lblCbx.setVisible(true);
        cbxDados.setVisible(true);
        btnProximo.setText("Próximo");
        btnCancelar.setText("Voltar");
        lblCbx.setText("Selecione o seu tipo de conta:");
        cbxDados.addItem("Autônomo");
        cbxDados.addItem("Colaborador");
        cbxDados.addItem("Empresa");
        cbxDados.addItem("Jovem Aprendiz");
    }

    private void abreCad4() {
        ifrmCadastro.setSize(315, 185);
        btnProximo.setText("Próximo");
        btnCancelar.setText("Voltar");
        lblFormatado2.setVisible(true);
        lblDados.setVisible(true);
        txtFormatado2.setVisible(true);
        txtDados.setVisible(true);

        lblDados.setText("E-mail:");
        lblErro1.setVisible(true);
        lblErro1.setText("");
        if (user.getTipoUser().equals("Empresa")) {
            cpnj("Cnpj");
            lblFormatado2.setText("Cnpj:");
        } else {
            cpnj("Cpf");
            lblFormatado2.setText("Cpf:");
        }
    }

    private void abreCad5() {
        btnProximo.setText("Próximo");
        btnCancelar.setText("Voltar");
        switch (user.getTipoUser()) {
            case "Autônomo":
                ifrmCadastro.setSize(480, 190);
                lblDados.setVisible(true);
                txtDados.setVisible(true);
                lblDados.setText("Qual a profissão em que você trabalha?");
                break;
            case "Colaborador":
                ifrmCadastro.setSize(450, 180);
                lblDados.setVisible(true);
                txtDados.setVisible(true);
                lblDados.setText("Sua área de ocupação:");
                break;
            case "Empresa":
                ifrmCadastro.setSize(475, 190);
                lblDados.setVisible(true);
                txtDados.setVisible(true);
                lblCbx.setVisible(true);
                cbxDados.setVisible(true);
                lblDados.setText("Profissão que você está oferecendo:");
                lblCbx.setText("Você oferece estágios?");
                cbxDados.removeAllItems();
                cbxDados.addItem("Sim");
                cbxDados.addItem("Não");
                break;
            case "Jovem Aprendiz":
                ifrmCadastro.setSize(480, 200);
                lblDados.setVisible(true);
                txtDados.setVisible(true);
                lblDados2.setVisible(true);
                txtDados2.setVisible(true);
                lblDados.setText("Nome da instituição que está cursando:");
                lblDados2.setText("Área que está cursando:");
                break;
        }
    }

    private void abreCadSen() {
        ifrmCadastro.setSize(385, 200);
        btnProximo.setText("Cadastrar");
        btnCancelar.setText("Voltar");
        lblErro1.setVisible(true);
        lblErro2.setVisible(true);
        lblSenha1.setVisible(true);
        lblSenha2.setVisible(true);
        txtSenha1.setVisible(true);
        txtSenha2.setVisible(true);
        ckxSenha1.setVisible(true);
        ckxSenha2.setVisible(true);

        lblErro1.setText("");
        lblErro2.setText("");
        lblSenha1.setText("Crie uma senha:");
        lblSenha2.setText("Repita a senha:");
    }

    private void telefone() {
        try {
            MaskFormatter format = new MaskFormatter("(##) 9####-####");
            txtFormatado.setFormatterFactory(new DefaultFormatterFactory(format));
        } catch (ParseException err) {
            System.err.println("Erro no telefone: " + err);
        }
    }

    private void cpnj(String tipo) {
        int igual = tipo.compareTo("Cpf");
        if (igual == 0) {
            try {
                MaskFormatter format = new MaskFormatter("###.###.###-##");
                txtFormatado2.setValue(null);
                txtFormatado2.setFormatterFactory(new DefaultFormatterFactory(format));
            } catch (ParseException err) {
                System.err.println("Erro np cpnj -> cpf: " + err);
            }
        } else {
            try {
                MaskFormatter format = new MaskFormatter("##.###.###/####-##");
                txtFormatado2.setValue(null);
                txtFormatado2.setFormatterFactory(new DefaultFormatterFactory(format));
            } catch (ParseException err) {
                System.err.println("Erro no cpnj -> cnpj: " + err);
            }
        }
    }

    private void senhaTam() {
        String senha = String.valueOf(txtSenha1.getPassword());
        int tam = senha.length();
        if (tam < 4) {
            btnProximo.setEnabled(false);
            lblErro1.setText("Senha muito curta!");
        } else {
            btnProximo.setEnabled(true);
            lblErro1.setText("");
        }
    }

    private void senhasIguais() {
        String senha1 = String.valueOf(txtSenha1.getPassword());
        String senha2 = String.valueOf(txtSenha2.getPassword());
        int igual = senha2.compareTo(senha1);
        if (igual == 1) {
            btnProximo.setEnabled(false);
            lblErro2.setText("As senhas não são iguais!");
        } else {
            btnProximo.setEnabled(true);
            lblErro2.setText("");
        }
    }

    private void abrePost() {
        ifrmPostagens.setSize(new Dimension(1100, 500));
        ifrmPostagens.setVisible(true);
        ifrmCadastro.setVisible(false);
        ifrmLogin.setVisible(false);
        mnuPosts.setEnabled(true);
        mniPosts.setText("Sair");
        carregarPosts();
    }

    private void fechaPost() {
        ifrmPostagens.setVisible(false);
        ifrmCadastro.setVisible(false);
        ifrmLogin.setVisible(true);
        mniPosts.setText("Abrir");
    }

    private void abrePerfil() {
        ifrmCadastro.setVisible(false);
        ifrmLogin.setVisible(false);
        abreJanela.abrePerfil(IfrmUser.getInstance());
        userAberto = true;
        abrePost();
        mnuOpcoes.setEnabled(true);
    }

    private void fechaPerfil() {
        if (userAberto) {
            ifrmUser.encerra();
            userAberto = false;
        } else if (alterarAberto) {
            ifrmAlterar.encerra();
            alterarAberto = false;
        } else if (alteraFotoAberto) {
            ifrmFoto.encerra();
            alteraFotoAberto = false;
        }
        ifrmPostagens.setVisible(false);
        ifrmLogin.setVisible(true);
    }

    private String horaEData() {
        //2023-07-24 09:03:23
        DateFormat formato = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String data = formato.format(new Date());
        return data;
    }

    private String hashingSenha(String senha) {
        try {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte hash[] = algorithm.digest(senha.getBytes());
            StringBuilder conversor = new StringBuilder();
            for (byte b : hash) {
                conversor.append(String.format("%02x", b));
            }
            String senhaHash = conversor.toString();
            return senhaHash;
        } catch (NoSuchAlgorithmException err) {
            throw new RuntimeException("Erro no hashing da senha: " + err);
        }
    }

    private void escreverId() {
        if (!arquivo.exists()) {

            try {
                arquivo.createNewFile();
            } catch (IOException err) {
                throw new RuntimeException("Erro no arquivo: " + err);
            }

            try {
                FileWriter escreve = new FileWriter(arquivo);
                BufferedWriter escrever = new BufferedWriter(escreve);
                escrever.write(lblGuardaDados.getText());
                escrever.newLine();
                escrever.close();
                escreve.close();
            } catch (IOException err) {
                throw new RuntimeException("Erro na escrita do arquivo: " + err);
            }
        } else {

            try {
                FileWriter escreve = new FileWriter(arquivo);
                BufferedWriter escrever = new BufferedWriter(escreve);
                escrever.write(lblGuardaDados.getText());
                escrever.newLine();
                escrever.close();
                escreve.close();
            } catch (IOException err) {
                throw new RuntimeException("Erro na escrita do arquivo: " + err);
            }
        }
    }

    private void preencheIdAtuacao() {
        try {
            FileReader leitura = new FileReader(arquivo);
            BufferedReader ler = new BufferedReader(leitura);
            while (ler.ready()) {
                int id = Integer.parseInt(ler.readLine());
                lblGuardaDados.setText(String.valueOf(id));
                IfrmUser.getInstance().setIdUser(id);
                IfrmAlterar.getInstance().setIdUser(id);
                IfrmAlterarFoto.getInstance().setIdUser(id);
                IfrmPost.getInstance().setIdUser(id);
            }
            ler.close();
            leitura.close();
        } catch (IOException err) {
            throw new RuntimeException("Erro na leitura do arquivo: " + err);
        }

        ArrayList<User> u = meUser.pesquisarUser(Integer.parseInt(lblGuardaDados.getText()));
        for (User us : u) {
            lblGuardaAtuacao.setText(us.getTipoUser());
        }
    }

    private void carregarPosts() {
        String tipo = lblGuardaAtuacao.getText();

        DefaultTableModel model = (DefaultTableModel) tblTabel.getModel();
        model.setNumRows(0);
        ArrayList<Posts> postsTabel = mePost.carregar(tipo);
        for (Posts p : postsTabel) {
            //2023-09-02 09:01:36.0
            String data = p.getDataPost();
            String[] corte = data.split("\\.");
            data = corte[0];

            model.addRow(new String[]{data, p.getEmailPost(),
                p.getTextoPost(), p.getFinalizadoPost(), p.getNumInteressadosPost()});
        }

        tblTabel.setModel(model);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNoticia;
    private javax.swing.JButton btnPostar;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVerPerfil;
    private javax.swing.JButton btnVerPosts;
    private javax.swing.JComboBox<String> cbxDados;
    private javax.swing.JCheckBox chbVisualizar;
    private javax.swing.JCheckBox ckxSenha1;
    private javax.swing.JCheckBox ckxSenha2;
    private javax.swing.JDesktopPane dkpPrincipal;
    private javax.swing.JInternalFrame ifrmCadastro;
    private javax.swing.JInternalFrame ifrmLogin;
    private javax.swing.JInternalFrame ifrmPostagens;
    private javax.swing.JLabel lblAviso1;
    private javax.swing.JLabel lblAviso2;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblCbx;
    private javax.swing.JLabel lblDados;
    private javax.swing.JLabel lblDados2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErro1;
    private javax.swing.JLabel lblErro2;
    private javax.swing.JLabel lblErroLog;
    private javax.swing.JLabel lblFormatado;
    private javax.swing.JLabel lblFormatado2;
    private javax.swing.JLabel lblGuardaAtuacao;
    private javax.swing.JLabel lblGuardaDados;
    private javax.swing.JLabel lblOla;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblSenha2;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mniAlterar;
    private javax.swing.JMenuItem mniFoto;
    private javax.swing.JMenuItem mniPosts;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JMenuItem mniSenha;
    private javax.swing.JMenuItem mniVoltar;
    private javax.swing.JMenu mnuOpcoes;
    private javax.swing.JMenu mnuPosts;
    private javax.swing.JPanel pnlAcoesPosts;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlPrincipalPosts;
    private javax.swing.JScrollPane scrTable;
    private javax.swing.JTable tblTabel;
    private javax.swing.JTextField txtDados;
    private javax.swing.JTextField txtDados2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFormatado;
    private javax.swing.JFormattedTextField txtFormatado2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenha1;
    private javax.swing.JPasswordField txtSenha2;
    // End of variables declaration//GEN-END:variables
}
