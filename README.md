# Projet de Dépistage de Paludisme en Python et Java

Ce projet implémente un système de dépistage du paludisme en utilisant plusieurs patrons de conception en Python et Java. Les patrons de conception utilisés incluent Singleton, Abstract Factory, Composite, Decorator, Observer et Strategy.

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

### Pré-requis

- Python 3.x
- JDK (Java Development Kit)

### Instructions

#### Exécution du Code Java

Pour exécuter le projet Java, suivez ces étapes :

1. Clonez le dépôt ou téléchargez les fichiers sources.
2. Assurez-vous d'avoir le JDK installé.
3. Compilez les fichiers Java :

    ```bash
    javac *.java
    ```

4. Exécutez le fichier principal :

    ```bash
    java Main
    ```

#### Exécution du Code Python

Pour exécuter le projet Python, suivez ces étapes :

1. Clonez le dépôt ou téléchargez les fichiers sources.
2. Assurez-vous d'avoir Python 3.x installé.
3. Exécutez le script principal :

    ```bash
    python3 app.py
    ```

## Fonctionnalités

- **Laboratoire Singleton** : Assure qu'il n'y ait qu'une seule instance du laboratoire.
- **Usines Abstraites** : Création d'objets sans spécifier la classe concrète.
- **Composite** : Permet de traiter des objets individuels et des compositions de manière uniforme.
- **Decorator** : Ajoute dynamiquement des responsabilités aux objets.
- **Observer** : Permet à un objet d'être notifié lorsque l'état d'un autre objet change.
- **Strategy** : Permet de définir une famille d'algorithmes, de les encapsuler dans des classes séparées et de les rendre interchangeables.
