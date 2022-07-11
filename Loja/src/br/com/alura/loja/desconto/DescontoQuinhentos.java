package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//Desconto para compra igual ou mais de 500 reais

public class DescontoQuinhentos extends Desconto {
	public DescontoQuinhentos(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
