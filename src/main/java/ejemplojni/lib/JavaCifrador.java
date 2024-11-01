package ejemplojni.lib;

/**
 * Clase que representa el cifrador con las funciones de la biblioteca dinámica JNI
 */
public class JavaCifrador {

    // Método nativo para cifrar con el cifrado César
    public native String cifrarCesar(String mensaje, int desplazamiento);

    // Método nativo para descifrar con el cifrado César
    public native String descifrarCesar(String mensaje, int desplazamiento);

    // Método nativo para cifrar con la Escítala Espartana
    public native String cifrarEscitala(String mensaje, int numLineas);

    // Método nativo para descifrar con la Escítala Espartana
    public native String descifrarEscitala(String mensaje, int numLineas);


}
