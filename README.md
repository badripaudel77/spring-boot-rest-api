# spring-boot-rest-api
Spring boot and spring data JPA rest api. User and Post scenario with basics operations implemented.

---------------------------------------------------------------------------------------------------


Small social site like REST API design with following features include.

1) User can register and login (for now I am skipping email verification and password reset )
2) User can perform CRUD operation for his / her account.
3) User can post a post with few details like (image url, title,etc.) and CRUD operations.



TECH STACKS :
-------------
JAVA, Spring Boot, Spring data JPA, MySQL, REST API,Maven etc.
--------------------------------------------------------------

Run Project Using maven using @command  : mvn spring-boot:run

------------------------------------------
Documenting APIs using Swagger [Swagger 2]
-------------------------------------------
- Add the Swagger 2 dependency
- Enable Swagger 2 using  @EanbleSwagger2 dependency in the root class (containing main class) or using configuration file

Access using : baseURL/v2/api-docs [for json docs]

Swagger-UI dependency [for html-ui docs]
Access using : baseURL/swagger-ui.html [for HTML UI docs]

!ScreenShot[https://github.com/badripaudel77/spring-boot-rest-api/blob/main/images/Capture1.PNG?raw=true]

!ScreenShot[https://github.com/badripaudel77/spring-boot-rest-api/blob/main/images/Capture2.PNG?raw=true]

!ScreenShot[https://github.com/badripaudel77/spring-boot-rest-api/blob/main/images/Capture3.PNG?raw=true]
