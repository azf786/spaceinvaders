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
		return null!=attaquant && null != toucher && 
				absicce_La_Plus_Gauche_Du_Vaisseau_Est_Inferieure_A_l_Absicce_La_PLus_Droite_Du_Vaisseau(attaquant, 
						toucher) &&
		        absicce_La_Plus_Droite_Du_Vaisseau_Est_Inferieure_A_l_Absicce_La_PLus_Gauche_Du_Vaisseau(attaquant,
						toucher) &&
		        ordonnee_La_Plus_Basse_Du_Vaisseau_Est_Inferieure_A_l_Ordonnee_La_PLus_Haute_Du_Vaisseau(attaquant,
						toucher) &&
		        ordonnee_La_Plus_Haute_Du_Vaisseau_Est_Superieure_A_L_Ordonnee_La_PLus_Basse_Du_Vaisseau(attaquant,
						toucher);
	}

	public boolean ordonnee_La_Plus_Haute_Du_Vaisseau_Est_Superieure_A_L_Ordonnee_La_PLus_Basse_Du_Vaisseau(
			Sprite attaquant, Sprite toucher) {
		return attaquant.ordonneeLaPlusHaute() >= toucher.ordonneeLaPlusBasse();
	}

	public boolean ordonnee_La_Plus_Basse_Du_Vaisseau_Est_Inferieure_A_l_Ordonnee_La_PLus_Haute_Du_Vaisseau(
			Sprite attaquant, Sprite toucher) {
		return attaquant.ordonneeLaPlusBasse() <= toucher.ordonneeLaPlusHaute();
	}

	public boolean absicce_La_Plus_Droite_Du_Vaisseau_Est_Inferieure_A_l_Absicce_La_PLus_Gauche_Du_Vaisseau(
			Sprite attaquant, Sprite toucher) {
		return attaquant.abscisseLaPlusADroite() >= toucher.abscisseLaPlusAGauche();
	}

	public boolean absicce_La_Plus_Gauche_Du_Vaisseau_Est_Inferieure_A_l_Absicce_La_PLus_Droite_Du_Vaisseau(
			Sprite attaquant, Sprite toucher) {
		return attaquant.abscisseLaPlusAGauche() <= toucher.abscisseLaPlusADroite();
	}

}
