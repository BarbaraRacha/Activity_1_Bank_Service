# Projet Spring Boot - Gestion des Comptes

Ce projet couvre différentes étapes pour créer et tester une application Spring Boot pour la gestion des comptes, en suivant les questions fournies. 

## 1. Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok
- **Description**: Initialiser un projet Spring Boot avec les dépendances nécessaires pour la gestion des comptes.

## 2. Créer l'entité JPA Compte
- **Description**: Définir l'entité `Compte` avec des attributs tels que `id`, `balance`, et `currency`.
- ![Image 2](./images/image2.png)

## 3. Créer l'interface CompteRepository basée sur Spring Data
- **Description**: Créer un repository qui étend `JpaRepository` pour gérer les entités `Compte`.
- ![Image 3](./images/image3.png)

## 4. Tester la couche DAO
- **Description**: Tester les méthodes CRUD de `CompteRepository` avec une base de données en mémoire H2.
- ![Image 4](./images/image4.png)

## 5. Créer le Web service Restfull qui permet de gérer des comptes
- **Description**: Créer un service Rest qui permet d'effectuer des opérations sur les comptes (ajouter, supprimer, modifier).
- ![Image 5](./images/image5.png)

## 6. Tester le web micro-service en utilisant un client REST comme Postman
- **Description**: Tester les points d'entrée de l'API Rest avec Postman.
- ![Image 6](./images/image6.png)

## 7. Générer et tester la documentation Swagger de des API Rest du Web service
- **Description**: Ajouter la documentation Swagger pour décrire les endpoints de l'API.
- ![Image 7](./images/image7.png)

## 8. Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections
- **Description**: Exposer des projections pour les entités afin de limiter les données exposées via l'API Rest.
- déjà illustré: @RepositoryRestResource

## 9. Créer les DTOs et Mappers
- **Description**: Implémenter les DTOs (Data Transfer Objects) et les mappers pour transformer les entités en objets adaptés au transfert via l'API.
- BankAccountRequestDTO & BankAccountResponseDTO

## 10. Créer la couche Service (métier) et du micro service
- **Description**: Implémenter la couche service pour la logique métier et l'intégration avec l'API.
- ![Image 10](./images/image10.png)

## 11. Créer un Web service GraphQL pour ce Micro-service
- **Description**: Implémenter un service GraphQL pour l'interrogation des données de compte.
- Schema "GraphQL"
- ![Image 11](./images/image11.png)
- classe "AccountGraphQLController"
- ![Image 11](./images/image11.png)

