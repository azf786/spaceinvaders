package fr.unilim.iut.spaceinvaders.model;

import fr.unilim.iut.spaceinvaders.utils.HorsEspaceJeuException;
import fr.unilim.iut.spaceinvaders.utils.MissileException;

public class Vaisseau extends Sprite {
		
		public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
			super(dimension, positionOrigine, vitesse);
		}
		
		private Position calculerLaPositionDeTirDuMissile(Dimension dimensionMissile) {
			int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur() / 2);
			int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

			int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
			
			Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
			return positionOrigineMissile;
		}

		public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
			if (dimensionMissile.longueur > this.dimension.longueur)
				throw new MissileException("La longueur du missile est supérieur a celui du vaisseau");
			
			Position positionOrigineMissile = calculerLaPositionDeTirDuMissile(dimensionMissile);
			return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
		}

		

}