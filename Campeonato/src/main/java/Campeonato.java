
public class Campeonato {
    
    Clube[] clubes;
    
    public Campeonato (Clube[] clubes) {
        this.clubes = clubes;
    }
        
    public void jogarPartida (Clube m, Clube v){
        int saldo;
        int golsM = (int) (Math.random() * 6);
        int golsV = (int) (Math.random() * 6);
        
        if (golsM > golsV) {
            saldo = golsM - golsV;
            m.ganhar(saldo);
            v.perder(saldo);
        } else if (golsV > golsM) {
            saldo = golsV - golsM;
            v.ganhar(saldo);
            m.perder(saldo);
        } else {
            m.empatar();
            v.empatar();
        }
    }
    
    public void jogarCampeonato () {
        for (int i = 0; i < clubes.length; i++) {
            for (int j = i + 1; j < clubes.length; j++) {
                jogarPartida(clubes[i],clubes[j]);
                jogarPartida(clubes[j],clubes[i]);
            }
        }
    }

    public String getClassificacao() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nClassificação\n\n");

        for (int i = 0; i < clubes.length - 1; i++) {
            for (int j = i + 1; j < clubes.length; j++) {
                if (clubes[i].getPontos() < clubes[j].getPontos() || 
                        (clubes[i].getPontos() == clubes[j].getPontos() && 
                        clubes[i].getSaldoGols() < clubes[j].getSaldoGols())) 
                {
                    Clube temporario = clubes[i];
                    clubes[i] = clubes[j];
                    clubes[j] = temporario;
                }
            }
        }
        
        int pos = 1;
        for (Clube clube : clubes) {
            clube.posicao  = pos++;
            sb.append(clube).append("\n");
        }

        return sb.toString();
    }
    
    public String getCampeao() {
        Clube campeao = clubes [0];
        
        return ("O Campeão é: " + campeao.getNome());
    }
    
}
