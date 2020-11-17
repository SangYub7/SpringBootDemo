# SpringBootDemo

1. New Spring Starter Project Dependencies


2.

pom.xml

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.mariadb.jdbc</groupId>
			<artifactId>mariadb-java-client</artifactId>
			<scope>runtime</scope>
		</dependency>
    
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>
application.properties

  spring.datasource.url=jdbc:mariadb://localhost:3306/test
  spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
  spring.datasource.username=root
  spring.datasource.password=root
  spring.jpa.open-in-view=false
  spring.jpa.show-sql=true

  spring.mvc.view.prefix=/WEB-INF/jsp/
  spring.mvc.view.suffix=.jsp



@Controller
public class MainController {	
	@RequestMapping("/index")
	public String MainPage()
	{	
		return "index";
	}
}
