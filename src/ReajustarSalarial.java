
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import rh.ValidacaoException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ra2257028
 */
public class ReajustarSalarial {
       // BigDecimal -> você consegue estipular qual o nível de precisão você precisa trabalhar.
	public void reajustarSalario(BigDecimal aumento, Funcionario f) {
            // Divide -> arredonda da maneira definida (HALF_UP - 0.5 p cima)
		BigDecimal percentualReajuste = aumento.divide(f.getSalario(), RoundingMode.HALF_UP);
                // Reajuste nao pode ser superior a 40% do salario
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
                f.setSalario(f.getSalario().add(aumento));
	}
}
