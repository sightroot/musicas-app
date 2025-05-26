package br.senac.tads.dsw.musicas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MusicaService {
    
    @Autowired
    private MusicaRepository musicaRepository;

    public List<Musica> listarMusicas() {
        return musicaRepository.findAll();
    }

    public Musica salvarMusica(Musica musica) {
        musica.setDataCadastro(LocalDateTime.now());
        return musicaRepository.save(musica);
    }
}
