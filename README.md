# spaceinvaders

# Semaine du 29 avril  au 06 Mai 2019

# Description du travail effectué
<<<<<<< HEAD
Fonctionalité n2
Ajouter la vitesse au vaisseau: on a ajouter un entier au attribut de vaisseau qui represente sa vitesse qui represente le nombre de pixel. On a intergerer la vitesse au code sur la methode seDeplacerVersLaDroite et seDeplacerVersLaDroite en modiant le +/-1 par +/- la vitesse.
On ecrite des tests de deplacement du vaisseau avec la vitesse. 
Le test du cas normal est cas limites sont au vert.
Mais le test du cas ou le vaisseau peut se déplacer partiellement et atteindre la butée, la barre passe au vert.
On modifie les methodes deplacerVersLaGauche et deplacerVersLaDroite pour que le vaisseau reste immobile si le deplacement pousse le vaisseau en dehors de l'espace de jeu.

Fonctionalité n3
Ajouter de la classe Spirite qui est une super classe pour tous les objets dans le jeux.
La classe vaisseau devient une sous-classe de spirite

# Diagramme de classes
![alt text](C:\Users\Azfar\Downloads\_Game_On__at_Pacific_Science_Center_(5559659293).jpg) 
=======
### Fonctionalité n2
Ajouter la vitesse au vaisseau: on a ajouter un entier au attribut de vaisseau qui represente sa vitesse qui represente le nombre de pixel. On a intergerer la vitesse au code sur la methode seDeplacerVersLaDroite et seDeplacerVersLaDroite en modiant le +/-1 par +/- la vitesse.
On ecrite des tests de deplacement du vaisseau avec la vitesse. 
Le test du cas normal est cas limites sont au vert.
Mais le test du cas ou le vaisseau peut se déplacer partiellement et atteindre la butée, la barre passe au vert.
On modifie les methodes deplacerVersLaGauche et deplacerVersLaDroite pour que le vaisseau reste immobile si le deplacement pousse le vaisseau en dehors de l'espace de jeu.

### Fonctionalité n3
Creér la classe Spirite qui est une super classe pour tous les objets dans le jeux.
La classe vaisseau devient une sous-classe de spirite
### Ajout dans la classe mère Sprite du constructeur à 3 paramètres;

# Diagramme de classes
![alt](https://github.com/azf786/spaceinvaders/blob/master/model.jpg) 

# Nuages de mots
![alt](https://github.com/azf786/spaceinvaders/blob/master/nuagesdemots.png) 


## Semaine du 06 avril  au 14 Mai 2019

# Description du travail effectué
### Fonctionalité n3 (suite et fin)

#### Ajout dans la classe mère Sprite du constructeur à 3 paramètres
<p> A l'aide du refactoring on crée le constructeur de la classe Spirite qui initialize la position, la taille et la vitesse de l'objet.</p>
<p> Modifie le constructeur de vaisseau pour qu'il fait au constructeur de la classe mère</p>
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
>>>>>>> branch 'master' of https://github.com/azf786/spaceinvaders.git
