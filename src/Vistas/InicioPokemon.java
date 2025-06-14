/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Equipo Hogar
 */
package Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.ModuleLayer.Controller;

import javax.swing.JOptionPane;

import Controladores.ControladorInicio;
import Interfaces.Inicio;

public class InicioPokemon extends javax.swing.JFrame implements ActionListener, Inicio {
    public ControladorInicio controlador;
    /**
     * Creates new form InicioPokemon
     */
    public InicioPokemon() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PanelDeInicio = new javax.swing.JPanel();
        LabelLogo = new javax.swing.JLabel();
        BotonJugar = new javax.swing.JButton();
        LabelFondoInicio = new javax.swing.JLabel();
        BotonTerminal = new javax.swing.JButton();
        BotonCargarPartida = new javax.swing.JButton();
        Seleccionador = new javax.swing.JFileChooser("src/Guardados");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(12, 28, 108));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(816, 639));

        PanelDeInicio.setLayout(null);

        LabelLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logos/Pokemon Java Logo.png"))); // NOI18N
        PanelDeInicio.add(LabelLogo);
        LabelLogo.setBounds(100, 50, 580, 160);

        BotonJugar.setBackground(new java.awt.Color(242, 242, 242));
        BotonJugar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logos/Jugar Logo Resized.png"))); // NOI18N
        BotonJugar.setBorderPainted(false);
        BotonJugar.setContentAreaFilled(false);
        PanelDeInicio.add(BotonJugar);
        BotonJugar.setBounds(180, 380, 420, 120);
        BotonJugar.addActionListener(this);

        BotonTerminal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logos/Cambiar a Terminal Resized.png"))); // NOI18N
        BotonTerminal.setBorderPainted(false);
        BotonTerminal.setContentAreaFilled(false);
        PanelDeInicio.add(BotonTerminal);
        BotonTerminal.setBounds(630, 500, 160, 90);
        BotonTerminal.addActionListener(this);

        BotonCargarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logos/Cargar Partida.png"))); // NOI18N
        BotonCargarPartida.setBorderPainted(false);
        BotonCargarPartida.setContentAreaFilled(false);
        PanelDeInicio.add(BotonCargarPartida);
        BotonCargarPartida.setBounds(20, 500, 160, 90);
        BotonCargarPartida.addActionListener(this);

        LabelFondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logos/Pikachu Fondo Resized.jpeg"))); // NOI18N
        PanelDeInicio.add(LabelFondoInicio);
        LabelFondoInicio.setBounds(0, 0, 800, 600);

        Seleccionador.setMultiSelectionEnabled(true);
        Seleccionador.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);

        getContentPane().add(PanelDeInicio);
        PanelDeInicio.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>                        

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
            java.util.logging.Logger.getLogger(InicioPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioPokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioPokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BotonJugar;
    private javax.swing.JButton BotonCargarPartida;
    private javax.swing.JLabel LabelFondoInicio;
    private javax.swing.JLabel LabelLogo;
    private javax.swing.JPanel PanelDeInicio;
    private javax.swing.JButton BotonTerminal;
    private javax.swing.JFileChooser Seleccionador;
    // End of variables declaration                   
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BotonTerminal) {
            this.controlador.setESGUI(false);
            /**Cierra la ventana y llama a "controlador.cambiarVista()", para cambiar a terminal." */
            this.dispose();
            controlador.cambiarVista();
        } else if (e.getSource() == BotonJugar) {
            /**Llama a "controlador.iniciarJuego()", y cierra la ventana actual. */
            controlador.iniciarJuego();
            this.dispose();
        }
        /** Si el boton "BotonCargarPartida" es presionado, se abre el "JFileChooser", y verifica la
         * respuesta, si es "APPROVE_OPTION", se obtienen los archivos seleccionados,
         * los guarda en una lista y llama al metodo "IniciarCarga" del controlador,
         * que se encarga de iniciar la carga de la partida. Si no se selecciona nada,
         * se muestra un mensaje de error, y por ultimo cierra la ventana actual. */
        else if (e.getSource() == BotonCargarPartida) {
            int respuesta = Seleccionador.showOpenDialog(null);
            if (respuesta == javax.swing.JFileChooser.APPROVE_OPTION) {
                File[] archivosSeleccionados = Seleccionador.getSelectedFiles();
                controlador.IniciarCarga(archivosSeleccionados);
                JOptionPane.showMessageDialog(this, "Partida Seleccionada exitosamente.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No se seleccionó ninguna partida.");
            }
        }
    }

    @Override
    public void SetControlador(ControladorInicio controller) {
        this.controlador = controller;
    }

    /**El metodo "Iniciar" se utiliza para cambiar el valor de "ESGUI" a verdadero, ya que en el
    "ControladorInicio", cuando la vista se pone como GUI, cambia el valor de "ESGUI" a falso,
    por lo que habría un error de lógica, y después se pone como "true" el valor para mostrar la ventana. */
    @Override
    public void Iniciar() {
        controlador.setESGUI(true);
        this.setVisible(true);
    }
}
