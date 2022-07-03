package br.com.damiani.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	A_Desejar {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.03");
		}
	},
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			// TODO Auto-generated method stub
			return new BigDecimal("0.20");
		}
	};
	//IMPLANTAR UMA ESTRATÉGIA DE NEGÓCIO SEM USAR VÁRIOS IF OU CASE
	public abstract BigDecimal percentualReajuste();

}
