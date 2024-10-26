package Aplication;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import Entities.Pedido;
import Entities.enums.OrderStatus;

public class Aplication {
	public static void main(String []args) {
		
		DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm/ss");
		
		
		Pedido pedido = new Pedido(1028, new Date(), OrderStatus.Processando );
		
		
		OrderStatus one = OrderStatus.valueOf("enviado");
		
		System.out.println(OrderStatus.valueOf("acabado"));
		System.out.println(pedido);
	}
}