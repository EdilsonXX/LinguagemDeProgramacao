package br.edu.ifba.back.gincana.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifba.back.gincana.model.CriterioModel;
import br.edu.ifba.back.gincana.repository.CriterioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping ("/criterio")

public class CriterioController {

private CriterioRepository repository;

public CriterioController(CriterioRepository repository) {
	super();
	this.repository = repository;
}

@GetMapping
public String teste() {
	return "Testando Rota Usuario";
}


@GetMapping("/listall")
public List<CriterioModel> listall() {
	var criterios = repository.findAll();
	return criterios;
}


@GetMapping("/{id}")
public CriterioModel findById(@PathVariable("id") Long id) {
	Optional<CriterioModel> obj = repository.findById(id);
	if ( obj.isPresent() )
		return obj.get();
    return null;
}

@PostMapping("/")
@ResponseStatus( HttpStatus.CREATED )
public boolean insert(@RequestBody CriterioModel model){
	System.out.println("server - insert: " + model);
	try {
		repository.save(model);
		System.out.println("server - insert: TRUE");
		return true;
	}
	catch (Exception e) {
		System.out.println("server - insert: FALSE");
		e.printStackTrace();
		return false;
	}
}

@DeleteMapping("/{id}")
@ResponseStatus( HttpStatus.ACCEPTED )
public boolean delete(@PathVariable("id") Long id) {
	System.out.println("delete");
	try {
		repository.deleteById(id);
		return true;
	}
	catch (Exception e) {
		return false;
	}
}


@PutMapping("/{id}")
@ResponseStatus( HttpStatus.CREATED )
public ResponseEntity<CriterioModel> update(@PathVariable("id") Long id, @RequestBody CriterioModel criterioModel) {
	var p = repository.findById(id);
    if (p.isPresent()) {
        var criterio = p.get();
        if ( criterioModel.getNome_Criterio() != null )
        	criterio.setNome_Criterio(criterioModel.getNome_Criterio());
        if ( criterioModel.getPontuacao_Criterio() != null )
        	criterio.setPontuacao_Criterio(criterioModel.getPontuacao_Criterio());
        if ( criterioModel.getProva() != null )
        	criterio.setProva(criterioModel.getProva());
        repository.save(criterio);
        return ResponseEntity.ok(criterio);
    } else {
    	return ResponseEntity.notFound().build();
    }
}
	
}