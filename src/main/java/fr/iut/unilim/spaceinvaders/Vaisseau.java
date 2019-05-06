package fr.iut.unilim.spaceinvaders;

public class Vaisseau extends Sprite {

	 public Vaisseau(int longueur, int hauteur) {
			this(longueur, hauteur, 0, 0);
		}

		public Vaisseau(int longueur, int hauteur, int x, int y) {
			this(new Dimension(longueur, hauteur), new Position(x, y));
		}

		public Vaisseau(Dimension dimension, Position positionOrigine) {
			this(dimension, positionOrigine, 1);
		}
		
		public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
			super(dimension, positionOrigine, vitesse);
		}

}