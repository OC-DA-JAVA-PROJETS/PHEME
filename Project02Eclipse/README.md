# Sample project for OpenClassroom's fundamentals of Java

## Lancement programme

```shell
java AnalyticsCounter symptoms.txt
```



### Lists of issues

* FIXME1 : Il y a 3 compteurs sp�cifiques pour 3 symptomes hors la liste des symptomes n'est pas fixes.	
* FIXME2 : Le chemin du fichier n'est pas param�trable. Ceci pose un probl�me de flexibilit�.	
* FIXME3 : Le compteur i ne sert � rien. Pas utiliser apr�s dans la boucle.	
* FIXME4 : D�claration d'une variable en doublon pour le m�me symptome cr�� en param�tre de classe.	
* FIXME5 : Sysout inutile de l'afficher dans la boucle.
* FIXME6 : M�me probl�me que le 1.
* FIXME7 : Traiment globale de la boucle qui pourrait �tre g�r�e par une m�thode.
* FIXME8 : Traitement global de l'ecriture qui peut �tre trait� pa rune m�thode.	
* FIXME9 : Le chemin du fichier n'est pas param�trable. Ceci pose un probl�me de flexibilit�.
* FIXME10 : Meme probl�me que le 1 conditionn� sur 3 symptomes.	
* FIXME11 : Pas de fermeture du reader.
* FIXME12 : Probl�me li� au fixme4 et confusion sur headcount.
* FIXME13 : M�me probl�me que sur le 4.
* FIXME14 : Mise � jour de la Javadoc.
* FIXME15 : Modifications du nom des interfaces.
* FIXME16 : Omptimisation du nom des impl�mentations.
* FIXME17 : Ouverture du param�trage de la classe AnalyticsCounter.

### Expliquer quelles solutions pourraient �tre apport�es : 

* FIXME1 : Suppression des variables statiques, � remplacer par une liste de compteur de symptomes.
* FIXME2 : Externaliser le chemin du fichier via les arguments du programme.
* FIXME3 : A supprimer.
* FIXME4 : R�gl� par le FIXME 1.
* FIXME5 : A supprimer.
* FIXME6 : R�gl� par le FIXME 1.
* FIXME7 : Externalis� vers la classe ReadSymptomDataFromFile
* FIXME8 : Externalis� vers la classe WriteSymptomDataToFile
* FIXME9 : Externaliser le chemin du fichier via les arguments du programme.
* FIXME10 : R�gl� par le FIXME 1.
* FIXME11 : Fermeture du reader.
* FIXME12 : R�gl� par le FIXME 1.
* FIXME13 : R�gl� par le FIXME 1.
* FIXME15 : Am�lioration de la compr�hension de l'utilisation des interfaces.
* FIXME16 : Am�lioration de la compr�hension de l'utilisation des impl�mentations.
* FIXME17 : Possibilit� d'externalisation de la classe.


### V1.0
Livr�e
