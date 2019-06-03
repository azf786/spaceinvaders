package fr.iut.unilim.spaceinvaders;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.unilim.iut.spaceinvaders.model.Colision;
import fr.unilim.iut.spaceinvaders.model.Dimension;
import fr.unilim.iut.spaceinvaders.model.Position;
import fr.unilim.iut.spaceinvaders.model.SpaceInvaders;

public class CollisionTest {
	
	private SpaceInvaders spaceinvaders;
	private Colision colision;

    @Before
    public void initialisation() {
	    spaceinvaders = new SpaceInvaders(15, 10);
	    this.colision = new Colision();
	   
    }
    
    @Test
    public void collision_Test() {
 	   spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(5,9), 2);
 	   spaceinvaders.tirerUnMissile(new Dimension(3,2),2);
 	   spaceinvaders.positionnerUnNouveauEnvahisseur(new Dimension(3,2),new Position(6,3), 1);

 	   spaceinvaders.deplacerMissile();
 	   spaceinvaders.deplacerMissile();
 	   
 	   
        assertTrue(colision.detecterCollision(spaceinvaders.recupererMissile(), spaceinvaders.recupererEnvahisseur()));
     }
    
    @Test
    public void collision_Test_Missile_Sort_Du_Cote_Gauche_De_LEnvahisseur() {
 	   spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(6,9), 2);
 	   spaceinvaders.tirerUnMissile(new Dimension(3,2),2);
 	   spaceinvaders.positionnerUnNouveauEnvahisseur(new Dimension(3,2),new Position(6,3), 1);

 	   spaceinvaders.deplacerMissile();
 	   spaceinvaders.deplacerMissile();
 	   
 	  assertTrue(colision.detecterCollision(spaceinvaders.recupererMissile(), spaceinvaders.recupererEnvahisseur()));

    }
    
    @Test
    public void collision_Test_Missile_Sort_Du_Cote_Droit_De_LEnvahisseur() {
 	   spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(2,9), 2);
 	   spaceinvaders.tirerUnMissile(new Dimension(3,2),2);
 	   spaceinvaders.positionnerUnNouveauEnvahisseur(new Dimension(3,2),new Position(6,3), 1);

 	   spaceinvaders.deplacerMissile();
 	   spaceinvaders.deplacerMissile();
 	   
 	   
 	  assertTrue(colision.detecterCollision(spaceinvaders.recupererMissile(), spaceinvaders.recupererEnvahisseur()));

    }
    
    @Test
    public void collision_Test_Missile_Intersect_Envahisseur() {
 	   spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(4,9), 2);
 	   spaceinvaders.tirerUnMissile(new Dimension(2,4),1);
 	   spaceinvaders.positionnerUnNouveauEnvahisseur(new Dimension(6,2),new Position(4,3), 1);

 	   spaceinvaders.deplacerMissile();
 	   spaceinvaders.deplacerMissile();
 	   spaceinvaders.deplacerMissile();
 	   
 	   
 	  assertTrue(colision.detecterCollision(spaceinvaders.recupererMissile(), spaceinvaders.recupererEnvahisseur()));
    }

    @Test
    public void collision_Test_Missile_Sort_En_Gauche_De_LEnvahisseur_En_Haut_De_LEnvahisseur() {
 	   spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(2,9), 2);
 	   spaceinvaders.tirerUnMissile(new Dimension(3,2),3);
 	   spaceinvaders.positionnerUnNouveauEnvahisseur(new Dimension(6,2),new Position(5,2), 1);

 	   spaceinvaders.deplacerMissile();
 	   spaceinvaders.deplacerMissile();
 	  
 	   
 	   
 	  assertTrue(colision.detecterCollision(spaceinvaders.recupererMissile(), spaceinvaders.recupererEnvahisseur()));
    }
    
    @Test
    public void collision_Test_Envahisseur_Touche_Missile_A_Gauche() {
 	   spaceinvaders.positionnerUnNouveauVaisseau(new Dimension(7,2),new Position(2,9), 2);
 	   spaceinvaders.tirerUnMissile(new Dimension(2,4),2);
 	   spaceinvaders.positionnerUnNouveauEnvahisseur(new Dimension(6,2),new Position(5,2), 1);

 	   spaceinvaders.deplacerMissile();
 	   spaceinvaders.deplacerMissile();
 	  
 	   
 	   
 	  assertTrue(colision.detecterCollision(spaceinvaders.recupererMissile(), spaceinvaders.recupererEnvahisseur()));
    }
}
