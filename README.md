# spaceinvaders

# Semaine du 29 avril  au 06 Mai 2019

# Description du travail effectué

## Fonctionalité n3
Ajouter la vitesse au vaisseau: on a ajouter un entier au attribut de vaisseau qui represente sa vitesse qui represente le nombre de pixel. On a intergerer la vitesse au code sur la methode seDeplacerVersLaDroite et seDeplacerVersLaDroite en modiant le +/-1 par +/- la vitesse.
On ecrite des tests de deplacement du vaisseau avec la vitesse. 
Le test du cas normal est cas limites sont au vert.
Mais le test du cas ou le vaisseau peut se déplacer partiellement et atteindre la butée, la barre passe au vert.
On modifie les methodes deplacerVersLaGauche et deplacerVersLaDroite pour que le vaisseau reste immobile si le deplacement pousse le vaisseau en dehors de l'espace de jeu.

### Fonctionalité n4
Ajouter de la classe Spirite qui est une super classe pour tous les objets dans le jeux.
La classe vaisseau devient une sous-classe de spirite
Creér la classe Spirite qui est une super classe pour tous les objets dans le jeux.
La classe vaisseau devient une sous-classe de spirite
### Ajout dans la classe mère Sprite du constructeur à 3 paramètres;

# Diagramme de classes
![alt](https://github.com/azf786/spaceinvaders/blob/master/model.jpg) 

# Nuages de mots
![alt](https://github.com/azf786/spaceinvaders/blob/master/nuagesdemots.png) 


## Semaine du 06 avril  au 14 Mai 2019

# Description du travail effectué
### Fonctionalité n4 (suite et fin)

#### Ajout dans la classe mère Sprite du constructeur à 3 paramètres
A l'aide du refactoring on crée le constructeur de la classe Spirite qui initialize la position, la taille et la vitesse de l'objet.
 Modifie le constructeur de vaisseau pour qu'il fait au constructeur de la classe mère
#### Ecrire un premier un test (cas normal de tirerUnMissile)
le test echoue.
On ecrit la classe tirerMissile, on modifie la classe recupererMarqueDeLaPosition pour qu'il affiche un missile a la position voulue.
On ecrit dans la classe Missile le comprtement de tirer missile.

#### Ecrire les autres test
Pour les test qui echoue on modifie la methode tirer missile pour qu'il se comporte comme voulue. 
# Diagramme de classes
![alt](https://github.com/azf786/spaceinvaders/blob/master/modelS2.jpg) 

# Nuages de mots
![alt](https://github.com/azf786/spaceinvaders/blob/master/spaceinvadersS2.png) 


# Semaine du 14 avril  au 21 Mai 2019

# Description du travail effectué

## Fonctionalité n5
### Story n°1 : Positionner un nouveau vaisseau dans l’espace de jeu : 
Un nouveau envahisseur est créé avec des dimensions 
L'envahisseur est positionné aux coordonnées transmis
Si un nouveau envahisseur essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.
### Story n°2 : Deplacer un envahisseur dans l'espace de jeu : 
Déplacer l'envahisseur avec vitesse prédefinie vers une direction prédefine(Gauche ou droite)
Une direction doit être definie dans la classe envahisseur qui prendra une valeur par defaut
Chager la direction une fois que l'envahisseur touche le bord

Pour tester le deplacement de l'envahisseur on place:
l'envahisseur au milieu: il se deplace vers la position prédefinie
l'envahisseur est au bord gauche de l'ecran: il se depllace vers la droite
l'envahisseur est au bord droite de l'ecran: il se depllace vers la gauche

### Intégration graphique:
Dans la classe dessinSpaceInvaders on crée la methode dessinerEnvahisseur qui dessine un rectangle à partir des coordonnées de l'envahisseur
Pour deplacer automatiquement l'envahisseur on ajoute dans la methode evoluer si il y'a vaisseau alors deplacer le vaisseau

## Fonctionalité n6: Détecter une collision entre deux sprites :
### Story n°1 : Creation de la classe colision
Créer la classe colision
### Story n°2 : Creation de la méthode detecterColision : 
La methode prend en paramètres deux Spirites.
Comparer les coordonnées des deux spites.

Pour tester la colision, on crée la classe ColisionTest:
On verifie tous les cas possible
![alt text](https://github.com/azf786/spaceinvaders/blob/master/testColision.jpg) 


# Diagramme de classes
![alt text](https://github.com/azf786/spaceinvaders/blob/master/model4.jpg) 

# Nuages de mots
![alt](https://github.com/azf786/spaceinvaders/blob/master/spaceinvaders4.png) 

# Semaine du 21 avril  au 06 Mai 2019

# Description du travail effectué

## Fonctionalité n7
### Story n°1 : Positionner un nouveau vaisseau dans l’espace de jeu : 
Un nouveau envahisseur est créé avec des dimensions 
L'envahisseur est positionné aux coordonnées transmis
Si un nouveau envahisseur essaye d’être positionné en dehors des limites de l’espace jeu, alors une exception devra être levée.
### Story n°2 : Deplacer un envahisseur dans l'espace de jeu : 
Déplacer l'envahisseur avec vitesse prédefinie vers une direction prédefine(Gauche ou droite)
Une direction doit être definie dans la classe envahisseur qui prendra une valeur par defaut
Chager la direction une fois que l'envahisseur touche le bord

Pour tester le deplacement de l'envahisseur on place:
l'envahisseur au milieu: il se deplace vers la position prédefinie
l'envahisseur est au bord gauche de l'ecran: il se depllace vers la droite
l'envahisseur est au bord droite de l'ecran: il se depllace vers la gauche

### Intégration graphique:
Dans la classe dessinSpaceInvaders on crée la methode dessinerEnvahisseur qui dessine un rectangle à partir des coordonnées de l'envahisseur
Pour deplacer automatiquement l'envahisseur on ajoute dans la methode evoluer si il y'a vaisseau alors deplacer le vaisseau

## Fonctionalité n6: Détecter une collision entre deux sprites :
### Story n°1 : Creation de la classe colision
Créer la classe colision
### Story n°2 : Creation de la méthode detecterColision : 
La methode prend en paramètres deux Spirites.
Comparer les coordonnées des deux spites.

Pour tester la colision, on crée la classe ColisionTest:
On verifie tous les cas possible
![alt text](https://github.com/azf786/spaceinvaders/blob/master/testColision.jpg) 


# Diagramme de classes
![alt text](https://github.com/azf786/spaceinvaders/blob/master/model4.jpg) 

# Nuages de mots
![alt](https://github.com/azf786/spaceinvaders/blob/master/spaceinvaders4.png) 


