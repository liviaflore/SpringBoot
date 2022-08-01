package br.com.generation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.generation.model.Anotacoes;

@Repository
public interface AnotacoesRespository extends JpaRepository<Anotacoes, Long> {

}
