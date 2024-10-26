package arrayList2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main( String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		System.out.println("quantos funcionarios deseja adicionar?");
		int n = scanner.nextInt();
		
		for(int i=1; i<= n ; i++) {
			System.out.print("id: ");
			Integer id = scanner.nextInt();
			
			System.out.print("nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			
			System.out.print("salario: ");
			Double salario = scanner.nextDouble();		
			
			Funcionario funcionario = new Funcionario(id , nome , salario);
			
			list.add(funcionario);
		}
		
		System.out.println("qual funcionario deseja aumentar o salario, informe o id?");
		int idFuncionario = scanner.nextInt();
		Integer pos = position(list , idFuncionario);
		if(pos == null) {
			System.out.println("funcionario não existe");
		} else {
			System.out.println("digite a porcentagem de aumento");
			double porcento = scanner.nextDouble();
			list.get(pos).aumentarSalario(porcento);
		}
		
		
		
		for(Funcionario x: list) {
			System.out.println(x);
		}
		
	}
		
	public static Integer position(List<Funcionario> list , Integer idFuncionario) {
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getId() == idFuncionario) {
				return i;
			}
		}//
		return null;
	}
	
		
	}

