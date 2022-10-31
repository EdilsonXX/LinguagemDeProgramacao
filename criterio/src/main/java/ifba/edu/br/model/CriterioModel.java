package ifba.edu.br.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name = "Criterio")

public class CriterioModel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	@Column (name = "idCriterio")
	private long idCriterio;  
	
	@Column (name = "nomeCriterio", nullable = false)
	private  String nomeCriterio;
	
	@Column (name = "pontuacaoCriterio", nullable = false, unique = true)
	private  String pontuacaoCriterio;

	public CriterioModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//FAZER CONSTRUTOR
	
	//FAZER GETS E SETS

	//LUGAR DA CHAVE ESTRAGEIRA
	
}
