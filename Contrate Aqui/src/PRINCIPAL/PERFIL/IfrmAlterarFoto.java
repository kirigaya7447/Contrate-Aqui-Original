package PRINCIPAL.PERFIL;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.nio.file.Files;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import METODOS.MEUser;
import VARIAVEIS.User;

public class IfrmAlterarFoto extends javax.swing.JInternalFrame {

    private static IfrmAlterarFoto ifrmFoto;
    private int idUser;
    private String emailUser;
    private String imagem;
    private MEUser meUser = new MEUser();

    File destino;

    public static IfrmAlterarFoto getInstance() {
        if (ifrmFoto == null) {
            ifrmFoto = new IfrmAlterarFoto();
        }
        return ifrmFoto;
    }

    public void abreFecha() {
        if (ifrmFoto.isVisible()) {
            ifrmFoto.setVisible(false);
        } else {
            ifrmFoto.setVisible(true);
        }
    }

    public void encerra() {
        ifrmFoto.dispose();
    }
    
    public void setIdUser(int idUser){
        this.idUser = idUser;
    }

    public void setSistema(String system){
        if(system.equals("Linux")){
            destino = new File("/home/joao4774/Contrate-Aqui/Contrate Aqui/src/FOTOS/PERFIL/" + emailUser);
        }
        else{
            destino = new File("C:\\Contrate-Aqui\\Contrate Aqui\\src\\FOTOS\\PERFIL\\" + emailUser);
        }
    }

    public IfrmAlterarFoto() {
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

        scrAlterarFoto = new javax.swing.JScrollPane();
        pnlAlterarFoto = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
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

        pnlAlterarFoto.setBackground(new java.awt.Color(0, 0, 0));
        pnlAlterarFoto.setForeground(new java.awt.Color(255, 255, 255));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Sem-foto.jpeg"))); // NOI18N

        lblMensagem.setBackground(new java.awt.Color(0, 0, 0));
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setText("Sua foto atual");

        btnAlterar.setText("Alterar Foto");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAlterarFotoLayout = new javax.swing.GroupLayout(pnlAlterarFoto);
        pnlAlterarFoto.setLayout(pnlAlterarFotoLayout);
        pnlAlterarFotoLayout.setHorizontalGroup(
            pnlAlterarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlterarFotoLayout.createSequentialGroup()
                .addGroup(pnlAlterarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlterarFotoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblImagem))
                    .addGroup(pnlAlterarFotoLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(pnlAlterarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterar)
                            .addComponent(lblMensagem))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        pnlAlterarFotoLayout.setVerticalGroup(
            pnlAlterarFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlterarFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        scrAlterarFoto.setViewportView(pnlAlterarFoto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrAlterarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrAlterarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        pesquisarFotoEEmail();
        if (imagem != null) {
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FOTOS/PERFIL/" + imagem)));
        } else {
            lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Sem-foto.jpeg")));
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        JFileChooser caixaDialogo = new JFileChooser();
        int opcao = caixaDialogo.showOpenDialog(this);

        if (opcao == JFileChooser.APPROVE_OPTION) {
            File arquivo = new File(caixaDialogo.getSelectedFile().getAbsolutePath());
            try {
                Files.copy(arquivo.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
                JOptionPane.showMessageDialog(null, "Imagem alterada com sucesso!", "Alteração", JOptionPane.INFORMATION_MESSAGE);
                meUser.alterarFoto(idUser, nomeFoto);

                BufferedImage leImage = ImageIO.read(destino);
                Image redimensiona = leImage.getScaledInstance(150, 180, Image.SCALE_SMOOTH);
                BufferedImage redimensionando = new BufferedImage(150, 180, BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = redimensionando.createGraphics();
                g2d.drawImage(redimensiona, 0, 0, null);
                g2d.dispose();
                ImageIO.write(redimensionando, "jpg", destino);

            } catch (IOException err) {
                throw new RuntimeException("Erro na cópia da imagem: " + err);
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    private void pesquisarFotoEEmail() {
        ArrayList<User> user = meUser.pesquisarUser(idUser);
        for (User u : user) {
            imagem = u.getFotoUser();
            email = u.getEmailUser();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JPanel pnlAlterarFoto;
    private javax.swing.JScrollPane scrAlterarFoto;
    // End of variables declaration//GEN-END:variables
}
