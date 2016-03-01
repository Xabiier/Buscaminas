package org.pokesweeper.model;

import org.pokesweeper.view.LaukiaUI;
import org.pokesweeper.view.TableroaUI;

public class LurLaukia extends BarruLaukia{
	
	//Atributoak
	private int errenkada;
	private int zutabea;
	private int egoera;
	private int ikonoZenb;
	private LaukiaUI laukiHonenUI = TableroaUI.getNireTableroaUI().laukia[this.errenkada][this.zutabea];
	
	//Eraikitzailea
	public LurLaukia(int pErrenkada, int pZutabea, int pIkonoZenb){
		this.errenkada = pErrenkada;
		this.zutabea = pZutabea;
		this.egoera = 0;
		this.ikonoZenb = pIkonoZenb;
	}
	
	//Beste metodoak
	public void mouseClicked(){
		if (this.egoera != 3){
			this.egoera = 3;
			laukiHonenUI.setRolloverIcon(null);
			laukiHonenUI.setIcon(Helbideak.lurra[5]);
			laukiHonenUI.repaint();
			//TODO: EXPANDIRSE A LAS DEMAS BELARRAK!
		}
	}
	
}
