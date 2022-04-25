# 626-1 Génie Logiciel

# Lecture 1
#### jeudi 24 février 2022

**Architecting systems** : determine les performances, coûts, risques, tendances economique, mouvement concurrents, "ilities"...
- **ilities** : ce sont des NFR (Non-functional requirement) tel que "availability", "operability", "manufacturability", ""survivability".

## Designing the high level architecture
![Designing the high level architecture](img/lecture1/designing-high-levl-architecture.jpg)

## Designing the high level architecture : based on NFR - 2 concepts
1. **Architectural tactic** : une décision de conception qui permet d'obtenir une réponse spécifique en terme d'attributs de qualité (Quality attribute), fait par un "quality-attribute analysis model".
2. **Architectural pattern (architectural style)** :  une schema d'organisation structurelle fondamentaux pour les systèmes logiciels qui fournit un ensemble de sous-systèmes prédéfinis en spécifiant leurs responsabilités, les règles et lignes directives pour organiser les relations entre eux.

#### Vue d'ensemble : architecting steps
![Overwie - architecting steps]

- on utilise des tactics pour améliorer un design patterns
- low level architecture : design plus détaillés par exemple Builder, Factory...

## QA : performance
- Combien de temps le système met-il à réagir à un événement (latence) ?  Source de complication : le nombre de sources d'événements et leur séquence d'arrivée.
- Source des problèmes de performance : disponibilité des ressources nécessaires (plus de RAM,CPU)

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

![Availability tactics](img/lecture1/availability-tactics.jpg?raw=true)

## Pourquoi la modifiabilité est-elle un problème ? Dépendances
![Pourquoi la modifiabilité est-elle un problème ? Dépendances](img/lecture1/modifiability-issue-dependencies.jpg?raw=true)

### Modifiability tactics
![Modifiability tactics](img/lecture1/modifiability-tactics.jpg?raw=true)

# Design in the large
![Design the large](img/lecture1/design-large.jpg?raw=true)

## Software architecure
- Plan de construction et d'évolution
  - abstraction - principales décisions de conception
- Pas seulement une question de conception
  - communiquer - visualiser - représenter - qualité
- Chaque application en a un, qui évolue
  - descriptive - prescriptive - dérive - érosion
- Pas une phase de développement

> A software system's architecture is the set of principal design decisions made about the system

![Abstraction](img/lecture1/abstraction.jpg?raw=true)

### When does software architecture start ?
![Start of software architecture start](img/lecture1/start-software-architecture.jpg?raw=true)

### When does software architecture stop ?
![Stop of software architecture start](img/lecture1/stop-architecture-software.jpg?raw=true)

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

![Model-View-Controller](img/lecture1/model-view-controller.jpg?raw=true)

#### Implemented tactics
Modifiability tactics : anticipe les changements attendus, sépare les préoccupations

![Exemple : servlet](img/lecture1/exemple-servlet.jpg?raw=true)

![Exemple - votations](img/lecture1/exemple-votations.jpg?raw=true)

#### Problem  
Les interfaces utilisateur sont les plus fréquemment touchées par les changements.
- Comment puis-je représenter la même information de différentes manières ?
- Comment puis-je garantir que les modifications apportées à l'ensemble de données seront instantanément dans toutes les vues ?
- Comment puis-je modifier l'interface utilisateur ? (éventuellement au moment de l'exécution)
- Comment prendre en charge plusieurs interfaces utilisateur sans modifier le cœur de l'application ?
de l'application ?

#### Solution
Le modèle Model-view-controller divise l'application en trois parties :
- Le modèle est responsable du traitement,
- La vue s'occupe de la sortie,
- Le contrôleur s'occupe de l'entrée

#### Structure
![Structure Model-View-Controller](img/lecture1/model-view-controller.jpg?raw=true)

![Structure 2](img/lecture1/structure2-model-view-controller.jpg?raw=true)

- Chaque model peut enregistrer plusieurs observateurs (vues et contrôleurs).
- Dès que le modèle change, tous les observateurs enregistrés sont notifiés, et ils se mettent à jour en conséquence.

#### Participants - Model
Le modèle encapsule les données et les fonctionnalités de base ; il est indépendant de toute représentation concrète de sortie ou de tout comportement d'entrée.

![Particpant - model](img/lecture1/participant-model.jpg?raw=true)

#### Participants - View
La vue affiche les informations à l'utilisateur. Un modèle peut avoir plusieurs
vues.

![Participant - view](img/lecture1/participants-view.jpg?raw=true)

#### Participants - Controller
Le contrôleur traite les entrées et invoque les services appropriés de la vue ou du modèle. Chaque contrôleur est assigné à une seule vue ; un modèle peut avoir plusieurs contrôleurs.

![Participant - controller](img/lecture1/participants-controller.jpg?raw=true)

#### Dynamic Behaviour

![Dynamic Behaviour](img/lecture1/dynamic-behaviour.jpg?raw=true)

#### Consequences of the Model-View-Controller Pattern
Avantages :
- vues multiples du même système
- vues synchrones
- vues et contrôleurs attachables
Inconvénients
- complexité accrue
- couplage fort entre le modèle et la vue
- couplage fort entre le modèle et les contrôleurs (peut être évité au moyen de moyen du patron de commande)

Applications connues : Bibliothèques d'interface graphique, Smalltalk, Microsoft Foundation Classes

## Publish-subscribe
![Publish-subscribe](img/lecture1/publish-subscribe.jpg?raw=true)

#### Implemented Tactics
Tactiques de modifiabilité :
- Restreindre les voies de communication
- Utiliser un intermédiaire
- Normaliser la collaboration

#### Problem : point à point communication entre les composants
![Problem : point à point communication entre les composants](img/lecture1/problem-pp-communication-entre-composants.jpg?raw=true)


#### Problem : trop de chemins de communications
![Problem : trop de chemins de communications](img/lecture1/poblem-bcp-chemin-communications.jpg?raw=true)

## Façade
![Facade](img/lecture1/facade.jpg?raw=trues)

#### Implemented tactics
Tactiques de modifiabilité
- Cacher l'information
- Restreindre les voies de communication
- Utiliser un intermédiaire

#### Nouvelle architecture : Facade et Proxy
![Facade et Proxy](img/lecture1/facade-proxy.jpg?raw=true)

![Layered vs plug-in](img/lecture1/layered-vs-plugin.jpg?raw=true)

#### Layers
![Layers](img/lecture1/layers.jpg?raw=true)

Choisir les couches:
- Définir le critère d'abstraction (préoccupation) que chaque couche fournit (cibles)
  - Changements potentiels
  - Opportunités de réutilisation
  - Catégorie de responsabilités
- Choisir le nombre de couches
  - Niveaux d'abstraction / nombre de catégories
  - Maintenir un nombre réduit de couches
   - Éviter les surcharges de performance
- Spécifier l'interface de chaque couche
  - Chaque couche doit représenter une boîte noire pour la couche supérieure.

#### Changement dans l'une des préoccupations : affichage, accès aux données
![Changement dans l'une des préoccupations : affichage, accès aux données](img/lecture1/change-concerns.jpg?raw=true)

#### Exemple
![exemple changement dans l'une des préoccupations](img/lecture1/exemple-change-concerns.jpg?raw=true)

#### Réprésentation Java
![Représentation Java du changement dans l'une des préoccupations](img/lecture1/java-representation-change-concerns.jpg?raw=true)

## Qu'est-ce que nous modélisons ?
- Le système à venir (modèle de conception)
 - Architecture statique
 - Architecture dynamique
- Attributs de qualité et propriétés non fonctionnelles
- Le problème (modèle de domaine)
- L'environnement (contexte du système et parties prenantes)
- Le processus de conception

#### Software components
![ Software components](img/lecture1/software-components.jpg?raw=true)

#### Components vs objects vs modules
Components :
- Encapsuler l'état et la fonctionnalité
- Grain grossier
- Éléments d'architecture de la boîte noire
- Structure de l'architecture
Objects :
- Encapsuler l'état et la fonctionnalité
- Grain fin
- Peuvent se "déplacer" entre les composants
- Unité d'instanciation identifiable
Modules
- Existent rarement au moment de l'exécution
- Peuvent nécessiter d'autres modules pour être compilés
- Emballer le code

#### Component Interfaces
![Component Interfaces](img/lecture1/component-interfaces.jpg?raw=true)

Provided interfaces : Spécifier et documenter les fonctionnalités visibles de l'extérieur (ou l'API publique) offertes par le composant.
- Types de données et modèle
- Opérations
- Propriétés
- Événements et rappels

Required interfaces : Spécifier les conditions dans lesquelles un composant peut être réutilisé
- La plate-forme est compatible
- L'environnement est correctement configuré

#### Compatible interfaces
Les interfaces des composants doivent correspondre parfaitement pour être  connectées.

![Compatible Interfaces](img/lecture1/compatible-interfaces.jpg?raw=true)

#### Software Connectors
![Software Connectors](img/lecture1/software-connectors.jpg?raw=true)
Modéliser les aspects statiques et dynamiques de interaction entre les interfaces des composants.
- Les connecteurs ne sont généralement pas directement visibles dans le code, ce qui n'est pas le cas des composants.
- Les connecteurs sont le plus souvent indépendants de l'application, alors que les composants peuvent être à la fois dépendants ou non de l'application

#### Connector Roles
- Communication : fourniture de données et transfert de contrôle, prise en charge de différents mécanismes de communication, qualité de la fourniture de données et du transfert de contrôle. mécanismes de communication, qualité de la livraison
- Coordination : contrôle de la transmission des données, séparation du contrôle et du calcul.
- Conversion : permettre l'interaction de composants mal adaptés
- Facilitation : médiation de l'interaction entre les composants, gestion de l'accès aux l'accès aux informations partagées, assure la synchronisation

## View and Viewpoints
How many views ?
- 5 par Taylor et al : Logique, Physique, Déploiement, Concurrence, Comportemental
- 3 par Bass et al : Composant et connecteur, module Vue, Comportement
- 4+1 par Kruchten : Logique, physique, processus, Développement, et Scénario

#### Historical model: Kruchten’s 4+1 views (RUP)
![Historical model](img/lecture1/historical-model.jpg?raw=true)

#### Logical view
![Logical view](img/lecture1/logical-view.jpg?raw=true)

#### Development view
![Development view](img/lecture1/development-view.jpg?raw=true)

#### Process view
![ Process view](img/lecture1/process-view.jpg?raw=true)

#### Physical view
![Physical view](img/lecture1/physical-view-last.jpg?raw=true)

## Use Case Scenarios
- Unifier et relier les éléments des 4 autres vues
- Les scénarios permettent de s'assurer que le modèle architectural est complet par rapport aux exigences
- L'architecture peut être décomposée en fonction des les scénarios et illustrée à l'aide des 4 autres vues

## Music Player Scenarios
- Rechercher de nouvelles chansons
- Payer pour écouter la chanson en entier
- Télécharger la chanson achetée sur le téléphone
- Écouter la chanson

## Logical View
![Logical view - music player](img/lecture1/logical-view-music-player.jpg?raw=true)

- Décomposer la structure du système en logiciels composants et connecteurs
- Faire correspondre les fonctionnalités (cas d'utilisation) aux composants
- **Concerne** : Fonctionnalité
- **Public cible** : Développeurs et utilisateurs


## Process view
![use Case : Browse, Pay, Play for Songs]

- Modéliser les aspects dynamiques de l'architecture et le comportement de ses parties
  - composants actifs
  - les threads concurrents
- Décrire comment les processus/threads communiquent
  - RPC
  - Bus de messages
- **Concerne** : Fonctionnalité, performance
- **Public cible** : Développeurs

## Development view
![Development view last]
- Organisation statique des artefacts du code logiciel
  - paquets
  - modules
  - binaires
- Correspondance entre les éléments de la vue logique et les artefacts de code
- **Concerne** : Réutilisation, portabilité, construction
- **Public cible** : Développeurs

## Physical view
![Physical view last]
- Environnement matériel dans lequel le logiciel sera déployé
  - hôtes
  - réseaux
  - stockage
- Correspondance entre les entités logiques et physiques
- **Concerne** : Attributs de qualité
- **Public cible** : Opérations

## Reuse and Libraries
Est-il possible de réutiliser des classes existantes ? Il est possible que des classes d'adaptation soient nécessaires.

# Quality Attributes with REST

Fonctionnalité pour la performance : statelessness, interface uniforme, adressabilité
Statelessness permet la tactique suivante : "Introduire la concurrence".
  - Puisque les demandes peuvent être traitées de manière isolée, indépendamment des demandes précédentes, elles peuvent être distribuées sur plusieurs machines sans impact sur le résultat du traitement.
  - Permet de comprendre chaque demande de manière isolée. En effet, tout le contexte pour interpréter une demande est dans la demande.
Interface uniforme et adressabilité : Permet la visibilité et la simplicité du protocole. Chaque demande est transparente (facilement interprétable)

#### Statelessness
Etat : configuration interne d'un système qui spécifie la réponse à l'événement qu'il reçoit.

2 types d'états :
- **L'état de la ressource** : configuration d'une ressource sur le serveur qui est disponible pour tous les clients. Cela détermine quelle représentation on peut obtenir de la ressource.
- **L'état du client** : la configuration du client qui détermine la prochaine requête qu'il pourrait émettre ensuite (suite à une entrée utilisateur par exemple). On l'appelle aussi **l'état de l'application**.





# SESSION  5














































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

#### jeudi 4 avril 2022
s3
soa : service oriented Architecture

s7
monolithic : utilisation d'un seul services, pas adapbtable et escalable
soa : niveau entreprise, on crée une application basée sur plusieurs services
microservices : on crée un seul service, une seule Application basée sur les services

s21
- on doit encapsuler la bdd pour chaque service car si on veut changer les données pour le service1 ca pourrait impacter le service 2 si on utilises la meme bdd

##### representation
- avantages,
- qa
- system design : haut niveau


#### jeudi 14 avril 2022 - lecture note 7
