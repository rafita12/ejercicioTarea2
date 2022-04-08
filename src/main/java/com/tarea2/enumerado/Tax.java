package com.tarea2.enumerado;

import java.math.BigDecimal;

public enum Tax {
	
	NORMAL(new BigDecimal("1.21")), SUPERREDUCED(new BigDecimal("1.04")), REDUCED(new BigDecimal("1.10"));
	
	private BigDecimal precio;
	
	Tax(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	

}
