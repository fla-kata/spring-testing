package example.weather;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.PactProviderRuleMk2;
import au.com.dius.pact.consumer.PactVerification;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;
import example.helper.FileLoader;
import org.apache.http.entity.ContentType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

// Documentation : https://github.com/DiUS/pact-jvm/tree/master/pact-jvm-consumer-junit
// 1. Annotations a completer
public class WeatherClientConsumerTest {

    // 2. injecter le SUT
    // 3. declarer Pact JUnit Rule representant le fournisseur

    // 4. ecrire une méthode qui retourne un fragment de données (weatherApiResponse) en utilisant FileLoader
    // 5. ecrire un test qui appel la méthode fetchWeather et vérifier une information de la réponse (summary == rain)

}
