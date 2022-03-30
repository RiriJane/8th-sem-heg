# 626-1 Urbanisation

Introduction
#### jeudi 24 février 2022


![Diagramme système d'infomatique et information]
## Système d'information (SI)
- question qui peut sortit à l'examen
- l'ensemble de moyens (humain, organisationnel, logiciel, materiel) qui peut gérer l'information
  - gerer : 
    - acquérir, collecter
    - stocker
    - traiter : exploiter, transformer, modifier, supprimer
    - communiquer
    - archiver
    - détruire
    - sécurité

## Système informatique
- ensemble des moyens informatiques et de télécommunication qui permet de gérer des données de manière électronique (voir définition de gérer au dessus)

## donnée et information
- une donnée est un élément brut sans interprétation
- une information est une donnée interprétée

## Le contexte d'évolution des systèmes d'information
### Evolution technologique
![Explosion du numérique]


## Principaux problèmes
- le coûts de maintenance, couvre une grande partie du budget de l'entreprise
- peu évolutif

## Besoins
- maîtriser le SI existant
- rendre cohérent
- le simplifier
- le rendre agile pour faciliter l'évolution
- l''aligner sur le métier

## La propodition de l'urbanisationdes SI
- appelé aussi architecture d'entreprise

## Urbanisation du système d'information
![Une démarche progressive du SI]
- une démarche de transformation progressive et continue du SI
- elle vise à simplifier le SI, optimiser sa valeur ajoutée, rendre plus adaptable et plus flexible selon l'évolution stratégique de l'entreprise, tout en prenant en compte les technologies du marché

## Objectifs
- soutenir et accompagner la stratégie d'entreprise
- faciliter la transofrmation continue du SI de manière réactive et flexible en maitrisant les impacts
- clarifier les attentes et valeur ajoutée des différentes parties du SI

## Urbanisation des SI et Architecture d'entreprise
- urbanisation est une des activtiés de l'architecture d'entreprise

## Approche par les modèles
- avant de prendre une décision, il faut comprendre le contexte 
- un modèle : représentation simplifié de la réalité
  - comprendre un système complexe
  - facilité la communication - plus facile de faire des explications concernant le système
  - présenter des perspectives différentes


## Cartographie
- ensemble de modèles qui représentent les différents objets du SI
- permet de comprendre l'organisation

## 4 couches de réference
![4 couches de réference]
**métier** : quel métier ? qui fait quoi ? Cartographie métier selon BMPN
**fonctionnelle** : quel outils utiles au métier ? cartographie fonctionnelle
- fait le lien entre le metier et l'informatique
-
**applicative** : quels sont les applications, comment elle fonctionne ? cartgraphie applicative
**technologique** : 

- permet d'analyser chaque niveau sans se soucier des autres niveaux
- modèle agile : le travail de cartographie peut commencer à n'importe quel niveau
- 

## 5ième couche : stratégie
![5ième couche : stratégie]
- au dessous de la couche métier


## exercice quizz
1. infrastructure technique
2. métier
3. fonctionnelle
4. métier
5. métier
6. infrastructure technique

## Gestion de risques
stratégie : direction générale
métier : responsable métiers
fonctionnelle : une équipe assistance MOA
applicative : responsable informatique
infrastructure technique : responsable informatique

- les risques peuvent être de n'importe quel niveau
- la responsable de risque est responsable de la gestion des risques

## démarche urbanisation outillée
- il existe plusieurs outils d'architechture d'entreprise



#### jeudi 3 mars 2022

![cartographie métier - organigramme d'acteur]

- manque RM01 : directuer général -> selon le texte; soit on remplace ceci par le nom de l'entreprise soit une autre carré au dessus de ceci avec le nom de l'entreprise


#### Processus métier
- un enchaînement ordonné d'activités aboutissant à un résultat déterminé



#### jeudi 10 mars 2022

#### retour tp01
- attention il faut que ça soit lisible. Un diagramme si lit de haut en bas et de gauche à droite.
- faut pas oublier la regle : titre
- soit service soit rôle
- garder même niveau granulité

macro :
- input et output seulement
- mettre à l'infinitif

#### couche metier - 2

3 catégories de concepts BPMN
1. Les objets étapes
2. objets connexion
- séquence : exprimer un ordre des activités
- message : échange entre les procususs
3. objets de collaboration

Les marqueurs d'objet BPMN

Les 3 niveaux de conformité

types de processus : on fait que métier et organisationnelle
processus métier : indépendent de l'organisation
- écrit de manière conceptuelle

processus organisationnel : dépendent de l'organisation
- qui fait quoi et comment
- 

difference entre métier et organisationnel
- métier : quoi
- organisationnel : qui fait quoi, quand, comment et ou


Activité dans la norme BPMN
- pas utiliser le verne "gérer" car cela veut dire tout et rien


#### jeudi 17 mars 2022 
-Evenement de type signal

Evenement de type signal
![symbol signal]

Passerelle (ou branchement)
- objet de modélisation essential en BPMN
- ne fait pas de tâche, juste un lieu où une décision est prise en fonction du flux d'entrée
- losange : permet d'identifier le comportement de la passerelle


s. 62 : permet de diviser une décision après une tâche
- permet de rassembler plusieurs chemins pour déclencher une tâche

s. 63
une tâche doit être déclenchée par un seul flux
- tâche D on sait pas si c'est déclenchée par tâche B ou tâche C

s.64
- on fait pas le complexe

s.65
exclusif : 1 seul des trajets 

s.66
inclusif : une ou plusieurs réponses
- on peut déclencher toutes les combinaisons possibles

s.67
et : on déclenche toutes les tâches en liens

s.68
ou + attente d'un evenement : 
- evenement : flux de séquences
- pas possible que D n'a pas d'événements, da,s ce cas on mets D derrière à

s.70
- on peut faire 2 passerelles à la suite
img 2: permet de reunir les flux et ensuite de les séparer
- on peut avoir plus que 2 tâches qui arrive sur une passerelle, après ca dépend quel passerelle

71
1. identifier les participants au processus
- acteurs externes et internes, les gens qui réalisent les processus/tâches = des acteurs internes
- acteurs interne: on les a dans l'organigramme

# corrigé tps 2
- pas d'acteurs externes
- pas de légende sur les fleches interieures
- processus en bleu et sous processus, processus orga -> rose
- acteur externes vert et acteur interne en bleu
- processus métier macro : boîte noire
    - on s'interesse à des actions qui rentrent dans mon procesuss macro et ce qui en sortent
    - permet d'identifier les déclencheurs
- ouvrir la boite noire et regarder les grands activités : sous-processus
    - un fournisseur qui livre un produit, ou est-ce que ca va arriver ? quel macro activité est declencher et produit
    le resultat
    - on commence toujours dans le global et rentre de plus en plus en détail (étape/etages)
    - dans un sous processus on doit pas voir les evenements et les passerelles -> sinon processus organisationnel
- un flux ne va que dans un sens
- flux et échange de messages ne sont pas les mêmes
- flux d'un acteur à processus -> fleches avec des traitrillet, sinon dans les sous-processus, on utilise une fleche entière
- attention à la lisibilité des flèches, faut que les fleches soit intuitive à comprendre
- les fleches qu'on voit se sont des flux de messages et non pas de flux de séquences


# *********************************************************** 24 mzrs 2022
626-1 couche métier – part 4 -
Objet de données 
Un objet de données représente des informations circulant tout au long des processus tels que des documents 

Une base de données est un endroit où le processus peut lire et écrire des données. Elle persiste au-delà de la durée de vie du processus

Artefact
un artéfact est une précision, une information supplémentaire graphique ou textuelle apportée à un diagramme.
une annotation
un regroupement : rassemble graphiquement un ensemble d'éléments ayant une relation sémantique,  pour le visuel uniquement
Les 2 catégories de diagrammes 
Diagramme de collaboration : permet de représenter les interactions entre un processus et son environnement en spécifiant les messages échangés.
Processus métier 
Processus organisationnel
Sous-processus
Participant (avec acteur externe)
Flux de message
Flux de séquence 


(i started noting here)

Les 2 catégories de diagrammes 
2.  Diagramme d'orchestration (ou diagramme de flux de séquence) : décrit la séquence du processus du début à la fin avec les concepts de : 
Processus organisationnel
Participant (acteur interne)
Opération (ou tâche)
Flux de message
Flux de séquence
Événement 
Passerelle
Piscine et couloir   


Exemple 1
Diagramme de collaboration : 1er niveau le macro-processus


Exemple 2
Diagramme de collaboration : 2ème niveau on décompose le processus en sous-processus. Pas de séquence entre processus mais des échanges de message 
-> sous-processus métier 
-> flux avec les boîtes bleus -> flux d'informations
    -> soit interne (entre les boîtes bleues), soit externe (interaction avec les acteurs clients)


Exemple 3
Diagramme d'orchestration : décrit la séquence des activités du début jusqu'à la fin. 
-> processus organisationnel du début jusqu'à la fin


Diagramme d'orchestration (ou diagramme de flux de séquence) 
[RM10] : Dans un diagramme de processus organisationnel, le flux de séquence ne doit pas s'interrompre, c’est-à-dire on doit pouvoir aller du début jusqu'à la fin, sans interruption dans la description de la séquence.
-> cad, on doit pouvoir suivre la fleche de début jusqu'à la fin'


Démarche de cartographie des processus métiers  du plus général au plus détaillé  
1. Organigramme d'acteur 
- Identifier les acteurs internes à l'organisation étudiée 
2. Diagramme de collaboration niveau 1 macro
- identifier les acteurs externes et les interactions (flux de messages)
3. Diagramme de collaboration niveau 2 sous-processus 
- Décomposer le macro processus en sous-processus
4. Diagramme d'orchestration processus organisationnels 
- Décomposer chaque sous-processus en une séquence de  processus organisationnels (boites roses)
-> on l'a pas fait
5. Diagramme d'orchestration pour chaque processus organisationnel 
- Pour chaque processus organisationnel, décrire la séquence de tâches 


Comment savoir si un diagramme est réussi ?
Dans la modélisation on recherche 2 qualités :
Conformité : 
Respect de toutes les règles de modélisation [RMxx] 
Respect des conventions de nommage
-> verbe à l'infinitif : processus, 
Respect des usages (couleurs, sens de modélisation, expliciter les événements de fin, et les informations portés par les flux d'information ) 

Pour la norme BPMN, l'utilisation d'un outil de modélisation aide à respecter la norme : 
- Camunda est conçu pour modéliser des diagrammes de processus organisationnels et ne permet pas de déroger à la norme BPMN
- MEGA Hopex, permet de modéliser l'ensemble des 4 couches de référence et offre la possibilité d'utiliser le "règlement BPMN" qui signale les erreurs de modélisation sur un diagramme de processus organisationnel. 
Comment savoir si un diagramme est réussi ?


Lisibilité des diagrammes : 
La modélisation est aussi un acte de communication. Une cartographie doit être le plus lisible possible tant sur le fond que sur la forme : 
De gauche à droite, de haut en bas
Éviter les croisements de flux ou de messages 
Indiquer systématiquement le titre du diagramme

626-1 couche métier – fin part 4

CC : de début jusqu'à cours 24 mars 2022
-> 90 minutes (pas sûr)

-> corrig tp03
- faire les exercices à part
- les messages doivent avoir une fin
- activités = actions = tâches = infinitif
- ne pas oublier le début + utiliser l'élément pour réprésenter le début
- il faut nommer la fin
- pas de flux de messages entre les acteurs externes, on s'intéresse que à l'interne
- les flux de messages on utilise pas de verbe 




















