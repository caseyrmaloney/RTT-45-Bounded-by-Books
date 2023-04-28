# Bounded By Books 

Bounded by Books is a Java Spring Boot web application that allows book readers to join a more extensive community of the world of books. This application connects readers to friends and strangers with similar interests. The user can create an account that will store user information and books in the database to allow user customization. Through Bounded By Books, the user can explore books within the database and add them to their library. The user will be asked to search for a book from the title and then be able to add it to a specific bookshelf of their choosing. These bookshelves are then filtered and organized so users can see what books they have read, want to read, and are currently reading. The user can also add comments and reviews to the book. Anyone can see these comments to collaborate and gain insight into the book.

Additionally, users can collaborate through book clubs. These book clubs can have users reading the book at the same time. Users can then discuss ideas and theories about the book in real-time together as they continue throughout the book. Finally, Bounded By Books allows users to see breakdowns of their library. These breakdowns include graphs and charts of the type of books that they are reading. This breakdown can be from comparing genres, page lengths, books they finished vs. want to read, etc. This can give a reader better insight on their reading habits to find books in the future that they will enjoy.

The design concept behind this product is to create a new web application that utilizes data from a customized MySQL database to allow customization of playlists from the user. The database will enable users to grab novels to add them to their accounts and allow the application to understand relationships between the books and the user. This efficiently allows the user to customize and contribute to the website. This product will be created using Java, HTML, CSS, JavaScript, MySQL, Spring Boot, and Maven. This project is a newly created project that is not using any open-source project.
Using the Spring Boot framework, this application will connect the front end for account management, book searches, book reviews, and ratings. For storing what books belong to the user and displaying the data Spring Boot framework will rely on the MySql database and use JPA, Native, and Spring Data Queries to retrieve the information needed. The Spring Boot application will be deployed using a Maven instance to build, polish, and deploy the project using a local host on the browser. Data visualization will be used in this project to help the user break down the books in their libraries and give a better insight into the types of books they like. These visualizations will be using JavaScript with D3. It is a dynamic interactive way to show the data in an easily understandable way.


### Project Structure 

This entire project can be found within the capstone folder. In this folder you can find the different directories and packages that are required for the project to run. 

         - Src folder 
            The source folder contains the main application files. These files are under the Main folder. 
            This folder also holds the Unit testing folder that holds the JUnit testing for the native and JPA queries, 
            
            - Main Folder 
                - The file structure for the Main folder has three main directories: Java, Resources, and Webapp 
                
                Java: 
                 - The Jave package is the main source of the project. This is where you can find the entities, DAOS, Controllers, 
                 FormBeans, Config, Secuirty, and Validation packages.
                 
                Resources: 
                - This is where the application.properties is held. The application properties is where the Database and Tomcat
                configuration is for the web setup 
                
                Webapp:
                - Webapp is where you can find the jsp and pub folders. The jsp folder holds the jsp pages that are displayed on the
                website. When we call a new model and view it inside our controllers, they call the jsp files to show the website. 
                - Pub folder is where you can find the CSS, images, javascript, and font-family directories. These directories help
                with the functionality and the styling of the website. 
         
            - Test Folder 
               - The test folder file structure is one package that holds each DAO test class for the DAOs based on the database. Here in each 
               test case, we are testing the JPA and native queries that were written. 
       
       - Pom.xml 
          We set up and configured the project as a spring boot application in the pom file. This is also where we hold all of the 
          dependencies within the project. Some dependencies included are Tomcat, JSTL, Database, Utils (Lombok and maven), Spring security, 
          and test cases. 
          
### System Block Diagram 

![Screen Shot 2023-04-26 at 12 10 29 PM](https://user-images.githubusercontent.com/77736692/234636407-81fbcdf3-5eb3-4b79-8a05-01e17694d9bb.png)
This image portrays the high-level design of the application. The user will open the website on the computers and have access to all of Bounded By Books features. The web client application will be designed using HTML and CSS. It will communicate with the MySQL database through a maven project holding the Java Spring Boot application. This backend service will manage all user accounts and their books. It will then be deployed using a Maven Project. The backend will call a database schema from MySQL to get the data of the user, books, etc. 


### ER diagram of the Database 
![Screen Shot 2023-04-26 at 12 13 17 PM](https://user-images.githubusercontent.com/77736692/234637067-03e789a3-8ec8-4e6e-9080-1210ac013408.png)


This image portrays the breakdown and relationship of the database within the different tables. The database contains five total tables with many-to-many and many-to-one relationships. The user table holds one too many relationships with the user_books, comments, and user_roles table. It holds all the information of the user within the database. The user_books table is the table that tells us the relationship between the user and what books they have in their library. It contains two foreign key constraints to the books table and the user table. These foreign keys tell us which user has what book. The Comments table has a very similar nature to the user_books table. It holds the same two foreign key constraints: user_id and books_id. This keeps the comments based on the specific book and what user made the comment. The user_roles table holds one foreign key constraint for user_id. It tells us if the user is in an admin role or just a user. Finally, the books table contains all the information on the books in the database. 

                
### Documentations 
[Requirments Specifications](https://docs.google.com/document/d/1-NRYd2wN_MfQJJC4Ro55leC5uYyJsrInNJC-ozKja6k/edit?usp=sharing) 

[Software Development Plan](https://docs.google.com/document/d/1EhJgtx_CkIgp4-32XVee6gwIp5e2riDQkTuwHC9b5LM/edit?usp=sharing)

[Software Design Architecture](https://docs.google.com/document/d/1uafORZbAca-aD3swiFFtht0N7xQwefpxyO8LHUSfSRU/edit?usp=sharing) 
