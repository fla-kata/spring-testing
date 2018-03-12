package example;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// 1. Ajouter annotations pour demarrer l'application sur un port aléatoire
public class HelloE2ESeleniumTest {

    // 2. Configurer le driver Selenium
    // 3. Recuperer le port affecté au lancement de l'appli

    // 4. Compléter en préparant le Manager de driver
    @BeforeClass
    public static void setUpClass() throws Exception {
        // TODO
    }

    // 5. instancier le driver
    @Before
    public void setUp() throws Exception {
        // TODO
    }

    // 6. fermer le Driver
    @After
    public void tearDown(){
        // TODO
    }

    // 7. Ecrire un test qui vérifie que le body contient "Hello World!"
    @Test
    public void helloPageHasTextHelloWorld() {
    }
}
