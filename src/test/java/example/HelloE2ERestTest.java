package example;

import org.junit.After;
import org.junit.Test;

// 1. Ajouter annotations pour demarrer l'application sur un port aléatoire
public class HelloE2ERestTest {

    // 2. Injecter le repository
    // 3. Recuperer le port affecté au lancement de l'appli
    private int port;

    // 4. vider le repository
    @After
    public void tearDown() throws Exception {
        // TODO
    }

    // 5. Tester en utilisant REST-Assured que l'URL hello repond "Hello World!" avec un status 200.
    @Test
    public void shouldReturnHelloWorld() throws Exception {
        // TODO
    }

    // 6. Tester en utilisant REST-Assured que l'URL hello/Pan repond "Hello Peter Pan!" avec un status 200.
    @Test
    public void shouldReturnGreeting() throws Exception {
        // TODO
    }
}
