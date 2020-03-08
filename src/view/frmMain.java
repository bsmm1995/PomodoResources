package view;

import controller.Audio;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 * Esta clase es la principal del programa, aquí se inicializan los componentes
 * y se escriben los procesos necesarios para el funcionamiento del programa.
 * Así como también, se implementa todos los métodos de los componentes GUI.
 *
 * @author Bladimir Minga
 * @author Steveen Ganchozo
 * @version 17/02/2020/A
 */
public final class frmMain extends javax.swing.JFrame {

    private final int INT_MS = 1000;
    private int INT_SECOND = 0, INT_HOUR = 0, INT_MINUTE = 0;
    private Timer objTimer;
    private final ArrayList<pnlActivity> listPaneles;
    private int INDEX;
    private boolean BOOL_IS_ACTIVITY;
    private final String ALERTA1;
    private final String ALERTA2;
    private final Audio objAudio;

    /**
     * Constructor para iniciar las variables finales y los componentes gráficos
     * utilizados
     */
    public frmMain() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        listPaneles = new ArrayList<>();
        INDEX = 0;
        BOOL_IS_ACTIVITY = true;
        objAudio = new Audio();
        ALERTA1 = "src/src/alarma1.mp3";
        ALERTA2 = "src/src/alarma2.mp3";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pnlActivities = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        lblCronometroBreak = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnFinish = new javax.swing.JButton();
        sldVelocidad = new javax.swing.JSlider();
        lblCronometro = new javax.swing.JLabel();
        btnComenzar = new javax.swing.JButton();
        btnAddActivity = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        spnSessionForRest = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtActivityName = new javax.swing.JTextField();
        spnDuracionIntervalos = new javax.swing.JSpinner();
        spnDuracionDescanzoProlongado = new javax.swing.JSpinner();
        spnDuracionDescanzo = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDeleteActivity = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/src/Pomodoro.png")).getImage());

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POMODORO");

        pnlActivities.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actividades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        pnlActivities.setLayout(new java.awt.GridLayout(4, 4));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consola", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        txtConsole.setEditable(false);
        txtConsole.setColumns(20);
        txtConsole.setRows(5);
        jScrollPane1.setViewportView(txtConsole);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descanso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        lblCronometroBreak.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblCronometroBreak.setForeground(new java.awt.Color(102, 102, 102));
        lblCronometroBreak.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometroBreak.setText("00:00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCronometroBreak, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCronometroBreak, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        btnFinish.setText("FINALIZAR");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        sldVelocidad.setMajorTickSpacing(50);
        sldVelocidad.setMaximum(250);
        sldVelocidad.setPaintLabels(true);
        sldVelocidad.setPaintTicks(true);
        sldVelocidad.setValue(1);
        sldVelocidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sldVelocidadMouseClicked(evt);
            }
        });

        lblCronometro.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblCronometro.setForeground(new java.awt.Color(102, 102, 102));
        lblCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro.setText("00:00:00");

        btnComenzar.setText("INICIAR");
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnAddActivity.setText("AGREGAR");
        btnAddActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActivityActionPerformed(evt);
            }
        });

        jLabel2.setText("N° sesiones para descansar ");

        spnSessionForRest.setModel(new javax.swing.SpinnerNumberModel(4, 1, 5, 1));

        jLabel6.setText("Nombre de la actividad");

        spnDuracionIntervalos.setModel(new javax.swing.SpinnerNumberModel(25, 10, 30, 1));

        spnDuracionDescanzoProlongado.setModel(new javax.swing.SpinnerNumberModel(25, 15, 59, 1));
        spnDuracionDescanzoProlongado.setValue(15);

        spnDuracionDescanzo.setModel(new javax.swing.SpinnerNumberModel(5, 1, 10, 1));

        jLabel3.setText("N° minutos de la actividad");

        jLabel4.setText("N° minutos de descanso entre actividad");

        jLabel5.setText("N°  minutos para el descanzo largo");

        btnDeleteActivity.setText("ELIMINAR");
        btnDeleteActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActivityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(spnDuracionDescanzoProlongado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spnDuracionIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtActivityName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spnSessionForRest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnDuracionDescanzo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddActivity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteActivity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sldVelocidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActivityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddActivity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnDuracionIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnDeleteActivity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnDuracionDescanzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnSessionForRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnDuracionDescanzoProlongado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ejecución", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        lblTag.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblTag.setForeground(new java.awt.Color(255, 102, 102));
        lblTag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlActivities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método que muestra un cuadro de dialogo
     *
     * @param strSMS Esta variable de tipo string contiene el mensaje que se
     * desea mostrar en el cuadro de diálogo
     */
    private void SMS(String strSMS) {
        if (!strSMS.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, strSMS);
        }
    }//Cierre del método SMS 

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed
        if (listPaneles.isEmpty()) {
            SMS("Debe crear al menos una tarea");
            return;
        }
        enableComponents(false);
        startCount();
        setTextConsole("-> Start at: " + getCurrentDateTime());
    }//GEN-LAST:event_btnComenzarActionPerformed
    private void setTextConsole(String cade) {
        txtConsole.setText(txtConsole.getText() + cade + "\n");
    }
    private void btnAddActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActivityActionPerformed
        if (txtActivityName.getText().trim().isEmpty()) {
            SMS("Escriba un nombre a la actividad");
            return;
        }
        pnlActivity newPnl = new pnlActivity(listPaneles.size() + 1, txtActivityName.getText());
        listPaneles.add(newPnl);
        updatePaneles();
        txtConsole.setText(txtConsole.getText() + "-> Add: " + txtActivityName.getText() + " : " + getCurrentDateTime() + "\n");
    }//GEN-LAST:event_btnAddActivityActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        try {
            resetValues();
            listPaneles.clear();
            INDEX = 0;
            BOOL_IS_ACTIVITY = true;
            objTimer.stop();
            listPaneles.clear();
            pnlActivities.removeAll();
            pnlActivities.updateUI();
            lblCronometroBreak.setText("00:00:00");
            lblCronometro.setText("00:00:00");
            txtConsole.setText(txtConsole.getText() + "-> Finish at: " + getCurrentDateTime() + "\n");
            enableComponents(true);
            objAudio.endAudio();
        } catch (BasicPlayerException e) {
        }
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnDeleteActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActivityActionPerformed
        int index = listPaneles.size();
        if (index > 0) {
            listPaneles.remove(index - 1);
            updatePaneles();
            txtConsole.setText(txtConsole.getText() + "-> Del activity " + index + " : " + getCurrentDateTime() + "\n");
        }
    }//GEN-LAST:event_btnDeleteActivityActionPerformed

    private void sldVelocidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldVelocidadMouseClicked
        try {
            objTimer.setDelay(INT_MS / (sldVelocidad.getValue() + 1));
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_sldVelocidadMouseClicked

    /**
     * Método que devuelve la fecha del sistema
     *
     * @return La fecha actual del sistema
     */
    public String getCurrentDateTime() {
        return new Date().toString();
    }//Cierre del método getCurrentDateTime

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddActivity;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnDeleteActivity;
    private javax.swing.JButton btnFinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCronometro;
    private javax.swing.JLabel lblCronometroBreak;
    private javax.swing.JLabel lblTag;
    private javax.swing.JPanel pnlActivities;
    private javax.swing.JSlider sldVelocidad;
    private javax.swing.JSpinner spnDuracionDescanzo;
    private javax.swing.JSpinner spnDuracionDescanzoProlongado;
    private javax.swing.JSpinner spnDuracionIntervalos;
    private javax.swing.JSpinner spnSessionForRest;
    private javax.swing.JTextField txtActivityName;
    private javax.swing.JTextArea txtConsole;
    // End of variables declaration//GEN-END:variables
    /**
     * Método que permite identificar cuando debe hacerse un descanso corto o
     * descanso prolongado. Aquí también, se resetea las vistas del cronómetro.
     * Finalmente, si se cumplen las condiciones se inicializa el método para
     * reproducir el sonido.
     */

    private void terminar(int n) {
        if (n < 1) {
            objTimer.stop();
        }
    }

    private void options() {
        int min;
        if (BOOL_IS_ACTIVITY) {
            min = Integer.parseInt(spnDuracionIntervalos.getValue().toString());
        } else {
            int n = Integer.parseInt(spnSessionForRest.getValue().toString());
            terminar(n); //Este método busca valores negativos en las entradas
            if (INDEX % n == 0 && INDEX > 0) {
                min = Integer.parseInt(spnDuracionDescanzoProlongado.getValue().toString());
            } else {
                min = Integer.parseInt(spnDuracionDescanzo.getValue().toString());
            }
        }
        terminar(min);//Este método busca valores negativos en las entradas
        if (min == INT_MINUTE) {
            resetValues();
            String sms;
            String pathString;
            if (BOOL_IS_ACTIVITY) {
                lblCronometro.setText("00:00:00");
                if (INDEX < listPaneles.size()) {
                    listPaneles.get(INDEX).setCompletActivity();
                } else {
                    objTimer.stop();
                }
                INDEX++;
                sms = "-> TIEMPO DE ACTIVIDAD : " + getCurrentDateTime();
                pathString = ALERTA1;
                BOOL_IS_ACTIVITY = false;
            } else {
                pathString = ALERTA2;
                lblCronometroBreak.setText("00:00:00");
                BOOL_IS_ACTIVITY = true;
                sms = "-> TIEMPO DE DESCANZO : " + getCurrentDateTime();

            }
            setTextConsole(sms);
            try {
                objAudio.endAudio();
            } catch (BasicPlayerException e) {
            }
            if (INDEX < listPaneles.size()) {

            }

            if (INDEX == listPaneles.size()) {
                objTimer.stop();
            }

            playSound(pathString);

        }
    }//Cierre del método

    /**
     * Método que se ejecuta en el hilo del objeto TIMER, que permite crear los
     * formatos de hora e ir mostrando el avance de tiempo.
     */
    private void startCount() {
        objTimer = new Timer(INT_MS, (e) -> {
            String hour = String.valueOf(INT_HOUR);
            String minute = String.valueOf(INT_MINUTE);
            String seconds = String.valueOf(INT_SECOND);

            if (INT_HOUR < 10) {
                hour = "0".concat(hour);
            }
            if (INT_MINUTE < 10) {
                minute = "0".concat(minute);
            }
            if (INT_SECOND < 10) {
                seconds = "0".concat(seconds);
            }
            if (BOOL_IS_ACTIVITY) {
                lblCronometro.setText(hour + ":" + minute + ":" + seconds);
            } else {
                lblCronometroBreak.setText(hour + ":" + minute + ":" + seconds);
            }

            if (BOOL_IS_ACTIVITY) {
                if (INT_SECOND % 2 == 0) {
                    lblTag.setText("ACTIVIDAD");
                } else {
                    lblTag.setText("");
                }
            } else {
                if (INT_SECOND % 2 == 0) {
                    lblTag.setText("DESCANSO");
                } else {
                    lblTag.setText("");
                }
            }

            INT_SECOND += 1;
            if (INT_SECOND == 60) {
                INT_SECOND = 0;
                INT_MINUTE++;
                if (INT_MINUTE == 60) {
                    INT_MINUTE = 0;
                    INT_HOUR++;
                }
            }
            options();
        });
        objTimer.start();
    }//Cierre del método startCount

    /**
     * Método que asigna el valor cero (0) a las variables hora, minuto y
     * segundo.
     */
    private void resetValues() {
        INT_HOUR = 0;
        INT_MINUTE = 0;
        INT_SECOND = 0;
        sldVelocidad.setValue(0);
        objTimer.setDelay(INT_MS);
    }//Cierre del método resetValues

    /**
     * Método que borra los componentes del panel pnlActivities y grafica
     * nuevamente los que se encuentran en el array listPaneles
     */
    private void updatePaneles() {
        pnlActivities.removeAll();
        pnlActivities.updateUI();
        listPaneles.forEach((panel) -> {
            pnlActivities.add(panel);
        });
    }//Cierre del método updatePaneles

    /**
     * Método que activa y desactiva los componentes de tipo spinner y el botón
     * btnDeleteActivity
     */
    private void enableComponents(boolean bool) {
        spnDuracionDescanzo.setEnabled(bool);
        spnDuracionDescanzoProlongado.setEnabled(bool);
        spnDuracionIntervalos.setEnabled(bool);
        spnSessionForRest.setEnabled(bool);
        btnDeleteActivity.setEnabled(bool);
        btnComenzar.setEnabled(bool);
        btnAddActivity.setEnabled(bool);
    }//Cierre del método enableComponents

    /**
     * Método que utiliza la instancia (objAudio) de la clase Audio.java, para
     * reproducir el audio. Además, aquí se captura las posibles excepciones que
     * pueden suscitarse cuando se intente reproducir un archivo de audio
     */
    private void playSound(String path) {
        try {
            objAudio.reproducirAudio(path);
        } catch (BasicPlayerException ex) {
            Logger.getLogger(frmMain.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//Cierre del método playSound
}//Cierre de la clase
