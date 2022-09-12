package br.ifba.tarefa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.ifba.tarefa.model.TarefaModel;
import br.ifba.tarefa.repository.TarefaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping ("/tarefa")
public class TarefaController {

	private TarefaRepository tarRepository;
	
	public TarefaController(TarefaRepository tarRepository) {
		super();
		this.tarRepository = tarRepository;
	}
	
	@GetMapping ("/listall")
	 public List<TarefaModel> listall() {
		var tarefas = tarRepository.findAll();
		return tarefas;
	}
	
	@GetMapping ("/{id}")
	public TarefaModel findById(@PathVariable("id") Long id) {
		Optional<TarefaModel> tarefa = tarRepository.findById(id);
		if(tarefa.isPresent())
			return tarefa.get();
		return null;
		
	}
	
	@PostMapping("/")
	@ResponseStatus (HttpStatus.CREATED)
	public boolean insert (@RequestBody TarefaModel tarefaModel) {
		try {
			tarRepository.save(tarefaModel);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
		
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus (HttpStatus.ACCEPTED)
	public boolean delete (@PathVariable("id") Long id) {
		try {
			tarRepository.deleteById(id);
			return true;
		} 
		catch (Exception e) {
			return false;
		}
		
	}
	
	@GetMapping ("/")
	public String Teste ( ) {
		
		return "Testando rota";
		
	}
	
}
