package br.senac.tads.dsw.musicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.senac.tads.dsw.musicas") // Substitua pelo seu pacote
public class MusicasApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicasApplication.class, args);
    }
}