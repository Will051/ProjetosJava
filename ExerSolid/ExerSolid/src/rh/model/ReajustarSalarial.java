
package rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import rh.ValidacaoException;

// 
public class ReajustarSalarial implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
	BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
	if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
	}
        funcionario.setSalario(funcionario.getSalario().add(aumento));
    }
}
