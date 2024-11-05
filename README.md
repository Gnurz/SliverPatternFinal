<h1>Introduction</h1>
Les slivoides à l'attaque !
Les slivoides sont de petites créatures dans l'univers de Magic the Gathering. Seules, elles sont faibles et fragiles, mais en nombre elles deviennent redoutables !
Exemple si un slivoide a le vol. Tous les slivoide ont le vol. Si un autre slivoide a +1 en force et +1 en endurance tous les slivoide gagne ce bonus 
Les slivoides ont le don de partager chacune de leur capacité avec le reste de la ruche. Votre objectif va être d'implémenter ce phénomène.

<h1>Consigne</h1>

- Compléter l'interface SkillStrategy en ajoutant les méthodes :
    - String applySkill();
    - boolean isApplicable(SliverPower type);
   
- Faites les implémentations suivantes : PowerOneThougnessOneBoost, HasteSkill, FlyingSkill, SkillNotFound
- Complétez la classe SliverFactory (n'oubliez pas que vous êtes sur Spring boot !)
- Complétez la classe BattleFieldDisplayService

Histoire que ce ne soit pas trop simple : <b>INTERDICTION d'utiliser if/else, switch case, expression ternaire, etc. :) </b>

<h1>Objectif</h1> 
Pour la liste suivante :

  List<SliverPower> sliverPowers = Arrays.asList(
                SliverPower.FLYING,
                SliverPower.HASTE,
                SliverPower.STRENGTHONE_THOUGNESSONE_BOOST,
                SliverPower.STRENGTHONE_THOUGNESSONE_BOOST);
	
        
Le résultat doit être : 
Tous les slivoïdes ont : 
- +1/+1
- +1/+1
- Vol
- Célérité


<h1>BONUS</h1> 
Pour les plus rapides. Certaines compétences deviennent cumulables +1/+1 se cumule en fonction du nombre de slivoides mais pas le vol ni la célérité.

On affiche donc : \n
Tous les slivoïdes ont : \n
- +1/+1 x2
-  Vol
-  Célérité
