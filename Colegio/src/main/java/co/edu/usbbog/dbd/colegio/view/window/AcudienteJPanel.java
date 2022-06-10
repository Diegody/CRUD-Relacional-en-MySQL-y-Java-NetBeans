/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.dbd.colegio.view.window;

import co.edu.usbbog.dbd.colegio.model.AcudienteDTO;
import co.edu.usbbog.dbd.colegio.view.frame.ColegioJFrame;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class AcudienteJPanel extends javax.swing.JPanel {
    private ColegioJFrame appJframe;
    /**
     * Creates new form AcudienteJPanel
     */
    public AcudienteJPanel(ColegioJFrame appJframe) {
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
        Registros = new javax.swing.JTextArea();
        CerrarA = new javax.swing.JButton();
        Ir_EstudianteA = new javax.swing.JButton();
        Ir_DocenteA = new javax.swing.JButton();
        EliminarA = new javax.swing.JButton();
        ActualizarA = new javax.swing.JButton();
        BuscarA = new javax.swing.JButton();
        CrearA = new javax.swing.JButton();
        ID_Estudiante_TextA = new javax.swing.JTextField();
        Telefono_TextA = new javax.swing.JTextField();
        Tipo_TextA = new javax.swing.JTextField();
        Apellido_TextA = new javax.swing.JTextField();
        Nombre_TextA = new javax.swing.JTextField();
        ID_TextA = new javax.swing.JTextField();
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
        FondoA = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registros.setEditable(false);
        Registros.setColumns(20);
        Registros.setRows(5);
        ResgristosA.setViewportView(Registros);

        add(ResgristosA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 530, 110));

        CerrarA.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CerrarA.setForeground(new java.awt.Color(255, 0, 0));
        CerrarA.setText("Cerrar");
        CerrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarAActionPerformed(evt);
            }
        });
        add(CerrarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 120, -1));

        Ir_EstudianteA.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        Ir_EstudianteA.setForeground(new java.awt.Color(255, 255, 0));
        Ir_EstudianteA.setText("Ir a Estudiante");
        Ir_EstudianteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_EstudianteAActionPerformed(evt);
            }
        });
        add(Ir_EstudianteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 120, -1));

        Ir_DocenteA.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        Ir_DocenteA.setForeground(new java.awt.Color(255, 255, 0));
        Ir_DocenteA.setText("Ir a Docente");
        Ir_DocenteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_DocenteAActionPerformed(evt);
            }
        });
        add(Ir_DocenteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 120, -1));

        EliminarA.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        EliminarA.setForeground(new java.awt.Color(255, 255, 0));
        EliminarA.setText("Eliminar");
        EliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAActionPerformed(evt);
            }
        });
        add(EliminarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 90, -1));

        ActualizarA.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        ActualizarA.setForeground(new java.awt.Color(255, 255, 0));
        ActualizarA.setText("Actualizar");
        ActualizarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarAActionPerformed(evt);
            }
        });
        add(ActualizarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 90, -1));

        BuscarA.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        BuscarA.setForeground(new java.awt.Color(255, 255, 0));
        BuscarA.setText("Buscar");
        BuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAActionPerformed(evt);
            }
        });
        add(BuscarA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 90, -1));

        CrearA.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        CrearA.setForeground(new java.awt.Color(255, 255, 0));
        CrearA.setText("Crear");
        CrearA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearAActionPerformed(evt);
            }
        });
        add(CrearA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 90, -1));
        add(ID_Estudiante_TextA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 180, -1));
        add(Telefono_TextA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 180, -1));
        add(Tipo_TextA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, -1));
        add(Apellido_TextA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 180, -1));
        add(Nombre_TextA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 180, -1));
        add(ID_TextA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, -1));

        ID_Estudiante.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        ID_Estudiante.setForeground(new java.awt.Color(255, 255, 0));
        ID_Estudiante.setText("ID del Estudiante:");
        add(ID_Estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        Telefono.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Telefono.setForeground(new java.awt.Color(255, 255, 0));
        Telefono.setText("Teléfono:");
        add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        Tipo.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Tipo.setForeground(new java.awt.Color(255, 255, 0));
        Tipo.setText("Tipo:");
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
        Subtitulo.setText("Acudientes Registrados:");
        add(Subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 0));
        Titulo.setText("Acudiente");
        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 30));

        Separador_2.setForeground(new java.awt.Color(255, 255, 0));
        add(Separador_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 730, -1));

        Separador_1.setForeground(new java.awt.Color(255, 255, 0));
        add(Separador_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 730, 10));

        FondoA.setBackground(new java.awt.Color(255, 0, 51));
        add(FondoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void CrearAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearAActionPerformed
        this.create();
    }//GEN-LAST:event_CrearAActionPerformed

    private void BuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAActionPerformed
        this.read();
    }//GEN-LAST:event_BuscarAActionPerformed

    private void ActualizarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarAActionPerformed
        this.update();
    }//GEN-LAST:event_ActualizarAActionPerformed

    private void EliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAActionPerformed
        this.delete();
    }//GEN-LAST:event_EliminarAActionPerformed

    private void Ir_DocenteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_DocenteAActionPerformed
        this.appJframe.IrDeAcudienteADocente();
    }//GEN-LAST:event_Ir_DocenteAActionPerformed

    private void Ir_EstudianteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_EstudianteAActionPerformed
        this.appJframe.IrDeAcudienteAEstudiante();
    }//GEN-LAST:event_Ir_EstudianteAActionPerformed

    private void CerrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarAActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CerrarAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarA;
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField Apellido_TextA;
    private javax.swing.JButton BuscarA;
    private javax.swing.JButton CerrarA;
    private javax.swing.JButton CrearA;
    private javax.swing.JButton EliminarA;
    private javax.swing.JPanel FondoA;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID_Estudiante;
    private javax.swing.JTextField ID_Estudiante_TextA;
    private javax.swing.JTextField ID_TextA;
    private javax.swing.JButton Ir_DocenteA;
    private javax.swing.JButton Ir_EstudianteA;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Nombre_TextA;
    private javax.swing.JTextArea Registros;
    private javax.swing.JScrollPane ResgristosA;
    private javax.swing.JSeparator Separador_1;
    private javax.swing.JSeparator Separador_2;
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField Telefono_TextA;
    private javax.swing.JLabel Tipo;
    private javax.swing.JTextField Tipo_TextA;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables

    private void mostrarDatos() {
        Registros.setText("");
        List<AcudienteDTO> acudientes = this.appJframe.mostrarA();
        for (AcudienteDTO acudiente : acudientes) {
            Registros.append(acudiente.toString() + "\n");
        }
    }
    
    private boolean validarA() {
        if (ID_TextA.getText().equals("")) {
            return false;
        } else if (ID_Estudiante_TextA.getText().equals("")) {
            return false;
        } else if (Nombre_TextA.getText().equals("")) {
            return false;
        } else if (Apellido_TextA.getText().equals("")) {
            return false;
        } else if (Tipo_TextA.getText().equals("")) {
            return false;
        } else if (Telefono_TextA.getText().equals("")) {
            return false;
        }else {
            try {
                int id = Integer.parseInt(ID_TextA.getText());
                int id_est = Integer.parseInt(ID_Estudiante_TextA.getText());
                int tel = Integer.parseInt(Telefono_TextA.getText());

                return true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error en el ingreso de datos");
                return false;
            }
        }
    }
    
    private void clean() {
        ID_TextA.setText("");
        ID_Estudiante_TextA.setText("");
        Nombre_TextA.setText("");
        Apellido_TextA.setText("");
        Tipo_TextA.setText("");
        Telefono_TextA.setText("");
    }
    
    private void create() {
        if (this.validarA()) {
            String salida = this.appJframe.crearAcudiente(Integer.parseInt(ID_TextA.getText()),
                    Integer.parseInt(ID_Estudiante_TextA.getText()),
                    Nombre_TextA.getText(),
                    Apellido_TextA.getText(),
                    Tipo_TextA.getText(),
                    Integer.parseInt(Telefono_TextA.getText()));
             JOptionPane.showMessageDialog(this, salida);
             this.clean();
        } else {
            System.out.println("Error");
            JOptionPane.showMessageDialog(this, "Por favor, inserte los datos");
        }
    }
    
    private void read() {
        try {
            String ask = this.appJframe.buscarAcudiente(Integer.parseInt(ID_TextA.getText()));
             JOptionPane.showMessageDialog(null, ask);
             this.clean();
        } catch (Exception e) {
            System.out.println("Error");
            JOptionPane.showMessageDialog(this, "Dato Erroneo");
        }
    }
    
    private void update() {
        if (this.validarA()) {
            String upd = this.appJframe.actualizarAcudiente(Integer.parseInt(ID_TextA.getText()),
                    Integer.parseInt(ID_Estudiante_TextA.getText()),
                    Nombre_TextA.getText(),
                    Apellido_TextA.getText(),
                    Tipo_TextA.getText(),
                    Integer.parseInt(Telefono_TextA.getText()));
             JOptionPane.showMessageDialog(this, upd);
             this.clean();
        } else {
            System.out.println("Error");
            JOptionPane.showMessageDialog(this, "Por favor, inserte los datos");
        }
    }
    
    private void delete() {
        try {
            String ask = this.appJframe.eliminarAcudiente(Integer.parseInt(ID_TextA.getText()));
            JOptionPane.showMessageDialog(null,"ID eliminado: " + ask);
            this.clean();
        } catch (Exception e) {
            System.out.println("Error");
            JOptionPane.showMessageDialog(this, "Dato Erroneo");
        }
    }
}
