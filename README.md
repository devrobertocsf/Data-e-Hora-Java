# 📅 Dominando Data e Hora no Java 8+ (API java.time)

Este repositório reúne exemplos práticos de manipulação, instanciação e conversão de datas e fusos horários utilizando a robusta API `java.time` introduzida a partir do Java 8. O objetivo é substituir de vez as antigas e problemáticas classes `Date` e `Calendar`.

## 🧠 Conceitos Importantes Estudados

### 1. Data-[Hora] Local vs Global

* **Data-[Hora] Local (`LocalDate`, `LocalDateTime`)**: Utilizada quando o momento exato do fuso horário não importa. Adequada para sistemas de região única, datas de nascimento ou registros internos de venda local (Ex: `2026-07-20`).
* **Data-Hora Global (`Instant`)**: Utilizada quando o momento exato importa para diferentes regiões do globo (sistemas web multi-região). É baseada no fuso **GMT/UTC** (Greenwich Mean Time), também conhecido como "Z" (*Zulu time*).

### 2. Timezone (Fuso Horário)

* O padrão mundial adota a hora de Londres como ponto zero (**UTC/GMT**).
* Fusos de outras regiões são calculados de forma relativa. Exemplo: São Paulo adota o padrão **GMT-3**.

### 3. Padrão ISO 8601

Todas as strings de texto utilizadas para alimentar o sistema seguem a padronização internacional ISO 8601:

* Local: `YYYY-MM-DD` ou `YYYY-MM-DDTHH:mm:ss`
* Global: `YYYY-MM-DDTHH:mm:ssZ` ou `YYYY-MM-DDTHH:mm:ss-03:00`

## 🛠️ Operações Implementadas no Código

* **Instanciação Dinâmica**: Captura do instante presente com `.now()`.
* **Parsing ISO 8601**: Conversão direta de strings internacionais em objetos Java com `.parse()`.
* **Parsing Customizado (`DateTimeFormatter`)**: Criação de máscaras de entrada para ler datas em formatos regionais brasileiros (`dd/MM/yyyy`).
* **Instanciação por Elementos (`.of`)**: Construção de objetos de data passando inteiros isolados para ano, mês e dia.

## 📂 Estrutura do Arquivo

* `DataeHora.java`: Classe principal contendo os cenários de teste de parsing, formatação e saída de logs padronizados.

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para clonar, estudar e utilizar o código!

---

*Projeto de portfólio desenvolvido por Roberto, focado no domínio de APIs fundamentais do ecossistema Java.*

---

