# Guide d'utilisation de l'application de quiz
# Présentation de l'application
    L'application de quiz est un outil d'apprentissage interactif qui permet aux utilisateurs de tester leurs connaissances sur un sujet donné en répondant à des questions. Elle est conçue pour être simple à utiliser et adaptée à différents niveaux de compétence. L'application utilise une base de données MySQL pour stocker les questions, les réponses et les résultats des quiz.

Quiz en ligne est un système de gestion des tests qui offre une solution complète pour les tests informatisés. Il est utilisé pour configurer un test à choix multiples pour des périodes de temps définies qui, une fois soumis, corrigeront automatiquement et afficheront les résultats.
Caractéristiques:
* Connexion  étudiant (utilisateur)
* Connexion  Professeur (administrateur )
* Affichage  le résultat final de l'examen de quiz, réponses correctes aux questions tentées et non tentées.
* Les professeurs peuvent créer, supprimer et mettre à jour  (CRUD)  les questions de quiz.

#Configuration de la base de données
Pour pouvoir utiliser l'application de quiz, vous devez configurer la base de données MySQL en créant les tables nécessaires. Voici les instructions pour configurer la base de données :

1 Ouvrez le logiciel de gestion de base de données MySQL.

2 Créez une nouvelle base de données en exécutant la commande suivante :

CREATE DATABASE quiz;

3 Utilisez la base de données en exécutant la commande suivante :

USE quiz;

4 Créez la table "test" en exécutant la commande suivante :

CREATE TABLE test (
  COMPTE VARCHAR(255) NOT NULL,
  MOTPASSE VARCHAR(255) NOT NULL,
  NOM VARCHAR(255) NOT NULL,
  PRENOM VARCHAR(255) NOT NULL,
  NIVEAU VARCHAR(255) NOT NULL,
  SUJET VARCHAR(255) NOT NULL,
  PRIMARY KEY (COMPTE)
);
5  Créez la table "question" en exécutant la commande suivante :

CREATE TABLE question (
  question_id VARCHAR(255) NOT NULL,
  QUESTION VARCHAR(255) NOT NULL,
  A VARCHAR(255) NOT NULL,
  B VARCHAR(255) NOT NULL,
  D VARCHAR(255) NOT NULL,
  C VARCHAR(255) NOT NULL,
  ANSWER VARCHAR(255) NOT NULL,
  SUBJECT VARCHAR(255) NOT NULL,
  PRIMARY KEY (question_id)
);
6 Créez la table "user" en exécutant la commande suivante :

CREATE TABLE user (
  COMPTE VARCHAR(255) NOT NULL,
  NOM VARCHAR(255) NOT NULL,
  PRENOM VARCHAR(255) NOT NULL,
  NOTE INT DEFAULT NULL,
  PRIMARY KEY (COMPTE)
);
7  Créez la table "compare" en exécutant la commande suivant:

CREATE TABLE compare (
  Nu VARCHAR(255) NOT NULL,
  Valeur VARCHAR(255) NOT NULL,
  PRIMARY KEY (Nu)
);
8 Créez la table "reponse" en exécutant la commande suivante :
CREATE TABLE reponse (
  Noo VARCHAR(255) NOT NULL,
  SA VARCHAR(255) NOT NULL,
  PRIMARY KEY (Noo)
);
# Utilisation de l'application
Voici comment utiliser l'application de quiz :

- Ouvrez l'application de quiz.
- Créez un nouveau compte en cliquant sur le bouton "Créer un compte".
- Connectez-vous à l'application en utilisant votre nom d'utilisateur et votre mot de passe.

-  démarrer le test.
- Répondez aux questions en sélectionnant la réponse correcte.
- Soumettez vos.
 



 