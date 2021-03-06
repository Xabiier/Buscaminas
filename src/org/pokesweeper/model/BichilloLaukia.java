package org.pokesweeper.model;

import org.pokesweeper.view.JokoaUI;
import org.pokesweeper.view.LaukiaUI;
import org.pokesweeper.view.TableroaUI;

//JUnitentzako
import javax.swing.Icon;

public class BichilloLaukia extends BarruLaukia {
	
	//Atributoak
	
	//Eraikitzailea
	public BichilloLaukia(int pErrenkada, int pZutabea, int pIkonoZenb){
		super(pErrenkada, pZutabea, pIkonoZenb);
	}
	
	//Beste metodoak
	@Override
	public void ezkerrekoBotoia() {
		if(this.egoera != 3 && !JokoaUI.bukatuta){
			this.egoera = 3;
			LaukiaUI laukiHonenUI = TableroaUI.getNireTableroaUI().laukia[this.errenkada][this.zutabea];
			laukiHonenUI.setRolloverIcon(null);
			int p = (int)(Math.random() * Helbideak.bichilloak.length);
			laukiHonenUI.setIcon(new IkonoKonbinaketa(Helbideak.lurra[4], Helbideak.bichilloak[p]));
			laukiHonenUI.repaint();
		}
	}
	
	@Override
	public void eskumakoBotoia(){
		
	}
	
	//JUnitentzako
	public void setEgoera(int pEgoera){
		this.egoera= pEgoera;
	}
	
	public Icon getIkonoa(){
		return TableroaUI.getNireTableroaUI().laukia[this.errenkada][this.zutabea].getIcon();
	}

}
