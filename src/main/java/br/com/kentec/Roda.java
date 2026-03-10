package br.com.kentec;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import tools.jackson.databind.ObjectMapper;

public class Roda {
	
	public void play() {
		for (int i = 0; i < 20; i++) {
	        try {
	            HttpClient client = HttpClient.newHttpClient();

	            String json = "{\"nome\": \"Kennedy\", \"email\": \"kennedy@ken.com\"}";

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
 
}
