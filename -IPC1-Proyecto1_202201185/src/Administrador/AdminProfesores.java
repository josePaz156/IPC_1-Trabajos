/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Administrador;

import static Administrador.AdministradorCursos.contadorCursos;
import static Administrador.AdministradorCursos.cursos;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import java.io.FileReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import proyecto1.Login;

/**
 *
 * @author andre
 */
public class AdminProfesores extends javax.swing.JFrame {
    
    public static Profesor[] profesores = new Profesor[50];
    public static int contadorProfesores;

    // Para actualizar profesor
    public static int fila;

    public static String codigo;
    public static String nombre;
    public static String apellido;
    public static String correo;
    public static String contrasenia;
    public static String genero;

    /**
     * Creates new form AdminProfesores
     */
    public AdminProfesores() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        actualizarListadoProfesores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TablaGenero = new javax.swing.JTable();
        CargaMBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListadoProfesores = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaGenero1 = new javax.swing.JTable();
        CargaMBtn2 = new javax.swing.JButton();
        CrearProfBtn = new javax.swing.JButton();
        ActualizarBtn = new javax.swing.JButton();
        EliminarBtn = new javax.swing.JButton();
        CargaMBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        TablaGenero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Genero", "Porcentaje"
            }
        ));
        jScrollPane2.setViewportView(TablaGenero);

        CargaMBtn1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CargaMBtn1.setText("Exportar Listado HTML");
        CargaMBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Listado de profesores");

        ListadoProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Correo", "Contrasenia", "Genero"
            }
        ));
        jScrollPane1.setViewportView(ListadoProfesores);

        TablaGenero1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Genero", "Porcentaje"
            }
        ));
        jScrollPane3.setViewportView(TablaGenero1);

        CargaMBtn2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CargaMBtn2.setText("Exportar Listado HTML");
        CargaMBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtn2ActionPerformed(evt);
            }
        });

        CrearProfBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CrearProfBtn.setText("Crear Profesor");
        CrearProfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearProfBtnActionPerformed(evt);
            }
        });

        ActualizarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ActualizarBtn.setText("Actualizar");
        ActualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBtnActionPerformed(evt);
            }
        });

        EliminarBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EliminarBtn.setText("Eliminar");
        EliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBtnActionPerformed(evt);
            }
        });

        CargaMBtn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CargaMBtn.setText("Carga Masiva");
        CargaMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaMBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Cursos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrearProfBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EliminarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActualizarBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(CargaMBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(CargaMBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CrearProfBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ActualizarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(CargaMBtn)
                        .addGap(35, 35, 35)
                        .addComponent(CargaMBtn2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargaMBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargaMBtn1ActionPerformed

    private void CargaMBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtn2ActionPerformed
        // TODO add your handling code here:
        
        String cadenaHTML = "<!DOCTYPE html>\n"
        + "<html>\n"
        + "<body>\n"
        + "\n"
        + "<h1>Reporte de profesores</h1>\n"
        + "\n"
        + "<table style=\"margin:auto\">\n"
        + "    <tr>\n"
        + "      <th>codigo</th>\n"
        + "      <th>nombre</th>\n"
        + "      <th>apellido</th>\n"
        + "      <th>correo</th>\n"
        + "      <th>genero</th>\n"
        + "    </tr>";
        for (int i = 0; i < contadorProfesores; i++) {
            cadenaHTML += "<tr>\n"
            + "<td>" + profesores[i].codigo + "</td>\n"
            + "<td>" + profesores[i].nombre + "</td>\n"
            + "<td>" + profesores[i].apellido + "</td>\n"
            + "<td>" + profesores[i].correo + "</td>\n"
            + "<td>" + profesores[i].genero + "</td>\n"
            + "</tr>";
        }

        cadenaHTML += "</table>\n"
        + "</body>\n"
        + "</html>\n";

        System.out.println(cadenaHTML);

        FileWriter fichero = null;
        PrintWriter pw = null;

        try{
            fichero = new FileWriter("./Reportes/ReporteProfesores.html");
            pw = new PrintWriter(fichero);

            pw.println(cadenaHTML);
            fichero.close();
            //System.out.println(cadenaHTML);
        }catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_CargaMBtn2ActionPerformed

    private void CrearProfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearProfBtnActionPerformed
        // TODO add your handling code here:
        CrearProfe cp = new CrearProfe();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CrearProfBtnActionPerformed

    private void ActualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoProfesores.getSelectedRow();

        codigo = ListadoProfesores.getModel().getValueAt(fila, 0).toString();
        nombre = ListadoProfesores.getModel().getValueAt(fila, 1).toString();
        apellido = ListadoProfesores.getModel().getValueAt(fila, 2).toString();
        correo = ListadoProfesores.getModel().getValueAt(fila, 3).toString();
        contrasenia = ListadoProfesores.getModel().getValueAt(fila, 4).toString();
        genero = ListadoProfesores.getModel().getValueAt(fila, 5).toString();

        ActualizarProfe ap = new ActualizarProfe();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ActualizarBtnActionPerformed

    private void EliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBtnActionPerformed
        // TODO add your handling code here:
        fila = ListadoProfesores.getSelectedRow();

        for (int i = fila; i < contadorProfesores - 1; i++) {
            profesores[i] = profesores[i + 1];
        }
        // se reduce en 1 la cantidad de profesores
        contadorProfesores--;

        /*
        DefaultTableModel modeloListado = (DefaultTableModel) ListadoProfesores.getModel();
        modeloListado.setRowCount(contadorProfesores);
        */
        actualizarListadoProfesores();
    }//GEN-LAST:event_EliminarBtnActionPerformed

    private void CargaMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaMBtnActionPerformed
        // TODO add your handling code here:

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);

        String filePath = fc.getSelectedFile().getAbsolutePath();
        System.out.println(filePath);

        BufferedReader reader = null;
        String line = "";

        contadorProfesores = 0;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            int contadorFila = 0;
            while ((line = reader.readLine()) != null) {
                if (contadorFila > 0) {
                    String[] columnas = line.split(";");

                    Profesor prof = new Profesor(columnas[0], columnas[1],
                        columnas[2], columnas[3], "1234", columnas[4]);

                    profesores[contadorFila - 1] = prof;

                }
                contadorFila++;

            }
            contadorProfesores = contadorFila - 1;
            System.out.println(Arrays.toString(profesores));
            actualizarListadoProfesores();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_CargaMBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdministradorCursos ac = new AdministradorCursos();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(AdminProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfesores().setVisible(true);
            }
        });
    }
    
    public void actualizarListadoProfesores() {

        if (contadorProfesores > 0) {

            // actualizar listado
            DefaultTableModel modeloListado = (DefaultTableModel) ListadoProfesores.getModel();
            modeloListado.setRowCount(contadorProfesores);

            for (int i = 0; i < contadorProfesores; i++) {
                modeloListado.setValueAt(profesores[i].codigo, i, 0);
                modeloListado.setValueAt(profesores[i].nombre, i, 1);
                modeloListado.setValueAt(profesores[i].apellido, i, 2);
                modeloListado.setValueAt(profesores[i].correo, i, 3);
                modeloListado.setValueAt(profesores[i].contrasenia, i, 4);
                modeloListado.setValueAt(profesores[i].genero, i, 5);
            }

            // contar generos
            int masculino = 0;
            int femenino = 0;

            for (int i = 0; i < contadorProfesores; i++) {
                // si es hombre
                if (profesores[i].genero.equals("m")) {
                    masculino++;
                    // si es mujer
                } else {
                    femenino++;
                }
            }

            System.out.println(masculino);
            System.out.println(femenino);
            System.out.println(contadorProfesores);

            System.out.println((double) (femenino / contadorProfesores));

            // actualizar tabla
            DefaultTableModel modeloListadoG = (DefaultTableModel) TablaGenero1.getModel();
            modeloListadoG.setValueAt("Femenino", 0, 0);
            modeloListadoG.setValueAt("Masculino", 1, 0);

            modeloListadoG.setValueAt((double) ((double) femenino / (double) contadorProfesores) * 100, 0, 1);
            modeloListadoG.setValueAt((double) ((double) masculino / (double) contadorProfesores) * 100, 1, 1);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBtn;
    private javax.swing.JButton CargaMBtn;
    private javax.swing.JButton CargaMBtn1;
    private javax.swing.JButton CargaMBtn2;
    private javax.swing.JButton CrearProfBtn;
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JTable ListadoProfesores;
    private javax.swing.JTable TablaGenero;
    private javax.swing.JTable TablaGenero1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
