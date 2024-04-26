package interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.MapPolygonImpl;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import negocio.Grafo;


public class RegArg extends JFrame implements KeyListener {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private Grafo grafo = new Grafo();
		private JFrame frame;
		private JPanel panelMapa;
		private JPanel panelControles;
		private JMapViewer _mapa;
		private ArrayList<Coordinate> _lasCoordenadas;
		private JButton btnEliminar;
		private MapPolygonImpl _poligono;
		private JButton btnDibujarPolgono ;
		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						RegArg window = new RegArg();
						window.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public RegArg() {
			initialize();
			setResizable(false); // Para que no se redimencione el alto y ancho

			//Se agrega panel protector para que los eventos de click no intervengan en el enfoque
			JPanel glassPane = (JPanel) this.getGlassPane();
			glassPane.setVisible(true); 
			glassPane.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// Si se hace click no hace nada
				}
			});
			
		 
		}

		private void initialize() {

			// Configuraciones de la ventana

			setTitle("Provincias Argentinas");
			setBounds(300, 20, 602, 530);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(new Color(224, 255, 255));

			getContentPane().setLayout(null);
			

			// Título "Argentina"
			JLabel lblArgentina = new JLabel("Argentina");
			lblArgentina.setForeground(new Color(210, 180, 140));
			lblArgentina.setFont(new Font("Segoe UI Black", Font.PLAIN, 43));
			lblArgentina.setBounds(56, 15, 175, 48);
			getContentPane().add(lblArgentina);

			// Fondo
			JLabel lblFondo = new JLabel("");
			lblFondo.setIcon(new ImageIcon("fondoBandera.png"));
			lblFondo.setBounds(0, 0, 588, 493);
			getContentPane().add(lblFondo);
			

			addKeyListener(this); // escucha eventos de teclado
			setFocusable(true); // recibe los eventos, la ventana es el foco
			setFocusTraversalKeysEnabled(false); // desactiva teclas que me puedan cambiar que el foco de la ventana

		}

		// Nexo entre logica e interfaz
		
		private void mostrarPantallaInicial() {
			PantallaBienvenida menuBien = new PantallaBienvenida();
			menuBien.getFrame().setVisible(true); // Hace visible la ventana PantallaInicial
			this.dispose(); // Cerrar la ventana actual
		}
		

		@Override
		public void keyTyped(KeyEvent e) {
			// ...
		}

		// Nexo entre logica e interfaz
		@Override
		public void keyPressed(KeyEvent e) {

		    
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// ...
		}
		
	
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
