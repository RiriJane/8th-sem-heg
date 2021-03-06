# 626-1 Urbanisation

# Table des matières
1. [Les fondamentaux](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#les-fondamentaux)
2. [Couche métier - part 1](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#couche-m%C3%A9tier---part-1)
    - [Organigramme d'acteur](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#cartographier-les-acteurs---organigramme-dacteur)
    - [Processus métiers](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#processus-m%C3%A9tier)
    - [Introduction à BPMN](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#business-process-model-notation---bpmn)
    - [Diagramme de processus métier](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#diagramme-de-processus-m%C3%A9tier)
3. [Couche métier - part 2](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#couche-m%C3%A9tier---part-2)
    - [Les principaux concepts de BPMN](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#les-principaux-concepts-de-bpmn)
    - [Diagramme de processus organisationnel](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#diagramme-de-processus-organisationnel)
4. [Couche métier - part 3](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#couche-m%C3%A9tier---part-3)
5. [Couche métier - part 4](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#couche-m%C3%A9tier---part-4)
    - [Objet de données](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#objet-de-donn%C3%A9es)
    - [Artefacts](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#artefact)
    - [Les 2 catégories de diagrammes](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#les-2-cat%C3%A9gories-de-diagrammes)
    - [Diagramme d'orchestration](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#diagramme-dorchestration--d%C3%A9crit-la-s%C3%A9quence-des-activit%C3%A9s-du-d%C3%A9but-jusqu%C3%A0-la-fin)
6. [Couche métier - part 5](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#couche-m%C3%A9tier---part-5)
    - [Pourquoi modéliser les processus ?](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#pourquoi-mod%C3%A9liser-les-processus-)
    - [Identifier les besoins métiers vis-à-vis du système informatique](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#identifier-les-besoins-m%C3%A9tiers-vis-%C3%A0-vis-du-syst%C3%A8me-informatique)
    - [Fonctionnalité](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#fonctionnalit%C3%A9)
    - [Identifier les besoins métiers vis-à-vis du système informatique](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#identifier-les-besoins-m%C3%A9tiers-vis-%C3%A0-vis-du-syst%C3%A8me-informatique-1)
7. [Couche fonctionnelle](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#couche-fonctionnelle)
    - [Objectifs](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#objectifs-1)
    - [Capacité métier](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#capacite-metier)
      - [Carte des capacités métier](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#carte-des-capacites-metier)
    - [Les concepts](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#les-concepts)
    - [Plan capacitaire](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#plan-capacitaire)
    - [Fonctionnalité](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#fonctionnalite)
    - [Application](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#application)
    - [Cartographier la couche fonctionnelle](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#cartographier-la-couche-fonctionnelle)
    - [Règles de modélisation](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#regles-de-modelisation)
    - [Principe d'urbanisation](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#principes-durbanisation)
    - [Valeur ajoutée d'urbanisaton](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/626-1_urbanisation.md#valeur-ajoutee-durbanisation)

# Les fondamentaux
#### jeudi 24 février 2022

## Système informatique vs système d'information
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

## Le contexte d'évolution des systèmes d'information
#### Evolution technologique
![Explosion du numérique](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/fondamentaux/explosion-numerique.jpg?raw=true)

- Les systèmes informatiques en strates de sédimentation technologiques
- Plus il y a des technologies différentes, plus l'intégration est difficile et le coût de maintenance élévée
- Il faut rationaliser les différentes technologies utilisées dans le SI

Le SI pour l'entreprise :
- L'information est une ressources stratégique
- Une composante importante de la création de valeur de l'entreprise
- Agile, performant, optimal (coûts), sécurisé, auditable, fiable et constant

## Le rôle de la direction des systèmes d'information (DSI)
- Intégrer les nouvelles opportunités technologiques
- Gérer l'évolution du SI

## Principaux problèmes
- Le coûts de maintenance, couvre une grande partie du budget de l'entreprise
- Peu évolutif

## Besoins
- Maîtriser le SI existant
- Rendre cohérent
- Le simplifier
- Le rendre agile pour faciliter l'évolution
- L'aligner sur le métier

## Urbanisation du système d'information
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

## Approche par les modèles
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


## Approche par la modélisation
- La modélisation est une science de l'ingénieur
- Un modèle fait appel à :
  - **Concepts** : catégories d'information. Par exemple : processus, application, flux
  - **Notation** : représentation graphique des concepts. Par exemple : BPMN.
  - **Techniaue de modélisation** : assemblage des concepts qui représentent un aspect d'une réalité
- Un modèle est représenté graphiquement par un diagramme (ou carte)
- Pas qu'un dessin illustratif

## Résumé
- Nous créons des modèles : selon une perspective précise, avec des objectifs précis, pour comprendre et améliorer des systèmes complexes
- Pour s'assurer que nos modèles sont cohérents entre eux, nous devons utiliser des concepts bien définis et des techniques de modélisation
- Pour communiquer facilement, nous devons utiliser une notation commune
- Pour y arriver, nous avons besoin à la fois d'un outil de modélisation et d'une méthodologie
- La modélisation est une science de l'ingénieur

## La cartographie des SI au service de l'urbanisation
- Ensemble de modèles qui représentent les différents objets du SI (processus métier, fonctions métiers, données métiers, applications, serveurs, ...), leurs comportements et leurs interrelations.
- Cartographier le SI existant pour :
  - Comprendre et de capitaliser les connaissance. Elle permet une meilleure compréhension de l'organisation.
  - Maîtriser la complexité.
  - Analyserr (SWOT).
  - Identifier les pistes d'amélioration et axes de rationalisation.
- Cartographier le SI cible idéal (horizon 3 à 5 ans) : rationalisé, aligné sur les besoins métiers, agile, évolutif.
- Identifier le chemin pour y parvenir.
- Se décline sur les 4 couches de référence (métier, fonctionnelle, applicative, technologique).

## 4 couches de réference
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
## La cartographie de la couche métier
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


## Processus métier
![Processus métier](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-1/processus-metier.jpg?raw=true)

- Un enchaînement ordonné d'activités aboutissant à un résultat déterminé
- Il est déclenché par un évènement qui lui est externe et il fournit des produits ou des services à un acteur externe
- Se caractérise par : un **événement déclencheur** en entrée, une **suite d'activités** constituant la chaîne des valeurs ajoutées (construction du résultat), une fin qui se matérialise par un **résulat** pour le **client**, le **bénéficiaire** du processus.

## La norme vision
La norme ISO (9000 : 2000) classe les processus en 3 familles :
- processus opérationnels : ils contribuent directement à la réalisation des  produits ou services depuis la détection des besoins du client à sa satisfaction.

- processus de soutien (ou de support) : ils contribuent au bon déroulement des processus opérationnels en leur apportant les ressources nécessaires. Bien que ne créant pas de valeur directement, ils sont nécessaires au fonctionnement permanent de l'entreprise et à sa pérennité

- processus de pilotage (ou de management) : ils contribuent à la détermination de la politique de l'entreprise et au déploiement des objectifs. Ils assurent la cohérence des processus opérationnels et de soutien. Ils sont sous la responsabilité totale de l'équipe dirigeante.

## Business Process Model Notation - BPMN
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

## Object Management Group
- Association américaine à but non lucratif créée en 1989
- Objectif : standardiser et promouvoir le modèle objet sous toutes ses formes (UML, CORBA , ..)
  - 2011 : version 2.0
  - 2013 : version 2.0.2
- Norme vivante grâce à une communauté très active

## BPMN et UML
BPMN et UML sont élaborées par l'OMG et sont complémentaires :
- UML permet l'analyse et la conception d'un système informatique.
- BPMN vise l'analyse et la conception de processus métiers .

Diagramme de processus BPMN ->  diagramme de cas d'utilisation UML.

## Diagramme de processus métier - approche top-down
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

## Les 3 catégories de concepts BPMN
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

## Diagramme de processus organisationnel
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

## Evénement de type signal
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

# Couche métier - part 4

## Objet de données
![elements base de données](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-4/elements-bdd.jpg?raw=true)

- Représente des **informations circulant** tout au long des processus tels que des documents.
- Une base de données est un endroit où le processus peut lire et écrire des données. Elle **persiste au-delà de la durée de vie du processus**.

![exemple objet de données](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-4/exemple-bdd.jpg?raw=true)

## Artefact
![artefacts](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-4/artefacts.jpg?raw=true)

- Une précision, une information supplémentaire graphique ou textuelle apportée à un diagramme, une **annotation**.
- un **regroupement** : rassemble graphiquement un ensemble d'éléments ayant une relation sémantique,  pour le visuel uniquement.

![exemple regroupement](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-4/exemple-regroupement.jpg?raw=true)

## Les 2 catégories de diagrammes
1. **Diagramme de collaboration** : permet de représenter les interactions entre un processus et son environnement en spécifiant les messages échangés.
    - Processus métier
    - Processus organisationnel
    - Sous-processus
    - Participant (avec acteur externe)
    - Flux de message
    - Flux de séquence

2. **Diagramme d'orchestration (ou diagramme de flux de séquence)** : décrit la séquence du processus du début à la fin avec les concepts de :
    - Processus organisationnel
    - Participant (acteur interne)
    - Opération (ou tâche)
    - Flux de message
    - Flux de séquence
    - Événement
    - Passerelle
    - Piscine et couloir   
- **[RM10]** : Dans un diagramme de processus organisationnel, le flux de séquence ne doit pas s'interrompre, c’est-à-dire on doit pouvoir aller du début jusqu'à la fin, sans interruption dans la description de la séquence.


#### Exemple - Diagramme de collaboration : 1er niveau le macro-Processus
![Exemple Diagramme de processus 1er niveau](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-4/exemple-diagramme-de-processus-macro-1er-niveau.jpg?raw=true)

#### Exemple - Diagramme de collaboration : 2ème niveau on décompose le processus en sous-processus. Pas de séquence entre processus mais des échanges de message
![Exemple Diagramme de collaboration : 2ème niveau](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-4/exemple-diagramme-collaboration-2eme-niveau.jpg?raw=true)

## Diagramme d'orchestration : décrit la séquence des activités du début jusqu'à la fin
![Exemple Diagramme d'orchestration](https://github.com/RiriJane/8th-sem-heg/blob/main/626-1_Architecture_sys_info/Urbanisation/img/couche-metier-part-4/exemple-diagramme-orchestration.jpg?raw=true)

#### Démarche de cartographie des processus métiers  du plus général au plus détaillé  
1. Organigramme d'acteur
    - Identifier les acteurs internes à l'organisation étudiée
2. Diagramme de collaboration niveau 1 macro
    - Identifier les acteurs externes et les interactions (flux de messages)
3. Diagramme de collaboration niveau 2 sous-processus
    - Décomposer le macro processus en sous-processus
4. Diagramme d'orchestration processus organisationnels
    - Décomposer chaque sous-processus en une séquence de processus organisationnels (boites roses)
5. Diagramme d'orchestration pour chaque processus organisationnel
    - Pour chaque processus organisationnel, décrire la séquence de tâches

#### Comment savoir si un diagramme est réussi ?
2 qualités :
1. Conformité :
    - Respect de toutes les règles de modélisation [RMxx]
    - Respect des conventions de nommage
    - Respect des usages (couleurs, sens de modélisation, expliciter les événements de fin, et les informations portés par les flux d'information )

Pour la norme BPMN, l'utilisation d'un outil de modélisation aide à respecter la norme :
- Camunda est conçu pour modéliser des diagrammes de processus organisationnels et ne permet pas de déroger à la norme BPMN
- MEGA Hopex, permet de modéliser l'ensemble des 4 couches de référence et offre la possibilité d'utiliser le "règlement BPMN" qui signale les erreurs de modélisation sur un diagramme de processus organisationnel.

2. Lisibilité :
    - La modélisation est aussi un acte de communication. Une cartographie doit être le plus lisible possible tant sur le fond que sur la forme :
      - De gauche à droite, de haut en bas
      - Éviter les croisements de flux ou de messages
      - Indiquer systématiquement le titre du diagramme

# Couche métier - part 5

## Pourquoi modéliser les processus ?
- **Comprendre** comment l'entreprise est organisée pour délivrer ses prestations
- S'inscrire dans une **démarche qualité** en vue d'une certification
- Identifier des **améliorations** possibles :
  - Temps de traitement
  - Qui fait quoi (RACI)
  - Rationalisation
- **Réorganiser** – mesure de l'impact, accompagnement au changement
- Identifier les **besoins métiers** vis-à-vis du système informatique    

## Identifier les besoins métiers vis-à-vis du système informatique    
- Les besoins métiers doivent être définis par ceux qui réalisent le processus.
- Les besoins métiers doivent être définis indépendamment de la solution informatique à fournir.
  - Les outils et les technologies sont du ressort de l'informatique et pas des métiers.
  - Les outils et technologies changent, les métiers sont plus stables.
- Pour enregistrer les besoins métiers, nous utilisons le concept de fonctionnalité.

## Fonctionnalité
![Fonctionnalité](img/couche-metier-part-5/fonctionnalite.jpg?raw=true)
- Une fonction élémentaire attendue par un acteur pour effectuer son travail.
- Une fonction informatisée ou à informatiser permettant à un acteur d’exécuter tout ou partie d’une tâche.
- Une fonctionnalité est définie indépendamment de la façon dont elle est fournie. Par exemple : Enregistrer une commande, Saisir une commande dans SAP.
- Plusieurs fonctionnalités peuvent être nécessaires à la réalisation d'une tâche.

## Identifier les besoins métiers vis-à-vis du système informatique
**Objectif** :
- Identifier les éléments du système informatique nécessaires pour supporter les utilisateurs à produire le résultat d'un processus organisationnel.

**Comment faire** :  
- En partant de la description du processus organisationnel, identifier, avec les métiers, les fonctionnalités du système informatique dont ils ont besoin pour réaliser le processus et donc produire le résultat.
- Déterminer si les fonctionnalités requises sont couvertes par une application informatique existant.

# COUCHE FONCTIONNELLE

## OBJECTIFS
- Répond à la question "Quoi ?" sans tenir compte des acteurs et de l'organisation.
- A pour objectif de proposer un découpage du SI stable, basé sur les invariants métiers, indépendant de l'organisation structurelle de l'entreprise et de l'architecture technique de l'informatique.
- Permet d'établir le lien entre le métier et l'informatique.
- Permet de vérifier ou d'apprécier l'adéquation des outils informatiques aux métiers (notion d'alignement).

En phase d'analyse du **SI existant** :
- Identifier les fonctionnalités utiles et nécessaires aux métiers
- Découvrir les outils informatiques utilisés par le métier
- Vérifier que les fonctionnalités informatisées sont utilisées dans les opérations métiers
- Identifier les redondances fonctionnelles, applicatives, de données de référence.

En phase de conception du **SI cible** :
- Identifier les fonctionnalités à informatiser.

## CAPACITE METIER
- Les capacités métier expriment les fonctions élémentaires nécessaires à l’entreprise pour réaliser son activité.
- Les capacités sont présentées dans une carte des capacités métier avec les applications qui les soutiennent et les fonctionnalités qui sont utiles.
- La modélisation des capacités métier est une technique qui permet de représenter les fonctions métier d’une organisation, indépendamment de sa structure, de ses processus, de son personnel ou de ses services.

> « Une capacité métier est une capacité particulière qu’une entreprise peut posséder ou échanger pour atteindre un objectif spécifique. »

*Définition des capacités métier de TOGAF® V9.2*

> « Une capacité métier, ou simplement une « capacité », définit ce que fait une entreprise. »

*Définition des capacités métier du Guide BIZBOK® V9.0 de la Business Architecture Guild*

## CARTE DES CAPACITES METIER
- Ce sont des outils destinés aux **architectes d’entreprise**, permettant de discuter avec la Direction générale, des investissements ou des désinvestissements stratégiques.
- Servent d’élément structurant pour découvrir les **redondances** dans les ressources informatiques ou des **lacunes opérationnelles**.
- Lier les ressources informatiques à l’entreprise à l’aide des capacités métier permet de :
  - Comprendre clairement comment les ressources informatiques soutiennent les capacités métier.
  - Identifier les redondances, les manques pour proposer une optimisation.
  - Concevoir une évolution ou une transformation du SI existant.

## LES CONCEPTS
1. **Plan capacitaire** - Fait en découpant le SI en unités autonomes appelées zones d’urbanisme.
2. **Zone d'urbanisme** - d'urbanisme regroupe des éléments (fonctionnalités ou applications) caractérisés par :
    - une cohérence forte entre éléments
    - un couplage faible : la dépendance entre 2 zones doit être minimale, idéalement inexistante.
    - (ceci repose sur le principe de **modularité de la décomposition systémique**)
    - peut se décomposer en n sous-zones appelées blocs.
3. Bloc fonctionnel
    - peut se décomposer en plusieurs autres blocs. (décomposition hiérarchique).
4. Fonctionnalité
5. Application

#### NOTATION PLAN CAPACITAIRE, ZONE D'URBANISME ET BLOC FONCTIONNEL
![01 notation](img/couche-fonctionnelle/01-notation.jpg?raw=true)

## PLAN CAPACITAIRE
A partir d'un SI découpé, il permet de conjuguer 2 vues différentes mais complémentaires :
- la vue des fonctionnalités (**carte des capacités fonctionnelles**)
- la vue des applications (**carte des capacités applicatives**)

Les vues permettent de comprendre la structuration du SI existant, de prévoir et maitriser son évolution et de dessiner la cible idéale à atteindre.

#### REGLES DE DECOUPAGE DU SI EN ZONE D'URBANISME
Le plan capacitaire du SI doit contenir :  
- une zone **opérationnelle** : regroupement des fonctions cœur de métier portées par un SI.
- une zone **pilotage** : regroupement des fonctions de management.
- une zone **support** : regroupement des fonctions support.
- une zone **données référentielles** : regroupement des données de référence.
- une zone **échanges** : regroupement des fonctions nécessaires pour acquérir de l'information en provenance de l'extérieur ou pour permettre aux autres SI de récupérer de l'information détenue.

L'ensemble de ces zones constitue le **fond de carte** du SI.

![02 fond de carte](img/couche-fonctionnelle/02-fond-carte.jpg?raw=true)

## FONCTIONNALITE
- Une fonctionnalité est une fonction élémentaire attendue par un acteur pour effectuer son travail.
  - C’est une fonction **informatisée ou à informatiser** permettant à un acteur d’exécuter tout ou partie d’une opération ou d'un ensemble d'opérations.
  - Une fonctionnalité est définie **indépendamment** de la façon dont elle est fournie
  - Généralement, plusieurs fonctionnalités sont nécessaires à la réalisation d'une opération.

Un des objectifs de l'urbanisation sur la couche fonctionnelle sera de **réutiliser** les fonctionnalités et non pas de les dupliquer.   

![03 notation fonctionnalite](img/couche-fonctionnelle/03-notation-fonctionnalite.jpg?raw=true)

## APPLICATION
- Un ensemble de composants logiciels qui constituent un tout cohérent au regard de leur déploiement, de leurs fonctionnalités et des techniques informatiques utilisées.

![04 notation application](img/couche-fonctionnelle/04-notation-application.jpg?raw=true)

## CARTOGRAPHIER LA COUCHE FONCTIONNELLE
- La carte de capacités applicatives
- La carte de capacités fonctionnelles

#### LES ETAPES
1. Identifier les fonctionnalités et les applications utilisées
    - Identifier les éléments du système informatique nécessaires pour supporter les utilisateurs à produire le résultat d'un processus organisationnel.
      - En partant de la description du processus organisationnel, identifier, avec les experts métiers, les fonctionnalités du système informatique qu'ils utilisent pour réaliser le processus et donc produire le résultat.
      - Déterminer si les fonctionnalités requises sont couvertes par une application informatique existante.

![05 étape 1](img/couche-fonctionnelle/05-etape1.jpg?raw=true)

2. Elaborer la carte de capacités fonctionnelles (CCF)
    Dans Draw.io :
    - Créer une carte de capacités fonctionnelles avec le fond de carte
    - Reprendre toutes les fonctionnalités identifiées dans les processus organisationnels et les regrouper par bloc fonctionnel (cohérence forte et couplage faible).

![06 cff](img/couche-fonctionnelle/06-ccf.jpg?raw=true)

![07 cff 2](img/couche-fonctionnelle/07-ccf2.jpg?raw=true)

3. Elaborer la carte de capacités applicatives (CCA)
    Dans Draw.io :
     - Reprendre le découpage hiérarchique zones d'urbanisme > blocs fonctionnels de la carte de capacités fonctionnelles.  
     - Relier directement les applications aux blocs fonctionnels suivant l'usage fait par les experts métiers.   

![08 cca](img/couche-fonctionnelle/08-cca.jpg?raw=true)

![09 cca 2](img/couche-fonctionnelle/09-cca2.jpg?raw=true)

## REGLES DE MODELISATION
**[RM07]** : une fonctionnalité doit être rattachée à une ou plusieurs opérations.

**[RM08]** : une fonctionnalité peut être rattachée à une ou plusieurs applications.

**[RM09]** : une fonctionnalité doit être rattachée à un ou plusieurs blocs.

**[RM10]** : une application doit être rattachée à un ou plusieurs blocs.

## PRINCIPES D'URBANISATION
**[PU1]** Unicité des blocs : un bloc ne doit pas être dupliqué.

**[PU2]** : Une fonctionnalité doit appartenir à un et un seul bloc.
- Si ce n'est pas le cas :
  - Soit elle est trop générique et mérite d'être précisée (ex : impression document),
  - Soit la fonctionnalité est transversale et mériterait d'avoir un bloc spécifique.

**[PU3]** : Une application doit appartenir à un et un seul bloc.
  - si une application est dans plusieurs blocs fonctionnels, c'est qu'elle implémente des fonctionnalités bien différentes, et par conséquent, il faut envisager son découpage.

**[PU4]** : Idéalement, chaque bloc doit contenir une seule application.
  - Si ce n'est pas le cas, il faut analyser leurs fonctionnalités et
  - Soit découper le bloc plus finement
  - Soit envisager la refonte des applications du bloc en une seule application.

#### MISE EN OEUVRE
 - Vérifier le respect des principes d'urbanisation est de la responsabilité de l'urbaniste, de l'architecte d'entreprise ou celle de la Direction des Systèmes d'Information.
 - Il s'agit d'analyser les 2 diagrammes d'urbanisme élaborés sur la couche fonctionnelle, à savoir :  
    - la carte de capacités fonctionnelles
    - la carte de capacités applicatives
    - D'où la nécessité d'avoir le même fond de carte !
- Les fonctionnalités identifiées sont invariantes, au contraire des applications informatiques qui évoluent.

## VALEUR AJOUTEE D'URBANISATION
Urbaniser le SI permet de :  
- construire un SI cible qui soit agile
- intégrer des SI ou partie de SI d'origines diverses (fusion de 2 SI comme chez Air France - KLM)
- intégrer des solutions hétérogènes (progiciels, des éléments de différentes plates-formes, etc.).
- faire interagir le SI et avec d’autres SI (interopérabilité)
- pouvoir remplacer certaines parties du SI (interchangeabilité) sans mettre en péril ni perturber l'ensemble du SI.

# 05 mai 2022

Dans le slide concept, elle a ajouté les données référentielle qui se trouve dans la slide 18, 19

donnée référentielle :
- donner des définitions sur les données pour éviter le malentendu, il faut clarifier, eclaircir les données

# 19 mai 2022 - Couche applicative
![01 - couche applicative](img/couche-applicative/01-couche-applicative.jpg?raw=true)

Exam : expliquer les couches, à quoi ca sert et comment on l'utiliser ?

#### OBJECTIFS - COUCHE APPLICATIVE
La couche applicative répond à la question "Comment ?" sans tenir compte des acteurs et de l'organisation.

La couche applicative a pour objectif de décrire les applications existantes, les fonctionnalités qu'elles implémentent, leur structuration en services (leur modules), et les échanges inter-applications.Il y a 2 temporeallité différentes : soit pour une application existante ou pour une future applications

La couche applicative permet aussi de spécifier de nouvelles applications et leur intégration avec les applications existantes.

La couche applicative établit le lien avec la couche fonctionnelle via les fonctionnalités.

#### LES CONCEPTS
- Application
- Service applicatif
- Base de données logique

#### APPLICATION
![02 - notation application](img/couche-applicative/02-notation-application.jpg?raw=true)

- Un ensemble de composants logiciels qui constituent un tout cohérent au regard de leur déploiement, de leurs fonctionnalités et des techniques informatiques utilisées.

**Convention de nommage :** un nom significatif des fonctionnalités. Eviter toute référence à une technologie.  

#### SERVICE APPLICATIF
![03 - notation service application](img/couche-applicative/03-notation-service-app.jpg?raw=true)

Un service applicatif  est une unité de traitement cohérent qui coordonne un ensemble de messages entrants et sortants, dans le but de réaliser une ou plusieurs fonctionnalités.
C’est l’élément le plus atomique de l’architecture applicative.

Le service applicatif peut être utilisé pour structurer l'application en composants fonctionnels et en composants techniques selon une architecture orientée services (SOA).

Ici on privilégie le découpage fonctionnel.

Quand il y a une fonctionnalité utilisée plusieurs fois, on fait un service qui est réutilisable.

On code à un seul endroit, à un seul module. Avantage : pas besoin de recoder

**Convention de nommage :** un nom significatif de la couverture fonctionnelle portée par l'application. Toute référence à une technologie est à éviter sinon à proscrire.

#### DIFFERENCE ENTRE SERVICE APPLICATIF ET APPLICATION
La différence essentielle est que le service n'est pas déployable indépendamment de l'application qui le définit. Le service application peut être utilisé par une autre application = **réutilisable**.

#### SOUS-APPLICATION ET SOUS-SERVICE APPLICATIF
Sous-application : L’application peut être décomposée en sous-applications dédiées à un périmètre fonctionnel sous-ensemble du périmètre couvert par l’application de plus haut niveau, afin d’obtenir un regroupement cohérent de fonctionnalités.

Sous-service applicatifs : Une application ou une sous-application peut être décomposée en services applicatifs et selon le même principe, un service peut être décomposé en sous-services applicatifs dédiés à un périmètre fonctionnel sous-ensemble du périmètre couvert par le service.

Par exemple, odoo, erp, sap, etc.

#### BASE DE DONNEES LOGIQUE
![04 - notation bdd](img/couche-applicative/04-notation-bdd.jpg?raw=true)

Un ensemble de données organisées indépendamment de son support physique (fichier, structure XML, base relationnelle,…).

Sa structure peut être décrite de manière logique via un modèle de données.

La modélisation des données ne sera pas abordée dans ce cours.
Cependant, on s'intéresse ici à l'identification des grandes ensembles de données ayant un intérêt pour le domaine fonctionnel étudié.
En particulier les données référentielles

Comme les données référentielles mais on peut aller plus en détails

**Convention de nommage :** un nom significatif de la nature des informations contenues. Eviter toute référence au support physique.

#### LES CARTES DE LA COUCHE APPLICATIVE

Sur la couche applicatif, on fait 3 cartes différentes(de plus général au plus particulier)

- Diagramme d'environnement d'application
- Arbre applicatif
- Diagramme d'architecture applicative interne

#### DIAGRAMME D'ENVIRONNEMENT D'APPLICATION

![05 - diagramme d'environnement d'application](img/couche-applicative/05-diagramme-environnement-app.jpg?raw=true)

Un diagramme d'environnement d'application est centré sur une seule application.

Il est utilisé pour replacer l’application dans son environnement sans prendre en considération son architecture interne (sous-applications, services applicatifs).

Il représente toutes les interactions de l’application décrite avec les autres applications.

Ce diagramme est composé de l'application qu'il décrit ainsi que : des applications et acteurs qui échangent des flux d'information des messages qui décrivent les flux d'information échangés.

Comme le processus de métiers. on regarde tous ce qui rentre et tous ce qui sort.

Ne pas oublier de mettre la nature de l'information (label). La nature des messages sont des noms et non pas des verbes.

#### ARBRE APPLICATIF

![06 - arbre applicatif](img/couche-applicative/06-arbre-app.jpg?raw=true)

Un arbre applicatif est un diagramme centré sur une seule application.
Il est permet une représentation synthétique et hiérarchique de la décomposition d’une application en :
- sous-applications
- et en services applicatifs mettant en œuvre les fonctionnalités (au niveau le plus bas).
C’est une vue statique, qui permet potentiellement d’identifier les fonctionnalités fournies par chacun des sous-applications ou des services.
Il peut être composé de :
- sous-applications
- services applicatifs
- fonctionnalités

Une app n'a pas forcement des sous-app. On trouve les fonctionnalités on le trouve dans les cartes fonctionnelles(couche fonctionnelle).

![07 - couche app](img/couche-applicative/07-couche-app.jpg?raw=true)

#### DIAGRAMME D'ARCHITECURE APPLICATIVE INTERNE
Un diagramme d'architecture applicative interne est centré sur une seule application. Il est utilisé pour décrire le fonctionnement interne de l’application. On s'interesse à comment l'app fonctionne

Les objets qui apparaissent dans ce diagramme sont :
- les sous-applications
- les services applicatifs définis et utilisés
- les bases de données logiques lues et mises à jour
- les messages qui représentent des flux de données internes entre composants

Un service applicatif est défini au sein d'une et une seule application.
En revanche, il peut être utilisé par plusieurs autres applications.

Recommandations :
- Positionner les services définis dans l'application décrite
- Positionner les services utilisés à l'extérieur de l'application décrite
- L'application qui définit un service qui est utilisé doit se retrouver dans le diagramme d'environnement de l'application

![08 - diagramme d'architecture applicative interne](img/couche-applicative/08-diagramme-arch-app-interne.jpg?raw=true)

#### REGLES DE MODELISATION
**[RM11]** Un service applicatif doit être défini par une seule application.

**[RM12]** Un service applicatif doit être utilisé par une ou plusieurs  applications.

**[RM13]** Chaque base de données logique doit être décrite par un modèle de données qui lui est rattaché.

**[RM14]** Complétude et cohérence des flux d'information entre le diagramme d'environnement d'application et le diagramme d'architecture applicative interne
Il faut vérifier la complétude et la cohérence des flux de message par rapport à l'application  :
- Tous les flux en entrée de l'application doivent être déclencheur d'au moins un traitement (sous-application ou service applicatif)
- Tous les flux en sortie doivent être produits par au moins un traitement (sous-application ou service applicatif)  

En revanche, un traitement peut produire un résultat intermédiaire qui déclenchera une autre traitement.

#### PRINCIPES D'URBANISATION
**[PU5]** Une architecture orientée services
Lors de la conception d'une nouvelle application, sa structuration doit s'inscrire dans la démarche SOA.

**[PU6]** Unicité de la localisation d'une informationUne information doit être gérée en un point unique du système informatique.

Il peut exister des copies des informations pour assurer l'archivage, certains recoupements en temps différé ou d'autres raisons. Ces copies sont destinées à des fins de consultation et non à des fins opérationnelles.

**[PU7]** Unicité de l'implémentation d'une fonctionnalité Une fonctionnalité est implémentée par une seule application ou un seul service applicatif.

**[PU8]** Réutilisation des services applicatifsNe pas dupliquer les composants informatiques.

**Corollaire**

Corollaire des principes d'urbanisation [PU2] et [PU4] (couche fonctionnelle) et du [PU7] (couche applicative) :  

**Une fonctionnalité doit être implémentée par une seule application ou un seul service applicatif.**

![09](img/couche-applicative/09.jpg?raw=true)

#### CARTOGRAPHIE LA COUCHE APPLICATIVE
1. Cartographie de la future solution informatique (la cible)
2. Cartographie de l'existant

Contexte : une nouvelle application est à concevoir et à intégrer dans un système informatique existant.

Pré requis : avoir les besoins de la couche métier et de la couche fonctionnelle c'est-à-dire:
- les diagrammes de processus organisationnels
- la carte de capacité fonctionnelle

1ère étape : Décrire les flux d'information entrants et sortants de l'application (exigences envers les interfaces)
Il s'agit de produire le diagramme d'environnement d'application de la future application

Responsable : Architecte solution avec l'appui de l'analyste fonctionnel

2ème étape : A partir des fonctionnalités, structurer la future application en sous-applications et/ou services applicatifs
Les fonctionnalités identifiées dans la carte capacitaire fonctionnelle sont, si nécessaires, complétées ou affinées.

Réutiliser les services applicatifs déjà existants (selon le principe d'urbanisation PU3)

Cette étape permet de produire l'arbre applicatif de la future application

Responsable : Architecte solution avec l'appui de l'analyste fonctionnel

3ème étape : Décrire le fonctionnement de la future application
Décrire les services définis et identifier les services utilisés.

Décrire les bases de données logiques de la future application.

Cette étape permet de produire le diagramme d'architecture applicative interne de la future application

Responsable : Architecte solution

#### CARTOGRAPHIER L'EXISTANT
Contexte : cartographier les applications existantes d'un domaine donné.

Pré requis : aucun. C'est-à-dire que la cartographie de l'existant peut commencer par la couche applicative.

1ère étape : recenser et identifier les applications existantes
Positionner les applications existantes dans une carte capacitaire applicative selon un découpage fonctionnelle que l'on affinera au fur et à mesure.

Responsable : Conseiller en SI ou AMOA.

2ème étape : pour chaque application importante, établir :
- un diagramme d'environnement d'application
- un arbre applicatif et découvrir les fonctionnalités de l'application
- un diagramme d'architecture applicative interne qu'il faudra mettre en cohérence avec les autres diagrammes.


3ème étape : construire en parallèle les cartes de capacité fonctionnelle et applicative
En fonction des diagrammes applicatifs élaborés, afin de garantir la cohérence de l'ensemble.

Responsable : Architecte solution avec l'appui de l'analyste fonctionnel

# COUCHE INFRASTRUCTURE TECHNIQUE

![01 - couche IT](img/couche-it/01-couche-it.jpg?raw=true)

#### OBJECTIFS
La couche IT répond à la question "Avec quoi ?" sans tenir compte des acteurs et de l'organisation.

La couche IT a pour objectif d'identifier et de décrire les ressources matérielles (serveurs, postes de travail,…), les réseaux qui relient les machines où sont installés les applications, leurs services applicatifs et les bases de données.

La couche IT permet aussi de suivre le déploiement des applications et des services applicatifs sur les différents sites de l'entreprise.

La couche IT est décrite par les architectes système et leur permet d'analyser l'architecture technique dans le but de planifier des actions d'optimisation et de rationalisation des ressources matérielles.

#### LES CONCEPTS
- Site
- Serveur
- Réseau
- Base de données (physique)
- Poste de travail

#### SITE
![02 - notation site](img/couche-it/02-notation-site.jpg?raw=true)

Un site est un lieu géographique où est implantée l'entreprise. Les sites peuvent être des sites-types tels que le siège, l'agence, l'usine, ou des lieux géographiques précis comme l'agence de Genève, l'usine de Nyon, …



**Convention de nommage** : un nom significatif du lieu géographique et si possible du type de site.

#### SERVEUR
![03 - notation serveur](img/couche-it/03-notation-serveur.jpg?raw=true)

Un serveur est une ressource informatique matérielle sur laquelle des applications et des services applicatifs peuvent s'exécuter et qui fournit des moyens de stockage d'information (bases de données, système de gestion de fichiers,…)

#### RESEAU
![04 - notation reseau](img/couche-it/04-notation-reseau.jpg?raw=true)

Un réseau est un système d'ordinateurs géographiquement éloignés les uns des autres, interconnectés par des télécommunications, généralement permanentes.

#### BASE DE DONNEES PHYSIQUE
![05 - notation base de données](img/couche-it/05-notation-bdd.jpg?raw=true)

Une base de données (physique) représente le support physique (fichier, …) d'une base de données logique.
Dans le contexte d'une infrastructure technique, il faut préciser le type de SGBD ou de support physique.

#### POSTE DE TRAVAIL
![06 - notation poste de travail](img/couche-it/06-notation-poste-de-travail.jpg?raw=true)

Un poste de travail est une ressource informatique matérielle permettant à un utilisateur final d'exécuter des applications.

#### LA CARTE DE LA COUCHE IT
- Diagramme d'infrastructure technique

Un diagramme d'infrastructure technique est la représentation graphique de l'infrastructure technique.

Les objets qui apparaissent dans ce diagramme sont :
- les sites
- les serveurs
- les réseaux
- les bases de données
- les postes de travail
- les applications et leurs services applicatifs
- les connexions entre ces objets

![07 - carte it](img/couche-it/07-carte-it.jpg?raw=true)

**[RM15]** Chaque application doit être hébergée soit sur un serveur soit sur un poste de travail.
**[RM16]** Chaque base de données physique doit être hébergée sur un serveur.
**[RM17]** Les accès entre applications et base de données sont spécifiés dans le diagramme d'architecture applicative interne, et pas dans le diagramme d'infrastructure technique
