public class Chassi {
    
    private String numero;

    public Chassi(String numero) {
        this.numero = numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getNumero() {
        return this.numero;
    }
    
    public void maiusculo(){
        this.numero = numero.toUpperCase();
    }
    
    public String incompleto(){
        if(numero.length() == 17){
            return "Completo";
        } else if (numero.length() < 17){
            return "Inválido tamanho menor";
        } else {
            return "Inválido tamanho maior";
        }
    }
    
    
    public int getAno(){
        char ano = numero.charAt(9);
        
        switch(ano){
            case 'A': 
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            default:
                return -1;
        }
    }
        
    }
