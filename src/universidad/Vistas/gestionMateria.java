package universidad.Vistas;

import javax.swing.JOptionPane;
import universidad.AccesoADatos.MateriaData;
import universidad.Entidades.Materia;

public class gestionMateria extends javax.swing.JInternalFrame {

    MateriaData materiaData = new MateriaData();

    public gestionMateria() {
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
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalirDeMaterias = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jtfCodigo = new javax.swing.JTextField();
        jtfNombreMateria = new javax.swing.JTextField();
        jtfAnio = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();

        setClosable(true);

        jLabel1.setText("MATERIAS");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Año:");

        jLabel5.setText("Estado:");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalirDeMaterias.setText("SALIR");
        jbSalirDeMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirDeMateriasActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jbGuardar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbEliminar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbBuscar)
                                            .addComponent(jbModificar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbSalirDeMaterias)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbBuscar)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbEstado)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalirDeMaterias)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirDeMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirDeMateriasActionPerformed
        // BOTON DE SALIR
        dispose();
    }//GEN-LAST:event_jbSalirDeMateriasActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        //GUARDAR

        if (!jtfCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El codigo tiene que estar vacio");
        } else if (jtfNombreMateria.getText().equals("") || jtfAnio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No puede tener campos vacios");
        } else {
            try {
                Materia materia = new Materia();

                materia.setNombre(jtfNombreMateria.getText());
                materia.setAnioMateria(Integer.parseInt(jtfAnio.getText()));
                materia.setActivo(jrbEstado.isSelected());

                materiaData.guardarMateria(materia);
                limpiar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese un Año en formato de numero");
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        //BUSCAR
        try {
            int id = Integer.parseInt(jtfCodigo.getText());

            Materia materia = materiaData.buscarMateriaPorId(id);

            if (materia != null) {
                jtfNombreMateria.setText(materia.getNombre());
                jtfAnio.setText(String.valueOf(materia.getAnioMateria()));
                jrbEstado.setSelected(materia.isActivo());
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe agregar un id válido");
            jtfCodigo.requestFocusInWindow();
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // MODIFICAR
        Materia mat = new Materia();

        if (!isNumeric(jtfCodigo.getText())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el ID de la materia.");
            jtfCodigo.requestFocusInWindow();
        } else if (!isNumeric(jtfAnio.getText())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un año válido.");
            jtfAnio.requestFocusInWindow();
        } else if (jtfNombreMateria.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
            jtfNombreMateria.requestFocusInWindow();
        } else {
            mat.setIdMateria(Integer.parseInt(jtfCodigo.getText()));
            mat.setNombre(jtfNombreMateria.getText());
            mat.setAnioMateria(Integer.parseInt(jtfAnio.getText()));
            mat.setActivo(jrbEstado.isSelected());
            materiaData.modificarMateria(mat);
            limpiar();
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        //Eliminar
        if (!isNumeric(jtfCodigo.getText())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el ID de la materia.");
            jtfCodigo.requestFocusInWindow();
        } else {
            int codigo = Integer.parseInt(jtfCodigo.getText());
            Materia materia = materiaData.buscarMateriaPorId(codigo);
            if (materia != null) {
                materiaData.eliminarMateria(materia.getIdMateria());
                JOptionPane.showMessageDialog(null, "Materia eliminada correctamente");
            }
            limpiar();
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalirDeMaterias;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtfAnio;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNombreMateria;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        // borra los datos de los textField
        jrbEstado.setSelected(false);
        jtfAnio.setText("");
        jtfCodigo.setText("");
        jtfNombreMateria.setText("");
    }

}
