# javacodingtask

Spring boot application to demonstrate public and secured apis with different roles.

Features : 
   
    1. registration and login with JWT token. 
    
    2. password encryption using B-crypt.
    
    3. Role based authorization.

Technology used : 
   
    1. Java 17 
    
    2. Spring Boot 3.1.3

    3. Mysql Database 


How to Run the application : 
   
    1. checkout the code.
    
    2. download all the dependency to run the application

    3. download mysql database

    4. change username and password in application.properties that matches your mysql username/password.

    5. run the main spring boot class.
    
  
    



public API : 


 1.     /api/v1/public/hello (Get Request) - return simple hello message

  <img width="661" alt="hellofrompublic" src="https://github.com/sudhirkr0304/javacodingtask/assets/37249975/a547ea9b-8927-4e36-acca-56d70a1a3539">

 2.     /api/v1/auth/register(Post Request) - it is used to register new user/admin in the system. It will return JWT token, which can be used to call the secured apis.
<img width="668" alt="adminregister" src="https://github.com/sudhirkr0304/javacodingtask/assets/37249975/ad391ef5-8aec-4d63-badf-118e823dd5a0">
<img width="661" alt="normaluserregister" src="https://github.com/sudhirkr0304/javacodingtask/assets/37249975/67c006df-ade6-4bb8-a9dc-8bb099b59a88">

 3.      /api/v1/auth/authenticate(Post request - It is used to login to the system. It will return JWT token, which can be used to call the secured apis.
    <img width="662" alt="authenticateuser" src="https://github.com/sudhirkr0304/javacodingtask/assets/37249975/8db8f0b7-d458-408c-a155-6c54940b75a2">








  Secured API 
  1.      /api/v1/user/hello (GET request) - It can be called by both user/admin, We need to pass the token we got from register/login to authentcate.
     <img width="661" alt="securedforuserandadmin" src="https://github.com/sudhirkr0304/javacodingtask/assets/37249975/2a6223b2-9396-439e-a74b-3899d09efd57">

  2.      /api/v1/admin/hello (Get request) - It can be called by only admin. We need to pass the token we got from register/login for the admin role user.
   <img width="662" alt="adminhello" src="https://github.com/sudhirkr0304/javacodingtask/assets/37249975/57141439-5454-4826-8df3-c954bf5b08e5">
