# 626-1 GENIE LOGICIEL

# CONTENTS
1. [Lecture note 1]()
2. [Lecture note 2]()


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

#### COMPONENT INTERFACES
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
![02 - Request/acknowledge/poll](img/lecture2/02-request-acknowledge-poll.jpg?raw=true)

**Interactions**
![03 - Interactions](img/lecture2/03-interactions-request-acknowledge-poll.jpg?raw=true)

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
Une collection d'entry ou des objects. Balise HTML :
```
<feed></feed>
```
- éléments réquis : id (URI unique), title, updated (dernière fois que le feed a été modifié)
- éléments recommandés : author, link (identifie une page Web associée)
- un Feed doit contenir un lien de retour à lui-même, c'est une adresse de la réprésentation de la source (rel="SELF")

![07 - Feed](img/lecture2/07-feed.jpg?raw=true)

#### ENTRY
Entry est une collection dans la collection feed. Balise HTML :
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
- Comment extraire et sélection une partie de l'objet de domaine pour le transfert réseau ? Contrainte : on ne veut pas implémenter du code transfer spécifique dans les objets du domaine.
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
    - On veut séparer la couche de transport et la couche de business car on a pas nécessairement besoin de passer des informations de la couche de business
  - Les objets métiers ne seront pas annotés. C'est dans la couche de transport que l'on fera des annotations.
2. Couches de communication applicatives
- Lors de la conception des couches applicatives client et serveur, dupliquer les couches communes : objet métier et transport à la fois dans le client et le code source du serveur pour vous assurer qu'ils seront identiques.

![16 - layers](img/lecture2/16-layers.jpg?raw=true)

# LECTURE NOTE 5

## LES ERREURS (FALLACIES) DE L'INFORMATIQUE DISTRIBUEES
- Le réseau est fiable,
- Zéro latence,
- Bande passante à l'infinie,
- Le réseau est sécurisé,
- La topologie ne change pas,
- Le coût du transport est zéro (temps et argent).
[Wikipedia, based on a Peter Deutsch’s paper in 1997]

Conséquence - se préparer aux échecs :
- Timeout
- Circuit breaker
- Use references
- Tolerant reader

## TIMEOUT PATTERNS

![01 Timeout](img/lecture5/01-timeout.jpg?raw=true)

**Problem** : éviter d'attendre longtemps si le service ne répond pas à la demande car la connexion n'est pas disponible ou le serveur est occupé

**Solution** : définissez le temps maximum que votre client attendra avant d'abandonner. Si le délai d'attente a expiré, effectuez une procédure de tolérance aux pannes

#### REQUESTCONFIG
Le HttpClient est configuré pour ne pas attendre plus que la période de temporisation.

**Implementation** : objet RequestConfig à transmettre à la fabrique ClientBuilder pour
configurer les paramètres de connexion au HttpClient.


```
// t1, t2, t3 : temps en millisecondes
RequestConfig requestConfig = RequestConfig.custom()
                                  .setConnectionRequestTimeout(t1)
                                  .setConnectTimeout(t2)
                                  .setSocketTimeout(t3)
                                  .build();
HttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build();
```
**Que se passe-t-il si un certain délai expire ?**
- Des exceptions sont levées : SocketTimeoutException, ConnectTimeoutException
- Intercepter l'exception pour exécuter la tolérance aux pannes
procédure

```
public static void main(String[]args) throws Exception {

  RequestConfig requestConfig = RequestConfig.custom()
              .setConnectionRequestTimeout(1)
              .setConnectTimeout(1)
              .setSocketTimeout(100).build();
  HttpClient client = HttpClientBuilder.create()
              .setDefaultRequestConfig(requestConfig).build(); // <--------------

  HttpRequest req1 = new HttpGet("http://localhost:8080/HelloWorld/helloworld");

  try{
    HttpResponse resp = client.execute(req1);
    print(resp);
  }catch (Exception e){
    System.out.println("Timeout"); // Fault tolérance procedure
  }

}

public static void print(HttpResponse resp) throws Exception{

  System.out.println(resp.getStatusLine().getStatusCode());

  if(resp.getStatusLine().getStatusCode() < 300){
      BUfferedReader rd = new BUfferedReader(new InputStreamReader(response.getEntity().getContent()));
      StringBuffer result = new StringBuffer();
      String line = "";
      while ((line = rd.readLine()) != null ){
          result.append(line);
      }
      System.out.println(result);

  }

}
```

#### EXEMPLE D'UNE SERVICE LENTE

**Service**

![02 exemple d'une service lente](img/lecture5/02-exemple-service-lente.jpg?raw=true)

**Client**
![03 client](img/lecture5/03-client.jpg?raw=true)

**Test1 : Limit 1'000'000**
![04 Test1](img/lecture5/04-test1.jpg?raw=true)

**Test2 : Limit 10'000'000**
![05 Test1](img/lecture5/05-test2.jpg?raw=true)

#### DEMO
On a testé le DemoTimeoutClient et DemoTimeOutServer

## CLIENT CIRCUIT BREAKER
![06 circuit breaker](img/lecture5/06-circuit-breaker.jpg?raw=true)

**Problème** : évitez d'appeler un service, lorsque nous savons qu'il n'est pas disponible.

**Solution** : utilisez un circuit breaker object qui filtre les requêtes vers des
service indisponible.

- Lorsqu'une panne est détectée plusieurs fois (doit être loggé dans un certains services de health log), le breaker s'ouvre.
- La prochaine fois que l'appel revient immédiatement (il doit également être loggé), sans appeler le servicer et le client doivent effectuer des travaux alternatifs.
- Après un certain temps, le circuit breaker laissera passer l'appel au service pour vérifier la disponibilité. Si OK, le circuit breaker se ferme et transmettra les prochaines requêtes au serveur.

**State graph**

![07 state graph](img/lecture5/07-state-graph.jpg?raw=true)


#### REMINDER : MAIN HTTP CLIENT CLASSES
![08 reminder http client](img/lecture5/08-reminder-http-client.jpg?raw=true)

#### EXAMPLE : UNE VERSION SIMPLE D'UN CIRCUIT BREAKER, DEUX ETATS : OUVERT ET FERME
![09 - exemple circuit breaker simple](img/lecture5/09-exemple-circuit-breaker.jpg?raw=true)

![10 - client](img/lecture5/10-client.jpg?raw=true)

![11 - simple circuit breaker](img/lecture5/11-simple-circuit-breaker.jpg?raw=true)

![12 - simple circuit breaker 2](img/lecture5/12-simple-circuit-breaker-2.jpg?raw=true)

## DEMO
On a testé le DemoCircuitBreakerClient et DemoTimeOutServer

## SERVICES COMPOSITION

## SOA : SERVICE ORIENTED ARCHITECTURE
Un modèle d'interaction applicative qui met en œuvre des services (composants logiciels)

![13 SOA](img/lecture5/13-soa.jpg?raw=true)

- Les composants de service peuvent varier en taille, des petits services d'application aux très grands services d'entreprise.
- Il est courant d'avoir un composant de service au sein de la SOA représenté par un gros produit ou même un sous-système.

#### QUALITY ATTRIBUTES
**Adaptabilité** : cette architecture est destinée à être adaptable aux évolutions du processus métier d'une entreprise.
**But** : Les performances, l'évolutivité et la déployabilité ne sont pas les principaux QA.

## MICROSERVICES
Source : https://martinfowler.com/articles/microservices.html#CharacteristicsOfAMicroserviceArchitecture

- Une spécialisation d'une approche d'implementation pour les SOA utilisées pour construire des systèmes logiciels déployables indépendamment.
- Le style architectural de microservice est une approche de développement d'une application unique sous la forme d'une suite de petits services, chacun s'exécutant dans son propre processus et communiquant avec des mécanismes légers, souvent une API de ressource HTTP.


- Chaque microservice est indépendamment appelé à travers le réseau.

#### CONSTRAINT : LARGE systems
![14 - constraint](img/lecture5/14-constraint.jpg?raw=true)

- Les services sont utilisés en isolément ou en groupe pour effectuer une tâche plus importante (composition).
- Mais les transactions du mainframe ne sont pas adaptées pour construire de grandes fonctions métier (non composables).

#### QUALITY ATTRIBUTES
Same QA as mainframe’s transactions
• Performance
• Isolation (beware of ACID constraints)
• Changeability (but constraints on the data model)

New QA’s for a new world
• Scalability
• Independance
• Deployability
• Changeability

**Scalability** : Si l'une des fonctionnalités du programme est fortement utilisée, il faut pouvoir augmenter les ressources.

**Independance** : Les services ne doivent pas interagir les uns avec les autres. Un changement dans un service ne doit pas avoir d'impact sur les autres services.

**Déploiement** : Les services doivent pouvoir être déployés indépendamment sur différentes VM.

**Changeabilité** : Les services doivent être facilement modifiables sans impact sur le reste du système

#### DISTRIBUTED APPLICATION
![01 - distributed application - lecture note 6]

#### ARCHITECTING LARGE SYSTEMS
Nous devons construire de grands services (fonctions métier) à partir de services plus simples.

![15 architecting large systems](img/lecture5/15-architecting-large-system.jpg?raw=true)

#### CALLING ARCHITECTURE : ORCHESTRATION AND CHOREOGRAPHY
**Orchestration** :
- Un manager orchestre le travail des autres services pour mettre en œuvre la fonction/processus métier.
- Chaque service est explicitement appelé par le gestionnaire.

**Chorégraphie** :
- Architecture de type publish/subscribe : la planification est implicite dans la séquence d'événements générés par chaque service.
- Chaque service s'inscrit à l'événement qu'il doit traiter.

#### EXEMPLE - INSCRIPTION DES ETUDIANTS
![16 - Inscripition des étudiants](img/lecture5/16-inscription-etudiants.jpg?raw=true)

**Orchestration**

![17 - orchestration exemple](img/lecture5/17-orchestration-exemple.jpg?raw=true)

**Choreography**

![18 - Choreography exemple](img/lecture5/18-choreography-exemple.jpg?raw=true)

## L'APPROCHE TRADITIONNELLE DE SYSTEM DESIGN
- Conception du modèle de données.
- Créer les services qui gèrent chaque partie du modèle.
- Mais cela ne sera pas conforme aux QA d'indépendance et de déployabilité.
  - Les services seront liés via le modèle de données.
  - Le service ne peut pas être déployé indépendamment.

#### EXEMPLE D'INCONVENIENTS
![19 - Exemple d'inconvénients exemple](img/lecture5/19-exemple-inconvenient.jpg?raw=true)

**Consequences**

- ~~Independence~~
  - Si la partie du modèle de données requise par le service 1 est modifiée (classe jaune foncé), il y aura un impact sur les autres services.
- ~~Deployability~~
  - Les services sont fortement liés à la couche de données. Comment pourraient-ils être déployés indépendamment sur plusieurs VM ?

**Solutions**

- Éviter le partage de données entre les services pour les grands
systèmes basés sur des microservices.
- Cela conduit à une nouvelle façon de concevoir les systèmes :
  - Commencez à concevoir des systèmes basés sur des capacités, des fonctionnalités, des services, et non sur des données.

#### CONSTATIONS SUR LA GESTION DISTRIBUEES DES DONNEES
- De nombreux clients interrogent les données tandis que quelques-uns les mettent à jour.
  - La mise à l'échelle (scaling) se produit principalement sur le service de lecture (read service).
  - Mais plusieurs mises à jour peuvent se produire simultanément.
- Les données que les gens regardent ne sont pas garanties d'être à jour
  - Lorsque quelqu'un récupère des données, quelqu'un d'autre peut les avoir mises à jour simultanément. Ainsi, les données lues peuvent être partiellement obsolètes. C'est
  un fait dans les grands systèmes distribués.
  - Ne surconcevez pas une solution pour éviter que des données obsolètes ne soient affichées. L'impact sur le QA sera trop lourd.

#### CONCLUSION
1. Tous les services n'ont pas besoin du même accès aux données (lecture / écriture).
2. Les services de lecture peuvent avoir besoin d'afficher plusieurs parties du modèle de données alors que les services d'écriture se concentrent généralement sur une seule.
3. La contrainte « Cohérence permanente des données » * doit être libérée pour les grands systèmes distribués.

* (Permanent Data Consistency) Toutes les données sont cohérentes pour tous les clients à tout moment.

# LECTURE NOTE 6

## CAP THEOREM
Source : https://dzone.com/articles/better-explaining-cap-theorem
Il est impossible sur un système informatique de calcul distribué de garantir en même
temps:
- La Consistance des données) (Consistency)
- La Disponibilité (Availability)
- La tolérance aux Partitionnement (Partition Tolerance) : le système doit fonctionner
même s’il est partitionné sur plusieurs nœuds.

![02 - cap theorem]

**Les variables statiques ou globales sont INTERDITES en programmation distribuée (viol du stalessness)**

#### EVITER LA DEPENDANCE DES DONNEES ENTRE LES SERVICES

![03 - éviter la dépendance]

**Mais comment les synchroniser ?**

## COMMAND QUERY RESPONSIBILITY SEGREGRATION (CQRS) PATTERNS
Source: http://fr.slideshare.net/myfear/cqrs-and-event-sourcing-for-java-developers
**Problème** : comment éviter le couplage de données entre les services qui mettent à jour le modèle de données et les services qui lisent les données ?

**Solution** : créer des services distincts, chacun ayant sa propre représentation des données.
- Le service de mise à jour possède le modèle de référence et fonctionnera comme modèle maître (MASTER).
- Le service de requête maintiendra un modèle de données esclave (SLAVE). Il sera informé de tout changement de modèle de référence.

![04 - CQRS Pattern]

#### RETHINKING THE DATA MODEL
Historiquement, le modèle de données accueillait à la fois les requêtes de lecture et d'écriture.
- Mais la structure requise pour répondre aux requêtes de lecture peut très bien être différente de celle des requêtes d'écriture.
  - Les requêtes d'écriture nécessitent des sous-modèles complets pour garantir les propriétés ACID.
  - Les requêtes de lecture peuvent accéder à plusieurs sous-modèles partiels.
  - Les requêtes de lecture peuvent nécessiter des informations historiques sur les modifications du modèle. Cela peut ne pas être le cas pour les requêtes en écriture.

#### THE READ (SLAVE) MODEL
- Le service de requête n'a pas besoin du modèle complet.
  - Il ne conserve que les données nécessaires pour répondre à la requête
  - Le modèle est proche d'une vue au sens RDB.
- Le service de requête n'a pas besoin d'un SGBDR.
  - Une technique plus simple ferait l'affaire puisqu'aucune contrainte d'intégrité ne doit être appliquée.
- Le modèle de requête sera cohérent à terme.
  - Quand il aura traité tous les événements de mise à jour.

#### IMPLEMENTATION DE CQRS
- On peut utiliser le "Event Sourcing" pattern

## EVENT SOURCING PATTERN
**Problème** : comment enregistrer efficacement l'état et les changements d'état d'un modèle de données ?
**Solution** : conserver la séquence des changements d'état des entités comme source principale de données.
  - L'état actuel des entités peut être reconstruit en naviguant dans la chaîne  d'événements dans l'ordre inverse.
  - Nous pouvons récupérer les valeurs que certains attributs avaient au fil du temps.
  - La chaîne d'événements est immuable.
  Remarque : ce modèle ne doit pas être la seule représentation des données dans un système complexe. Utilisez-le avec précaution.

#### EXEMPLE : RECORDING BOOK SALES
![05 - book sales]

#### AVANTAGES DU MODELE EVENT SOURCING POUR IMPLEMENTER LE READ DATA MODEL
Si le modèle de données est représenté comme une chaîne d'événements immuables, alors :
- Aucune mise à jour des tables, juste un stockage d'événements idempotent. (si une requête identique peut être faite une ou plusieurs fois de suite avec le même effet tout en laissant le serveur dans le même état.)
- Opérations très rapides : ajouter le nouvel événement à la fin de la chaîne.
  - Aucune API sophistiquée pour effectuer des opérations CRUD sur la base de donnée.
- Bien adapté au modèle de données distribué : il suffit d'envoyer des événements aux clients.
- Bien adapté pour interroger les changements d'état historiques.

Pour lire la valeur réelle d'un attribut, lisez la chaîne dans l'ordre inverse.
![06 - lire dans l'ordre inverse]

#### STRUCTURE FOR UPDATE EVENT
- Les événements doivent vraiment représenter ce qui est arrivé sur quel élément de données.
  - Ceux-ci peuvent être modélisés comme des objets avec une action, des données et du temps.
  - La modélisation de domaine est donc un bon début pour modéliser ces événements.
- Quelles sont les données qui seront lues ensemble ?
  - Cela représente l'équivalent d'une « vue » sur le modèle global.
  - Il s'agit des données à transporter vers le service de lecture.
  - Ensuite, concevez un objet DTO pour transporter uniquement ces informations vers le service de lecture.

#### EXEMPLE - FAST READ SERVICE
- Stockage du format XML brut de l'objet DTO sous forme de lignes de fichier unique.
- Format de récupération : même format XML.
- Aucune conversion lors du stockage/récupération.

**ARCHITECTURE**
![07 - exemple xml]

![08 - exemple 2]

#### DEMO CQRS
![09 - Demo cqrs]

#### DEMO CQRSReaderII
![10 - Demo cqrs reader]

#### UTILITY CLASS: FileStorage
![11 - Utility Class : File Storage]

#### DTO OBJECT TO RECORD THE SALES
![12 - DTO Object]

#### DEMO : RECORDING THE SALES ON TWO SERVERS
- Un ensemble de ventes de livres est envoyé à 2 services différents qui enregistreront les ventes séparément.
  - Tout d'abord, il faut définir les paramètres (nom du fichier sur lequel stocker les ventes).
  - Ensuite, nous mettons à jour les ventes sur les deux services.

#### INITIALIZING THE READERS
![13 - init readers]

#### RECORDING SALES
![14 - recording sales]

#### CONTENTES OF SALES.TXT FILE
![15 - Contents text file]

Il est maintenant possible de lire les sales de 2 serveurs. L'un sera interrogé sur une vente et l'autre sur une autre vente.

#### TESTING THE ARHITECTURE
1. Initialiser les services reader (file name for storage)
2. Mettre à jour le book sales
3. Lire le book sales avec le service reader

![16 testing architecture

#### FAST READING SALES
![17 fast reading sales]

#### DEMO
DemoCQRSReader, DemoCQRSReader2, DemoCQRSSalesReaderClient

#### DISCUSSION
- The reading service does not know the structure of the stored object.
  - It just stores plain XML.
  - The only constraint: there must be an <id> tag in the recoded information.
- The client marshalls some DTO object to XML and send the result to the storage service.
- When querying some record, the client gets the plain XML format and unmarshalls it to the original DTO object.
Rather than FileStorage, a better alternative would be to store the data in some NoSQL database such as MongoDB or Cassandra

#### APPLYING THE EVENT SOURCING PATTERN TO CQRS
- Les modèles de données Master sont conservés dans le service de mise à jour.
- Le modèle de données Slave construit la vue requise par le service de requête.
- La communication entre le master et le slave est basée sur les événements.

![18 - applying event sourcing to cqrs]



























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
