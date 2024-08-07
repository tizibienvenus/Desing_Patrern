# Projet de Dépistage de Paludisme en Python

Ce projet implémente un système de dépistage du paludisme en utilisant plusieurs patrons de conception en Python. Les patrons de conception utilisés incluent Singleton, Abstract Factory, Composite, Decorator, Observer et Strategy.

## Structure du Projet

- **Abstract Factory** : Utilisé pour créer différents types de tests et équipements.
- **Singleton** : Assure qu'il n'y ait qu'une seule instance de la classe `Laboratoire`.
- **Composite** : Gère les équipements qui peuvent être composés de plusieurs sous-éléments.
- **Decorator** : Permet d'ajouter dynamiquement des fonctionnalités aux objets `Test`.
- **Observer** : Notifie les observateurs (médecins) des résultats des tests.
- **Strategy** : Permet de définir différentes manières de traiter les résultats des tests.

## Classes et Interfaces

### Abstract Factory

- `AbstractFactory` : Interface pour la création de tests et d'équipements.
- `RapidTestFactory` : Fabrique concrète pour les tests rapides et les microscopes.
- `LabTestFactory` : Fabrique concrète pour les tests de laboratoire et les centrifugeuses.

### Composite

- `EquipementComponent` : Interface pour les composants d'équipements.
- `Equipement` : Classe de base pour les équipements simples.
- `EquipementComposite` : Classe pour les équipements composés.

### Tests

- `Test` : Interface pour les tests.
- `BasicTest` : Implémentation d'un test de base.
- `RapidTest` : Implémentation d'un test rapide.
- `LabTest` : Implémentation d'un test de laboratoire.

### Decorator

- `TestDecorator` : Classe de base pour les décorateurs de tests.
- `AdvancedTestDecorator` : Ajoute des fonctionnalités avancées aux tests.

### Observer

- `Observer` : Interface pour les observateurs.
- `Medecin` : Observateur concret qui représente un médecin.
- `TestSubject` : Sujet observé qui notifie les observateurs de ses résultats.

### Strategy

- `TestStrategy` : Interface pour les stratégies de traitement des résultats.
- `SimpleProcessing` : Stratégie de traitement simple.
- `DetailedProcessing` : Stratégie de traitement détaillée.
- `TestProcessor` : Utilise une stratégie pour traiter les résultats des tests.

### Singleton

- `Laboratoire` : Classe singleton représentant le laboratoire.

## Exécution

Pour exécuter le projet, assurez-vous d'avoir Python installé sur votre machine. Sauvegardez le code ci-dessous dans un fichier nommé `app.py` et exécutez-le avec la commande suivante :

```bash
### Java
  javac *.java
  java Main

### Python
 python3 app.py
