package br.com.kentec;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tools.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class JavaphpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaphpApplication.class, args);
		
        try {
            HttpClient client = HttpClient.newHttpClient();

            String json = "{\"nome\": \"Kennedy\", \"email\": \"kennedy@kentec.com\"}";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://cold.kentec.com.br/post.php"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Código de resposta: " + response.statusCode());
            System.out.println("Corpo da resposta: " + response.body());
            
            var pegaJson = response.body();
            
            ObjectMapper mapper = new ObjectMapper();
            Teste teste = mapper.readValue(pegaJson, Teste.class);

            System.out.println(teste.getMensagem());

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
