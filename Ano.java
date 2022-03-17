public class Ano {
    
    public String validaData(int mt_in_i_ano){
        
        String mt_out_validacao;
        
        if (mt_in_i_ano < 1900 || mt_in_i_ano > 2022){
            mt_out_validacao = "Data inválida";
        }
        
        else{
            mt_out_validacao = "Data válida";
        }
        
        return mt_out_validacao; 
    }
    
}
