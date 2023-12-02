package entidades;
import java.util.*;

public class Funcionario {
	private int codigo;
	private String nome;
	private String cpf;
	private Date data_nasc = new Date();
	private Date data_contrat = new Date();
	private int dependentes;
	
	public Funcionario (int codigo, String nome, String cpf, Date data_nasc,
			Date data_contrat,int dependentes) {
                this.codigo = codigo;        
		this.nome = nome;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
		this.data_contrat = data_contrat;
		this.dependentes = dependentes;
	}
        
        public Funcionario (String nome, String cpf, Date data_nasc,
			Date data_contrat,int dependentes) {        
		this.nome = nome;
		this.cpf = cpf;
		this.data_nasc = data_nasc;
		this.data_contrat = data_contrat;
		this.dependentes = dependentes;
	}
	
        public Funcionario (String nome) {
		this.nome = nome;
	}
        
	public Funcionario () {}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	public Date getData_contrat() {
		return data_contrat;
	}
	public void setData_contrat(Date data_contrat) {
		this.data_contrat = data_contrat;
	}
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	
	public String toString() {
		return this.nome;
	}
}
