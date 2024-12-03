package com.eduardovolpi.exemplos;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileSystemView;

public class TelaInicial extends javax.swing.JFrame {

    // Constante com o nome do "Titulo" utilizados nos JOptionPanes 
    private static final String APPTITLE = "Exemplos";
    // Constante com o caminho do arquivo de audio
    private static final String ARQAUDIO = "D:\\Programas\\Musica\\Alice Cooper\\HowYouGonnaSeeMeNow.wav";

    public TelaInicial() {
        initComponents();

        EduardoVolpi.traduzir();

        ImageIcon icon = new ImageIcon(this.getClass().getResource("/imagens/icone.png"));
        setIconImage(icon.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnDataHora = new javax.swing.JButton();
        btnIdiomaSistema = new javax.swing.JButton();
        btnResolucao = new javax.swing.JButton();
        btnTiposPrimitivos = new javax.swing.JButton();
        btnRandom = new javax.swing.JButton();
        btnParImpar = new javax.swing.JButton();
        btnSystemGetEnv = new javax.swing.JButton();
        btnDocsFolder = new javax.swing.JButton();
        btnFileSeparator = new javax.swing.JButton();
        btnCurrentDir = new javax.swing.JButton();
        btnHomeDir = new javax.swing.JButton();
        btnSystemTempDir = new javax.swing.JButton();
        btnTryCatch = new javax.swing.JButton();
        btnAudioPlay = new javax.swing.JButton();
        btnComoNomear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnIfElse = new javax.swing.JButton();
        btnSwicth = new javax.swing.JButton();
        btnWhile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnDoWhile = new javax.swing.JButton();
        btnFoLoop = new javax.swing.JButton();
        btnVetoresSimples = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        btnAlert = new javax.swing.JButton();
        btnError = new javax.swing.JButton();
        btnInputBox = new javax.swing.JButton();
        btnQuestion = new javax.swing.JButton();
        btnSimpleMessage = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnFileWriter = new javax.swing.JButton();
        btnLerArquivo = new javax.swing.JButton();
        btnApagarArquivo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplos");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Outros"));

        btnDataHora.setText("Data e Hora do Sistema");
        btnDataHora.setMaximumSize(new java.awt.Dimension(153, 25));
        btnDataHora.setMinimumSize(new java.awt.Dimension(153, 25));
        btnDataHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataHoraActionPerformed(evt);
            }
        });

        btnIdiomaSistema.setText("Idioma do Sistema");
        btnIdiomaSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaSistemaActionPerformed(evt);
            }
        });

        btnResolucao.setText("Resolução de Tela");
        btnResolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolucaoActionPerformed(evt);
            }
        });

        btnTiposPrimitivos.setText("JDialog | Tipos Primitivos");
        btnTiposPrimitivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiposPrimitivosActionPerformed(evt);
            }
        });

        btnRandom.setText("Numeros Randômicos");
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        btnParImpar.setText("Número Par ou Impar?");
        btnParImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParImparActionPerformed(evt);
            }
        });

        btnSystemGetEnv.setText("System.getenv() Folders");
        btnSystemGetEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemGetEnvActionPerformed(evt);
            }
        });

        btnDocsFolder.setText("Documents Folder");
        btnDocsFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocsFolderActionPerformed(evt);
            }
        });

        btnFileSeparator.setText("File.separatorChar");
        btnFileSeparator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileSeparatorActionPerformed(evt);
            }
        });

        btnCurrentDir.setText("System \"Current\" Directory");
        btnCurrentDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentDirActionPerformed(evt);
            }
        });

        btnHomeDir.setText("System \"Home\" Directory");
        btnHomeDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeDirActionPerformed(evt);
            }
        });

        btnSystemTempDir.setText("System \"Temp\" Directory");
        btnSystemTempDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemTempDirActionPerformed(evt);
            }
        });

        btnTryCatch.setText("try .. catch");
        btnTryCatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTryCatchActionPerformed(evt);
            }
        });

        btnAudioPlay.setText("Audio Play");
        btnAudioPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAudioPlayActionPerformed(evt);
            }
        });

        btnComoNomear.setText("JDialog | Como Nomear");
        btnComoNomear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComoNomearActionPerformed(evt);
            }
        });

        jButton1.setText("Dark Theme");
        jButton1.setName("btnDarkTheme"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Light Theme");
        jButton2.setName("btnLightTheme"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSystemTempDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHomeDir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCurrentDir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFileSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDocsFolder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSystemGetEnv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTiposPrimitivos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResolucao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIdiomaSistema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRandom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnParImpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAudioPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComoNomear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnTryCatch, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTryCatch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIdiomaSistema)
                    .addComponent(btnAudioPlay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResolucao)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTiposPrimitivos)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRandom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnParImpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSystemGetEnv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDocsFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFileSeparator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCurrentDir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHomeDir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSystemTempDir)
                    .addComponent(btnComoNomear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Comandos, Loops"));

        btnIfElse.setText("if else");
        btnIfElse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIfElseActionPerformed(evt);
            }
        });

        btnSwicth.setText("switch");
        btnSwicth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwicthActionPerformed(evt);
            }
        });

        btnWhile.setText("while loop");
        btnWhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhileActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        btnDoWhile.setText("do while loop");
        btnDoWhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoWhileActionPerformed(evt);
            }
        });

        btnFoLoop.setText("for loop");
        btnFoLoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoLoopActionPerformed(evt);
            }
        });

        btnVetoresSimples.setText("Vetores Simples");
        btnVetoresSimples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVetoresSimplesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnWhile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIfElse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSwicth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoWhile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFoLoop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVetoresSimples, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnIfElse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSwicth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnWhile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoWhile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFoLoop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVetoresSimples)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Caixas  de Dialogo"));

        btnInfo.setText("Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnAlert.setText("Warning / Alert");
        btnAlert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertActionPerformed(evt);
            }
        });

        btnError.setText("Error");
        btnError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrorActionPerformed(evt);
            }
        });

        btnInputBox.setText("InputBox");
        btnInputBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputBoxActionPerformed(evt);
            }
        });

        btnQuestion.setText("Question");
        btnQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionActionPerformed(evt);
            }
        });

        btnSimpleMessage.setText("Simple Message");
        btnSimpleMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpleMessageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInputBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSimpleMessage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnSimpleMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInputBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Arquivos"));

        btnFileWriter.setText("Gravar Arquivo");
        btnFileWriter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileWriterActionPerformed(evt);
            }
        });

        btnLerArquivo.setText("Ler Arquivo");
        btnLerArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLerArquivoActionPerformed(evt);
            }
        });

        btnApagarArquivo.setText("Apagar Arquivo");
        btnApagarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFileWriter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLerArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagarArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnFileWriter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLerArquivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApagarArquivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Outro"));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Exemplos 1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Exemplos 2", jPanel2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/java_70px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Java");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(172, 172, 172));
        jLabel3.setText("programming");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Meus Metodos
    public class EduardoVolpi {

        public static void traduzir() {
            //---------------------------------------------------------------
            //--------------------Eventos OptionPane-------------------------
            //---------------------------------------------------------------
            UIManager.put("OptionPane.yesButtonText", "Sim");
            UIManager.put("OptionPane.noButtonText", "Não");
            UIManager.put("OptionPane.inputDialogTitle", APPTITLE);
            UIManager.put("OptionPane.okButtonText", "OK");
            UIManager.put("OptionPane.cancelButtonText", "Cancelar");
            //---------------------------------------------------------------

            //--------------------Eventos FileChooser------------------------
            //UIManager.put("FileChooser.lookInLabelMnemonic", new Integer('E'));
            UIManager.put("FileChooser.lookInLabelMnemonic", ('E'));
            UIManager.put("FileChooser.lookInLabelText", "Examinar em:");
            UIManager.put("FileChooser.saveInLabelText", "Salvar em:");

            //UIManager.put("FileChooser.fileNameLabelMnemonic", new Integer('N'));
            UIManager.put("FileChooser.fileNameLabelMnemonic", ('N'));
            UIManager.put("FileChooser.fileNameLabelText", "Nome do arquivo:");

            //UIManager.put("FileChooser.filesOfTypeLabelMnemonic", new Integer('T'));
            UIManager.put("FileChooser.filesOfTypeLabelMnemonic", ('T'));
            UIManager.put("FileChooser.filesOfTypeLabelText", "Tipos de arquivo:");

            UIManager.put("FileChooser.upFolderToolTipText", "Um nível acima");
            UIManager.put("FileChooser.upFolderAccessibleName", "Um nível acima");

            UIManager.put("FileChooser.homeFolderToolTipText", "Área de trabalho");
            UIManager.put("FileChooser.homeFolderAccessibleName", "Área de trabalho");

            UIManager.put("FileChooser.newFolderToolTipText", "Nova pasta");
            UIManager.put("FileChooser.newFolderAccessibleName", "Nova pasta");

            UIManager.put("FileChooser.listViewButtonToolTipText", "Lista");
            UIManager.put("FileChooser.listViewButtonAccessibleName", "Lista");

            UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalhes");
            UIManager.put("FileChooser.detailsViewButtonAccessibleName", "Detalhes");

            UIManager.put("FileChooser.fileNameHeaderText", "Nome");
            UIManager.put("FileChooser.fileSizeHeaderText", "Tamanho");
            UIManager.put("FileChooser.fileTypeHeaderText", "Tipo");
            UIManager.put("FileChooser.fileDateHeaderText", "Data");
            UIManager.put("FileChooser.fileAttrHeaderText", "Atributos");

            UIManager.put("FileChooser.saveButtonText", "Salvar");
            UIManager.put("FileChooser.cancelButtonText", "Cancelar");
            UIManager.put("FileChooser.openButtonText", "Selecionar");

            UIManager.put("FileChooser.acceptAllFileFilterText", "Todos Arquivos (*.*)");

            UIManager.put("FileChooser.openDialogTitleText", "Abrir");
            UIManager.put("FileChooser.saveDialogTitleText", "Salvar");
            //---------------------------------------------------------------
            //----------------------Eventos Combobox-------------------------
            //UIManager.put("ComboBox.disabledForeground", Color.BLACK);
        }
    }

    private void btnIdiomaSistemaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIdiomaSistemaActionPerformed
    {//GEN-HEADEREND:event_btnIdiomaSistemaActionPerformed
        Locale currentLocale = Locale.getDefault();
        String localAtual = currentLocale.getDisplayLanguage();

        JOptionPane.showMessageDialog(this, "Idioma do Sistema: " +
                localAtual, APPTITLE, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnIdiomaSistemaActionPerformed

    private void btnDataHoraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDataHoraActionPerformed
    {//GEN-HEADEREND:event_btnDataHoraActionPerformed
        Date relogio = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String hojeStr = df.format(relogio);

        JOptionPane.showMessageDialog(this, "Data e Hora do Sistema: " +
                hojeStr, APPTITLE, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDataHoraActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown
        // TODO add your handling code here:
        // Seto foco na imagem(jlabel1) para tirar o foco de outros elementos
        jLabel1.requestFocusInWindow();
    }//GEN-LAST:event_formComponentShown

    private void btnResolucaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResolucaoActionPerformed
    {//GEN-HEADEREND:event_btnResolucaoActionPerformed
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();

        JOptionPane.showMessageDialog(this, "Resolução de Tela: " +
                d.width + " x " + d.height, APPTITLE, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnResolucaoActionPerformed

    private void btnTiposPrimitivosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTiposPrimitivosActionPerformed
    {//GEN-HEADEREND:event_btnTiposPrimitivosActionPerformed
        PrimitiveTypes meuDialog = new PrimitiveTypes(this, true);
        meuDialog.setVisible(true);
    }//GEN-LAST:event_btnTiposPrimitivosActionPerformed

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRandomActionPerformed
    {//GEN-HEADEREND:event_btnRandomActionPerformed
        // Para gerar números randômicos tem que importar java.util.Random

        Random random = new Random();

        int numero = random.nextInt(); // Gera qualquer número
        JOptionPane.showMessageDialog(this, "Número Qualquer:\n" +
                Integer.toString(numero), APPTITLE, JOptionPane.INFORMATION_MESSAGE);

        int numero2 = random.nextInt(60); // Gera um número entre 0 e 59
        JOptionPane.showMessageDialog(this, "Número entre 0 e 59:\n" +
                Integer.toString(numero2), APPTITLE, JOptionPane.INFORMATION_MESSAGE);

        int numero3 = random.nextInt(60) + 1; // Gera um número entre 1 e 60
        JOptionPane.showMessageDialog(this, "Número entre 1 e 60:\n" +
                Integer.toString(numero3), APPTITLE, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRandomActionPerformed

    private void btnParImparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnParImparActionPerformed
    {//GEN-HEADEREND:event_btnParImparActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(this, "O número " + Integer.toString(numero) +
                    " é Par!", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "O número " + Integer.toString(numero) +
                    " é Impar!", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnParImparActionPerformed

    private void btnIfElseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnIfElseActionPerformed
    {//GEN-HEADEREND:event_btnIfElseActionPerformed
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade para vermos se voce vota ou não:"));

        if (idade < 16) {
            JOptionPane.showMessageDialog(this, "Voce tem " + Integer.toString(idade) +
                    " anos e\n Não Vota", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
        } else {
            if ((idade >= 16 && idade < 18) || (idade >= 70)) {
                JOptionPane.showMessageDialog(this, "Voce tem " + Integer.toString(idade) +
                        " anos e\n O Voto é Opcional.", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Voce tem " + Integer.toString(idade) +
                        " anos e\n O Voto é Obrigatório.", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnIfElseActionPerformed

    private void btnSwicthActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSwicthActionPerformed
    {//GEN-HEADEREND:event_btnSwicthActionPerformed
        Date relogio = new Date();
        LocalDate dataLocal = LocalDate.now();
        java.time.DayOfWeek diaDaSemana = dataLocal.getDayOfWeek();

        // diaDaSemana.getValue() - pega o numero do dia da semana
        // diaDaSemana.toString() - pega o nome em Ingles
        String Dia = diaDaSemana.toString().toLowerCase();
        String msg = "";

        switch (Dia) {
            case "monday":
                msg = "Hoje é Segunda-Feira";
                break;
            case "tuesday":
                msg = "Hoje é Terça-Feira";
                break;
            case "wednesday":
                msg = "Hoje é Quarta-Feira";
                break;
            case "thursday":
                msg = "Hoje é Quinta-Feira";
                break;
            case "friday":
                msg = "Hoje é Sexta-Feira";
                break;
            case "saturday":
                msg = "Hoje é Sábado";
                break;
            case "sunday":
                msg = "Hoje é Domingo";
                break;
            default:
                break;
        }

        JOptionPane.showMessageDialog(this, msg, APPTITLE, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSwicthActionPerformed

    private void btnWhileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnWhileActionPerformed
    {//GEN-HEADEREND:event_btnWhileActionPerformed
        DefaultListModel itemLista = new DefaultListModel();
        itemLista.clear();

        int contador = 1;
        while (contador <= 500) {
            itemLista.addElement("while " + Integer.toString(contador));
            contador++;
        }
        jList1.setModel(itemLista);
    }//GEN-LAST:event_btnWhileActionPerformed

    private void btnDoWhileActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDoWhileActionPerformed
    {//GEN-HEADEREND:event_btnDoWhileActionPerformed
        DefaultListModel itemLista = new DefaultListModel();
        itemLista.clear();

        int contador = 1;
        do {
            itemLista.addElement("do while " + Integer.toString(contador));
            contador++;
        } while (contador <= 500);
        jList1.setModel(itemLista);
    }//GEN-LAST:event_btnDoWhileActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInfoActionPerformed
    {//GEN-HEADEREND:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(this, "Esta é uma mensagem de Informação.", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnAlertActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAlertActionPerformed
    {//GEN-HEADEREND:event_btnAlertActionPerformed
        JOptionPane.showMessageDialog(this, "Este é um aviso de Alerta!", APPTITLE, JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnAlertActionPerformed

    private void btnErrorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnErrorActionPerformed
    {//GEN-HEADEREND:event_btnErrorActionPerformed
        JOptionPane.showMessageDialog(this, "Esta é uma Mensagem de Erro!", APPTITLE, JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnErrorActionPerformed

    private void btnInputBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInputBoxActionPerformed
    {//GEN-HEADEREND:event_btnInputBoxActionPerformed
        String nome;
        nome = JOptionPane.showInputDialog(this, "Digite seu Nome: ");
        if (!nome.isBlank()) {
            nome = nome.trim();
            JOptionPane.showMessageDialog(this, "Ola " + nome + "!", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnInputBoxActionPerformed

    private void btnQuestionActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnQuestionActionPerformed
    {//GEN-HEADEREND:event_btnQuestionActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente sair do programa?", APPTITLE, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnQuestionActionPerformed

    private void btnSimpleMessageActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSimpleMessageActionPerformed
    {//GEN-HEADEREND:event_btnSimpleMessageActionPerformed
        JOptionPane.showMessageDialog(this, "Exibe uma mensagem simples, sem Ícone.", APPTITLE, JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnSimpleMessageActionPerformed

    private void btnFoLoopActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFoLoopActionPerformed
    {//GEN-HEADEREND:event_btnFoLoopActionPerformed
        DefaultListModel itemLista = new DefaultListModel();
        itemLista.clear();

        for (int i = 0; i <= 500; i++) {
            itemLista.addElement("for loop " + Integer.toString(i));
        }
        jList1.setModel(itemLista);
    }//GEN-LAST:event_btnFoLoopActionPerformed

    private void btnSystemGetEnvActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSystemGetEnvActionPerformed
    {//GEN-HEADEREND:event_btnSystemGetEnvActionPerformed
        // Isso é melhor ou acho que só para usar no Windows
        // Não deve ser uma solução Multiplataform        
        // TEMP - PROGRAMFILES - PROGRAMFILES(X86) - SYSTEMDRIVE - WINDIR
        // Usando System.getenv("PROGRAMFILES")
        JOptionPane.showMessageDialog(this, System.getenv("PROGRAMFILES"), APPTITLE, JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnSystemGetEnvActionPerformed

    private void btnDocsFolderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDocsFolderActionPerformed
    {//GEN-HEADEREND:event_btnDocsFolderActionPerformed
//        JFileChooser fr = new JFileChooser();
//        FileSystemView fw = fr.getFileSystemView();
//        JOptionPane.showMessageDialog(this, fw.getDefaultDirectory(), APPTITLE, JOptionPane.PLAIN_MESSAGE);

        //Solução bem mais rápida encontrada é usar
        //FileSystemView.getFileSystemView().getDefaultDirectory().getPath()
        JOptionPane.showMessageDialog(this, FileSystemView.getFileSystemView().getDefaultDirectory().getPath(), APPTITLE, JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_btnDocsFolderActionPerformed

    private void btnVetoresSimplesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVetoresSimplesActionPerformed
    {//GEN-HEADEREND:event_btnVetoresSimplesActionPerformed
        DefaultListModel itemLista = new DefaultListModel();

        String mes[]
                = {
                    "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"
                };
        int numDias[]
                = {
                    31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
                };

        for (int i = 0; i < mes.length; i++) {
            itemLista.addElement(mes[i] + " tem " + numDias[i] + " dias.");
        }
        jList1.setModel(itemLista);

    }//GEN-LAST:event_btnVetoresSimplesActionPerformed

    private void btnFileSeparatorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFileSeparatorActionPerformed
    {//GEN-HEADEREND:event_btnFileSeparatorActionPerformed
        JOptionPane.showMessageDialog(this, FileSystemView.getFileSystemView().getDefaultDirectory().getPath() +
                File.separatorChar, APPTITLE, JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnFileSeparatorActionPerformed

    private void btnCurrentDirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCurrentDirActionPerformed
    {//GEN-HEADEREND:event_btnCurrentDirActionPerformed
        String currentWorkingDir = System.getProperty("user.dir");
        JOptionPane.showMessageDialog(this, currentWorkingDir, APPTITLE, JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnCurrentDirActionPerformed

    private void btnHomeDirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHomeDirActionPerformed
    {//GEN-HEADEREND:event_btnHomeDirActionPerformed
        String homeDirectory = System.getProperty("user.home");
        JOptionPane.showMessageDialog(this, homeDirectory, APPTITLE, JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnHomeDirActionPerformed

    private void btnTryCatchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnTryCatchActionPerformed
    {//GEN-HEADEREND:event_btnTryCatchActionPerformed
        try {
            // Basta dividir um número qualquer por 0 para gerar uma exceção
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(this, "Primeiro número: "));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(this, "Segundo número (digite 0 para gerar uma exceção): "));

            double result = num1 / num2;

            JOptionPane.showMessageDialog(this, Double.toString(result));
        } catch (ArithmeticException e)// Exception e
        {
            JOptionPane.showMessageDialog(this, "Não é possíveldividir um número por 0\n" + e.getMessage());
        } finally {
            // Este bloco sempre executará, com erro ou não
            // é um local bom para fechar ou liberar qualquer objeto ou arquivo criado/aberto
            System.out.println("Sempre executará");
        }


    }//GEN-LAST:event_btnTryCatchActionPerformed

    private void btnSystemTempDirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSystemTempDirActionPerformed
    {//GEN-HEADEREND:event_btnSystemTempDirActionPerformed
        String tempDir = System.getProperty("java.io.tmpdir");
        JOptionPane.showMessageDialog(this, tempDir, APPTITLE, JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnSystemTempDirActionPerformed

    private void btnApagarArquivoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnApagarArquivoActionPerformed
    {//GEN-HEADEREND:event_btnApagarArquivoActionPerformed
        String filePath = System.getProperty("java.io.tmpdir") + "arquivo.txt";
        File file = new File(filePath);

        if (file.exists()) {
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja apagar este arquivo?", APPTITLE, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                file.delete();
                JOptionPane.showMessageDialog(this, "Arquivo Apagado do Disco.", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Arquivo Inexistente\n", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnApagarArquivoActionPerformed

    private void btnFileWriterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFileWriterActionPerformed
    {//GEN-HEADEREND:event_btnFileWriterActionPerformed
        // Obtendo e formatando data e hora do sistema
        Date relogio = new Date();
        DateFormat dfd = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dfh = new SimpleDateFormat("HH:mm");
        String dataStr = dfd.format(relogio);
        String horaStr = dfh.format(relogio);

        String filePath = System.getProperty("java.io.tmpdir") + "arquivo.txt";
        try {
            FileWriter writer = new FileWriter(filePath, UTF_8);
            writer.write("Eduardo Volpi de Almeida\n");
            writer.append("Rua Willis Roberto Banks, 549 apto.72C\n");
            writer.append("05128-000 São Paulo - SP\n\n");
            writer.append("Gravado em " + dataStr + " às " + horaStr);
            writer.close();

            JOptionPane.showMessageDialog(this, "Arquivo Gravado com Sucesso!", APPTITLE, JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Ocorreu um Erro.", APPTITLE, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFileWriterActionPerformed

    private void btnLerArquivoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLerArquivoActionPerformed
    {//GEN-HEADEREND:event_btnLerArquivoActionPerformed
        String filePath = System.getProperty("java.io.tmpdir") + "arquivo.txt";
        File file = new File(filePath);
        String msg = "";

        if (file.exists()) {
            try {
                FileReader reader = new FileReader(filePath, UTF_8);
                int conteudo = reader.read();
                while (conteudo != -1)// -1 indica que não há mais characteres para ler
                {
                    msg = msg + ((char) conteudo);
                    conteudo = reader.read();
                }
                reader.close();

                JOptionPane.showMessageDialog(this, msg, APPTITLE, JOptionPane.PLAIN_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Ocorreu um Erro.\n" + ex.getMessage(), APPTITLE, JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Arquivo Inexistente.", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btnLerArquivoActionPerformed

    private void btnAudioPlayActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAudioPlayActionPerformed
    {//GEN-HEADEREND:event_btnAudioPlayActionPerformed
        File file = new File(ARQAUDIO); // Constante definida acima

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            JOptionPane.showMessageDialog(this, "Formato de Arquivo Não Suportado", APPTITLE, JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um Erro.\n" + e.getMessage(), APPTITLE, JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnAudioPlayActionPerformed

    private void btnComoNomearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComoNomearActionPerformed
        ComoNomear meuDialog = new ComoNomear(this, true);
        meuDialog.setVisible(true);
    }//GEN-LAST:event_btnComoNomearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            // Atualiza o LookAndFeel da janela atual
            UIManager.getLookAndFeelDefaults().put("ClassLoader", getClass().getClassLoader());
            // Atualiza a interface
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            // Atualiza o LookAndFeel da janela atual
            UIManager.getLookAndFeelDefaults().put("ClassLoader", getClass().getClassLoader());
            // Atualiza a interface
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        // LOOKANDFEEL
        com.formdev.flatlaf.FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlert;
    private javax.swing.JButton btnApagarArquivo;
    private javax.swing.JButton btnAudioPlay;
    private javax.swing.JButton btnComoNomear;
    private javax.swing.JButton btnCurrentDir;
    private javax.swing.JButton btnDataHora;
    private javax.swing.JButton btnDoWhile;
    private javax.swing.JButton btnDocsFolder;
    private javax.swing.JButton btnError;
    private javax.swing.JButton btnFileSeparator;
    private javax.swing.JButton btnFileWriter;
    private javax.swing.JButton btnFoLoop;
    private javax.swing.JButton btnHomeDir;
    private javax.swing.JButton btnIdiomaSistema;
    private javax.swing.JButton btnIfElse;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnInputBox;
    private javax.swing.JButton btnLerArquivo;
    private javax.swing.JButton btnParImpar;
    private javax.swing.JButton btnQuestion;
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnResolucao;
    private javax.swing.JButton btnSimpleMessage;
    private javax.swing.JButton btnSwicth;
    private javax.swing.JButton btnSystemGetEnv;
    private javax.swing.JButton btnSystemTempDir;
    private javax.swing.JButton btnTiposPrimitivos;
    private javax.swing.JButton btnTryCatch;
    private javax.swing.JButton btnVetoresSimples;
    private javax.swing.JButton btnWhile;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
