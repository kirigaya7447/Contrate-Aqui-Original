package PRINCIPAL.POSTS;

import java.util.ArrayList;

import VARIAVEIS.*;
import METODOS.*;

public class IfrmVerPost extends javax.swing.JInternalFrame {

    private static IfrmVerPost ifrmPost;
    private Posts posts = new Posts();
    private MEPosts mePosts = new MEPosts();
    private User user = new User();
    private MEUser meUser = new MEUser();

    private int idPost;
    private int interesse;
    private String emailPost;

    public static IfrmVerPost getInstance() {
        if (ifrmPost == null) {
            ifrmPost = new IfrmVerPost();
        }
        return ifrmPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
        System.out.println("Se setou aparece: " + this.idPost);
    }

    public void setEmailPost(String email) {
        this.emailPost = email;
    }

    public IfrmVerPost() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVerPost = new javax.swing.JPanel();
        scrPost = new javax.swing.JScrollPane();
        txtPost = new javax.swing.JTextArea();
        lblEmailData = new javax.swing.JLabel();
        lblFinalizado = new javax.swing.JLabel();
        lblInteressados = new javax.swing.JLabel();
        btnInteressado = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        pnlVerPost.setBackground(new java.awt.Color(0, 0, 0));
        pnlVerPost.setForeground(new java.awt.Color(255, 255, 255));

        txtPost.setColumns(20);
        txtPost.setRows(5);
        scrPost.setViewportView(txtPost);

        lblEmailData.setBackground(new java.awt.Color(0, 0, 0));
        lblEmailData.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailData.setText("lblEmailData");

        lblFinalizado.setBackground(new java.awt.Color(0, 0, 0));
        lblFinalizado.setForeground(new java.awt.Color(255, 255, 255));
        lblFinalizado.setText("lblFinalizado");

        lblInteressados.setBackground(new java.awt.Color(0, 0, 0));
        lblInteressados.setForeground(new java.awt.Color(255, 255, 255));
        lblInteressados.setText("lblInteressados");

        btnInteressado.setText("Estou interessado");
        btnInteressado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInteressadoActionPerformed(evt);
            }
        });

        lblFoto.setBackground(new java.awt.Color(0, 0, 0));
        lblFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblFoto.setText("Foto");

        javax.swing.GroupLayout pnlVerPostLayout = new javax.swing.GroupLayout(pnlVerPost);
        pnlVerPost.setLayout(pnlVerPostLayout);
        pnlVerPostLayout.setHorizontalGroup(
            pnlVerPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVerPostLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVerPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVerPostLayout.createSequentialGroup()
                        .addComponent(lblEmailData)
                        .addContainerGap(358, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVerPostLayout.createSequentialGroup()
                        .addGap(0, 81, Short.MAX_VALUE)
                        .addGroup(pnlVerPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVerPostLayout.createSequentialGroup()
                                .addGroup(pnlVerPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVerPostLayout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(lblInteressados)
                                        .addGap(128, 128, 128))
                                    .addGroup(pnlVerPostLayout.createSequentialGroup()
                                        .addComponent(scrPost, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFinalizado))
                                    .addGroup(pnlVerPostLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btnInteressado)))
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVerPostLayout.createSequentialGroup()
                                .addComponent(lblFoto)
                                .addGap(184, 184, 184))))))
        );
        pnlVerPostLayout.setVerticalGroup(
            pnlVerPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVerPostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmailData)
                .addGap(57, 57, 57)
                .addComponent(lblFoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(pnlVerPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrPost, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFinalizado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInteressados)
                .addGap(43, 43, 43)
                .addComponent(btnInteressado)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVerPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlVerPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        txtPost.setLineWrap(true);
        btnInteressado.setEnabled(true);
        lblFoto.setText("");
        limpar();
        setarDados();
        jaInteressado();
        System.out.println(idPost + " e " + emailPost);
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnInteressadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInteressadoActionPerformed
        ArrayList<Posts> intere = mePosts.verPost(idPost);
        for (Posts inter : intere) {
            interesse = Integer.parseInt(inter.getNumInteressadosPost());
            interesse += 1;
            mePosts.interessadoNoPost(String.valueOf(idPost), String.valueOf(interesse), emailPost);
        }

        limpar();
        //pegarId();
        //pegarEmail();
        setarDados();
        btnInteressado.setEnabled(false);
    }//GEN-LAST:event_btnInteressadoActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
    }//GEN-LAST:event_formInternalFrameClosed
    private void setarDados() {
        ArrayList<Posts> dados = mePosts.verPost(idPost);
        for (Posts oPost : dados) {
            String data = oPost.getDataPost();
            String[] corte = data.split("\\.");
            data = corte[0];

            lblEmailData.setText("Postado por " + oPost.getEmailPost() + " em " + data);
            txtPost.setText(oPost.getTextoPost());
            lblInteressados.setText(oPost.getNumInteressadosPost() + " pessoas estão interessadas "
                    + "neste post");

            if (oPost.getFinalizadoPost().equals("Não")) {
                lblFinalizado.setText("");
            } else {
                lblFinalizado.setText("O post já foi concluído");
                btnInteressado.setEnabled(false);
            }

            if (oPost.getImagemPost() != null) {
                lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/POSTS/" + oPost.getImagemPost())));
            } else {
                lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Sem-foto.jpeg")));
            }

        }

    }

    private void limpar() {
        lblEmailData.setText("");
        txtPost.setText(null);
        lblInteressados.setText("");
        lblFinalizado.setText("");
    }

    private void jaInteressado() {
        ArrayList<Posts> dados = mePosts.verPost(idPost);
        for (Posts pos : dados) {
            String nomeInteressados = pos.getNomeInteressadosPost();

            if (nomeInteressados != null) {
                String[] nomes = nomeInteressados.split("/");
                for (int cont = 0; cont < nomes.length; cont++) {
                    if (emailPost.equals(nomes[cont])) {
                        btnInteressado.setEnabled(false);
                    }
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInteressado;
    private javax.swing.JLabel lblEmailData;
    private javax.swing.JLabel lblFinalizado;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblInteressados;
    private javax.swing.JPanel pnlVerPost;
    private javax.swing.JScrollPane scrPost;
    private javax.swing.JTextArea txtPost;
    // End of variables declaration//GEN-END:variables
}
