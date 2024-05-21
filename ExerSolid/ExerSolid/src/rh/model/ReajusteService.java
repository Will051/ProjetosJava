
package rh.model;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;
    
    // Todos que tiverem ValidacaoReajuste podem estar na lista
    public ReajusteService(List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }
    
    public void reajustarSalariodoFuncionario(Funcionario funcionario, BigDecimal aumento)
    {
        this.validacoes.forEach(v ->v.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        
    }
}
