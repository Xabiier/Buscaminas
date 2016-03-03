package org.pokesweeper.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.pokesweeper.model.Helbideak;
import org.pokesweeper.model.Tableroa;

public class JokoaUI extends JFrame implements ActionListener{
	
	//Atributoak
	private static final long serialVersionUID = 1L;
	private JPanel goikoPanela, behekoPanela;
	public static boolean galdu = false;

	//Eraikitzailea
	public JokoaUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Pok�Sweeper");
		Helbideak.denakKargatu();
		this.setIconImage(Helbideak.ikonoa);
		this.setCursor(Helbideak.kursorea);
		UIManager.put("Menu.font", Helbideak.iturria);
		UIManager.put("MenuItem.font", Helbideak.iturria);
		
		
		this.setJMenuBar(new MenuaUI());
		
		goikoPanela = new JPanel();
		goikoPanela.setBackground(new Color(112, 200, 160));
		goikoPanela.setLayout(new BorderLayout(0, 0));
		getContentPane().add(goikoPanela, BorderLayout.NORTH);
		
		JPanel goikoPanelaGoian = new JPanel();
		goikoPanelaGoian.setBackground(new Color(112, 200, 160));
		goikoPanela.add(goikoPanelaGoian, BorderLayout.NORTH);
		
		PikaUI.getNirePika().addActionListener(this);
		goikoPanela.add(PikaUI.getNirePika(), BorderLayout.CENTER);
		
		behekoPanela = new JPanel();
		behekoPanela.setBackground(new Color(112, 200, 160));
		behekoPanela.setLayout(new BorderLayout(0, 0));
		getContentPane().add(behekoPanela, BorderLayout.CENTER);
		
		panelakEraiki();
		
		Tableroa.getNireTableroa().setTamaina(10, 10, 10);
		Tableroa.getNireTableroa().tableroaEraiki();
		behekoPanela.add(TableroaUI.getNireTableroaUI());
		
		this.setVisible(true);
		this.pack();
	}
	
	//Beste metodoak
	private void panelakEraiki() {
		
		JPanel panelIpar = new JPanel();
		panelIpar.setBackground(new Color(112, 200, 160));
		behekoPanela.add(panelIpar, BorderLayout.NORTH);
		
		JPanel panelMendebal = new JPanel();
		panelMendebal.setBackground(new Color(112, 200, 160));
		behekoPanela.add(panelMendebal, BorderLayout.WEST);
		
		JPanel panelEkial = new JPanel();
		panelEkial.setBackground(new Color(112, 200, 160));
		behekoPanela.add(panelEkial, BorderLayout.EAST);
		
		JPanel panelHegoal = new JPanel();
		panelHegoal.setBackground(new Color(112, 200, 160));
		behekoPanela.add(panelHegoal, BorderLayout.SOUTH);
		
	}
	
	public static void galdu(){
		JokoaUI.galdu = true;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JDialog.setDefaultLookAndFeelDecorated(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JokoaUI frame = new JokoaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
