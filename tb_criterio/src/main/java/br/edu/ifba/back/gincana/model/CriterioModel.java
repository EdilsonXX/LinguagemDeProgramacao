package br.edu.ifba.back.gincana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import br.edu.ifba.back.gincana.model.EventoModel;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

import lombok.Data;

@Data
@Entity
@Table (name = "tb_criterio")

public class CriterioModel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column (name = "id_Criterio")
	private long id_Criterio;  
	
	@Column (name = "nome_Criterio", nullable = false, unique = true)
	private  String nome_Criterio;
	
	@Column (name = "pontuacao_min_Criterio", nullable = false)
	private  String pontuacao_min_Criterio;

	@Column (name = "pontuacao_max_Criterio", nullable = false)
	private  String pontuacao_max_Criterio;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private EventoModel evento;

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

	public String getPontuacao_min_Criterio() {
		return pontuacao_min_Criterio;
	}

	public void setPontuacao_min_Criterio(String pontuacao_min_Criterio) {
		this.pontuacao_min_Criterio = pontuacao_min_Criterio;
	}

	public String getPontuacao_max_Criterio() {
		return pontuacao_max_Criterio;
	}

	public void setPontuacao_max_Criterio(String pontuacao_max_Criterio) {
		this.pontuacao_max_Criterio = pontuacao_max_Criterio;
	}

	public EventoModel getEvento() {
		return evento;
	}

	public void setEvento(EventoModel evento) {
		this.evento = evento;
	}

	public CriterioModel(long id_Criterio, String nome_Criterio, String pontuacao_min_Criterio,
			String pontuacao_max_Criterio, EventoModel evento) {
		super();
		this.id_Criterio = id_Criterio;
		this.nome_Criterio = nome_Criterio;
		this.pontuacao_min_Criterio = pontuacao_min_Criterio;
		this.pontuacao_max_Criterio = pontuacao_max_Criterio;
		this.evento = evento;
	}

	public CriterioModel() {
		super();
	}

	@Override
	public String toString() {
		return "CriterioModel [id_Criterio=" + id_Criterio + ", nome_Criterio=" + nome_Criterio
				+ ", pontuacao_min_Criterio=" + pontuacao_min_Criterio + ", pontuacao_max_Criterio="
				+ pontuacao_max_Criterio + "]";
	}

	
	
	

	
}
