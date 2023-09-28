package universidad.Vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidad.AccesoADatos.InscripcionData;
import universidad.AccesoADatos.MateriaData;
import universidad.Entidades.Alumno;
import universidad.Entidades.Materia;

public class consultaAlumnoPorMateria extends javax.swing.JInternalFrame {

    private MateriaData materiaData = new MateriaData();
    private InscripcionData inscripcionData = new InscripcionData();
    private DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int f, int c) {  // para que la tabla no sea editable
        return false;
        }
    };
    
    public consultaAlumnoPorMateria() {
        initComponents();
        cargarCombo();
        armarCabecera();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbSeleccionarMaterias = new javax.swing.JComboBox<>();
        jbSalirDeConsultasXMaterias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListaDeAlumnos = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("LISTADO DE ALUMNOS POR MATERIAS");

        jLabel2.setText("SELECCIONAR MATERIAS:");

        jcbSeleccionarMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSeleccionarMateriasActionPerformed(evt);
            }
        });

        jbSalirDeConsultasXMaterias.setText("SALIR");
        jbSalirDeConsultasXMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirDeConsultasXMateriasActionPerformed(evt);
            }
        });

        jtListaDeAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtListaDeAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbSeleccionarMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalirDeConsultasXMaterias)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbSeleccionarMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalirDeConsultasXMaterias)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirDeConsultasXMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirDeConsultasXMateriasActionPerformed
        // BOTON DE SALIR
        dispose();
    }//GEN-LAST:event_jbSalirDeConsultasXMateriasActionPerformed

    private void jcbSeleccionarMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSeleccionarMateriasActionPerformed
        //selecciona una materia y se carga la tabla con los alumnos
        Materia materiaSeleccionada = (Materia) jcbSeleccionarMaterias.getSelectedItem();
        List<Alumno> alumnosPorMateria = inscripcionData.obtenerAlumnosXMateria(materiaSeleccionada.getIdMateria());
        borrarFilasTabla();
        cargarDatosTabla(alumnosPorMateria);
    }//GEN-LAST:event_jcbSeleccionarMateriasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalirDeConsultasXMaterias;
    private javax.swing.JComboBox<Materia> jcbSeleccionarMaterias;
    private javax.swing.JTable jtListaDeAlumnos;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        for (Materia materias : materiaData.listarMaterias()) {
            jcbSeleccionarMaterias.addItem(materias);
        }
    }

    private void armarCabecera() {
        //de la tabla
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jtListaDeAlumnos.setModel(modelo);
    }
    
    private void cargarDatosTabla(List<Alumno> alumnosXMateria) {
        //de la tabla
        for (Alumno alumnos : alumnosXMateria) {
            modelo.addRow(new Object[]{alumnos.getIdAlumno(), alumnos.getDni(), alumnos.getApellido(),alumnos.getNombre()});
        }
    }

    private void borrarFilasTabla() {
        //para borrar las filas cada vez que selecciono un alumno diferente, elijo mostrar materias cursadas o no cursadas
        try {
            int filas = jtListaDeAlumnos.getRowCount() - 1;
            for (; filas >= 0; filas--) {
                modelo.removeRow(filas);
            }
        } catch (Exception e) {
        }
    }
}
