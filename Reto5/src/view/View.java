package view;

import controller.EBO;
import javax.swing.JOptionPane;
import modelo.EVO;

public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
        jButtonActualizar.setEnabled(false);
        jButtonBorrar.setEnabled(false);
    }

    public void limpiar() {
        jTextNombres.setText(null);
        jTextApellidos.setText(null);
        jTextFnacimiento.setText(null);
        jTextCinstitucional.setText(null);
        jTextCpersonal.setText(null);
        jTextNcelular.setText(null);
        jTextNfijo.setText(null);
        jTextPrograma.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombres = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelFnacimiento = new javax.swing.JLabel();
        jLabelCinstitucional = new javax.swing.JLabel();
        jLabelCpersonal = new javax.swing.JLabel();
        jLabelNcelular = new javax.swing.JLabel();
        jLabelNfijo = new javax.swing.JLabel();
        jLabelPrograma = new javax.swing.JLabel();
        jTextNombres = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jTextFnacimiento = new javax.swing.JTextField();
        jTextCinstitucional = new javax.swing.JTextField();
        jTextCpersonal = new javax.swing.JTextField();
        jTextNcelular = new javax.swing.JTextField();
        jTextNfijo = new javax.swing.JTextField();
        jTextPrograma = new javax.swing.JTextField();
        jButtonInsertar = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonConsultas = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNombres.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelNombres.setText("Nombres");

        jLabelApellidos.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelApellidos.setText("Apellidos");

        jLabelFnacimiento.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelFnacimiento.setText("Fecha de nacimiento");

        jLabelCinstitucional.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelCinstitucional.setText("Correo institucional");

        jLabelCpersonal.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelCpersonal.setText("Correo personal");

        jLabelNcelular.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelNcelular.setText("Número de celular");

        jLabelNfijo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelNfijo.setText("Número fijo");

        jLabelPrograma.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabelPrograma.setText("Programa académico");

        jTextNombres.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jTextApellidos.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTextApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidosActionPerformed(evt);
            }
        });

        jTextFnacimiento.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jTextCinstitucional.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jTextCpersonal.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jTextNcelular.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jTextNfijo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jTextPrograma.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jButtonInsertar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonInsertar.setText("INSERTAR");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonCargar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonCargar.setText("CARGAR");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonBorrar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonBorrar.setText("BORRAR");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonConsultas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButtonConsultas.setText("CONSULTAS");
        jButtonConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultasActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelTitulo.setText("INSTITUTO LA FLORESTA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombres)
                    .addComponent(jLabelApellidos)
                    .addComponent(jLabelFnacimiento)
                    .addComponent(jLabelCinstitucional)
                    .addComponent(jLabelCpersonal)
                    .addComponent(jLabelNcelular)
                    .addComponent(jLabelNfijo)
                    .addComponent(jLabelPrograma))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextCinstitucional)
                    .addComponent(jTextCpersonal)
                    .addComponent(jTextNcelular)
                    .addComponent(jTextNfijo)
                    .addComponent(jTextPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jTextFnacimiento)
                    .addComponent(jTextNombres)
                    .addComponent(jTextApellidos))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jButtonInsertar)
                .addGap(18, 18, 18)
                .addComponent(jButtonCargar)
                .addGap(18, 18, 18)
                .addComponent(jButtonActualizar)
                .addGap(18, 18, 18)
                .addComponent(jButtonBorrar)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultas)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabelTitulo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombres)
                    .addComponent(jTextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFnacimiento)
                    .addComponent(jTextFnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCinstitucional)
                    .addComponent(jTextCinstitucional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpersonal)
                    .addComponent(jTextCpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNcelular)
                    .addComponent(jTextNcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNfijo)
                    .addComponent(jTextNfijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrograma)
                    .addComponent(jTextPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonCargar)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonConsultas))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidosActionPerformed

    private void jButtonConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultasActionPerformed
        // TODO add your handling code here:
        new Consultas(this, true).setVisible(true);
    }//GEN-LAST:event_jButtonConsultasActionPerformed

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // TODO add your handling code here:
        try {
            EVO registro = new EVO();
            registro.setNombres(jTextNombres.getText());
            registro.setApellidos(jTextApellidos.getText());
            registro.setFnacimiento(jTextFnacimiento.getText());
            registro.setCinstitucional(jTextCinstitucional.getText());
            registro.setCpersonal(jTextCpersonal.getText());
            try {
                registro.setNcelular(Long.parseLong(jTextNcelular.getText()));
            } catch (NumberFormatException exc) {
                registro.setNcelular(0);
            }
            try {
                registro.setNfijo(Long.parseLong(jTextNfijo.getText()));
            } catch (NumberFormatException exc) {
                registro.setNfijo(0);
            }
            registro.setPrograma(jTextPrograma.getText());
            //CARGA LOS DATOS A TRAVÉS DE REGISTRO
            boolean resultado = new EBO().ingresarEstudiante(registro);
            String mensaje = resultado ? "El estudiante fue registrado" : "El estudiante no fue registrado";
            limpiar();
            //IMPRIMIR MENSAJE
            JOptionPane.showMessageDialog(this, mensaje);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        // TODO add your handling code here:
        try {
            String cinstitucional = jTextCinstitucional.getText();
            EVO encontrado = new EBO().buscarEstudiante(cinstitucional);
            if (encontrado != null) {
                jTextNombres.setText(encontrado.getNombres());
                jTextApellidos.setText(encontrado.getApellidos());
                jTextFnacimiento.setText(encontrado.getFnacimiento());
                jTextCinstitucional.setText(encontrado.getCinstitucional());
                jTextCpersonal.setText(encontrado.getCpersonal());
                jTextNcelular.setText(encontrado.getNcelular()+"");
                jTextNfijo.setText(encontrado.getNfijo()+"");
                jTextPrograma.setText(encontrado.getPrograma());
            } else {
                JOptionPane.showMessageDialog(this, "El estudiante no se encuentra registrado en el instituto");
                JOptionPane.showMessageDialog(this, "Ingrese el correo institucional");
            }
            jButtonActualizar.setEnabled(true);
            jButtonBorrar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    }//GEN-LAST:event_jButtonCargarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here
        try {
            String cinstitucional = jTextCinstitucional.getText();
            EVO modificar = new EBO().buscarEstudiante(cinstitucional);
            if (modificar != null) {
                modificar.setCpersonal(jTextCpersonal.getText());
                try {
                    modificar.setNcelular(Long.parseLong(jTextNcelular.getText()));
                } catch (NumberFormatException exc) {
                    modificar.setNcelular(0);
                }
                try {
                    modificar.setNfijo(Long.parseLong(jTextNfijo.getText()));
                } catch (NumberFormatException exc) {
                    modificar.setNfijo(0);
                }
                modificar.setPrograma(jTextPrograma.getText());
                //CARGA LOS DATOS A TRAVÉS DE MODIFICAR
                boolean resultado = new EBO().modificarEstudiante(modificar);
                String mensaje = resultado ? "El estudiante fue actualizado" : "El estudiante no fue actualizado";
                limpiar();
                //IMPRIMIR MENSAJE
                JOptionPane.showMessageDialog(this, mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "El estudiante no se encuentra registrado en el instituto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        try {
            String cinstitucional = jTextCinstitucional.getText();
            EVO estudiante = new EBO().buscarEstudiante(cinstitucional);
            if (estudiante != null) {
                boolean resultado = new EBO().borrarEstudiante(estudiante);
                String mensaje = resultado ? "El estudiante fue borrado" : "El estudiante no fue borrado";
                limpiar();
                //IMPRIMIR MENSAJE
                JOptionPane.showMessageDialog(this, mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "El estudiante no se encuentra registrado en el instituto");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e);
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonConsultas;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCinstitucional;
    private javax.swing.JLabel jLabelCpersonal;
    private javax.swing.JLabel jLabelFnacimiento;
    private javax.swing.JLabel jLabelNcelular;
    private javax.swing.JLabel jLabelNfijo;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelPrograma;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextCinstitucional;
    private javax.swing.JTextField jTextCpersonal;
    private javax.swing.JTextField jTextFnacimiento;
    private javax.swing.JTextField jTextNcelular;
    private javax.swing.JTextField jTextNfijo;
    private javax.swing.JTextField jTextNombres;
    private javax.swing.JTextField jTextPrograma;
    // End of variables declaration//GEN-END:variables
}
