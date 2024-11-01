package co.edu.uceva.springcifrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringCifradorApplication {



	private static final Logger logger = LoggerFactory.getLogger(SpringCifradorApplication.class);
	static {
		logger.info("cifrador..."); // Carga libcifrador.so
		System.loadLibrary("cifrador");
		logger.info("Biblioteca cargada exitosamente!");
	}
	public static void main(String[] args) {
		logger.info("Iniciando aplicacion");
		SpringApplication.run(SpringCifradorApplication.class, args);

	}

}
