import java.util.ArrayList;

public class Community{
	private String dono, nomeComunidade, descricao;
	private ArrayList<String> membros = new ArrayList<String>();

    public Community(String dono, String nomeComunidade, String descricao) {
		this.dono = dono;
		this.nomeComunidade = nomeComunidade;
		this.descricao = descricao;
	}

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public String getNomeComunidade(){
        return nomeComunidade;
    }

    public void setNomeComunidade(String nomeComunidade){
        this.nomeComunidade = nomeComunidade;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
	

    public int encontrarMembro(String pessoa) {
		for(String val : membros) {
			if(pessoa.contentEquals(val) == true) {
				return 1;
			}
		}
		return 0;
	}

    public void addMembro(String pessoa){
        membros.add(pessoa);
    }
	
    public void removerMembro(String pessoa){
        membros.remove(pessoa);
    }

	public void mostrarComunidade() {
		System.out.println("\n--------------------------\n" + nomeComunidade.toUpperCase() + "\n--------------------------");
		System.out.println("Criado por: " + dono);
		System.out.println("Descrição: " + descricao);
		System.out.println("Membros:");
		for(int i = 0; i < membros.size(); i++) {
			System.out.println("   " + membros.get(i));
		}
		
	}

    public void printarMembros(){
        for(int i = 0; i < membros.size(); i++){
            System.out.println("   " + membros.get(i));
        }
    }
}