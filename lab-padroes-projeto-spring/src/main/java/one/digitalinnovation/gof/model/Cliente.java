package one.digitalinnovation.gof.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente Endereco {

    @Id
    private String cep;

    public String getCep(){
        return cep;
    }
    public void setCep(String cep){
        this.cep = cep;
    }

    public Cliente getEndereco() {
        return null;
    }
}
