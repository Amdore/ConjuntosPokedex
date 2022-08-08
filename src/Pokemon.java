
public class Pokemon {
	
	private String nome ;
	private int id  ;
	private String type1;
	private String type2;
	private String descricao;
	
	public Pokemon(String nome, int id, String type1,
			String type2, String descricao) {
		this.nome = nome;
		this.id = id;
		this.type1 = type1;
		this.type2 = type2;
		this.descricao = descricao;
	}
	
	
	public String toString() {
		if(type1 == type2) {
		return "\n" + nome + " | " + type1 + " | " + descricao;
	
		}else {
			return "\n" + nome + " | " + type1  + " | " + type2  + " | " + descricao;
		}
		
		
	}
	
	
	
}
