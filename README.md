<h1>Projet Spring Boot - Gestion des Comptes</h1>

<p>Ce projet couvre différentes étapes pour créer et tester une application Spring Boot pour la gestion des comptes, en suivant les questions fournies.</p>

<h2>1. Créer un projet Spring Boot avec les dépendances Web, Spring Data JPA, H2, Lombok</h2>
    <p><strong>Description :</strong> Initialiser un projet Spring Boot avec les dépendances nécessaires pour la gestion des comptes.</p>

<h2>2. Créer l'entité JPA Compte</h2>
<p><strong>Description :</strong> Définir l'entité <code>Compte</code> avec des attributs tels que <code>id</code>, <code>balance</code>, et <code>currency</code>.</p>
<img src="./images/class_Compte.png" alt="Class Compte" width="500">

<h2>3. Créer l'interface CompteRepository basée sur Spring Data</h2>
<p><strong>Description :</strong> Créer un repository qui étend <code>JpaRepository</code> pour gérer les entités <code>Compte</code>.</p>
<img src="./images/Compte_Repository.png" alt="Compte Repository" width="500">

<h2>4. Tester la couche DAO</h2>
<p><strong>Description :</strong> Tester les méthodes CRUD de <code>CompteRepository</code> avec une base de données en mémoire H2.</p>
<img src="./images/Compte_BD.png" alt="Compte BD" width="500">

<h2>5. Créer le Web service Restful qui permet de gérer des comptes</h2>
<p><strong>Description :</strong> Créer un service Rest qui permet d'effectuer des opérations sur les comptes (ajouter, supprimer, modifier).</p>
<img src="./images/RestFull.png" alt="RestFull Service" width="500">

<h2>6. Tester le web micro-service en utilisant un client REST comme Postman</h2>
<p><strong>Description :</strong> Tester les points d'entrée de l'API Rest avec Postman.</p>
<p>Exemple de méthode GET :</p>
<img src="./images/GET_Compte_Postman.png" alt="GET Compte Postman" width="500">
<p>Exemple de méthode POST :</p>
<img src="./images/POST_Compte_Postman.png" alt="POST Compte Postman" width="500">

<h2>7. Générer et tester la documentation Swagger des API Rest du Web service</h2>
<p><strong>Description :</strong> Ajouter la documentation Swagger pour décrire les endpoints de l'API.</p>
<img src="./images/swagger_ui.png" alt="Swagger UI" width="500">

<h2>8. Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections</h2>
<p><strong>Description :</strong> Exposer des projections pour les entités afin de limiter les données exposées via l'API Rest.</p>
<p>Déjà illustré : <code>@RepositoryRestResource</code></p>

<h2>9. Créer les DTOs et Mappers</h2>
<p><strong>Description :</strong> Implémenter les DTOs (Data Transfer Objects) et les mappers pour transformer les entités en objets adaptés au transfert via l'API.</p>
<p>BankAccountRequestDTO &amp; BankAccountResponseDTO</p>

<h2>10. Créer la couche Service (métier) et du micro service</h2>
<p><strong>Description :</strong> Implémenter la couche service pour la logique métier et l'intégration avec l'API.</p>
<img src="./images/Couche_Service.png" alt="Couche Service" width="500">

<h2>11. Créer un Web service GraphQL pour ce Micro-service</h2>
<p><strong>Description :</strong> Implémenter un service GraphQL pour l'interrogation des données de compte.</p>
<p>Schema "GraphQL"</p>
<img src="./images/schema_GraphQL.png" alt="Schema GraphQL" width="500">
<p>Classe "AccountGraphQLController"</p>
<img src="./images/classe_GraphQL.png" alt="Classe GraphQL" width="500">

<h2>Quelques Affichages avec GraphQL</h2>
<img src="./images/capture_1.png" alt="Capture 1" width="500">
<img src="./images/capture_2.png" alt="Capture 2" width="500">
<img src="./images/capture_3.png" alt="Capture 3" width="500">
<img src="./images/capture_7.png" alt="Capture 7" width="500">
<img src="./images/capture_12.png" alt="Capture 12" width="500">
