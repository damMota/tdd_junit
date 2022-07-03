package br.com.damiani.tdd.service;

import java.math.BigDecimal;

import br.com.damiani.tdd.modelo.Desempenho;
import br.com.damiani.tdd.modelo.Funcionario;

public class ReajusteService {
//TESTAR CLASSES QUE POSSUEM REGRA DE NEGÓCIO!!
	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		// TODO Auto-generated method stub
			BigDecimal reajuste = funcionario.getSalario().multiply(desempenho.percentualReajuste());
			funcionario.reajustarSalario(reajuste);
			System.out.println("reajuste:" + reajuste + "salario: " + funcionario.getSalario());
		
	}

}
