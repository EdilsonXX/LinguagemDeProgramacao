package br.ifba.tarefa.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
@Entity
@Table (name = "tarefa")
public class TarefaModel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column (name = "id")
	private long id;  
	
	@Column (name = "descricao", nullable = true, unique = true)
	private  String descrica;
	
	@Column (name = "data_criacao", nullable = true)
	private Date data_criacao;
	
	@Column (name = "data_conclusao", nullable = true)
	private Date data_conclusao;
	
	@Column (name = "status", nullable = true)
	private long status;

	public TarefaModel() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescrica() {
		return descrica;
	}

	public void setDescrica(String descrica) {
		this.descrica = descrica;
	}

	public Date getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Date getData_conclusao() {
		return data_conclusao;
	}

	public void setData_conclusao(Date data_conclusao) {
		this.data_conclusao = data_conclusao;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}
	
	
	
}
