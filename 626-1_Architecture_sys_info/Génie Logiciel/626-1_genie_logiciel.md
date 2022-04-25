# 626-1 GENIE LOGICIEL

# LECTURE NOTE 1 - ARCHITECTING SYSTEMS
#### jeudi 24 février 2022

**Architecting systems** : determine les performances, coûts, risques, tendances economique, mouvement concurrents, "ilities"...
- **ilities** : ce sont des NFR (Non-functional requirement) tel que "availability", "operability", "manufacturability", ""survivability".

## DESIGNING THE HIGH LEVEL ARCHITECTURE
![Designing the high level architecture](img/lecture1/designing-high-levl-architecture.jpg)

#### DESIGNING THE HIGH LEVEL ARCHITECTURE : BASED ON NFR - 2 CONCEPTS
1. **Architectural tactic** : une décision de conception qui permet d'obtenir une réponse spécifique en terme d'attributs de qualité (Quality attribute), fait par un "quality-attribute analysis model".
2. **Architectural pattern (architectural style)** :  une schema d'organisation structurelle fondamentaux pour les systèmes logiciels qui fournit un ensemble de sous-systèmes prédéfinis en spécifiant leurs responsabilités, les règles et lignes directives pour organiser les relations entre eux.

#### VUE D'ENSEMBLE : ARCHITECTING STEPS
![Overview - architecting steps](img/lecture1/vue-ensemble-architecting-steps.jpg)

- on utilise des tactics pour améliorer un design patterns
- low level architecture : design plus détaillés par exemple Builder, Factory...

## QA : TACTICS
- Combien de temps le système met-il à réagir à un événement (latence) ?  Source de complication : le nombre de sources d'événements et leur séquence d'arrivée.
- Source des problèmes de performance : disponibilité des ressources nécessaires (plus de RAM,CPU)

## PERFORMANCE TACTICS
#### DEMANDE DES RESSOURCES
- Augmenter l'efficacité des calculs (meilleurs algorithmes)
- Réduire la charge de calcul (ne pas gaspiller le temps du processeur)
- Gérer le taux d'événements (limiter les besoins de calcul)
#### GESTION DES RESSOURCES
- Introduire la concurrence (threads)
- Maintien de plusieurs copies de données ou de calcul (cache)
#### ARBITRAGE DES RESSOURCES
- First in, first out
- Ordonnancement à priorité fixe

## AVAILABILITY TACTICS
La disponibilité concerne les défaillances du système et leurs conséquences.
- Une défaillance se produit lorsque **le système ne fournit plus un service** conforme à ses spécifications.
- Un défaut devient une défaillance lorsqu'il est observable par l'utilisateur du système.
  - Alors, une façon d'éviter une défaillance est de détecter et de corriger une défaillance avant qu'elle ne devienne observable par l'utilisateur.

![Availability tactics](img/lecture1/availability-tactics.jpg?raw=true)

## POURQUOI LA MODIFIABILITE EST-ELLE UN PROBLEME ? DEPENDANCES
![Pourquoi la modifiabilité est-elle un problème ? Dépendances](img/lecture1/modifiability-issue-dependencies.jpg?raw=true)

#### MODIFIABILITY TACTICS
![Modifiability tactics](img/lecture1/modifiability-tactics.jpg?raw=true)

# DESIGN IN THE LARGE
![Design the large](img/lecture1/design-large.jpg?raw=true)

## SOFTWARE ARCHITECTURE
- Plan de construction et d'évolution
  - abstraction - principales décisions de conception
- Pas seulement une question de conception
  - communiquer - visualiser - représenter - qualité
- Chaque application en a un, qui évolue
  - descriptive - prescriptive - dérive - érosion
- Pas une phase de développement

> A software system's architecture is the set of principal design decisions made about the system

![Abstraction](img/lecture1/abstraction.jpg?raw=true)

#### WHEN DOES SOFTWARE ARCHITECTURE START ?
![Start of software architecture start](img/lecture1/start-software-architecture.jpg?raw=true)

#### WHEN DOES SOFTWARE ARCHITECTURE STOP ?
![Stop of software architecture start](img/lecture1/stop-architecture-software.jpg?raw=true)

#### WHAT MAKES A GOOD ARCHITECTURE ?
- Il n'existe pas de conception parfaite ni une bonne/mauvaise architecture
- Adaptée à un certain objectif et dépendante du contexte.
- Principes, lignes directrices et utilisation de l'expérience collective (méthode)

Principes de conception - Arch. Modèles - Arch. Styles

## DESIGN PRINCIPLES
- abstraction
- encapsulation - séparation des préoccupations
- modularisation
- KISS (keep it simple, stupid)
- DRY (Don't repeat yourself)

## ARCHITECTURAL PATTTERN
> An architectural pattern is a set of architectural design decisions that are applicable to a recurrring design problem, and parameterized to account for different software development contexts in which that problem appears.

Problem : traitement complexe avec plusieurs niveaux d'abstraction de inputs/outputs

## MODEL-VIEW-CONTROLLER
- plus connu dans l'archecture des systèmes intéractifs

![Model-View-Controller](img/lecture1/model-view-controller.jpg?raw=true)

**Implemented tactics**
Modifiability tactics : anticipe les changements attendus, sépare les préoccupations

![Exemple : servlet](img/lecture1/exemple-servlet.jpg?raw=true)

![Exemple - votations](img/lecture1/exemple-votations.jpg?raw=true)

**Problem** : Les interfaces utilisateur sont les plus fréquemment touchées par les changements.
- Comment puis-je représenter la même information de différentes manières ?
- Comment puis-je garantir que les modifications apportées à l'ensemble de données seront instantanément dans toutes les vues ?
- Comment puis-je modifier l'interface utilisateur ? (éventuellement au moment de l'exécution)
- Comment prendre en charge plusieurs interfaces utilisateur sans modifier le cœur de l'application ?
de l'application ?

**Solution** : Le modèle Model-view-controller divise l'application en trois parties :
- Le modèle est responsable du traitement,
- La vue s'occupe de la sortie,
- Le contrôleur s'occupe de l'entrée

#### STRUCTURE
![Structure Model-View-Controller](img/lecture1/model-view-controller.jpg?raw=true)

![Structure 2](img/lecture1/structure2-model-view-controller.jpg?raw=true)

- Chaque model peut enregistrer plusieurs observateurs (vues et contrôleurs).
- Dès que le modèle change, tous les observateurs enregistrés sont notifiés, et ils se mettent à jour en conséquence.

#### PARTICIPANTS - MODEL
Le modèle encapsule les données et les fonctionnalités de base ; il est indépendant de toute représentation concrète de sortie ou de tout comportement d'entrée.

![Particpant - model](img/lecture1/participant-model.jpg?raw=true)

#### PARTICIPANTS - VIEW
La vue affiche les informations à l'utilisateur. Un modèle peut avoir plusieurs
vues.

![Participant - view](img/lecture1/participants-view.jpg?raw=true)

#### PARTICIPANTS - CONTROLLER
Le contrôleur traite les entrées et invoque les services appropriés de la vue ou du modèle. Chaque contrôleur est assigné à une seule vue ; un modèle peut avoir plusieurs contrôleurs.

![Participant - controller](img/lecture1/participants-controller.jpg?raw=true)

#### DYNAMIC BEHAVIOUR

![Dynamic Behaviour](img/lecture1/dynamic-behaviour.jpg?raw=true)

#### CONSEQUENCES OF THE MODEL-VIEW-CONTROLLER PATTERN
Avantages :
- vues multiples du même système
- vues synchrones
- vues et contrôleurs attachables
Inconvénients
- complexité accrue
- couplage fort entre le modèle et la vue
- couplage fort entre le modèle et les contrôleurs (peut être évité au moyen de moyen du patron de commande)

Applications connues : Bibliothèques d'interface graphique, Smalltalk, Microsoft Foundation Classes

## PUBLISH-SUBSCRIBE
![Publish-subscribe](img/lecture1/publish-subscribe.jpg?raw=true)

#### IMPLEMENTED TACTICS
Tactiques de modifiabilité :
- Restreindre les voies de communication
- Utiliser un intermédiaire
- Normaliser la collaboration

**Problem : point à point communications entre les composants**
![Problem : point à point communication entre les composants](img/lecture1/problem-pp-communication-entre-composants.jpg?raw=true)


**Problem : trop de chemins de communications**
![Problem : trop de chemins de communications](img/lecture1/poblem-bcp-chemin-communications.jpg?raw=true)

## FACADE
![Facade](img/lecture1/facade.jpg?raw=trues)

#### IMPLEMENTED TACTICS
Tactiques de modifiabilité
- Cacher l'information
- Restreindre les voies de communication
- Utiliser un intermédiaire

#### NOUVELLE ARCHITECTURE : FACADE ET PROXY
![Facade et Proxy](img/lecture1/facade-proxy.jpg?raw=true)

![Layered vs plug-in](img/lecture1/layered-vs-plugin.jpg?raw=true)

#### LAYERS
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

#### CHANGEMENT DANS L'UNE DES PREOCCUPATIONS : AFFICHAGE, ACCES AUX DONNES
![Changement dans l'une des préoccupations : affichage, accès aux données](img/lecture1/change-concerns.jpg?raw=true)

#### EXEMPLE
![exemple changement dans l'une des préoccupations](img/lecture1/exemple-change-concerns.jpg?raw=true)

#### REPRESENTATION JAVA
![Représentation Java du changement dans l'une des préoccupations](img/lecture1/java-representation-change-concerns.jpg?raw=true)

## QU'EST-CE QUE NOUS MODELISONS ?
- Le système à venir (modèle de conception)
 - Architecture statique
 - Architecture dynamique
- Attributs de qualité et propriétés non fonctionnelles
- Le problème (modèle de domaine)
- L'environnement (contexte du système et parties prenantes)
- Le processus de conception

#### SOFTWARE COMPPONENTS
![ Software components](img/lecture1/software-components.jpg?raw=true)

#### COMPPONENTS VS OBJECTS VS MODULES
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

#### COMPPONENT INTERFACES
![Component Interfaces](img/lecture1/component-interfaces.jpg?raw=true)

Provided interfaces : Spécifier et documenter les fonctionnalités visibles de l'extérieur (ou l'API publique) offertes par le composant.
- Types de données et modèle
- Opérations
- Propriétés
- Événements et rappels

Required interfaces : Spécifier les conditions dans lesquelles un composant peut être réutilisé
- La plate-forme est compatible
- L'environnement est correctement configuré

#### COMPATIBLE INTERFACES
Les interfaces des composants doivent correspondre parfaitement pour être  connectées.

![Compatible Interfaces](img/lecture1/compatible-interfaces.jpg?raw=true)

#### SOFTWARE CONNECTORS
![Software Connectors](img/lecture1/software-connectors.jpg?raw=true)
Modéliser les aspects statiques et dynamiques de interaction entre les interfaces des composants.
- Les connecteurs ne sont généralement pas directement visibles dans le code, ce qui n'est pas le cas des composants.
- Les connecteurs sont le plus souvent indépendants de l'application, alors que les composants peuvent être à la fois dépendants ou non de l'application

#### CONNECTOR ROLES
- Communication : fourniture de données et transfert de contrôle, prise en charge de différents mécanismes de communication, qualité de la fourniture de données et du transfert de contrôle. mécanismes de communication, qualité de la livraison
- Coordination : contrôle de la transmission des données, séparation du contrôle et du calcul.
- Conversion : permettre l'interaction de composants mal adaptés
- Facilitation : médiation de l'interaction entre les composants, gestion de l'accès aux l'accès aux informations partagées, assure la synchronisation

## VIEW AND VIEWPOINTS
How many views ?
- 5 par Taylor et al : Logique, Physique, Déploiement, Concurrence, Comportemental
- 3 par Bass et al : Composant et connecteur, module Vue, Comportement
- 4+1 par Kruchten : Logique, physique, processus, Développement, et Scénario

#### HISTORICAL MODEL: KRUCHTEN’S 4+1 VIEWS (RUP)
![Historical model](img/lecture1/historical-model.jpg?raw=true)

#### LOGICAL VIEW
![Logical view](img/lecture1/logical-view.jpg?raw=true)

#### Development view
![Development view](img/lecture1/development-view.jpg?raw=true)

#### PROCESS VIEW
![ Process view](img/lecture1/process-view.jpg?raw=true)

#### PHYSICAL VIEW
![Physical view](img/lecture1/physical-view-last.jpg?raw=true)

## USE CASE SCENARIOS
- Unifier et relier les éléments des 4 autres vues
- Les scénarios permettent de s'assurer que le modèle architectural est complet par rapport aux exigences
- L'architecture peut être décomposée en fonction des les scénarios et illustrée à l'aide des 4 autres vues

#### MUSIC PLAYER SCENARIOS
- Rechercher de nouvelles chansons
- Payer pour écouter la chanson en entier
- Télécharger la chanson achetée sur le téléphone
- Écouter la chanson

#### LOGICAL VIEW
![Logical view - music player](img/lecture1/logical-view-music-player.jpg?raw=true)

- Décomposer la structure du système en logiciels composants et connecteurs
- Faire correspondre les fonctionnalités (cas d'utilisation) aux composants
- **Concerne** : Fonctionnalité
- **Public cible** : Développeurs et utilisateurs

#### PROCESS VIEW
![use Case : Browse, Pay, Play for Songs](img/lecture1/use-case-browse-pay-play.jpg?raw=true)

- Modéliser les aspects dynamiques de l'architecture et le comportement de ses parties
  - composants actifs
  - les threads concurrents
- Décrire comment les processus/threads communiquent
  - RPC
  - Bus de messages
- **Concerne** : Fonctionnalité, performance
- **Public cible** : Développeurs

#### DEVELOPMENT VIEW
![Development view last]
- Organisation statique des artefacts du code logiciel
  - paquets
  - modules
  - binaires
- Correspondance entre les éléments de la vue logique et les artefacts de code
- **Concerne** : Réutilisation, portabilité, construction
- **Public cible** : Développeurs

#### PHYSICAL VIEW
![Physical view last]
- Environnement matériel dans lequel le logiciel sera déployé
  - hôtes
  - réseaux
  - stockage
- Correspondance entre les entités logiques et physiques
- **Concerne** : Attributs de qualité
- **Public cible** : Opérations

## REUSE AND LIBRARIES
Est-il possible de réutiliser des classes existantes ? Il est possible que des classes d'adaptation soient nécessaires.

# LECTURE NOTE 2
#### QUALITY ATTRIBUTE WITH REST
Fonctionnalité pour la performance : statelessness, interface uniforme, adressabilité
Statelessness permet la tactique suivante : "Introduire la concurrence".
  - Puisque les demandes peuvent être traitées de manière isolée, indépendamment des demandes précédentes, elles peuvent être distribuées sur plusieurs machines sans impact sur le résultat du traitement.
  - Permet de comprendre chaque demande de manière isolée. En effet, tout le contexte pour interpréter une demande est dans la demande.
Interface uniforme et adressabilité : Permet la visibilité et la simplicité du protocole. Chaque demande est transparente (facilement interprétable)

#### STATELESSNESS
**Statelessness** : pas de sessions utilisateur dans le server. Le serveur ne doit pas enregistrer les états d'un utilisateur. Il n'enregistre que les états ressources. Par exemple, l'achat en ligne. Le serveur doit savoir ce que le client va acheter, c'est donc un état de ressource. Mais, si le client navigue seulement, ce sont des états de clients.
Etat : configuration interne d'un système qui spécifie la réponse à l'événement qu'il reçoit.

2 types d'états :
- **L'état de la ressource** : configuration d'une ressource sur le serveur qui est disponible pour tous les clients. Cela détermine quelle représentation on peut obtenir de la ressource. Côté serveur. Accessible à tous les clients.
- **L'état du client** : la configuration du client qui détermine la prochaine requête qu'il pourrait émettre ensuite (suite à une entrée utilisateur par exemple). On l'appelle aussi **l'état de l'application**. Côté client. Spécifique au client.

Toutes requêtes doivent être indépendant de chacune entres elles de point de vue du serveur.
- Le serveur n'enregistre pas les intéractions avec un client particulier.
- Chaque client "navigue" parmi les ressources et enregistre le dernier état (du client) qu'il a abouti.

![01 - exmple état client](img/lecture2/01-exemple-etat-client.jpg?raw=true)


## RESOURCE PATTERN
Patterns basique pour intéragir avec les ressources.

#### REQUEST ACKNOWLEDGE
**Problem** : Comment gérer des services durables, c'est-à-dire, services qui ne peuvent pas répondre immédiatement.
**Solutions** : Request/acknowledge/poll, Request/acknowledge/callback
External sources : http://servicedesignpatterns.com/clientserviceinteractions/requestacknowledge

#### REQUEST/ACKNOWLEDGE/POLL
![02 - Request/acknowledge/poll](img/lecture2/request-acknowledge-poll.jpg?raw=true)

**Interactions**
![03 - Interactions](img/lecture2/interactions-request-acknowledge-poll.jpg?raw=true)

#### REQUEST/ACKNOWLEDGE/CALLACK
![04 - Request/acknowledge/callback](img/lecture2/04-request-acknowledge-callback.jpg?raw=true)

**Interactions**
![05 - Interactions](img/lecture2/05-interactions.jpg?raw=true)

## COLLECTION PATTERN
**Problem** : comment sélectionner des objets dans une collection afin de les transmettre à une autre service ? A cause de la bande passante, on ne peut pas transmettre tous les objets au client afin qu'il puisse en sélectionner un.
**Solution** : créer une représentation d'une collection d'un ensemble des objets. Contenu :
- Description significative pour la sélection
- Identifiant unique

![06 - Collection](img/lecture2/06-collections.jpg?raw=true)

#### FEED
```
<feed></feed>
```
- éléments réquis : id (URI unique), title, updated (dernière fois que le feed a été modifié)
- éléments recommandés : author, link (identifie une page Web associée)
- un Feed doit contenir un lien de retour à lui-même (rel="SELF")

![07 - Feed](img/lecture2/07-feed.jpg?raw=true)

#### ENTRY
```
<entry></entry>
```
- éléments réquis : id (URI unique), title, updated (dernière fois que le entry a été modifié)
- éléments recommandés : author, content (Contenu entier ou un lien alternatif pour compléter le contenu de l'entry. Le contenu en entier doit être fourni s'il n'y a pas de lien alternatif), link

## REMINDER ATOM - MINIMAL UML MODEL
![08 - Reminder atom](img/lecture2/08-reminder-atom.jpg?raw=true)

![09 - Architecture](img/lecture2/09-architecture.jpg?raw=true)

## PATTERN : DATA TRANSFER OBJECTS
**Problem** : pour minimiser le trafic réseau, on ne veut pas envoyer/recevoir toutes les informations de l'objet de domaine, mais seulement la partie significative pour le service.
- Comment extraire et sélection un ê partie de l'objet de domaine pour le transfert réseau ? Contrainte : on ne veut pas implémenter du code transfer spécifique dans les objets du domaine.
- Lors de la traduction en XML à l'aide d'une bibliothèque standard
(JAXB), comment inclure/exclure des informations ? Contrainte : on ne veut pas ajouter d'annotations dans les objets du domaine

**Solution** : créer un objet de transfert de données pour contenir
seulement la partie de l'objet de domaine que nous devons transférer
(ou parties de plusieurs objets).

![10 - exemple DTO](img/lecture2/10-exemple-DTO.jpg?raw=true)

#### EXEMPLE : POST
Lors de la publication de représentations pour créer des objets sur le serveur, la représentation peut être envoyée à l'aide d'un DTO.

![11 - Exemple POST DTO](img/lecture2/11-exemple-post-DTO.jpg?raw=true)

#### CREATING BOOKS, CLIENT SIDE
![12 - Creating books, client side](img/lecture2/12-creating-books-client-side.jpg?raw=true)

#### CREATING BOOKS, SERVER SIDE
![13 - Creating books, server side](img/lecture2/13-creating-books-server-side.jpg?raw=true)

#### BOOKS
```
public class Book {
  private String titre;
  private String auteur;
  private int annee;
  private String cote;

  public Book(){}

  public Book(String titre, String auteur, int annee, String cote){
    super();
    this.titre = titre;
    this.auteur = auteur;
    this.annee = annee;
    this.cote = cote;  // <------
  }

  // Setters and getteurs
  // To String
}
```

#### Book Description
```
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD) // <-------
public class BDTO {
  private String titre;
  private String auteur;
  private int annee;


  public BDTO(){}

  public BDTO(String titre, String auteur, int annee){
    super();
    this.titre = titre;
    this.auteur = auteur;
    this.annee = annee;
  }

  // Getteurs
}
```

#### CLIENT
```
public class BookPOstClient{

  public static main(String[args]) throws Exception {

    BDTO dto  = new BDTO("Seigneur des anneaux", "Tolkien", 1954);
    String url = "http://localhost:8080/DemoPostServer/Books";

    String newURL = new RestInterface().postRemoteObject(url, mediaType.APPLICATION_XML, BDTO.class, dto);

    System.out.println(newUrl);
  }
}

public class BookGetClient{

  public static void main(String[]args){

      String url = "http://localhost:DemoPostServer/books/Tol1945";
      Entry<Book> o = (Entry<Book>)new RestInterface().getRemoteObject(url, MediaType.APPLICATION_ATOM_XML, Entry.class);

      System.out.println(b);

  }

}
```

#### REST INTERFACE : POST
```
public class RestInferface{

  // Creating a new resource. Retursns the URL of the newly created resource
  public String postRemoteObject(String url, String type, Class objectClass, Object o){
    try{
      // XML Conversion
      OutputStream os = new ByteArrayOutputStream();
      JAXBContext jaxbContext = JAXBContext.newInstance(objectClass);
      Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
      jaxbMarshaller.marshal(o,os);

      // REST service query
      HttpPost request = new HttpPost(url);
      request.setHeader(HttpHeaders.CONTEXT_TYPE, type);
      request.setEntity(new StringEntity(os.toString(), "UTF-8"));
      HttpResponse resp = HttpClientBuilder.create().build().execute(request);
      System.out.println(resp.getStatusLine().getStatusCode()); // <------
      if(resp.getStatusLine().getStatusCode() == 200){
        return resp.getFirstHeader("Location").getValue();
      }
    }catch(Exception e){ e.printStackTrace(); }

    return "";
  }
}
```

#### REST INTERFACE : GET
```
public class RestInferface{

  // Getting a remote resource. Retursns an Object that must be Type cast
  public Object getRemoteObject(String url, String type, Class objectClass){
    Object result = null;
    try{
      // REST service query
      HttpClient client = HttpClientBuilder.create().build();
      HttpGet request = new HttpGet(url);
      request.setHeader(HttpHeaders.ACCEPT, type);
      HttpResponse resp = client.execute(request);

      // XML Conversion
      JAXBContext jaxbContext = JAXBContext.newInstance(objectClass);
      Unmarshaller Unmarshaller = jaxbContext.createUnmarshaller();
      System.out.println(resp.getStatusLine().getStatusCode()); // <------
      if(resp.getStatusLine().getStatusCode() == 200){
        result = Unmarshaller.unmarshal(resp.getEntity().getContent());
      }
    }catch(Exception e){ e.printStackTrace(); }

    return result; // Type casting must be done in the caller method
  }
}
```

#### SERVICES
```
@Path("/")
public class EntryPoint(){

  @POST
  @Path("books")
  @Consumes(MediaType.APPLICATION_XML)
  public void createBook(BDTO input, @Context HttpServletResponse response, @Context UriInfo uriInfo) throws Exception{

    String baseURL = uriInfo.getBaseUri().toString();
    String auteur = input.getAuteur();
    String cote = auteur.subString(0,3)+input.getAnnee(); // <-------------

    // ici devrait se trouver l'insertion du livre dans la BD
    // Ensuite on retourne l0URL du livre inséré
    response.setStatus(HttpServletResponse.SC_CREATED); // <-------------
    response.setHeader(HttpHeaders.LOCATION, baseURL+"books/"+cote); // <-------------
    try{
      response.flushBuffer();
    }catch(Exception e){}
  }

  @GET
  @Path("books/{cote}")
  @Produces(MediaType.APPLICATION_ATOM_XML)
  public Entry<Book> getBook(@PathParam("cote") String cote, @Context UriInfo uriInfo) throws Exception{

    String baseURL = uriInfo.getBaseUri().toString();


    // ici devrait se placer la recherche du livre dans la BD à partir de la "cote"
    // Simulation du livre trouvé, si non trouvé on devrait retourner 404
    Book b = new Book("Seigneur des anneux", "Tolkien", 1954, "Tol1954");
    return new Entry<Book>("book "+cote, baseURL+"books/"+cote, b, true); // <-------------
  }
}
```

#### TEST : RESOURCE CREATION
```
public class BookPostClient{

  public static void main(String[]args) throws Exception{
    BDTO dto = new BDTO("Seigneur des anneaux", "Tolkien", 1954);
    String url = "http://localhost:8080/DemoPostServer/books/";

    String new Url = new RestInferface().postRemoteObject(url, MediaType.APPLICATION_XML, BDTO.class, dto);
    System.out.println(newUrl); // <------
  }
}
```
![14 - test creating post](img/lecture2/14-test-creating-post.jpg?raw=true)

#### Test: getting the resource
```
public class BookGetClient{

  public static void main(String[]args){

    String url = "http://localhost:8080/DemoPostServer/books/Tol1945";
    Entry<Book> o = (Entry<Book>)new RestInferface().getRemoteObject(url, MediaType.APPLICATION_ATOM_XML, Entry.class);
    Book b = o.getContents();
    System.out.println(b); // <------
  }
}
```
![15 - test getting the resource](img/lecture2/15-test-get-resource.jpg?raw=true)

## DEMO
Tried DemoPostServer in class. View exercice in folder *Demos".

## COMMUNICATION "META PATTERNS"
1. Payload format
- Lors de la communication entre le client et le server :
  - Les objets métier doivent être transportés avec des objets de transport annotés (Objets Atom).
  . Les objets métiers ne seront pas annotés.
2. Couches de communication applicatives
- Lors de la conception des couches applicatives client et serveur, dupliquer les couches communes : objet métier et transport à la fois dans le client et le code source du serveur pour vous assurer qu'ils seront identiques.

![16 - layers](img/lecture2/16-layers.jpg?raw=true)













































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
