package example.weather;

import org.junit.Test;

// Documentation : http://wiremock.org/docs/getting-started/
// 1. Ajouter annotations pour demarrer l'application sur un port aléatoire
public class WeatherAcceptanceTest {

    // 2. Recuperer le port
    // 3. Instancier une regle wiremock sur le port 8089

    // 4. Ecrire un test qui vérifie le texte "Rain" comme body, un code Http 200 lorsque le endpoint /weather est appelé
    // Penser a stuber le service meteo externe
    @Test
    public void shouldReturnYesterdaysWeather() throws Exception {
        // TODO
    }
}
