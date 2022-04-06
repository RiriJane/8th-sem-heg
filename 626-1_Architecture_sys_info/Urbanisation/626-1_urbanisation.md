# 626-1 Urbanisation

# Table des matières
1. [Les fondamentaux](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#les-fondamentaux)
2. [Couche métier - part 1](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#couche-m%C3%A9tier---part-1)
3. [Organigramme d'acteur](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#cartographier-les-acteurs---organigramme-dacteur)
4. [Processus métiers](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#processus-m%C3%A9tier)
5.[Introduction à BPMN](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#business-process-model-notation---bpmn)
6. [Diagramme de processus métier](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#diagramme-de-processus-m%C3%A9tier)
7. [Couche métier - part 2]()
8. [Les principaux concepts de BPMN](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#les-principaux-concepts-de-bpmn)
9. [Diagramme de processus organisationnel](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#diagramme-de-processus-organisationnel)
10. [Couche métier - part 3](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#couche-m%C3%A9tier---part-3)
 Diagramme de processus fonctionnel
 Diagramme de processus applicatif

# Les fondamentaux
#### jeudi 24 février 2022

### Système informatique vs système d'information
![Diagramme système d'infomatique et information](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/diagramme-syst%C3%A8me-informatique-information.jpg?raw=true)

Le système informatique est la composante informatisée du système d'information

#### Système d'information (SI)
- Question qui peut sortir à l'examen
- Ensemble de moyens (humain, organisationnel, logiciel, materiel) qui peut gérer l'information
  - Gérer : acquérir, collecter, stocker, traiter (exploiter, transformer, modifier), supprimer, communiquer, archiver, détruire, sécurité

#### Système informatique
- Ensemble des moyens informatiques et de télécommunication (matérielsm logiciels, réseaux, bases de données, téléphonie) qui permet de gérer des données de manière électronique (voir définition de gérer au dessus)

#### Donnée et information
![donnee et information](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/donnee-information.jpg?raw=true)
- Une donnée est un élément brut sans interprétation
- Une information est une donnée interprétée

La donnée se transforme en information lorsqu'elle est communiquée à un être humain capable de l'interpréter.

#### Le contexte d'évolution des systèmes d'information
#### Evolution technologique
![Explosion du numérique](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/explosion-numerique.jpg?raw=true)

- Les systèmes informatiques en strates de sédimentation technologiques
- Plus il y a des technologies différentes, plus l'intégration est difficile et le coût de maintenance élévée
- Il faut rationaliser les différentes technologies utilisées dans le SI

Le SI pour l'entreprise :
- L'information est une ressources stratégique
- Une composante importante de la création de valeur de l'entreprise
- Agile, performant, optimal (coûts), sécurisé, auditable, fiable et constant

#### Le rôle de la direction des systèmes d'information (DSI)
- Intégrer les nouvelles opportunités technologiques
- Gérer l'évolution du SI

#### Principaux problèmes
- Le coûts de maintenance, couvre une grande partie du budget de l'entreprise
- Peu évolutif

#### Besoins
- Maîtriser le SI existant
- Rendre cohérent
- Le simplifier
- Le rendre agile pour faciliter l'évolution
- L'aligner sur le métier

#### Urbanisation du système d'information
![Une démarche progressive du SI](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/urba-SI.jpg?raw=true)
- Appelé aussi architecture d'entreprise.
- Une démarche de transformation progressive et continue du SI.
- Elle vise à simplifier le SI, optimiser sa valeur ajoutée, rendre plus adaptable et plus flexible selon l'évolution stratégique de l'entreprise, tout en prenant en compte les opportunités technologiques du marché.
- Role : garantir la transition entre les différents niveaux de maturité et garantir que les bonnes activités sont faites sur les niveaux de maturité.

#### Objectifs
- Soutenir et accompagner la stratégie d'entreprise dans le meilleur rapport coûts/qualité/délais.
- Faciliter la transformation continue du SI de manière réactive et flexible en maitrisant les impacts.
- Clarifier les attentes et valeur ajoutée des différentes parties du SI.

#### Urbanisation des SI et Architecture d'entreprise
- Démarche francophone de 1995
- AE : démarche anglo-saxophone de 1987 crée par Zachmann
- Urbanisation a pour centre de gravité le SI : l'AE considère l'entreprise dans son ensemble
- Urbanisation est une des activtiés de l'architecture d'entreprise : l'AE va jusqu'à la planification de la transformation du SI et la gestion du changement
-

#### Approche par les modèles
- Avant de prendre une décision, il faut comprendre le contexte.
  - Adapter le SI aux besoins des métiers, aux contraintes réglementaires
  - Améliorer la satisfaction client
  - Réorganiser après une fusion
- **Un modèle** : représentation simplifié de la réalité
  - Deux criètres qui dirigent **le choix de la modélisation** :
    - Dans une **perspective** précise : organisation, système informatiques, ...
    - Pour un **objectif** précis : diminuer les couts, maitriser les risques opérationnels, s'adapter aux évolutions légales, optimiser les processus…
  - Permet de :
    - Décrire des systèmes complexes
    - Comprendre un système complexe et de comprendre le fonctionnement d'un système
    - Facilité la communucation
    - Présenter des perspective différentes d'une même réalité

#### Exemple de la vie courante, de modèle avec sa perspective et un objectif

![Exemple de la vie courante, de modèle avec sa perspective et un objectif](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/exemple-model-perspective-objectif.jpg?raw=true)
![Exemple de la vie courante, de modèle avec sa perspective et un objectif - 2](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/exemple-model-perspective-objectif-2.jpg?raw=true)


#### Approche par la modélisation
- La modélisation est une science de l'ingénieur
- Un modèle fait appel à :
  - **Concepts** : catégories d'information. Par exemple : processus, application, flux
  - **Notation** : représentation graphique des concepts. Par exemple : BPMN.
  - **Techniaue de modélisation** : assemblage des concepts qui représentent un aspect d'une réalité
- Un modèle est représenté graphiquement par un diagramme (ou carte)
- Pas qu'un dessin illustratif

#### Résumé
- Nous créons des modèles : selon une perspective précise, avec des objectifs précis, pour comprendre et améliorer des systèmes complexes
- Pour s'assurer que nos modèles sont cohérents entre eux, nous devons utiliser des concepts bien définis et des techniques de modélisation
- Pour communiquer facilement, nous devons utiliser une notation commune
- Pour y arriver, nous avons besoin à la fois d'un outil de modélisation et d'une méthodologie
- La modélisation est une science de l'ingénieur

#### La cartographie des SI au service de l'urbanisation
- Ensemble de modèles qui représentent les différents objets du SI (processus métier, fonctions métiers, données métiers, applications, serveurs, ...), leurs comportements et leurs interrelations.
- Cartographier le SI existant pour :
  - Comprendre et de capitaliser les connaissance. Elle permet une meilleure compréhension de l'organisation.
  - Maîtriser la complexité.
  - Analyserr (SWOT).
  - Identifier les pistes d'amélioration et axes de rationalisation.
- Cartographier le SI cible idéal (horizon 3 à 5 ans) : rationalisé, aligné sur les besoins métiers, agile, évolutif.
- Identifier le chemin pour y parvenir.
- Se décline sur les 4 couches de référence (métier, fonctionnelle, applicative, technologique).

#### 4 couches de réference
![4 couches de réference](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/4-couches-reference.jpg?raw=true)

**Métier** : Quels métiers ? qui fait quoi ? **Cartographie métier** selon BMPN
**Fonctionnelle** : Quoi ? Quels outils utiles au métier ? **Cartographie fonctionnelle**  
- Fait le lien entre le metier et l'informatique.
- Fonctions du SI permettant de supporter les processus métiers, informations métiers.

**Applicative** : Comment ? Comment fonctionnenent les outils ? **Cartographie applicative**
- applications, flux d'information, entités et données.

**Technologique** : Avec quoi ? **Cartographie infrastructure technique**
- Base de données, serveurs, réseaux.

- Permet d'analyser chaque niveau sans se soucier des autres niveaux.
- Modèle agile : le travail de cartographie peut commencer à n'importe quelle couches.
- La couche correspond à l'implémentation de la couche N+1
- La couche fonctionnelle fait le lien entre les processus métier et l'informatique
- Ce modèle se décline aussi en plusieurs dimensions temporelles : actuel / cible

#### 5ième couche : stratégie
![5ième couche : stratégie](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/5ieme-couche.jpg?raw=true)

Avantage :
- Découpler processus métiers, fonctions, applications et infrastructure technique rend chaque niveau plus indépendant l'un de l'autre tout en mettant en exergue leurs interrelations

#### La couche données-informations
![La couche données-informations](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/couche-donnee-information.jpg?raw=true)

#### exercice quizz
![quizz](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/quizz.jpg?raw=true)

Réponses :
1. Infrastructure technique
2. Métier
3. Fonctionnelle
4. Métier
5. Métier
6. Infrastructure technique

#### Les acteurs de l'urbanisation des SI
![Acteurs](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/acteurs.jpg?raw=true)

Enjeu : adhésion des acteurs des SI
Les **acteurs métiers** - responsable SI, experts métiers.
**Les acteurs informatiques** -  RDD, équipe projet, architectes solutions et architectes techniques.


#### Gestion de risques
Stratégie : direction générale

Métier : responsable métiers

Fonctionnelle : une équipe assistance MOA

Applicative : responsable informatique

Infrastructure technique : responsable informatique

- Les risques peuvent être de n'importe quel niveau
- öa responsable de risque est responsable de la gestion des risques

#### Démarche urbanisation outillée
- Il existe plusieurs outils d'architechture d'entreprise


# Couche métier - part 1
#### jeudi 3 mars 2022
#### La cartographie de la couche métier
![cartographie métier - organigramme d'acteur](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-1/cartographie-couche-metier.jpg?raw=true)

#### Le concept d'acteur
Un acteur représente une personne, un groupe de personnes ou une unité organisationnelle qui intervient dans les processus de l'entreprise.

Un acteur peut être interne ou externe à l'entreprise :

- Un acteur interne représente un élément de l'organisation de l'entreprise (une direction, un service ou un poste de travail). Définit à un niveau plus au moins fin selon la précision fournit sur l'organisation.
- Un acteur externe représente un organisme qui ne fait pas partie de l'entreprise mais qui échange des flux avec l'entreprise. Ex : client, fournisseur,…

Types d'acteur :
- Société : représente une entité juridique comme une filiale ou le siège social d'une entreprise.  
- Structure : représente un service ou une direction de l'entreprise (ex: département des finances).
- Fonction : représente un poste de travail (ex: responsable commercial).
- Responsable : représente le responsable d'un service ou d'une direction (ex : Directeur de l'administration fiscale

Notation :
![Notation acteurs](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-1/notation-acteurs.jpg?raw=true)

#### Cartographier les acteurs - organigramme d'acteur
Un organigramme d'acteur est une représentation graphique des liens hiérarchiques d’une entreprise.
- Il sert à donner une vue d’ensemble de la répartition des postes et fonctions.
- Cette cartographie simplifiée permet de visualiser les différentes **relations de commandement** ainsi que les rapports de **subordination**.
- Elle donne une vision simple et claire des structures complexes.
- L'organigramme d'acteur ne donne pas d'information sur la répartition des tâches.
- Une représentation **statique** de l'organisation de l'entreprise.
- La structure hiérarchique de l'entreprise est très volatile donc plus l'organigramme sera détaillé, plus souvent il faudra le mettre à jour.  


Un organigramme d'acteur est un **arbre** (ou une pyramide) **d'acteurs internes** à l'entreprise.

Sont représentés sur ce type de diagramme :
- Les acteurs de l'entreprise : les unités organisationnelles et leur découpage en sous-unités (par des boites).
- Les relations hiérarchiques qui permettent la transmission des ordres (par des traits pleins) .
- Les responsables des unités organisationnelles, selon le niveau de détail souhaité.

Une unité organisationnelle est un département, ou un office, ou un service, sous-services, sections…

#### Règles de modélisation [RM xx]
- **[RM01]** Un organigramme d'acteur présente un arbre d'acteur dont la racine est la structure décrite.
- **[RM02]** Une unité organisationnelle (feuille de l'arbre) ne peut être rattachée qu'à une -et une seule unité organisationnelle supérieure.  
- **[RM03]** Un organigramme d'acteur ne doit mentionner que des acteurs internes. On ne s'intéresse pas à l'organisation des acteurs externes.   

#### Mauvaise exemple d'un organigramme d'acteur
![Faux exemple - organigramme d'acteur](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-1/faux-exemple-organigramme-acteurs.jpg?raw=true)

- manque RM01 : directuer général -> selon le texte; soit on remplace ceci par le nom de l'entreprise soit une autre carré au dessus de ceci avec le nom de l'entreprise


#### Processus métier
![Processus métier](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-1/processus-metier.jpg?raw=true)

- Un enchaînement ordonné d'activités aboutissant à un résultat déterminé
- Il est déclenché par un évènement qui lui est externe et il fournit des produits ou des services à un acteur externe
- Se caractérise par : un **événement déclencheur** en entrée, une **suite d'activités** constituant la chaîne des valeurs ajoutées (construction du résultat), une fin qui se matérialise par un **résulat** pour le **client**, le **bénéficiaire** du processus.

#### La norme vision
La norme ISO (9000 : 2000) classe les processus en 3 familles :
- processus opérationnels : ils contribuent directement à la réalisation des  produits ou services depuis la détection des besoins du client à sa satisfaction.

- processus de soutien (ou de support) : ils contribuent au bon déroulement des processus opérationnels en leur apportant les ressources nécessaires. Bien que ne créant pas de valeur directement, ils sont nécessaires au fonctionnement permanent de l'entreprise et à sa pérennité

- processus de pilotage (ou de management) : ils contribuent à la détermination de la politique de l'entreprise et au déploiement des objectifs. Ils assurent la cohérence des processus opérationnels et de soutien. Ils sont sous la responsabilité totale de l'équipe dirigeante.

#### Business Process Model Notation - BPMN
- Norme de notation pour la modélisation des processus.
- Norme internationale gérée depuis 2008 par l'OMG.
- Gestion des processus métiers.
- Objectifs :
  - Un langage commun pour la modélisation des processus métiers
  - Proposer un ensemble de modèles pour favoriser le passage de la modélisation ou conception des processus vers l'implémentation et l'exécution des processus en langage BPEL.  
- Pour qui : tous ceux qui s'intéressent à la compréhension et à l'optimisation des processus métiers :
  - Les consultants et auditeurs en stratégie d'entreprise,
  - Les analystes métiers ou de processus,
  - Les concepteurs de processus métier,
  - Les urbanistes de SI ou architectes d'entreprise,
  - Tous les managers.
- Pourquoi :
  - Norme internationale,
  - Indépendante,
  - Norme ouverte,
  - Group de travail de l'OMG est très applicatif,
  - Utilisation forte croissance.
>De plus en plus d'organisations utilisent le BPMN et dans de plus en plus d'universités, le BPMN est enseigné en tant que matière. Voici les raisons:
Standard
BPMN n'appartient pas à une certaine entreprise mais à une institution ( OMG ), qui est déjà établie par le biais d'autres normes mondiales, par exemple UML. La norme est prise en charge par de nombreux produits logiciels; vous êtes moins dépendant des produits d'un fournisseur particulier.
Simplicité
Le principe derrière BPMN est assez simple, c'est pourquoi vous pouvez commencer à travailler avec cette notation très rapidement.
Pouvoir d'expression
Si nécessaire, vous pouvez décrire précisément le fonctionnement d'un processus avec BPMN. Cependant, cela est plus difficile que de décrire approximativement le processus. Cette méthode de modélisation précise est possible, mais pas obligatoire.
Implémentation en informatique
BPMN a été principalement développé pour soutenir la mise en œuvre technique des processus («Process Automation»). Plus l'informatique est importante dans une entreprise, plus l'utilisation du BPMN devient utile.

#### Object Management Group
- Association américaine à but non lucratif créée en 1989
- Objectif : standardiser et promouvoir le modèle objet sous toutes ses formes (UML, CORBA , ..)
  - 2011 : version 2.0
  - 2013 : version 2.0.2
- Norme vivante grâce à une communauté très active

#### BPMN et UML
BPMN et UML sont élaborées par l'OMG et sont complémentaires :
- UML permet l'analyse et la conception d'un système informatique.
- BPMN vise l'analyse et la conception de processus métiers .

Diagramme de processus BPMN ->  diagramme de cas d'utilisation UML.

#### Diagramme de processus métier - approche top-down
#### Identifier les processus métier macroscopiques
1. Identifier les acteurs externes :
  - les clients et bénéficiaires auxquels l'organisation doit répondre
  - les partenaires stratégiques qui fournissent des services ou des ressources clés  
2. Faire l'inventaire des produits ou services fournis
  - Lister les principaux produits et services qui font l'objet d'un engagement formel envers les clients et partenaires
3. Identifier les processus métiers
  - Ce sont les activités mises en place pour fournir les produits et services demandés
4. Initialiser le diagramme de processus métier
  - Au moins 1 participant (acteur)
  - Des flux avec des contenus correspondant aux produits et services

![Processus métier](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-1/processus-metier.jpg?raw=true)

#### Décomposer les processus métier en sous-Processus
![Décomposer les processus métier en sous-Processus](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-1/d%C3%A9composer-processus-m%C3%A9tier-sous-processus.jpg?raw=true)

#### Diagramme de processus métier
- Est définit pour un processus
- Identifier les événements, les résultats produits et les interactions avec d'autres  processus
- Décomposer un processus en sous-processus
- Identifier les processus organisationnels qui mettent en œuvre le processus  

#### Quelques questions à poser pour faire cartographier des processus métiers
- Quel est l’objectif de mon processus ? En quoi contribue-t-il à la création de valeurs pour mon organisation ?
- Qu’est-ce qui déclenche mon processus ? Quels sont le ou les évènements qui démarrent la séquence d’activités.
- Quels sont les résultats attendus ? Quelles sont les différentes fins possibles ?
- Quelles sont les activités de mon processus ? Comment s’enchainent-t-elles quand tout se passe bien ?
- Quelles sont les interactions de mon processus avec des acteurs externes ? Ou d’autres processus ?

# Couche métier - part 2
# Les principaux concepts de BPMN

#### Les 3 catégories de concepts BPMN
- Objectif :avoir un formalisme standard, simple et implémentable.

1. Les objets étapes
  - **Activité** action ou ensemble d'actions ![élément activité](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/element-activite.jpg?raw=trues)
    - Tache
    - Sous-processus
  - **Evénement** va déclencher, interrompre ou influencer le déroulement du processus ![élément événement](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/element-evenement.jpg?raw=true)
    - Début
    - Intermédiaire
    - Fin
  - **Passerelle** qui influence la séquence d'activités ![élément passerelle](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/element-passerelle.jpg?raw=true)

2. Les objets de connexion
  - **Flux de séquence** : connectent les activités entre elles, et expriment l'ordre d'exécution ![Flux de séquence](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/flux-sequence.jpg?raw=true)
  - **Flux de message** : les échanges entre processus ![Flux de message](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/flux-message.jpg?raw=true)

3. Les objets de collaboration
  - Les **piscines et les couloirs** : les responsabilités au sein d’un processus métier
    ![piscines et couloirs](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/piscine-couloir.jpg?raw=true)
  - Les **artéfacts** : objets de données et annotations ![artefacts](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/artefacts.jpg?raw=true)

Une bonne référence : https://docs.camunda.org/manual/7.14/reference/bpmn20/

#### Les marquers d'objets BPMN
![Les marquers d'objets BPMN](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/marquers-bpmn.jpg?raw=true)

#### Les 3 niveaux de conformité
1. **Descriptif** : les éléments de base utiles pour la modélisation des processus macroscopiques.
  -Mmodélisation à partager entre humains. On décrit essentiellement le chemin idéal et on omet les cas d'exception. Dans ce cas, on désactive le règlement BPMN.
2. **Analytique** : tous les éléments de niveau descriptif + des éléments utilisés pour décrire le comportement des processus.
  - On décrit formellement tout ce que l'on peut décrire : le chemin idéal mais aussi les exceptions. Le règlement BPMN doit être respecté.
3. Exécutable : contient tous les attributs nécessaires pour que les processus puissent être exécutés par un moteur de workflow. **Pas pour ce cours.**

# Diagramme de processus organisationnel
- Nn ensemble d'activités (opérations) réalisées par des acteurs de l'entreprise en vue de produire un résultat.
- Décrit par une succession d'opérations déclenchée par la réception d'un événement et produit au moins un résultat.
- Décrit la marche à suivre pour mettre en œuvre tout ou partie d'un processus.

#### Processus métier vs Processus organisationnel
![Exemple processus métier vs processus organisationnel](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/processus-metier-vs-processus-organisationnel.jpg?raw=true)

Un **processus métier**  : permet la description de ce que fait l'entreprise. Il décrit le Quoi ?

Un **processus organisationnel** : décrit comment l'entreprise est organisée pour effectuer les opérations nécessaires à son fonctionnement. Il décrit le Qui fait quoi, Quand, Comment et Où?

Donc, un processus métier peut être mis en œuvre par **plusieurs** processus organisationnels.

#### Les activités dans la norme BPMN
Une **activité** est une action.

2 cas :
1. Soit cette activité est décomposable, BPMN parle de sous-processus et donc peut être décrit par un diagramme de processus.

![sous-processus](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/sous-processus.jpg?raw=true)

2. Soit cette activité est élémentaire ou atomique et donc non décomposable et BPMN parle de tâche. Et donc ne peut pas être décrit par un diagramme.

![Tâche](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/tache.jpg?raw=true)

**Convention de nommage** : Processus, sous-processus et tâche commencent par un verbe à l'infinitif.

#### Marqueurs d'activités
Les marqueurs d'activitées indiquent le comportement des activités lors de leur exécution.

![Marqueurs d'activités](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/marquers-activites.jpg?raw=true)

#### Marqueurs de tâches
![Type de tâches](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/types-taches.jpg?raw=true)

#### Piscine et couloirs
- **Piscine** : indique le responsable du déroulement des activités (acteur interne). Il assume le contrôle du processus et attribue les tâches (chef d'orchestre) c'est pourquoi ce type de processus est appelé «orchestration».

- **Couloir** : indique qui réalise les activités. Subdivision optionnelle de la piscine. Un acteur interne aussi.

- **Piscine collapsée** : permet de modéliser un participant externe (acteur ou processus) qui échange des flux avec le processus décrit mais dont on ne connait pas la séquence d'activités.   

#### Flux de séquence
- C'est un lien entre 2 activités d'un processus ou entre un événement et une activité dans un processus. Il indique un lien de séquence.
- Deux activités successives doivent être reliées entre elles par un enchainement.
- **[RM04]** : Un flux de séquence ne doit pas sortir des frontières du processus (la -piscine) , il est obligatoirement interne au processus.
- Les interactions avec l'extérieur du processus sont modélisées par des flux de message.
- Donnent une vue séquentielle du déroulement des activités.

#### Flux de messages
 - Permet de modéliser la circulation d'information entre le processus et son environnement c’est-à-dire avec les participants externes au processus, ou avec d'autres processus.
- **[RM05]** : Un flux (de message) sort des frontières du processus (la piscine).
- Recommandé de décrire le contenu du flux.
- Font circuler l'information

#### Evénement - Niveau Descriptif
- DÉBUT : déclenche le processus ![événement début](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/evenement-debut.jpg?raw=true)
  - indique quand et comment un processus démarre
  - obligatoire et unique au sein d'un processus

- FIN : est émis par le processus ![événement fin](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/evenement-fin.jpg?raw=true)
  - indique la fin d'un processus et ne peut pas avoir de suite
  - obligatoire mais peuvent être multiples dans un processus
  - On distinguera les fins avec erreurs ou anomalies

- INTERMÉDIAIRE : le processus attend l'arrivée d'un événement pour continuer ![événement intermédiaire](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/evenement-intermediaire.jpg?raw=true)


- **[RM06]** : un processus est obligatoirement déclenché par un événement de type début unique.
- **[RM07]** : un processus prend fin obligatoirement par au moins un événement de type fin.
- Convention : s'il y a plusieurs événements de fin, on doit les distinguer par un libellé explicite de la cause de la fin.

![3 principaux types d'événements](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/3-principaux-types-evenements.jpg?raw=true)

#### Evénement temporel
![événement temporel](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-2/evenements-temporels.jpg?raw=true)

# Couche métier - part 3

#### Evénement de type signal
#### Différence entre message et signal
- message : est toujours adressé à un destinataire spécifique et porte une information.
- signal : non dirigé, et c'est souvent un stimuli sensoriel, visuel ou auditif. Il ne porte pas une information à proprement dit mais c'est son interprétation qui donne une information. Par exemple, le client arrive, le réveil sonne, le client lève la main pour appeler le serveur.

![evenement synthèse](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-3/evenements-synthese.jpg?raw=true)

#### Passerelle (branchement)
- Sert à contrôler des flux de séquence qui convergent ou qui divergent à l'intérieur d'un processus.
- Effectue aucune tâche, c’est juste un lieu où une décision est prise en fonction du flux d’entrée.
- Le symbole à l’intérieur du losange sert à identifier le comportement de la passerelle.
- Ne laisse aucune ambiguïté sur la séquence du flux.
- **[RM08]** : l’arrivée ou le départ de plus qu’un flux doit passer obligatoirement par une passerelle et ne pas être directement relié à une tâche.
- Après une tâche, une passerelle permet de diviser un flux en 2 ou plusieurs chemins (autres flux de séquence).
- Avant une tâche, une passerelle permet de rassembler plusieurs chemins en 1 seul pour déclencher la tâche.
- **[RM09]** : une passerelle ne doit pas servir à la fois à réunir et à diviser le flux. Dans ce cas, on modélise 2 passerelles à la suite

![RM09](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-3/RM09.jpg?raw=true)

#### Mauvais exemple passerelle
![Mauvais exemple passerelle](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-3/mauvais-exemple-passerelle.jpg?raw=true)

#### 5 types de Passerelle
![5 types de Passerelle](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-3/5-types-passerelles.jpg?raw=true)

#### Passerelle OU EXCLUSIF
- 1 seul des trajets qui suivent est exécutée en fonction de la valeur de la condition.
- La condition doit être explicite et sans ambiguïté.
- On note sur les flux de séquence les critères des différents chemins possibles.

#### Passerelle OU INCLUSIF

![passerelle inclusive](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-3/passerelle-inclusive.jpg?raw=true)

- 1 ou plusieurs : En fonction de la condition, la séquence continue sur 1, plusieurs ou toutes les branches.
- La condition doit être explicite.

#### Passerelle ET

![passerelle et](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-3/passerelle-et.jpg?raw=true)

- le processus suit simultanément tous les trajets parallèles.
- Placé après une tâche, la passerelle parallèle sépare le flux de séquence en plusieurs flux de séquence qui tournent en même temps.
- Placé avant une tâche, la passerelle parallèle permet la réunion de plusieurs flux de séquence et attend que toutes les séquences d’arrivée soient terminées avant de toutes les associer en un seul flux de sortie.

#### Passerelle basée sur les événements
Passerelle **OU exclusif + attente d'un événement**
- Ppermet de prendre une décision en fonction des événements.
- Chaque flux de séquence sortant de la passerelle doit être connecté à un événement intermédiaire.
- Lorsque l'exécution du processus atteint une passerelle basée sur les événements, la passerelle agit comme un état d'attente: l'exécution est suspendue, et attend qu'un des événements intermédiaires se produit.
- L'arrivée d'un évènement intermédiaire déclenchera un des chemins du processus.

Exemple :
![exemple Passerelle basée sur les événements](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-3/exemple-passerelle-basee-evenements.jpg?raw=true)

#### Décrire le processus organisationnel
- Décrire le processus organisationnel
- Identifier les participants au processus
- Décrire les activités menées du début à la fin du processus
- Agencer les activités dans leur ordre chronologique
- Affecter les activités aux acteurs participants qui sont en charge de leur exécution
- Identifier les événements qui peuvent changer le déroulement du processus
- Décrire les passerelles et les conditions.
