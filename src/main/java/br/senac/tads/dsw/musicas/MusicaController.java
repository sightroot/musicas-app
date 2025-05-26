package br.senac.tads.dsw.musicas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    // Endpoint para listar todas as músicas em formato JSON
    @GetMapping
    public List<Musica> listarMusicas() {
        return musicaService.listarMusicas();
    }

    // Endpoint para adicionar uma nova música
    @PostMapping("/novo")
    public Musica adicionarMusica(@RequestBody Musica musica) {
        return musicaService.salvarMusica(musica);
    }
}