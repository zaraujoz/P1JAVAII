public class Gerente extends Funcionario {
    private int senha = 306412;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public boolean autenticacao(){
        if (getSenha()==306412){
            return true;
        }
    
            return false;
        
    }    
    }
