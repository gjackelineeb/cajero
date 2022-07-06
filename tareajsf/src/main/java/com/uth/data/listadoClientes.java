package com.uth.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

import com.uth.Cliente;


public class listadoClientes implements Serializable {

	private List<setgetC> lista;
	
	public listadoClientes() {
		
		this.lista = new ArrayList<>();
		
		setgetC lista1 = new setgetC();
		setgetC lista2 = new setgetC();
		setgetC lista3 = new setgetC();
		setgetC lista4 = new setgetC();
		setgetC lista5 = new setgetC();
		
		lista1.setNumeroCuenta("20221");	
		lista2.setNumeroCuenta("20222");
		lista3.setNumeroCuenta("20223");
		lista4.setNumeroCuenta("20224");
		lista5.setNumeroCuenta("20225");
		
		lista1.setPin("A123");
		lista2.setPin("A456");
		lista3.setPin("A789");
		lista4.setPin("A741");
		lista5.setPin("A852");
		
		lista1.setSaldo(10000);
		lista2.setSaldo(5000);
		lista3.setSaldo(18000);
		lista4.setSaldo(8000);
		lista5.setSaldo(900);
		
		this.lista.add(lista1);
		this.lista.add(lista2);
		this.lista.add(lista3);
		this.lista.add(lista4);
		this.lista.add(lista5);
	
	}

	public List<setgetC> getLista() {
		return lista;
	}

	public void setLista(List<setgetC> lista) {
		this.lista = lista;
	}
	
	public setgetC consultarCliente(String numeroCuenta) {
		for(setgetC lista: this.lista) {
			if(lista.getNumeroCuenta() == numeroCuenta) {
				return lista;
				
			}
		}
		return null;

	}
	public List<SelectItem> getSelectedItems(){
		SelectItemGroup g2 = new SelectItemGroup("Libros Disponibles");
		SelectItem[] librosArray = new SelectItem[this.lista.size()];
		for(int i=0; i<this.lista.size();i++) {
			librosArray[i] = new SelectItem(this.lista.get(i).getNumeroCuenta());
		}
		g2.setSelectItems(librosArray);
		List<SelectItem> librosList = new ArrayList<SelectItem>();
		librosList.add(g2);
		return librosList;
	}
	
}
