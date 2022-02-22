# Module 643-11
# Chapitre 8 : OSPF à zone unique
- OSPFv2 est pour IPv4, version 3 est pour IPv6

#### Charactéristiques du protocole OSPF
- Sans classe
- Efficace
- Convergence rapide
- Sécurisé
- Evolutif

#### Structure de données : le protocole met à jour 3 bases de données :
- Base de données de contiguïté : crée la table de voisinage
- Base de données d'états de liens 5LSDB) : crée la table de topologique
- Base de données de réacheminement : Crée la table de routage

#### Fonctionnement des états de liens
- réseaux directement conenctés : chaque router prend connaissance des réseaux qui lui sont connectés directement
- établir les contiguïté de voisinage : chaque routeur est responsable de l'établissement de la communication, par l'envoi de paquet Hello, avec ses voisins situés aux réseaux qui lui sont directement conenctés
- échange des paquets LSA (Link-State Advertisement) : chaque routeur crée un paquet LSP (Link state Packet) en indiquant l'état de chaque liaison directement connecté
  - chaque routeur indonde tous ses voisins avec LSP, et ils stockent les LSP reçus dans une base de données
- établir la table topologique (LSDB) : chaque router utilise cette base de données pour créer une carte topologique complète et calcule le meilleur chemin vers chaque réseau de destination
- éxecuter l'algorithm SPF : utilise l'algorithme Dijkstra pour créer une arborescence SPF afin de trouver les meileurs chemins vers chaque réseau à la tablea de routage

## Protocole OSPF à zone unique
![Protocole OSPF à zone unique](https://github.com/RiriJane/8th-sem-heg/blob/master/645-31_CCNA/last_sem/img/OSPF_zone_0.jpg)

- zone fédératice : zone 0
- utile sur les petits réseaux qui ont peut de routeurs

#### Activation du protocole OSPF
```
Router1(config)#router ospf [process-id]

Router1(config)#router ospf 1
```

#### Router ID
```
Router1(config-router)#router-id [ip-address]
```

#### Réglage de priorité
- Le router en DR : possède la priorité interface d'OSPF la plus élevé
- Le routeur en BDR : possède la seconde priorité la plus élevé
- Si les priorités d'interfaces sont identiques, c'est le routeur avec le plus grand ID de routeur qui sera éku DR
- Valeur par défaut 1
- La valeur 0 empêche la sélection en tant que DR ou BDR
```
Router(config-if)#ip ospf priority {0 - 255}
```

#### Adresse de bouclage
```
Router1(config)#interface loopback [number]
Router1(config-if)#ip address []ip-address] []masque de sous-réseau]
```

#### Modification de l'ID de routeur
```
Router1#clear ip ospf process
```

#### Vérification de l'ID de router 
```
Routeur1# show ip protocols
```

#### Commande network 
```
Router1(config-router)#network [adresse-réseau] [masque-générique] area [area-id]

 Router1(config-router)#network 172.16.1.32 0.0.0.7 area 0
```

#### Configuration d'une interface passive
```
Rtr-2(config-router)# passive-interface [interface]

Rtr-2(config-router)# passive-interface GigabitEthernet 0/1
```

#### Redistribution du routage OSPF par défaut
```
R1(config-router)# default-information originate
```

#### Modification de la bande passante de référence
```
R1(config-router)#auto-cost reference-bandwidth [number]
# ou
R1(config-router)#bandwidth 64
# ou (équivalent du précédent)
R1(config-router)ip ospf cost 1562

R1(config-router)#auto-cost reference-bandwidth 10000
```

#### Vérifier les voisins OSPF
```
R7# show ip ospf neighbor
```

#### Autres commandes de vérification
```
show ip protocols
show ip route
show ip ospf
show ip ospf interface [brief]
debug ip ospf events
debug ip ospf adj
```

## Protocoles OSPF à zones multiples
![Protocoles OSPF à zones multiples](https://github.com/RiriJane/8th-sem-heg/blob/master/645-31_CCNA/last_sem/img/OSPF_zones_multiples.jpg)
- mise en place au moyen d'une hiérarchie de zones à deux couches étant donné que toutes les zones doivent se connecter à la zone 0
- les routers interconnectés (R1 et R2) sont appelés routeurs ABR (Area Border Router)


# Module 643-12
# CHAPITRE 3 : ROUTAGE DYNAMIQUE - RIP - EIGRP

**Protocoles de routage** : ensemble de processus qui permet d'échanger des informations de routage pour créer la table de routage contenant les meilleurs chemins
- utilises différentes métriques (bande passante, coût, nombre de sauts, délai...)

#### Les protocoles IGP (Interior Gateway Protocols)
**Protocole de routage à vecteur de distance**

![Protocole de routage à vecteur de distance](https://github.com/RiriJane/8th-sem-heg/blob/master/645-31_CCNA/last_sem/img/routage_vecteur_distance.jpg)

- la distance est définie en terme de mesures comme le nombre de sauts
- utilise l'algorithme de Bellman-Ford pour déterminer le meilleur chemin
- des mises à jours sont envoyées aux routerurs voisins
- pour les situations comme : réseau simple et linéaire, les admins ne sont pas expérimentés, les délais de convergences longs ne posent pas de problème
- le routeur ne connaît pas le chemin complet vers un réseau de destination
- le routeur ne connait que la direction ou l'interface dans laquelle les paquets doivent être transmis
- le router ne connait que la distance le séparant du réseau de destination
- RIP ou EIGRP

**Protocole d'état des liaisons**
- un routeur possède une vue complète ou topologie du réseau ce qui permet de sélectionner le meilleur chemin vers tous les réseaux de destination de la topologie
- tous les routeurs possèdent la même vue du réseau
- les mises à jour ne sont pas utilisées. Une mise à jour est envoyée uniquement lorsqu'il y a une modification de la topologie
- pour les situations comme : grands réseaux, admin ayant des bonnes connaissances, réseau pour lequel une convergence rapide est importante


**Protocoles de routages par classe**
- n'envoi pas d'informations sur les masques de sous-réseau dans les mises à jour de routage
- les addresses réseaux sont allouées en fonction de classe (A, B, C)
- ne prend pas en charge les masques de sous-réseaux de longeur variable (VLSM)
- inclus RIPv1 et IGRP.

**Protocoles de routages sans classe**
- inclus le masque de sous-réseau avec l'adresse réseau dans les mies à jours de routage
- prend en charge les masques de sous-réseaux de longeur variable (VLSM)
- RIPv2, EIGRP, OSPF, IS-IS, BGP

#### RIP : Routing Information Protocol
- utilise le nombre de saut comme mésure de sélection d'un chemin
- si le nombre de sauts est plus que 15, le protocol ne peut pas fournir un chemin
- les maj sont diffusées toutes les 30 secondes
- découpage horizon et découpage d'horizon avec empoisonnement inverse pour éviter les boucles
- équilibrer la charge à 6 chemins à coût égal au max. 4 par défaut

#### RIPv1, RIPv2 - améliorations 
- inclus le masque de sous-réseau dans les mises à jour de routage (= routage sans classe)
- prend en charge les masques de sous-réseaux de longeur variable (VLSM)
- authentification pour sécuriser les tables de routages
- adresses de multidiffusion (au lieu de l'adresse de diffusion)
- prend en charge le résumé de routes manuel

### EIGRP : Enhanced Interior Gateway Routing Protocol
- développé par cisco
- effectue un équilibrage de charge à coût inégal
- utilise l'algorithme DUAL (Diffused Update Algorithm)
- maj envoyés quand il y a une modification de la topologie (maj déclenchées)
- utilisation d'une table topologie pour maintenir toutes les routes reçues des voisins (pas seulement les meilleurs chemins)
- Hello EIGRP - contiguïtés avec des routeurs voisins
- prend en charge les masques de sous-réseaux de longeur variable, le résumé de routes manuel

## Fonctionnement
#### Démarrage à froid :
- aucune information sur la topologie du réseau, aucune information de qui est connectés physiquement
- seules informations qu'un router dispose sont ses propres informations stockés dans la mémoire (NVRAM)

#### Echange intial d'informations de routage
![échange d'informations de routage, le résumé de routes manuel](https://github.com/RiriJane/8th-sem-heg/blob/master/645-31_CCNA/last_sem/img/%C3%A9change_information_routage.jpg)

- si un protocole de routage est configuré, les retours commencent l'échange des maj de routage
- au départ les maj concernent que les réseaux directement connectés
- maj reçue : recherche des nouvelles informations
- toutes les routes qui n'existent pas dans la table de routage sont ajoutées
- pour se rapprocher de la convergence, les routeurs échangent des nouvelles maj

#### Convergence
- vitesse à laquelle ils peuvent propager ces informations
- la vitesse de convergence englobe :
  - la vitesse à laquelle le routeur propage une modification de la topologie lors d'une maj de routage à ses voisins
  - la vitesse de calcul des meilleurs chamins à l'aide des nouvelles informations

## RIPv2 - commande router RIP

#### Activation
```
R1(config)#router rip
R1(config-router)#[no] version [number]

R1(config)#router rip
R1(config-router)#version 2
```
### Key
```
R1(config-router)#key [number]
R1(config-router)#key-string [pass]

R1(config-router)#key 1
R1(config-router)#key-string cisco
```

#### Spécification d'une liste de réseaux participant au routage RIP
```
R1(config-router)#network [network number]
R1(config-router)#network 172.20.0.0
```
*network number : addresse IP réseau du réseau directement connecté

#### Equilibrage de charge
```
R1(config-router)#maximum-paths [nombre]
```

#### Propagation de la route par défaut 0.0.0.0
```
R1(config-router)#default-information originate

```
#### Redistribution de route statique
```
R1(config-router)#redistribute static
```
#### Interface passive : empêche l'envoi des mises à jour de routage sur l'interface concernée
```
R1(config-router)#passive-interface [type] [numero] 
R1(config-router)#passive-interface int f0/0
R1(config-router)#passive-interface int default 

```
#### Redistribution EIGRP
```
R1(config-router)#redistribute EIGRP [AS_number] metric [number]
```
#### Redistribution OSPF
```
R1(config-router)#redistribute OSPF [process_ID] metric [number]
```
#### Résumé des routes
```
R1(config-router)#[no] auto-summary

R1(config-router)#auto-summary
R1(config-router)#no auto-summary
```

## EIGRP - commande router EIGRP
#### Activation
```
Router1(config)# router eigrp autonomous-system
Router1(config)# router eigrp 65100
```

#### identifiant du routeur
```
Router1(config-router)# eigrp router-id [ipv4-address]
```

#### résumé des routes
```
Router1(config-router)#[no] auto-summary

Router1(config-router)# auto-summary
Router1(config-router)# no auto-summary
```

#### commande network : réseaux conntectés
```
Router1(config-router)# network [network address]
Router1(config-router)# network 172.16.0.0
```

#### Redistribution static
```
Router1(config-router)#redistribute static
```

#### Résumé mmanuel de route
```
R1(config-if)#ip summary-address [eigrp] [as-number] [network-address] [subnet-mask]
```

#### Commande passive-interface : arrêter l'envoi des maj
```
Router1(config-router)#passive-interface [id_interface]

```

#### Commande affichage principales EIGRP
```
show ip eigrp neighbors
show ip eigrp topology
show ip eigrp topology all-links
show ip eigrp interfaces
```

#### Commandes de bases
```
show ip protocols
show ip route
show ip interfaces brief
```

#### Debugging
```
debug ip eigrp
```

# CHAPITRE 7 : LISTES DE CONTRÔLE D'ACCÈS
## ACL
- permet de contrôler le trafic entrant et sortant d'un réseau par filtrages des paquets
- prises de décision d'acheminement : addresse IP source/destination, protocole de couches supérieures, port source/destination
- les actions effectuées :
  - limite le trafic réseau, contrôle le flux de trafic
  - niveau de sécurité de base pour l'accès de réseau
  - détermine le type de trafic à acheminer ou bloquer sur les interfaces de router
  - contrôle les zones que les clients peuvent accéder
  - refuse ou accepte les hôtes pour l'accès aux services sur le réseau
- ACl se termine par une instruction implicite finale de refus : "deny any" ou "deny all trafic"

#### masque générique
- une châine de chiffres binaires qui spécifie au router quelle partie d'une adresse IP est à examiner
- fonctionnement :
  - 0 : la veleur correspondante de l'adresse ip doit être comparée et correspondance exigée
  - 1 :  la valer correspondante de l'adresse ip doit pas être comparée, pas de correspondance exigée
  - exemples: 
    - 00000000 00000000 00000000 00000000 Tous les bits de l’adresse doivent être examiné.
    - 00000000 00000000 00000000 00111111 Les 26 premiers bits de l’adresse doivent être examiné.
    - 11111111 11111111 11111111 11111111 L’adresse n’a pas besoin d’être examinée

#### Mots clés host et any
**host** : remplace le masque générique 0.0.0.0
```
host [adresse ip]
host 192.168.10.10
```
192.168.10.10 est équivalent à 192.168.10.10 0.0.0.0.

**any** : remplace l'adresse IP 0.0.0.0 et le masque 255.255.255.255
```
any
```

## Commandes ACL
#### Création d'une ACL en mode de configuration
```
access-list [access-list-number] { deny | permit } condition_de_test

access-list 117 permit tcp 10.136.0.0 0.0.3.255 host 10.136.9.66 eq telnet log
access-list 117 deny tcp any any eq telnet
access-list 117 permit ip any any
```

#### application d'une ACL en mode d'interface'
```
protocol access-group [access-list-number] { in | out }

interface FastEthernet0/0
ip address 10.136.9.66 255.255.255.192
ip access-group 117 in

```

#### Affiche le contenu de toutes les ACLS programmés sur le routeur
```
Extended IP access list [number]

Extended IP access list 117
```

#### vérification d'une ACL
```
show ip interface [interface]

show ip interface fa0/0
```

#### Troubleshoot configuration ACL
```
Router# debug ip packet [access-list-number] [detail]
```

## ACL nommées IP
#### Création d'une ACL nommées
```
Router1(config)# ip access-list { extended | standard } [nom]
```

## Contrôle de l'accès au terminal virtuel VTY
```
Routeur1(config)#line vty 0 4
Routeur1(config-line)#access-class 11 in
```
 
# CHAPITRE 8 : PROTOCOLE DHCP

# CHAPITRE 9 : NAT POUR IPV4 ET IPV6

# CHAPITRE 10 : DECOUVERTE, GESTION ET MAINTENANCE DES PHÉRIPHERIQUES


****************************************************************************************************************
*******************************************************644-11***************************************************
****************************************************************************************************************

# COMMUTATION DE COUCHE 3

# CONNEXIONS POINT À POINT - PPP 

# LISTES DE CONTRÔLE D'ACCÈES - ACL

# CONNEXION WAN - TUNNEL GRE

# CONNEXION WAN - PPPOE

# TRADUCTION D'ADDRESSE RESEAU - NAT PAT NAT-PT 

# DHCP IPV6

# SURVEILLANCE DHCP

# FRAME RELAY

# ISDN

# SURVEILLANCE DU RESEAU LOGS SNMP

# BGP - NOTIONS

