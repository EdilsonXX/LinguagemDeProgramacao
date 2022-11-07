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
	
	@Column (name = "id_Criterio")
	private long id_Criterio;  
	
	@Column (name = "nome_Criterio", nullable = false, unique = true)
	private  String nome_Criterio;
	
	@Column (name = "pontuacao_Criterio", nullable = false)
	private  String pontuacao_Criterio;

	@ManyToOne
	@JoinColumn(nullable = false)
	private ProvaModel prova;

	public long getId_Criterio() {
		return id_Criterio;
	}

	public void setId_Criterio(long id_Criterio) {
		this.id_Criterio = id_Criterio;
	}

	public String getNome_Criterio() {
		return nome_Criterio;
	}

	public void setNome_Criterio(String nome_Criterio) {
		this.nome_Criterio = nome_Criterio;
	}

	public String getPontuacao_Criterio() {
		return pontuacao_Criterio;
	}

	public void setPontuacao_Criterio(String pontuacao_Criterio) {
		this.pontuacao_Criterio = pontuacao_Criterio;
	}

	public ProvaModel getProva() {
		return prova;
	}

	public void setProva(ProvaModel prova) {
		this.prova = prova;
	}

	public CriterioModel(long id_Criterio, String nome_Criterio, String pontuacao_Criterio, ProvaModel prova) {
		super();
		this.id_Criterio = id_Criterio;
		this.nome_Criterio = nome_Criterio;
		this.pontuacao_Criterio = pontuacao_Criterio;
		this.prova = prova;
	}

	public CriterioModel() {
		super();
	}

	@Override
	public String toString() {
		return "CriterioModel [id_Criterio=" + id_Criterio + ", nome_Criterio=" + nome_Criterio
				+ ", pontuacao_Criterio=" + pontuacao_Criterio + ", prova=" + prova + "]";
	}

	
	
	
	
	

	
}
