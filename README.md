# Ephitec-Test

Les tests sont faites en récepectant toutes les instructions fournies dans le sujet .
plusieurs images ulistratives sont fournies dans le projet montrant l'exécution des différents tests.
vous trouvez également ci-dessus les différentes instructions de compilation et d'exécution mais faut prendre bien en compte la version JAVA utiliser.

informations importantes:
-------------------------- 

technologie utilisée : JAVA version : jdk-15
IDE utilisé: eclipse (conseiller d'utiliser eclipse en utilisant jdk-15 pour le run de test)

les Classes Main à tester sont de cette format 'Exemple1.java' je vais les citer dessus:

package epithecExercices:
-------------------------
- Exemple1.java
- ExempleStep2.java
- ExempleStep3.java
- ExempleStep4.java

package exceptions:
-------------------------
- Exemple1.java


compilation:
---------------------------------

pour la partie compilation les classes sont déjà compilées et elle se trouve dans le répertoire "bin".
si de besoin de recompiler faut se positionner dans le dossier 'src' et taper la commande suivante :
javac nomDePackageAtester\NomDeLaClasse.java

ou

javac nomDePackageAtester\*.java 

pour l'intégralité des classes mais il est préférable d'utiliser les classes déjà compiler 
pour raison certaines classes des différents packages est liée notamment la classe "WeaponException" 
et lier aux classes de package epithecExercices.

pour le run:
------------------------------------

faut se potitionner dans le dossier bin et taper la commande suivante pour les classes Main(Exemple dans mon projet) seulement:

java nomDePackageAtester\NomDeLaClasse

