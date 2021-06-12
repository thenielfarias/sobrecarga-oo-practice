package examplesobrecarga;
public abstract class Animal {
    protected float peso;
    protected int idade, membros;
    
    public abstract void emitirSom();
    
    public float getPeso() {
        return peso;
    }   
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setPeso(int peso) {
        this.idade = idade;
    }    
    
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }    
}
