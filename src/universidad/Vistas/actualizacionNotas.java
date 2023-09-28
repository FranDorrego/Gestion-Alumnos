 package universidad.Vistas;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.AlumnoData;
import universidad.AccesoADatos.InscripcionData;
import universidad.Entidades.Alumno;
import universidad.Entidades.Inscripcion;
import universidad.Entidades.Materia;

public class actualizacionNotas extends javax.swing.JInternalFrame {

    AlumnoData alumnoData = new AlumnoData();
    private InscripcionData inscripcionData = new InscripcionData();
    private DefaultTableModel modelo = new DefaultTableModel();

    public actualizacionNotas() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnoCN = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtNotas = new javax.swing.JTable();
        jbGuardarNotas = new javax.swing.JButton();
        jbSalirDeNotas = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("CARGA DE NOTAS");

        jLabel2.setText("SELECCIONE ALUMNO:");

        jcbAlumnoCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoCNActionPerformed(evt);
            }
        });

        jtNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtNotas);

        jbGuardarNotas.setText("GUARDAR");
        jbGuardarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarNotasActionPerformed(evt);
            }
        });

        jbSalirDeNotas.setText("SALIR");
        jbSalirDeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirDeNotasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jcbAlumnoCN, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jbGuardarNotas)
                        .addGap(220, 220, 220)
                        .addComponent(jbSalirDeNotas)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnoCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarNotas)
                    .addComponent(jbSalirDeNotas))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirDeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirDeNotasActionPerformed
        // ACCION DE SALIR DE VENTANA
        dispose();
    }//GEN-LAST:event_jbSalirDeNotasActionPerformed

    private void jcbAlumnoCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoCNActionPerformed
        // Actualizo los datos
        Alumno alumnoSeleccionado = (Alumno) jcbAlumnoCN.getSelectedItem();
        List<Inscripcion> inscripciones = inscripcionData.obtenerInscripcionPorAlumno(alumnoSeleccionado.getIdAlumno() );
        borrarFilasTabla();
        cargarDatosTabla(inscripciones);
    }//GEN-LAST:event_jcbAlumnoCNActionPerformed

    private void jbGuardarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarNotasActionPerformed
        //actualizar la nota
        Alumno alumno = (Alumno) jcbAlumnoCN.getSelectedItem(); //obtengo el alumno
        int filaSelecionada = jtNotas.getSelectedRow();         //obtengo la fila selecionada
        if (filaSelecionada != -1) {  // si está una fila seleccionada
            DefaultCellEditor cellEditor = (DefaultCellEditor) jtNotas.getCellEditor();//Tuvimos que buscar un método para que se haga un "enter"
            if (cellEditor != null) {                                                 //ya que si no tiraba error
                // Detener la edición si está en curso
                cellEditor.stopCellEditing();
            }
            System.out.println(modelo.getValueAt(filaSelecionada, 2));
            String notaMateria = String.valueOf(modelo.getValueAt(filaSelecionada, 2));
            
            if (isNumeric(notaMateria)) {
                int idMateria = ((Integer) modelo.getValueAt(filaSelecionada, 0));
                inscripcionData.actualizarNota(alumno.getIdAlumno(), idMateria, Double.parseDouble(notaMateria));
                jcbAlumnoCNActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una nota válida entre 0 y 10");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una materia primero");
        }
    }//GEN-LAST:event_jbGuardarNotasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardarNotas;
    private javax.swing.JButton jbSalirDeNotas;
    private javax.swing.JComboBox<Alumno> jcbAlumnoCN;
    private javax.swing.JTable jtNotas;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        for (Alumno alumno : alumnoData.listarAlumnos()) {
            jcbAlumnoCN.addItem(alumno);
        }
    }

    private void armarCabecera() {
        //de la tabla
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jtNotas.setModel(modelo);
    }

    private void cargarDatosTabla(List<Inscripcion> inscripcion) {
        //de la tabla
        for (Inscripcion inscrip : inscripcion) {
            modelo.addRow(new Object[]{inscrip.getMateria().getIdMateria(), inscrip.getMateria().getNombre(), inscrip.getNota()});
        }
    }

    private void borrarFilasTabla() {
        //para borrar las filas cada vez que selecciono un alumno diferente, elijo mostrar materias cursadas o no cursadas
        try {
            int filas = jtNotas.getRowCount() - 1;
            for (; filas >= 0; filas--) {
                modelo.removeRow(filas);
            }
        } catch (Exception e) {
        }
    }
    
    private static boolean isNumeric(String cadena) {
        try {
            if(Double.parseDouble(cadena) >= 0 && Double.parseDouble(cadena) <= 10){
                return true;
            }else{
                return false;
            }
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
