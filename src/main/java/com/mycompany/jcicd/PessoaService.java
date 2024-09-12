
package com.mycompany.jcicd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lorij
 */
public class PessoaService {
    
    private List<PessoaModel> pessoas;
    
    public PessoaService(){
        pessoas = new ArrayList<>();
    }
    
    public void addPessoa(PessoaModel pessoaModel){
        pessoas.add(pessoaModel);
    }
    
    public PessoaModel getPessoaModelByNome(String nome) {
        return pessoas
                .stream()
                .filter((p) -> p.getNome().equalsIgnoreCase(nome))
                .findFirst()
                .orElse(null);
    }
}
