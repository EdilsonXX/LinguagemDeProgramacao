package br.edu.ifba.back.gincana.repository;

import org.springframework.stereotype.Repository;

import br.edu.ifba.back.gincana.model.CriterioModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CriterioRepository extends JpaRepository<CriterioModel, Long>{
	
}