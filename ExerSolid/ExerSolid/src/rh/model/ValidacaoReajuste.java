
package rh.model;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    
    void validar(Funcionario funcionario, BigDecimal aumento);
    
}
