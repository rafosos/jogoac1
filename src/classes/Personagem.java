package classes;

public abstract class Personagem {
    protected float vida;
    protected int xp;
    protected String nome;
    protected int forca;
    
    public abstract void ataque();
    public abstract void morrer();
    
    public void restaurarVida(float vida){
        if(vida < 0){
            System.out.println("Valor inválido");
        } else {
            this.vida += vida;
        }
    }
    
    public void sofrerDano(float dano){
        this.vida -= dano;
        if(this.vida <= 0){
            morrer();
        }
    }

    @Override
    public String toString() {
        return "nome: " + nome + "\n" +
                "vida: " + vida + "\n" +
                "xp: " + xp + "\n" +
                "forca: " + forca;
    }
}
