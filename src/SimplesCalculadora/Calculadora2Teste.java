package SimplesCalculadora;

public class Calculadora2Teste {
	
	public static void main(String[] args) {
		
		System.out.print("Soma: 5 + 2: ");
		Calculadora2 calculadora = new Soma();
		System.out.println(calculadora.executar(5, 2));
		
		System.out.print("\nMultiplicação: 5 x 2: ");
		calculadora = new Multiplicacao();
		System.out.println(calculadora.executar(5, 2));
		
		System.out.print("\nSubtracao: 5 - 2: ");
		calculadora = new Subtracao();
		System.out.println(calculadora.executar(5, 2));
		
		Calculaadora2 calculaadora = new Divisao();
		System.out.print("\nDivisão: 5 / 2: ");
		calculaadora = new Divisao();
		System.out.println(calculaadora.executar(5, 2));
	}
}

