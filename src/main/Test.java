package main;

import main.facade.Facade;
import main.singleton.SingletonEager;
import main.singleton.SingletonLazy;
import main.singleton.SingletonLazyHolder;
import main.strategy.Comportamento;
import main.strategy.ComportamentoDefensivo;
import main.strategy.ComportamentoNormal;
import main.strategy.ComportamentoOfensivo;
import main.strategy.Robot;

public class Test {

	public static void main(String[] args) {
		
		//Testes Singleton
		System.out.println("Singleton test");
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		System.out.println();
		
		//Testes Strategy
		System.out.println("Strategy test");
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento ofensivo = new ComportamentoOfensivo();
		
		Robot robo = new Robot();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(ofensivo);
		robo.mover();
		robo.mover();
		System.out.println();
		//Testes Facade
		System.out.println("Facade test");
		Facade facade = new Facade();
		facade.migraCliente("Natan", "41820-460");
		
	}

}
