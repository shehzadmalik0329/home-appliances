Create Spring boot application.
APIs to create appliance, update appliance and delete appliance.
Create docker compose(docker-compose-mysql.yml) file for MySQL database.
Run docker compose file using docker desktop.
Connect Spring Boot application to MySQL database running on docker(locally).

##############################################################################

APIs to get appliance by Id and get all appliances.
Add logging dependencies in build.gradle
	implementation 'org.springframework.boot:spring-boot-starter'
	implementation 'org.springframework.boot:spring-boot-starter-logging'

Create logback-spring.xml in src/main/resources to generate rolling log files based on size of file.
