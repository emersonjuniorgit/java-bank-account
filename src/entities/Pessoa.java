package entities;

public class Pessoa {

    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Boolean verificarIdade(Integer idade) {
        if (idade >= 18 && idade <= 100) {
            this.idade = idade;
            return true;
        }
        else{
            System.out.println("Idade inválida.");
        }
        this.idade = 0;
        return false;
    }
}
