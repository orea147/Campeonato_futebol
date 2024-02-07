
public class Clube {
    String nome;
    int posicao;
    int pontos;
    int saldoGols;
    int vitorias;
    int derrotas;
    int empates;

    public Clube (String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.saldoGols = 0;
        this.vitorias = 0;
        this.derrotas = 0;
        this.empates = 0;
    }
        
    public Clube (){  
    }
    
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(int saldoGols) {
        this.saldoGols = saldoGols;
    }
    
    public void ganhar (int saldoGols) {
        this.pontos += 3;
        this.saldoGols += saldoGols;
        this.vitorias += 1;
    }
    
    public void empatar () {
        this.pontos += 1;
        this.empates += 1;
    }
    
    public void perder (int saldoGols) {
        this.saldoGols -= saldoGols;
        this.derrotas += 1;
    }
    
    @Override
    public String toString() {
        return this.posicao + "º Lugar: " + this.nome + ", Pontos: " + this.pontos + ", Saldo de Gols: " + this.saldoGols +
                ", Vitórias: " + this.vitorias + ", Empates: " + this.empates + ", Derrotas: " + this.derrotas;
    }
}
