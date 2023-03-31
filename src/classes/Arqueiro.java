package classes;

public class Arqueiro extends Personagem{
    
    protected int velocidade;
    
    public Arqueiro(String nome){
        this.nome = nome;
        this.xp = 0;
        this.vida = 80;
        this.forca = 40;
        velocidade = 50;
    }
    
    @Override
    public void ataque() {
        System.out.println("O arqueiro " + this.nome + " atacou com o arco.");
    }

    @Override
    public void morrer() {
        System.out.println("O arqueiro " + this.nome + " foi de comes e bebes.");
    }
    
    @Override
    public String toString(){
        return "Arqueiro:\n" +
                super.toString() +
                "velocidade: " + velocidade;
    }
}
