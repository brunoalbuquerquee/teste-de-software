public class Idade {
    
    public String validaIdade(int mt_in_i_idade){
        
        String mt_out_validacao = "";
        
  
        if (mt_in_i_idade < 50){
            mt_out_validacao = "Renovar a cada 10 anos";
        }
        else if (mt_in_i_idade <= 70){
            mt_out_validacao = "Renovar a cada 5 anos";
        }
        
        else{
            mt_out_validacao = "Renovar a cada 3 anos";
        }
        
        return mt_out_validacao; 
    }
    
}
