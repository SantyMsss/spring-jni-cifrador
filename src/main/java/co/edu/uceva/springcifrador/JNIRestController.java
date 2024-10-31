package co.edu.uceva.springcifrador;

import ejemplojni.lib.JavaCifrador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jni-service")
public class JNIRestController {
    private final JavaCifrador cifrador;

    public JNIRestController() {
        this.cifrador = new JavaCifrador();
    }

    @GetMapping("/cifrarCesar/{mensaje}/{desplazamiento}")
    public String cifrarCesar(@PathVariable String mensaje, @PathVariable int desplazamiento) {
        cifrador.cifrarCesar(mensaje, desplazamiento);
        return mensaje;
    }

    @GetMapping("/descifrarCesar/{mensaje}/{desplazamiento}")
    public String descifrarCesar(@PathVariable String mensaje, @PathVariable int desplazamiento) {
        cifrador.descifrarCesar(mensaje, desplazamiento);
        return mensaje;
    }

    @GetMapping("/cifrarEscitala/{mensaje}/{numLineas}")
    public String cifrarEscitala(@PathVariable String mensaje, @PathVariable int numLineas) {
        cifrador.cifrarEscitala(mensaje, numLineas);
        return mensaje;
    }

    @GetMapping("/descifrarEscitala/{mensaje}/{numLineas}")
    public String descifrarEscitala(@PathVariable String mensaje, @PathVariable int numLineas) {
        cifrador.descifrarEscitala(mensaje, numLineas);
        return mensaje;
    }
}
