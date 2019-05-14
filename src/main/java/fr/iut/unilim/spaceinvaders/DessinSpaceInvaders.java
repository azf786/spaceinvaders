package fr.iut.unilim.spaceinvaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import fr.unilim.iut.spaceinvaders.moteurjeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu {

	private SpaceInvaders jeu;

	
	public DessinSpaceInvaders(SpaceInvaders spaceInvaders) {
		   this.jeu = spaceInvaders;
	   }

	   public void dessiner(BufferedImage im) {
		   if (this.jeu.aUnVaisseau()) {
			   Vaisseau vaisseau = this.jeu.recupererVaisseau();
			   this.dessinerUnVaisseau(vaisseau, im);
		   }
		   if (this.jeu.aUnMissile()) {
			   Missile missile = this.jeu.recupererMissile();
			   this.dessinerUnMissile(missile, im);
		   }
	   }

	   private void dessinerUnVaisseau(Vaisseau vaisseau, BufferedImage im) {
		   Graphics2D crayon = (Graphics2D) im.getGraphics();

		   crayon.setColor(Color.gray);
		   crayon.fillRect(vaisseau.abscisseLaPlusAGauche()/2, vaisseau.ordonneeLaPlusBasse(), vaisseau.longueur(), vaisseau.hauteur());

	   }
	   
	   private void dessinerUnMissile (Missile missile, BufferedImage im) {
		   Graphics2D crayon = (Graphics2D) im.getGraphics();

		   crayon.setColor(Color.blue);
		   int abscisseMilieuVaisseau = this.jeu.vaisseau.abscisseLaPlusAGauche() + (this.jeu.vaisseau.longueur() / 2);
		   int abscisseOrigineMissile = abscisseMilieuVaisseau - (missile.longueur() / 2);

		   int ordonneeeOrigineMissile = this.jeu.vaisseau.ordonneeLaPlusBasse() - 1;
		   crayon.fillRect(abscisseOrigineMissile, ordonneeeOrigineMissile, missile.longueur(), missile.hauteur());
	   }


}
