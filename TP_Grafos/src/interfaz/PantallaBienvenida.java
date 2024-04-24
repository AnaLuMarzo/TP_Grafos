
package interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PantallaBienvenida {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaBienvenida window = new PantallaBienvenida();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaBienvenida() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Mapa de Argentina"); // Titulo de la ventana
		frame.getContentPane().setBackground(new Color(210, 180, 140));
		frame.setBounds(400, 50, 833, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton botonPlay = new JButton("Ingresar");
		botonPlay.setForeground(new Color(244, 164, 96));
		botonPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPantallaMapa();
			}
		});
		botonPlay.setFont(new Font("Segoe UI Black", Font.PLAIN, 40));
		botonPlay.setBounds(256, 307, 301, 65);
		frame.getContentPane().add(botonPlay);

		botonPlay.setBackground(new Color(192, 224, 255));
		// llamar a revalidate() y repaint() sino no cambia el color de fondo...
		botonPlay.revalidate();
		botonPlay.repaint();
		
		JLabel lblNewLabel = new JLabel("Provincias Argentinas");
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 50));
		lblNewLabel.setForeground(new Color(255, 228, 181));
		lblNewLabel.setBounds(162, 52, 580, 88);
		frame.getContentPane().add(lblNewLabel);
		
		// agregamos la figura de fondo
		JLabel lblFondo = new JLabel("");
		lblFondo.setForeground(SystemColor.controlHighlight);
		lblFondo.setIcon(new ImageIcon("C:\\Users\\user\\Documents\\GitHub\\TP_Grafos\\fondoBandera.jpg"));
		lblFondo.setBounds(-74, -23, 910, 520);
		frame.getContentPane().add(lblFondo);

	}

	protected void mostrarPantallaMapa() { // Crea la nueva ventana, la hace visible y cierra la primera
		RegArg frame2 = new RegArg();
		frame2.setVisible(true);
		frame.dispose();
	}

	/*
	 * Necesario tener el jFrame de pantallaInical para poder volver a esta pantalla
	 * cuando se cierre la PantallaJuego, ya que se borran todas las referencias
	 */
	public JFrame getFrame() {
		return frame;
	}
}
