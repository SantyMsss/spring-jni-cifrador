package co.edu.uceva.springcifrador;

import ejemplojni.lib.JavaCifrador;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jni-service")
public class JNIRestController {
    private final JavaCifrador cifrador;

    public JNIRestController() {
        this.cifrador = new JavaCifrador();
    }

    @GetMapping("/cifrarCesar/{mensaje}/{desplazamiento}")
    public String cifrarCesar(@PathVariable String mensaje, @PathVariable int desplazamiento) {
        return cifrador.cifrarCesar(mensaje, desplazamiento);
    }

    @GetMapping("/descifrarCesar/{mensaje}/{desplazamiento}")
    public String descifrarCesar(@PathVariable String mensaje, @PathVariable int desplazamiento) {
        return cifrador.descifrarCesar(mensaje, desplazamiento);
    }

    @GetMapping("/cifrarEscitala/{mensaje}/{numLineas}")
    public String cifrarEscitala(@PathVariable String mensaje, @PathVariable int numLineas) {
        return cifrador.cifrarEscitala(mensaje, numLineas);
    }

    @GetMapping("/descifrarEscitala/{mensaje}/{numLineas}")
    public String descifrarEscitala(@PathVariable String mensaje, @PathVariable int numLineas) {
        return cifrador.descifrarEscitala(mensaje, numLineas);
    }
}
