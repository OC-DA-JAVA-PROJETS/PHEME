# Sample project for OpenClassroom's fundamentals of Java

## Lancement programme

```shell
java AnalyticsCounter symptoms.txt
```



### Lists of issues

* FIXME1 : Il y a 3 compteurs spécifiques pour 3 symptomes hors la liste des symptomes n'est pas fixes.	
* FIXME2 : Le chemin du fichier n'est pas paramétrable. Ceci pose un problème de flexibilité.	
* FIXME3 : Le compteur i ne sert à rien. Pas utiliser après dans la boucle.	
* FIXME4 : Déclaration d'une variable en doublon pour le même symptome créé en paramètre de classe.	
* FIXME5 : Sysout inutile de l'afficher dans la boucle.
* FIXME6 : Même problème que le 1.
* FIXME7 : Traiment globale de la boucle qui pourrait être gérée par une méthode.
* FIXME8 : Traitement global de l'ecriture qui peut être traité pa rune méthode.	
* FIXME9 : Le chemin du fichier n'est pas paramétrable. Ceci pose un problème de flexibilité.
* FIXME10 : Meme problème que le 1 conditionné sur 3 symptomes.	
* FIXME11 : Pas de fermeture du reader.
* FIXME12 : Problème lié au fixme4 et confusion sur headcount.
* FIXME13 : Même problème que sur le 4.
* FIXME14 : Mise à jour de la Javadoc.
* FIXME15 : Modifications du nom des interfaces.
* FIXME16 : Omptimisation du nom des implémentations.
* FIXME17 : Ouverture du paramétrage de la classe AnalyticsCounter.

### Expliquer quelles solutions pourraient être apportées : 

* FIXME1 : Suppression des variables statiques, à remplacer par une liste de compteur de symptomes.
* FIXME2 : Externaliser le chemin du fichier via les arguments du programme.
* FIXME3 : A supprimer.
* FIXME4 : Réglé par le FIXME 1.
* FIXME5 : A supprimer.
* FIXME6 : Réglé par le FIXME 1.
* FIXME7 : Externalisé vers la classe ReadSymptomDataFromFile
* FIXME8 : Externalisé vers la classe WriteSymptomDataToFile
* FIXME9 : Externaliser le chemin du fichier via les arguments du programme.
* FIXME10 : Réglé par le FIXME 1.
* FIXME11 : Fermeture du reader.
* FIXME12 : Réglé par le FIXME 1.
* FIXME13 : Réglé par le FIXME 1.
* FIXME15 : Amélioration de la compréhension de l'utilisation des interfaces.
* FIXME16 : Amélioration de la compréhension de l'utilisation des implémentations.
* FIXME17 : Possibilité d'externalisation de la classe.


### V1.0
Livrée
