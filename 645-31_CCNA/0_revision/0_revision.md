# Revision EIGRP - OSPF

## Router
- Choisir l'interface à configurer
- Mettre l'adresse IP correspondante
- Activé l'interface'
#### Interface 
```
int g0/0
description vers R2
ip address 192.168.8.1 255.255.255.0
no shutdown

```

#### EIGRP
- Activer l'EIGRP soit 65100 ou 65200
- Ajouter les réseaux qui sont directement connectés au routeur
- Propager la table de routage à un autre protocole de routage
```
router EIGRP 65200
network 192.168.2.0
redistribute ospf 1 metric 10000 100 255 1 1500
```

#### OSPF
- Activer OSPF avec un nombre unique
- Ajouter un router ID le plus bas au routeur le plus proche de RC
- Ajouter les réseaux qui sont directement connectés au routeur avec l'area
- Propager la table de routage à un autre protocole de routage
```
router OSPF 1
router-id 1.1.1.1
network 192.168.4.0 0.0.0.255 area 0

// un des deux pour propager la table de routage
default-information originate

```
