package Entities;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import Entities.enums.OrderStatus;

public class Pedido {
	private Integer idPedido;
	private Date dataDoPedido;
	private OrderStatus status;
	
	DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm/ss");
	
	public Pedido(Integer idPedido, Date dataDoPedido, OrderStatus status) {
		this.idPedido = idPedido;
		this.dataDoPedido = dataDoPedido;
		this.status = status;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Date getDataDoPedido() {
		return dataDoPedido;
	}

	public void setDataDoPedido(Date dataDoPedido) {
		this.dataDoPedido = dataDoPedido;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", dataDoPedido=" + dataDoPedido + ", status=" + status + "]";
	}
	
	
	
	
}
