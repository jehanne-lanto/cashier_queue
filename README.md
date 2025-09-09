# Simulation de files d’attente Java

Projet de cours : Modélise et implémente la gestion d'un ensemble de caisses.

## Fonctionnalités
- Acheminement vers la file la plus courte
- Mesure du temps moyen d'attente par caisse
- Nombre moyen articles par client et nombre de clients servis par caisse

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

## Exemple  
The duration of modeling was 28800 seconds
FAST LINES :
LINE 0 :
The total number of clients served is 337
The average number of items per client was 6
The average time (in seconds) was 13

NORMAL LINES :
LINE 0 :
The total number of clients served is 251
The average number of items per client was 18
The average time (in seconds) was 47

LINE 1 :
The total number of clients served is 106
The average number of items per client was 18
The average time (in seconds) was 40


<details>
  <summary>English (summary)</summary>

# Queue Simulation — Java 

A discrete-event simulation of a supermarket with **fast** and **normal** lanes. Customers with ≤ 12 items are routed to fast lanes. Each tick advances all cashiers, and new customers arrive with a fixed probability. A greedy policy always sends a customer to the **shortest queue** within the relevant set (fast/normal).

## Key features
- Multi-lane sets: 1 fast lane, 2 normal lanes (configured in `Modeling2`)
- Shortest-queue routing (greedy)
- Per-lane metrics: **average wait time**, **average items per customer**, **clients served**
- Generic array-based queue (`Queue<E>`, `ArrayQueue<E>`) with O(1) enqueue/dequeue

## Files
- `Queue.java`, `ArrayQueue.java`
- `Client.java`, `Cashier.java`
- `Set.java` — set of cashiers/lanes
- `Modeling2.java` — main driver

## Run
```bash
javac *.java
java Modeling2
Sample output
pgsql
Copier le code
The duration of modeling was 28800 seconds
FAST LINES :
LINE 0 :
The total number of clients served is 337
The average number of items per client was 6
The average time (in seconds) was 13

NORMAL LINES :
LINE 0 :
The total number of clients served is 251
The average number of items per client was 18
The average time (in seconds) was 47

LINE 1 :
The total number of clients served is 106
The average number of items per client was 18
The average time (in seconds) was 40
