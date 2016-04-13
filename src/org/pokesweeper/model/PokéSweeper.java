package org.pokesweeper.model;

import javax.swing.JDialog;

import org.pokesweeper.view.JokoaUI;
import org.pokesweeper.view.LoginUI;
import org.pokesweeper.view.PokéSweeperUI;
import org.pokesweeper.view.Splash;

import javafx.embed.swing.JFXPanel;
import javafx.util.Duration;

public class PokéSweeper {
	
	//Atributoak
	private static PokéSweeper nirePokéSweeper = null;
	final JFXPanel jfx;
	
	//Main metodoa
	public static void main(String[] args) {
		new PokéSweeper();
	}
	
	//Eraikitzailea
	public static PokéSweeper getNirePokéSweeper(){
		if(nirePokéSweeper == null){
			nirePokéSweeper = new PokéSweeper();
		}
		return nirePokéSweeper;
	}
	
	private PokéSweeper(){
		Helbideak.denakKargatu();
		jfx = new JFXPanel();
		this.hurrengoa(0);
		JDialog.setDefaultLookAndFeelDecorated(true);
	}
	
	//Beste metodoak
	public void hurrengoa(int pInt) {
		switch (pInt) {
		case 0:
			this.splash();
			break;
		case 1:
			this.login();
			break;
		case 2:
			this.jokoa();
			break;
		}
		
	}
	
	private void splash(){
		new Splash();
	}
	
	private void login(){
		this.musikaJarri();
		new LoginUI();
	}
	
	private void jokoa(){
		PokéSweeperUI.getNirePokéSweeperUI().menuaJarri();
		JokoaUI.getNireJokoa().erreseteatu(JokoaUI.maila, false);
	}
	
	private void musikaJarri(){
		Audioa intro = new Audioa(Helbideak.intro);
		intro.play();
		intro.getPlayer().setOnEndOfMedia(new Runnable(){
			@Override
			public void run(){
				final Audioa bucle = new Audioa(Helbideak.bucle);
				bucle.play();
				bucle.getPlayer().setOnEndOfMedia(new Runnable(){
					@Override
					public void run(){
						bucle.getPlayer().seek(Duration.ZERO);
					}
				});
			}
		});
	}


	
}
