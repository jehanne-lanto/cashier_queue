# Simulation de files d’attente — Q2 (plusieurs caisses)

Ce projet implémente la **Question 2** du labo : gestion *d’ensembles de caisses* (`Set`) avec répartition vers la **file la plus courte**.

## Fichiers
- Queue.java, ArrayQueue.java
- Client.java, Cashier.java
- Set.java (implémenté)
- Modeling2.java (programme principal)

## Exécuter
```bash
javac *.java
java Modeling2
```

## Notes
- `Modeling2` crée 1 **ligne rapide** et 2 **lignes normales** (voir constants et `FAST_MAX_ITEMS` dans `Modeling2`). 
- `Set.add(Client)` envoie le client vers la **file la plus courte** de l’ensemble concerné.
- `Set.servedClients(int currentTime)` fait avancer toutes les caisses d’un “tick”.