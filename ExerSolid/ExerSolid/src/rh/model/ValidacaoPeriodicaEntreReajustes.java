
package rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import rh.ValidacaoException;

// Implementa a interface - Assim pode tentar reajustar
public class ValidacaoPeriodicaEntreReajustes implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDeseUltimoReajuste = ChronoUnit .MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDeseUltimoReajuste < 6){
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no moinimo 6 meses!");
        }
        
    }
    
}
