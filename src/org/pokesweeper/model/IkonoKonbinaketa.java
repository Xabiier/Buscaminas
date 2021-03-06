package org.pokesweeper.model;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class IkonoKonbinaketa implements Icon{
	
	//Atributoak
	private final Icon atzekoa;
	private final Icon aurrekoa;
	
	//Eraikitzailea
	public IkonoKonbinaketa(Icon pAtzekoa, Icon pAurrekoa) {
		this.atzekoa = pAtzekoa;
		this.aurrekoa = pAurrekoa;
	}

	//Beste metodoak
	@Override
	public int getIconHeight() {
		return Math.max(aurrekoa.getIconHeight(), atzekoa.getIconHeight());
	}

	@Override
	public int getIconWidth() {
		return Math.max(aurrekoa.getIconWidth(), atzekoa.getIconWidth());
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int arg2, int arg3) {
		atzekoa.paintIcon(arg0, arg1, arg2, arg3);
        aurrekoa.paintIcon(arg0, arg1, arg2, arg3);
	}

}
