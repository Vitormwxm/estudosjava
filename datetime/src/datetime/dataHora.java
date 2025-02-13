package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dataHora {
	public static void main(String[] args) {
		// instancie data,hora e convetar 
		
		LocalDateTime d01 = LocalDateTime.now();
		LocalDateTime d03 = LocalDateTime.parse("2025-10-27T10:04:03");
		Instant d02 = Instant.parse("2024-10-27T10:04:03Z");
		
		DateTimeFormatter dateFormaterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		
			System.out.println(d01.format(dateFormaterBr));
			System.out.println(dateFormaterBr.format(d02));
		
			
		Duration duracao = Duration.between(d01, d03);
		
		System.out.println(duracao.toDays());
	}
}	
