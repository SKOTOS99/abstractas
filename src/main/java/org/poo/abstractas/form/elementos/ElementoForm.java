package org.poo.abstractas.form.elementos;

public abstract class ElementoForm {
	
	protected String valor;
	protected String nombre;	
	
	
	
	public ElementoForm() {
		
	}
	
	public ElementoForm(String nombre) {
		this();
		this.nombre = nombre;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	abstract public String dibujarHtml();
	
	
	

}
