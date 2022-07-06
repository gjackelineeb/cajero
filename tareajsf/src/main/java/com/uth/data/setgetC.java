package com.uth.data;

import java.io.Serializable;
import com.uth.Cliente;

public class setgetC implements Serializable {
	
	
	
	  private String numeroCuenta;
	  private String pin;
	  private double saldo;
	  private String ultimaFechaIngreso;
	  
	  public setgetC() {
			super();
		}

	  
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getUltimaFechaIngreso() {
		return ultimaFechaIngreso;
	}
	
	public void setUltimaFechaIngreso(String ultimaFechaIngreso) {
		this.ultimaFechaIngreso = ultimaFechaIngreso;
	}


	public String getPin() {
		return pin;
	}


	public void setPin(String pin) {
		this.pin = pin;
	}

}
