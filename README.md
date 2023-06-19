# nagp

This project is responsible for managing order related operations like fetching orders for a user.

This is small microservice developed using a spring boot which exposes below operation currently.

http://servernameorserverip:serverport/getOrdersByUser/{userKey}  --> Fetches order for a specific user

Database :

Application use mysql database. Properties releated to local database database are configured in application-local.properties file.

Database url : jdbc:mysql://localhost:3306/ems
username : root
Password : root

Steps to run the application on local machine :

1) Right click and go to run as configuration and mentioned below property in VM argument to run in local profile.

	-Dspring.profiles.active=local

2) Click run and it run the application. We can inovoke required api using url as mentioned in above sections.

Steps to build docker image :

1) This project has required Dockerfile in codebase.Make sure you have at correct directory in terminal where you checked out code and Dockerfile is placed.
2) Run command maven command --> mvn spring-boot:build-image  It will generate image with artifact id name mentioned in pom file. E.g nagp:0.0.1-SNAPSHOT
3) To push it to docker hub, you need to have repo at docker hub. e.g vpnkmr764/nagp
4) Use below commands for pushing to docker hub

        docker tag nagp:0.0.1-SNAPSHOT vpnkmr764/nagp
        docker push vpnkmr764/nagp
   If you face authentication issues while pushing , then you need to login first using command docker login
