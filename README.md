# gestion_consultation
## Introduction

Le projet **Gestion des Consultations** est une application web conçue pour faciliter la gestion des consultations médicales, en particulier la gestion des patients et de leurs consultations. Il permet également aux utilisateurs d'envoyer des messages via un formulaire de contact intégré. Ce système est développé avec **Spring Boot** pour la gestion du backend et **Thymeleaf** pour le rendu des pages web côté frontend.

Le but de ce projet est de fournir une plateforme simple et fonctionnelle qui aide à gérer les informations médicales tout en permettant une interaction via le formulaire de contact pour des retours ou des questions.

## Objectifs du projet

- **Gestion des Patients** : Ajouter, modifier et consulter les informations des patients.
- **Gestion des Consultations** : Permettre la gestion des consultations associées à chaque patient.
- **Formulaire de Contact** : Offrir aux utilisateurs la possibilité de contacter l'équipe via un formulaire de contact.
- **Interface Simple et Responsive** : Offrir une interface utilisateur simple, accessible depuis tous les types de périphériques (mobile, tablette, ordinateur).

## Technologies utilisées

1. **Spring Boot** : Framework principal pour le développement du backend. Il permet de gérer les requêtes HTTP et d'interagir avec la base de données pour stocker les informations des patients et des consultations.
2. **Thymeleaf** : Moteur de templates utilisé pour rendre les pages HTML côté serveur. Il est intégré avec Spring Boot pour faciliter le rendu dynamique des pages.
3. **Bootstrap** : Framework CSS pour une interface utilisateur responsive et moderne.

## Fonctionnalités de l'application

### 1. **Page d'accueil**

La page d'accueil affiche un aperçu général de l'application avec les liens vers les différentes sections :
- **Gérer les Patients** : Cette section permet à l'utilisateur de gérer les informations des patients (ajout, modification, suppression).
- **Voir les Consultations** : Permet à l'utilisateur de consulter la liste des consultations associées aux patients.
- **Contactez-nous** : Un lien pour accéder à la page de contact et envoyer des messages à l'équipe.
  ![image](https://github.com/user-attachments/assets/366339fa-9e88-4357-a52f-7913439cd95f)


### 2. **Gestion des Patients**

Cette fonctionnalité permet aux utilisateurs de :
- Ajouter de nouveaux patients.
- Modifier les informations d'un patient existant.
- Supprimer des patients.

Les informations essentielles comprennent le nom, le prénom, l'email et le numéro de téléphone.

### 3. **Gestion des Consultations**

La gestion des consultations permet de suivre les rendez-vous des patients. Chaque consultation est liée à un patient spécifique. L'utilisateur peut ajouter de nouvelles consultations, modifier ou supprimer celles existantes.

### 4. **Formulaire de Contact**

Un formulaire de contact est disponible sur la page dédiée pour permettre aux utilisateurs d'envoyer des messages à l'équipe de gestion de l'application. Ce formulaire recueille le nom, l'email et le message de l'utilisateur.

### 5. **Prérequis

Avant de pouvoir exécuter ce projet, assurez-vous que les outils et technologies suivants sont installés sur votre machine :

1. **Java JDK** : Spring Boot nécessite Java pour fonctionner.
2. **Maven** : Outil de gestion de projet pour Spring Boot.
3. **IDE (facultatif)** : **IntelliJ IDEA** pour un développement plus facile et efficace.
4. **Git** : Pour la gestion du code source et la connexion avec GitHub.

### 6. **Conclusion

Le projet **Gestion des Consultations** est une application web complète permettant de gérer efficacement les patients et leurs consultations, avec une interface simple et intuitive. L'intégration d'un formulaire de contact permet une communication facile entre les utilisateurs et l'équipe de développement.

Ce projet peut être étendu en ajoutant des fonctionnalités supplémentaires, telles que la gestion des ordonnances ou des rapports de consultation, selon les besoins futurs.

Nous espérons que ce projet sera utile et évolutif. N'hésitez pas à contribuer, poser des questions, ou proposer des améliorations via le formulaire de contact intégré.

Merci pour l'intérêt porté à ce projet !
