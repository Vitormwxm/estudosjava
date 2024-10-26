package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("quantos funcionarios serão digitados?: ");
		int n = scanner.nextInt();
		
		for(int i=0; i<n ; i++ ) {
			System.out.println();
			System.out.println("Funcionario #" + (i +1) + ":" );
			System.out.print("id:");
			Integer id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("nome:");
			String nome = scanner.nextLine();
			System.out.print("salario:");
			Double salario = scanner.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome , salario);
			
			list.add(funcionario);
			
		}
		System.out.print("qual funcionario deseja alterar o salario, digite o id: ");
		int idFuncionario = scanner.nextInt();
		Integer pos = position(list , idFuncionario);
		if(pos == null) {
			System.out.println("funcionario não existe");
		} else {
			System.out.println("entre com a porcentagem");
			Double percent = scanner.nextDouble();
			list.get(pos).incrementarSalario(percent);
		}
		
		
		System.out.println(list);
			
		
	}
	public static Integer position(List<Funcionario> list, int idFuncionario) {
		for(int i=0; i < list.size(); i++) {
			if(list.get(i).getId() == idFuncionario) {
				return i;
			}
		}
		return null;
	}	
}

