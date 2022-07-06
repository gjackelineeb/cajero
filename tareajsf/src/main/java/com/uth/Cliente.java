package com.uth;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.uth.data.listadoClientes;
import com.uth.data.setgetC;

@ManagedBean(name="clientes")
@SessionScoped
public class Cliente implements Serializable {
	
	
	  private String numeroCuenta;
	  private double saldo;
	  private String pin;
	  private String ultimaFechaIngreso;
      private listadoClientes listadoclientes;
      private String cant;
	  private Cliente cliente;
      private double retiro;
      private String mensaje;
	  private double nuevosaldo;
	  private double retirado;
	  
	  public Cliente() {
	    this.numeroCuenta = numeroCuenta;
	    this.setSaldo(saldo);
	    this.setPin(pin);
	    this.listadoclientes= new listadoClientes();
	  }

	  public String getNumeroCuenta() {
	    return this.numeroCuenta;
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

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getUltimaFechaIngreso() {
		return ultimaFechaIngreso;
	}

	public void setUltimaFechaIngreso(String ultimaFechaIngreso) {
		this.ultimaFechaIngreso = ultimaFechaIngreso;
	}

	public listadoClientes getListadoclientes() {
		return listadoclientes;
	}

	public void setListadoclientes(listadoClientes listadoclientes) {
		this.listadoclientes = listadoclientes;
	}

	public String getCant() {
		return cant;
	}

	public void setCant(String cant) {
		this.cant = cant;
	}
	  
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public double getRetiro() {
		return saldo;
	}

	public void setRetiro(double retiro) {
		this.retiro = retiro;
	}
	
		public void validar() {
			
			if(this.numeroCuenta==numeroCuenta && this.pin==pin && saldo<=retiro) {
			        this.saldo=saldo-retiro;
			     
					this.mensaje=("Retiro exitoso");
				      
					
				}
			else {
				
				
				this.mensaje=("No se puede realizar el retiro");
			}
			}
			
		
		
		 
	}

	

