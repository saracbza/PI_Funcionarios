package entidades;

public class Cargo {
	
	private int codigo;
	private String nome;
	private float valor_hr;
	
	public Cargo() {}
	
	public Cargo(int codigo, String nome, float valor_hr) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor_hr = valor_hr;
	}
	
	public Cargo(String nome, float valor_hr) {
		this.nome = nome;
		this.valor_hr = valor_hr;
	}
        
        public Cargo(String nome) {
		this.nome = nome;
	}
	
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
	public float getValor_hr() {
		return valor_hr;
	}
	public void setValor_hr(float valor_hr) {
		this.valor_hr = valor_hr;
	}
	
        @Override
	public String toString() {
		return this.nome;
	}

}
