package br.edu.ifba.frontgincana.model;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class CriterioModel {

	private long id;
	private String nome_Criterio;
	private long pontuacao_min_Criterio;
	private long pontuacao_max_Criterio;
	
	private Boolean status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome_Criterio() {
		return nome_Criterio;
	}
	public void setNome_Criterio(String nome_Criterio) {
		this.nome_Criterio = nome_Criterio;
	}
	public long getPontuacao_min_Criterio() {
		return pontuacao_min_Criterio;
	}
	public void setPontuacao_min_Criterio(long pontuacao_min_Criterio) {
		this.pontuacao_min_Criterio = pontuacao_min_Criterio;
	}
	public long getPontuacao_max_Criterio() {
		return pontuacao_max_Criterio;
	}
	public void setPontuacao_max_Criterio(long pontuacao_max_Criterio) {
		this.pontuacao_max_Criterio = pontuacao_max_Criterio;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CriterioModel [id=" + id + ", nome_Criterio=" + nome_Criterio + ", pontuacao_min_Criterio="
				+ pontuacao_min_Criterio + ", pontuacao_max_Criterio=" + pontuacao_max_Criterio + ", status=" + status
				+ "]";
	}
	
	
	
	
}
