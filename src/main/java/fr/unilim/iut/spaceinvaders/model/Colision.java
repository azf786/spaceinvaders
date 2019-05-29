package fr.unilim.iut.spaceinvaders.model;

public class Colision {
	
	
	
	public boolean detecterCollision(Sprite attaquant, Sprite toucher) {
		if(colision(attaquant, toucher)) {
			return true;
		}
		else
			return false;
	}

	public boolean colision(Sprite attaquant, Sprite toucher) {
		return null!=attaquant && null != toucher && attaquant.abscisseLaPlusAGauche()< toucher.abscisseLaPlusADroite() &&
		        attaquant.abscisseLaPlusADroite() > toucher.abscisseLaPlusAGauche() &&
		        attaquant.ordonneeLaPlusBasse() < toucher.ordonneeLaPlusHaute() &&
		        attaquant.ordonneeLaPlusHaute() > toucher.ordonneeLaPlusBasse();
	}

}
