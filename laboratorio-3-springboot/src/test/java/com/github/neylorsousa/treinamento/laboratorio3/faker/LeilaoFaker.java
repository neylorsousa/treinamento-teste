package com.github.neylorsousa.treinamento.laboratorio3.faker;

import com.github.javafaker.Faker;
import com.github.neylorsousa.treinamento.laboratorio3.entity.Leilao;
import com.github.neylorsousa.treinamento.laboratorio3.service.LeilaoService;

public class LeilaoFaker {

	private static Faker faker = new Faker();

	public static Leilao novo() {
		Leilao leilao = new Leilao();
		leilao.setNome(faker.name().fullName());
		return leilao;
	}

	public static Leilao existenteNoBanco(LeilaoService service) {
		Leilao leilao = novo();
		service.persistir(leilao);
		return leilao;
	}
}
