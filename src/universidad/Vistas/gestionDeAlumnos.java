   package universidad.Vistas;

import java.util.Date;
import universidad.AccesoADatos.AlumnoData;
import universidad.Entidades.*;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class gestionDeAlumnos extends javax.swing.JInternalFrame {

    AlumnoData alumnoData = new AlumnoData();

    public gestionDeAlumnos() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_documento = new javax.swing.JTextField();
        TF_apellido = new javax.swing.JTextField();
        TF_nombre = new javax.swing.JTextField();
        JB_buscar = new javax.swing.JButton();
        JB_guradar = new javax.swing.JButton();
        JB_eliminar = new javax.swing.JButton();
        JB_modificar = new javax.swing.JButton();
        RB_activo = new javax.swing.JRadioButton();
        DC_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        TF_id = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setText("Alumnos");

        jLabel2.setText("Documento:");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de nacimiento");

        JB_buscar.setText("Buscar");
        JB_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_buscarActionPerformed(evt);
            }
        });

        JB_guradar.setText("Guardar");
        JB_guradar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_guradarActionPerformed(evt);
            }
        });

        JB_eliminar.setText("Eliminar");
        JB_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_eliminarActionPerformed(evt);
            }
        });

        JB_modificar.setText("Modificar");
        JB_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_modificarActionPerformed(evt);
            }
        });

        RB_activo.setText("Seleccionado esta Activo");

        jLabel7.setText("ID:");

        TF_id.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RB_activo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JB_eliminar)
                                    .addComponent(DC_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JB_modificar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(381, 381, 381)
                                .addComponent(JB_buscar))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(154, 154, 154)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TF_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JB_guradar)
                                .addComponent(jLabel6)))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TF_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_buscar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RB_activo))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(DC_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_eliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JB_guradar)
                        .addComponent(JB_modificar)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_guradarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_guradarActionPerformed
        // Gurda un alumno nuevo
        try {
            int DNI = Integer.parseInt(TF_documento.getText());
            String apellido = TF_apellido.getText();
            String nombre = TF_nombre.getText();
            boolean estado = RB_activo.isSelected();

            LocalDate fechaN = DC_fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            if (apellido.equals("") || nombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe agregar un nombre y/o un apellido");
            } else {
                Alumno alumno = new Alumno(DNI, nombre, apellido, fechaN, estado);
                alumnoData.guardarAlumno(alumno);
            }

            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Deben estar todos los campos completos o valor inválido");
        }
    }//GEN-LAST:event_JB_guradarActionPerformed

    private void JB_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_buscarActionPerformed
        //buscarAlumno
        try {
            int DNI = Integer.parseInt(TF_documento.getText());

            Alumno alum = alumnoData.buscarAlumnoPorDNI(DNI);

            if (alum != null) {
                TF_id.setText(alum.getIdAlumno() + "");
                TF_apellido.setText(alum.getApellido());
                TF_nombre.setText(alum.getNombre());
                RB_activo.setSelected(alum.isActivo());

                LocalDate localDate = alum.getfNac();

                Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

                DC_fechaNacimiento.setDate(date);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un dni o dni inválido");
        }
    }//GEN-LAST:event_JB_buscarActionPerformed

    private void JB_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_modificarActionPerformed
        //MODIFICAR
        try {
            Alumno alu = new Alumno();

            if (TF_id.getText().isEmpty() || TF_apellido.getText().isEmpty() || TF_nombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puede tener campos vacios.");

            } else {
                alu.setIdAlumno(Integer.parseInt(TF_id.getText()));
                alu.setDni(Integer.parseInt(TF_documento.getText()));
                alu.setApellido(TF_apellido.getText());
                alu.setNombre(TF_nombre.getText());
                alu.setActivo(RB_activo.isSelected());
                alu.setfNac(DC_fechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                alumnoData.modificarAlumno(alu);
            }

            limpiar();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un dni o dni inválido");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de nacimiento.");
        }

    }//GEN-LAST:event_JB_modificarActionPerformed

    private void JB_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_eliminarActionPerformed
        //eliminar alumno
        try {
            int documento = Integer.parseInt(TF_documento.getText());
            Alumno alumno = alumnoData.buscarAlumnoPorDNI(documento);

            if (alumno != null) {
                alumnoData.eliminarAlumno(alumno.getIdAlumno());
            }
            limpiar();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un dni válido");
        }
    }//GEN-LAST:event_JB_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DC_fechaNacimiento;
    private javax.swing.JButton JB_buscar;
    private javax.swing.JButton JB_eliminar;
    private javax.swing.JButton JB_guradar;
    private javax.swing.JButton JB_modificar;
    private javax.swing.JRadioButton RB_activo;
    private javax.swing.JTextField TF_apellido;
    private javax.swing.JTextField TF_documento;
    private javax.swing.JTextField TF_id;
    private javax.swing.JTextField TF_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        // borra los datos de los textField
        RB_activo.setSelected(false);
        TF_apellido.setText("");
        TF_documento.setText("");
        TF_id.setText("");
        TF_nombre.setText("");

    }

}
