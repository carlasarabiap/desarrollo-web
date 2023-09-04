package ar.org.centro8.curso.especialidad.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan()		
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);

		/*
		 * Clase que despliega y configura el Server Tomcat
		 * 
		 * 
		 * En windows es necesario instalar gitbash
		 * instalar con vscode cerrado
		 * 
		 * para correr el script de spring-boot manualmente,
		 * sobre una consola bash ejecutar:
		 * sh mvnw spring-boot:run
		 * 
		 * 
		 * @SpringBootApplication		//esto declara la app Spring
		 * @ServletComponentScan()		//esto escanea y pone en linea los servlet
		 */
	}

}
