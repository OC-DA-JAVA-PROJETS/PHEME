# Sample project for OpenClassroom's fundamentals of Java

## Lancement programme

```shell
java AnalyticsCounter symptoms.txt
```



### Lists of issues

* FIXME1 : il y a 3 compteurs spécifiques pour 3 symptomes hors la liste des symptomes n'est pas fixes.	
* FIXME2 : le chemin du fichier n'est pas paramétrable. Ceci pose un problème de flexibilité.	
* FIXME3 : Le compteur i ne sert à rien. Pas utiliser après dans la boucle.	
* FIXME4 : déclaration d'une variable en doublon pour le même symptome créé en paramètre de classe.	
* FIXME5 : sysout inutile de l'afficher dans la boucle.
* FIXME6 : même problème que le 1.
* FIXME7 : traiment globale de la boucle qui pourrait être gérée par une méthode.
* FIXME8 : traitement global de l'ecriture qui peut être traité pa rune méthode.	
* FIXME9 : le chemin du fichier n'est pas paramétrable. Ceci pose un problème de flexibilité.
* FIXME10 : meme problème que le 1 conditionné sur 3 symptomes.	
* FIXME11 : pas de fermeture du reader.
* FIXME12 : problème lié au fixme4 et confusion sur headcount.
* FIXME13 : même problème que sur le 4
* FIXME19 : Faute de frappe

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
* FIXME19 : Correction faute de frappe.


### Préparer une V1 du programme corrigé
**TODO**
