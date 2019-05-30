package View;

/**
 *
 * @author Matheus
 */
public class equipes {
    private String nome;
    private int pontos;
    public equipes(String n){
        nome = n;
        pontos = 5;
    }
    public String getNome(){
        return nome;
    }
    public int getPontos(){
        return pontos;
    }    
    public void setNome(String n){
        nome = n;
    }    
    public void setPontos(int p){
        pontos = p;
    }
}
/*Passar a informação por parametro, com um set na classe que quero usar as infos*/