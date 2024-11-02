package co.edu.uceva.springcifrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringCifradorApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCifradorApplication.class);

	static {
		logger.info("Cargando la biblioteca nativa cifrador...");
		System.loadLibrary("cifrador"); // Asegúrate de que el nombre coincida con tu archivo .so sin "lib" y ".so"
		logger.info("Biblioteca cargada exitosamente!");
	}

	public static void main(String[] args) {
		logger.info("Iniciando aplicación Spring Boot");
		SpringApplication.run(SpringCifradorApplication.class, args);
	}
}
