public class Nota {
    
    public String validaNota(int mt_in_i_nota){
        
        String mt_out_validacao;
        
        if (mt_in_i_nota < 0 || mt_in_i_nota > 10){
            mt_out_validacao = "Nota inválida";
        }
        
        else{
            mt_out_validacao = "Nota válida";
        }
        
        return mt_out_validacao; 
    }
    
}
