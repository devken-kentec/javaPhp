package br.com.kentec;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaphpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaphpApplication.class, args);
		
		Roda r = new Roda();
		r.play();
		
		//Decoder dec = new Decoder();
		//dec.decoderStringHex("795841594c5a78357732684f4c4c483771");
		
	}

}
