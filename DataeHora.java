package dataEhora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataeHora {

	public static void main(String[] args) {
		
		// =========================================================================
		// 1. FORMATAÇÃO / CUSTOMIZAÇÃO
		// =========================================================================
		// Define o padrão/molde de leitura para textos customizados (fora do ISO 8601)
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		// =========================================================================
		// 2. INSTANCIAÇÃO (AGORA - MOMENTO ATUAL)
		// =========================================================================
		LocalDate d01 = LocalDate.now();              // Data local atual (ano-mês-dia) sem fuso horário
		LocalDateTime d02 = LocalDateTime.now();      // Data e hora local atual (ano-mês-dia-hora-minutos) sem fuso
		Instant d03 = Instant.now();                  // Data e hora global atual no padrão GMT/UTC (Hora de Londres / "Z")
		
		// =========================================================================
		// 3. INSTANCIAÇÃO (PARSING - TEXTO ISO 8601 PARA OBJETO)
		// =========================================================================
		LocalDate d04 = LocalDate.parse("2026-07-20");                     // Texto ISO 8601 Local ➞ LocalDate
		LocalDateTime d05 = LocalDateTime.parse("2026-07-20T01:30:26");   // Texto ISO 8601 Local com horário ➞ LocalDateTime
		Instant d06 = Instant.parse("2026-07-20T01:30:26Z");               // Texto ISO 8601 Global (Z - Zulu time) ➞ Instant
		Instant d07 = Instant.parse("2026-07-20T01:30:26-03:00");          // Texto ISO 8601 Global com fuso do local (ex: São Paulo GMT-3) ➞ Instant
		
		// =========================================================================
		// 4. INSTANCIAÇÃO (PARSING - TEXTO CUSTOMIZADO UTILIZANDO FORMATTER)
		// =========================================================================
		LocalDate d08 = LocalDate.parse("20/07/2026", fmt1);               // Usa o padrão customizado fmt1 para ler o texto br
		LocalDateTime d09 = LocalDateTime.parse("20/07/2026 01:30", fmt2); // Usa o padrão customizado fmt2 para ler texto br com hora
		
		// =========================================================================
		// 5. INSTANCIAÇÃO (DADOS ISOLADOS - DIA, MÊS, ANO)
		// =========================================================================
		LocalDate d10 = LocalDate.of(2022, 7, 20);                         // Gera uma data local passando inteiros isolados
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);          // Gera data e hora local passando inteiros isolados
		
		// =========================================================================
		// 6. EXIBIÇÃO NO CONSOLE
		// =========================================================================
		System.out.println("Data: " + d01);
		System.out.println("Data e hora: " + d02);
		System.out.println("Data e hora(padrão GMT): " + d03);
		System.out.println("Data (ISO 8601): " + d04);
		System.out.println("Data e Hora (ISO 8601): " + d05);
		System.out.println("Data e Hora : " + d06);
		System.out.println("Data e Hora : " + d07);
		System.out.println("Data e Hora : " + d08);
		System.out.println("Data e Hora : " + d09);
		System.out.println("Data e Hora : " + d10);
		System.out.println("Data e Hora : " + d11);
	}
}
