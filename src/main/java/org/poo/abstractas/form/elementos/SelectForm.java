package org.poo.abstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import org.poo.abstractas.form.elementos.select.Opcion;

public class SelectForm extends ElementoForm{
	 private List<Opcion> opcion;
	 
	 
	 
	public SelectForm(String nombre, List<Opcion> lista) {
		super(nombre);
		this.opcion = lista;
	}
	
	public SelectForm addOpcion(Opcion opcion) {
		this.opcion.add(opcion);
		return this;
	}



	public SelectForm(String nombre) {
		super(nombre);
		this.opcion = new ArrayList<>();
	}
	
	@Override
	public String dibujarHtml() {
		StringBuilder sb = new StringBuilder("<select ");
		sb.append("name='").append(this.nombre).append("'>");
		for(Opcion opcion: this.opcion) {
			sb.append("\n<option value='").append(opcion.getValor())
			.append("'");
			if (opcion.isSelected()) {
				this.valor = opcion.getValor();
				sb.append(" selected");
			}
			sb.append(">")
			.append(opcion.getNombre())
			.append("</option>");
			
		}
		sb.append("</select>");
		return sb.toString();
	}

}
