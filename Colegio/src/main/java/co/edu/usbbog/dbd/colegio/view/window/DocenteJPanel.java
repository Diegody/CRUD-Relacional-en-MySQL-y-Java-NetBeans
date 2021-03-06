/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.view.window;

import co.edu.usbbog.dbd.colegio.model.DocenteDTO;
import co.edu.usbbog.dbd.colegio.view.frame.ColegioJFrame;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class DocenteJPanel extends javax.swing.JPanel {
    private ColegioJFrame appJframe;
    /**
     * Creates new form DocenteJPanel
     */
    public DocenteJPanel(ColegioJFrame appJframe) {
        this.appJframe = appJframe;
        initComponents();
        this.mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ResgristosA = new javax.swing.JScrollPane();
        RegistrosD = new javax.swing.JTextArea();
        CerrarD = new javax.swing.JButton();
        Ir_EstudianteD = new javax.swing.JButton();
        Ir_AcudienteD = new javax.swing.JButton();
        EliminarD = new javax.swing.JButton();
        ActualizarD = new javax.swing.JButton();
        BuscarD = new javax.swing.JButton();
        CrearD = new javax.swing.JButton();
        ID_Estudiante_TextD = new javax.swing.JTextField();
        Curso_TextD = new javax.swing.JTextField();
        Edad_TextD = new javax.swing.JTextField();
        Apellido_TextD = new javax.swing.JTextField();
        Nombre_TextD = new javax.swing.JTextField();
        ID_TextD = new javax.swing.JTextField();
        ID_Estudiante = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        Subtitulo = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Separador_2 = new javax.swing.JSeparator();
        Separador_1 = new javax.swing.JSeparator();
        FondoD = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrosD.setEditable(false);
        RegistrosD.setColumns(20);
        RegistrosD.setRows(5);
        ResgristosA.setViewportView(RegistrosD);

        add(ResgristosA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 530, 110));

        CerrarD.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CerrarD.setForeground(new java.awt.Color(255, 0, 0));
        CerrarD.setText("Cerrar");
        CerrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarDActionPerformed(evt);
            }
        });
        add(CerrarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 120, -1));

        Ir_EstudianteD.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        Ir_EstudianteD.setForeground(new java.awt.Color(255, 255, 0));
        Ir_EstudianteD.setText("Ir a Estudiante");
        Ir_EstudianteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_EstudianteDActionPerformed(evt);
            }
        });
        add(Ir_EstudianteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 120, -1));

        Ir_AcudienteD.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        Ir_AcudienteD.setForeground(new java.awt.Color(255, 255, 0));
        Ir_AcudienteD.setText("Ir a Acudiente");
        Ir_AcudienteD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_AcudienteDActionPerformed(evt);
            }
        });
        add(Ir_AcudienteD, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 120, -1));

        EliminarD.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        EliminarD.setForeground(new java.awt.Color(255, 255, 0));
        EliminarD.setText("Eliminar");
        EliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDActionPerformed(evt);
            }
        });
        add(EliminarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 90, -1));

        ActualizarD.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        ActualizarD.setForeground(new java.awt.Color(255, 255, 0));
        ActualizarD.setText("Actualizar");
        ActualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarDActionPerformed(evt);
            }
        });
        add(ActualizarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 90, -1));

        BuscarD.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        BuscarD.setForeground(new java.awt.Color(255, 255, 0));
        BuscarD.setText("Buscar");
        BuscarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDActionPerformed(evt);
            }
        });
        add(BuscarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 90, -1));

        CrearD.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CrearD.setForeground(new java.awt.Color(255, 255, 0));
        CrearD.setText("Crear");
        CrearD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearDActionPerformed(evt);
            }
        });
        add(CrearD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, -1));
        add(ID_Estudiante_TextD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 180, -1));
        add(Curso_TextD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 180, -1));
        add(Edad_TextD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, -1));
        add(Apellido_TextD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 180, -1));
        add(Nombre_TextD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 180, -1));
        add(ID_TextD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, -1));

        ID_Estudiante.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        ID_Estudiante.setForeground(new java.awt.Color(255, 255, 0));
        ID_Estudiante.setText("ID del Estudiante:");
        add(ID_Estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        Telefono.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 0));
        Telefono.setText("Curso:");
        add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        Tipo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Tipo.setForeground(new java.awt.Color(255, 255, 0));
        Tipo.setText("Edad:");
        add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        Apellido.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 0));
        Apellido.setText("Apellido:");
        add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        Nombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 0));
        Nombre.setText("Nombre:");
        add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        ID.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 0));
        ID.setText("ID:");
        add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 30, -1));

        Subtitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Subtitulo.setForeground(new java.awt.Color(255, 255, 0));
        Subtitulo.setText("Docentes Registrados:");
        add(Subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 0));
        Titulo.setText("Docente");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 30));

        Separador_2.setForeground(new java.awt.Color(255, 255, 0));
        add(Separador_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 730, -1));

        Separador_1.setForeground(new java.awt.Color(255, 255, 0));
        add(Separador_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 730, 10));

        FondoD.setBackground(new java.awt.Color(255, 0, 51));
        FondoD.setForeground(new java.awt.Color(255, 51, 51));
        add(FondoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void CrearDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearDActionPerformed
        this.create();
    }//GEN-LAST:event_CrearDActionPerformed

    private void BuscarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDActionPerformed
        this.read(); 
    }//GEN-LAST:event_BuscarDActionPerformed

    private void ActualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarDActionPerformed
        this.update();
    }//GEN-LAST:event_ActualizarDActionPerformed

    private void EliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDActionPerformed
        this.delete();
    }//GEN-LAST:event_EliminarDActionPerformed

    private void Ir_AcudienteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_AcudienteDActionPerformed
        this.appJframe.IrDeDocenteAAcudiente();
    }//GEN-LAST:event_Ir_AcudienteDActionPerformed

    private void Ir_EstudianteDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_EstudianteDActionPerformed
        this.appJframe.IrDeDocenteAEstudiante();
    }//GEN-LAST:event_Ir_EstudianteDActionPerformed

    private void CerrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarDActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarD;
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField Apellido_TextD;
    private javax.swing.JButton BuscarD;
    private javax.swing.JButton CerrarD;
    private javax.swing.JButton CrearD;
    private javax.swing.JTextField Curso_TextD;
    private javax.swing.JTextField Edad_TextD;
    private javax.swing.JButton EliminarD;
    private javax.swing.JPanel FondoD;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID_Estudiante;
    private javax.swing.JTextField ID_Estudiante_TextD;
    private javax.swing.JTextField ID_TextD;
    private javax.swing.JButton Ir_AcudienteD;
    private javax.swing.JButton Ir_EstudianteD;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Nombre_TextD;
    private javax.swing.JTextArea RegistrosD;
    private javax.swing.JScrollPane ResgristosA;
    private javax.swing.JSeparator Separador_1;
    private javax.swing.JSeparator Separador_2;
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() {
        RegistrosD.setText("");
        List<DocenteDTO> docentes = this.appJframe.mostrarD();
        for (DocenteDTO docente : docentes) {
            RegistrosD.append(docente.toString() + "\n");
        }
    }
    
    private boolean validarD() {
        if (ID_TextD.getText().equals("")) {
            return false;
        } else if (ID_Estudiante_TextD.getText().equals("")) {
            return false;
        } else if (Nombre_TextD.getText().equals("")) {
            return false;
        } else if (Apellido_TextD.getText().equals("")) {
            return false;
        } else if (Edad_TextD.getText().equals("")) {
            return false;
        } else if (Curso_TextD.getText().equals("")) {
            return false;
        }else {
            try {
                int id = Integer.parseInt(ID_TextD.getText());
                int id_est = Integer.parseInt(ID_Estudiante_TextD.getText());
                int edad = Integer.parseInt(Edad_TextD.getText());

                return true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error en el ingreso de datos");
                return false;
            }
        }
    }
    
    private void clean() {
        ID_TextD.setText("");
        ID_Estudiante_TextD.setText("");
        Nombre_TextD.setText("");
        Apellido_TextD.setText("");
        Edad_TextD.setText("");
        Curso_TextD.setText("");
    }
    
    private void create() {
        if (this.validarD()) {
            String salida = this.appJframe.crearDocente(Integer.parseInt(ID_TextD.getText()),
                    Integer.parseInt(ID_Estudiante_TextD.getText()),
                    Nombre_TextD.getText(),
                    Apellido_TextD.getText(),
                    Integer.parseInt(Edad_TextD.getText()),
                    Curso_TextD.getText());
             JOptionPane.showMessageDialog(this, salida);
             this.clean();
        } else {
            System.out.println("Error");
            JOptionPane.showMessageDialog(this, "Por favor, inserte los datos");
        }
    }
    
    private void read() {
        try {
            String ask = this.appJframe.buscarDocente(Integer.parseInt(ID_TextD.getText()));
             JOptionPane.showMessageDialog(null, ask);
             this.clean();
        } catch (Exception e) {
            System.out.println("Error");
            JOptionPane.showMessageDialog(this, "Dato Erroneo");
        }
    }
    
    private void update() {
        if (this.validarD()) {
            String salida = this.appJframe.actualizarDocente(Integer.parseInt(ID_TextD.getText()),
                    Integer.parseInt(ID_Estudiante_TextD.getText()),
                    Nombre_TextD.getText(),
                    Apellido_TextD.getText(),
                    Integer.parseInt(Edad_TextD.getText()),
                    Curso_TextD.getText());
             JOptionPane.showMessageDialog(this, salida);
             this.clean();
        } else {
            System.out.println("Error");
            JOptionPane.showMessageDialog(this, "Por favor, inserte los datos");
        }
    }
    
    private void delete() {
        try {
            String ask = this.appJframe.eliminarDocente(Integer.parseInt(ID_TextD.getText()));
            JOptionPane.showMessageDialog(null,"ID eliminado: " + ask);
            this.clean();
        } catch (Exception e) {
            System.out.println("Error");
            JOptionPane.showMessageDialog(this, "Dato Erroneo");
        }
    }
}
