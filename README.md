# 📒 Gestionnaire de Contacts en Java

Ce projet est une application console en Java qui permet de gérer une liste de contacts (ajouter, supprimer, rechercher, afficher). Les contacts sont enregistrés dans un fichier texte au format CSV.

## ✨ Fonctionnalités

- Ajouter un contact (prénom, nom, email, téléphone)
- Supprimer un contact par email
- Rechercher un contact par nom de famille
- Afficher tous les contacts
- Sauvegarde automatique dans un fichier texte
- Lecture des contacts à chaque démarrage
- Gestion dynamique du chemin vers le fichier de contacts

## 🧱 Architecture

- `Contact` : modèle de données représentant un contact
- `ContactManager` : logique métier (ajout, suppression, recherche)
- `ContactReader` : lecture des contacts depuis un fichier
- `ContactWriter` : écriture des contacts dans un fichier
- `Main` : interface console avec menu utilisateur

## 🗃️ Stockage des données

Les contacts sont stockés dans un fichier CSV (ex : `contacts.txt`) au format :
```
Prénom,Nom,Email,Téléphone
```
> Le chemin du fichier peut être défini dynamiquement par l'utilisateur.

## ⚙️ Utilisation

Lancer le programme depuis `Main.java`.  
Suivre les instructions affichées dans la console :

1. Choisir une action (ajouter, afficher, supprimer, rechercher)
2. Fournir les informations demandées
3. Les données sont automatiquement enregistrées

## 🚀 Exécution

Compilation :
```bash
javac -d out src/org/example/**/*.java
```

Exécution :
```bash
java -cp out org.example.Main
```

## 🗂️ Structure du projet

```text
📁 Projet Java - Gestionnaire de Contacts
│
├── 📁 src
│   └── 📁 org
│       └── 📁 example
│           ├── 📄 Main.java                # Interface console principale
│           │
│           ├── 📁 model
│           │   └── 📄 Contact.java         # Classe Contact (POJO)
│           │
│           ├── 📁 io
│           │   ├── 📄 ContactReader.java   # Lecture des contacts depuis un fichier
│           │   └── 📄 ContactWriter.java   # Écriture des contacts dans un fichier
│           │
│           └── 📁 service
│               └── 📄 ContactManager.java  # Logique métier (ajout, suppression, recherche)
│
├── 📁 docs
│   └── 📄 README.md                        # Documentation du projet
│
└── 📁 data (optionnel)
    └── 📄 contacts.txt                     # Fichier CSV contenant les contacts
```

## 🙋‍♂️ Auteur

- Projet développé par Moi, dans le cadre de ma montée en compétences en Java
- Objectif : structuration d’une application complète, sans ORM, avec gestion de fichiers

## 📄 Licence

Ce projet est open-source. Tu peux le modifier, l’adapter ou t’en inspirer librement.