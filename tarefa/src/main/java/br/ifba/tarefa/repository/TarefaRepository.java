package br.ifba.tarefa.repository;

import org.springframework.stereotype.Repository;
import br.ifba.tarefa.model.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long>{

}
