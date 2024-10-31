package ejemplojni.lib;



/**
 * Clase que representa el cifrador con las funciones de la biblioteca dinámica JNI
 */
public class JavaCifrador {

    // Método nativo para cifrar con el cifrado César
    public native void cifrarCesar(String mensaje, int desplazamiento);

    // Método nativo para descifrar con el cifrado César
    public native void descifrarCesar(String mensaje, int desplazamiento);

    // Método nativo para cifrar con la Escítala Espartana
    public native void cifrarEscitala(String mensaje, int numLineas);

    // Método nativo para descifrar con la Escítala Espartana
    public native void descifrarEscitala(String mensaje, int numLineas);

    // Constructor que carga la biblioteca
    public JavaCifrador() {

    }

}

