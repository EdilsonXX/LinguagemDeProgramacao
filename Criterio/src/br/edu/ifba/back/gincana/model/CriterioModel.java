package br.edu.ifba.back.gincana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.edu.ifba.back.gincana.model.ProvaModel;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import lombok.Data;

@Data
@Entity
@Table (name = "Criterio")

public class CriterioModel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column (name = "idCriterio")
	private long idCriterio;  
	
	@Column (name = "nomeCriterio", nullable = false, unique = true)
	private  String nomeCriterio;
	
	@Column (name = "pontuacaoCriterio", nullable = false)
	private  String pontuacaoCriterio;

	@ManyToOne
	@JoinColumn(nullable = false)
	private ProvaModal prova;
	
	
	public long getIdCriterio() {
		return idCriterio;
	}

	public void setIdCriterio(long idCriterio) {
		this.idCriterio = idCriterio;
	}

	public String getNomeCriterio() {
		return nomeCriterio;
	}

	public void setNomeCriterio(String nomeCriterio) {
		this.nomeCriterio = nomeCriterio;
	}

	public String getPontuacaoCriterio() {
		return pontuacaoCriterio;
	}

	public void setPontuacaoCriterio(String pontuacaoCriterio) {
		this.pontuacaoCriterio = pontuacaoCriterio;
	}

	public ProvaModal getProva() {
		return prova;
	}

	public void setProva(ProvaModal prova) {
		this.prova = prova;
	}

	public CriterioModel(long idCriterio, String nomeCriterio, String pontuacaoCriterio, ProvaModal prova) {
		super();
		this.idCriterio = idCriterio;
		this.nomeCriterio = nomeCriterio;
		this.pontuacaoCriterio = pontuacaoCriterio;
		this.prova = prova;
	}

	public CriterioModel() {
		super();
	}

	@Override
	public String toString() {
		return "CriterioModel [idCriterio=" + idCriterio + ", nomeCriterio=" + nomeCriterio + ", pontuacaoCriterio="
				+ pontuacaoCriterio + "]";
	}
	

	
}