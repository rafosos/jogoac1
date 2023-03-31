package classes;

public class Mago extends Personagem {
    protected int magia;
    protected int cura;
    
    public Mago(String nome){
        this.nome = nome;
        this.xp = 0;
        this.vida = 70;
        this.forca = 30;
        magia = 50;
        cura = 25;
    }
    
    @Override
    public void ataque(){
        System.out.println("O mago " + this.nome + " atacou o inimigo com sua magia.");
    }
    
    @Override
    public void morrer(){
        System.out.println("O mago " + this.nome + " foi ver se no céu tem pão.");
    }

    @Override
    public String toString() {
        return  "Mago:\n" +
                super.toString() + "\n" +
                "- magia: " + magia + "\n" +
                "- cura: " + cura;
    }
}
