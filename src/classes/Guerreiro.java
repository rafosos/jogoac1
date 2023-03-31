package classes;

public class Guerreiro extends Personagem{
    
    public Guerreiro(String nome){
        this.nome = nome;
        this.xp = 0;
        this.vida = 100;
        this.forca = 70;
    }
    
    @Override
    public void ataque() {
        System.out.println("O guerreiro " + this.nome + " atacou o inimigo com sua espada gloriosa.");
    }

    @Override
    public void morrer() {
        System.out.println("O mago " + this.nome + " foi de americanas.");
    }
    
    @Override
    public String toString() {
        return  "Guerreiro:\n" +
                super.toString();
    }
}
