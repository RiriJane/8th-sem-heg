# 626-1 Génie Logiciel

# Lecture 1
#### jeudi 24 février 2022

**Architecting systems** : determine les performances, coûts, risques, tendances economique, mouvement concurrents, "ilities"...
- **ilities** : ce sont des NFR (Non-functional requirement) tel que "availability", "operability", "manufacturability", ""survivability".

## Designing the high level architecture
![Designing the high level architecture](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/designing-high-levl-architecture.jpg?raw=true)

## Designing the high level architecture : based on NFR - 2 concepts
1. **Architectural tactic** : une décision de conception qui permet d'obtenir une réponse spécifique en terme d'attributs de qualité (Quality attribute), fait par un "quality-attribute analysis model".
2. **Architectural pattern (architectural style)** :  une schema d'organisation structurelle fondamentaux pour les systèmes logiciels qui fournit un ensemble de sous-systèmes prédéfinis en spécifiant leurs responsabilités, les règles et lignes directives pour organiser les relations entre eux.

#### Vue d'ensemble : architecting steps

## QA : performance
- Combien de temps le système met-il à réagir à un événement (latence) ?  Source de complication : le nombre de sources d'événements et leur séquence d'arrivée.
- Source des problèmes de performance : disponibilité des ressources nécessaires.

## Performance tactics
#### Demande de ressources
- Augmenter l'efficacité des calculs (meilleurs algorithmes)
- Réduire la charge de calcul (ne pas gaspiller le temps du processeur)
- Gérer le taux d'événements (limiter les besoins de calcul)
#### Gestion des ressources
- Introduire la concurrence (threads)
- Maintien de plusieurs copies de données ou de calcul (cache)
#### Arbitrage des ressources
- First in, first out
- Ordonnancement à priorité fixe

## Availability tactics
La disponibilité concerne les défaillances du système et leurs conséquences.
- Une défaillance se produit lorsque **le système ne fournit plus un service** conforme à ses spécifications.
- Un défaut devient une défaillance lorsqu'il est observable par l'utilisateur du système. 
  - Alors, une façon d'éviter une défaillance est de détecter et de corriger une défaillance avant qu'elle ne devienne observable par l'utilisateur. 

![Availability tactics](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/availability-tactics.jpg?raw=true)

## Pourquoi la modifiabilité est-elle un problème ? Dépendances
![Pourquoi la modifiabilité est-elle un problème ? Dépendances](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/modifiability-issue-dependencies.jpg?raw=true)

### Modifiability tactics
![Modifiability tactics](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/modifiability-tactics.jpg?raw=true)

# Design in the large
![Design the large](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/design-large.jpg?raw=true)

## Software architecure
- Plan de construction et d'évolution
  - abstraction - principales décisions de conception
- Pas seulement une question de conception
  - communiquer - visualiser - représenter - qualité
- Chaque application en a un, qui évolue
  - descriptive - prescriptive - dérive - érosion
- Pas une phase de développement

> A software system's architecture is the set of principal design decisions made about the system

![Abstraction](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/abstraction.jpg?raw=true)

### When does software architecture start ?
![Start of software architecture start](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/start-software-architecture.jpg?raw=true)

### When does software architecture stop ?
![Stop of software architecture start](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/stop-architecture-software.jpg?raw=true)

## What makes a good architecture ?
- Il n'existe pas de conception parfaite ni une bonne/mauvaise architecture
- Adaptée à un certain objectif et dépendante du contexte.
- Principes, lignes directrices et utilisation de l'expérience collective (méthode)

Principes de conception - Arch. Modèles - Arch. Styles

## Design Principles
- abstraction
- encapsulation - séparation des préoccupations
- modularisation
- KISS (keep it simple, stupid)
- DRY (Don't repeat yourself)

# Architectural patterns
> An architectural pattern is a set of architectural design decisions that are applicable to a recurrring design problem, and parameterized to account for different software development contexts in which that problem appears.

Problem : traitement complexe avec plusieurs niveaux d'abstraction de inputs/outputs

## Model-View-Controller
- plus connu dans l'archecture des systèmes intéractifs

![Model-View-Controller](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/model-view-controller.jpg?raw=true)

### Implemented tactics
Modifiability tactics : anticipe les changements attendus, sépare les préoccupations

![Exemple : servlet](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/exemple-servlet.jpg?raw=true)

![Exemple - votations](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/exemple-votations.jpg?raw=true)

### Problem  
Les interfaces utilisateur sont les plus fréquemment touchées par les changements.
- Comment puis-je représenter la même information de différentes manières ?
- Comment puis-je garantir que les modifications apportées à l'ensemble de données seront instantanément dans toutes les vues ?
- Comment puis-je modifier l'interface utilisateur ? (éventuellement au moment de l'exécution)
- Comment prendre en charge plusieurs interfaces utilisateur sans modifier le cœur de l'application ?
de l'application ?

### Solution
Le modèle Model-view-controller divise l'application en trois parties :
- Le modèle est responsable du traitement,
- La vue s'occupe de la sortie,
- Le contrôleur s'occupe de l'entrée

### Structure
![Structure Model-View-Controller](https://github.com/RiriJane/8th-sem-heg/blob/master/626-1_Architecture_sys_info/G%C3%A9nie%20Logiciel/img/lecture1/model-view-controller.jpg?raw=true)


#### jeudi 17 march 2022
#### Collection pattern
problem : comment traiter l'ensemble d'objets et de passer à une autre service



#### Architecture
- on veut séparer la couche de transport et la couche de business car on a pas nécessairement besoin de passer des informations de la couche de business
- on évite de faire des annotations dans la couche de business, ca sera dans la couche de transport

#### FEED
- une collection d'entry ou des objects
- entry est une collection dans la collection feed
- on utilise un lien qui se réfère à un autre entry et non pas directement sur les données
    - lien self : adresse de la réprésentation de la source
    - lien alternative

#### Reminder ATOM : minimal UML model
- fullEntry : si true, il faut toutes les données sinon on ajoute encore un lien
