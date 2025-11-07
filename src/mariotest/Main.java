package mariotest;

/**
 * Punto de entrada único del juego
 * Responsabilidad: Solo arrancar la aplicación
 * 
 * Principio: KISS (Keep It Simple)
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("\n==============================================");
        System.out.println("   " + Configuracion.NOMBRE_JUEGO);
        System.out.println("==============================================\n");
        
        try {
            // Crear y arrancar el juego
            Juego juego = new Juego();
            juego.iniciar();
            
        } catch (Exception e) {
            System.err.println("\n[FATAL] Error al iniciar el juego:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}