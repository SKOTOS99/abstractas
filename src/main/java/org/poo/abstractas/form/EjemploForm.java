package org.poo.abstractas.form;

import java.util.ArrayList;
import java.util.List;

import org.poo.abstractas.form.elementos.ElementoForm;
import org.poo.abstractas.form.elementos.InputForm;
import org.poo.abstractas.form.elementos.SelectForm;
import org.poo.abstractas.form.elementos.TextAreaForm;
import org.poo.abstractas.form.elementos.select.Opcion;

public class EjemploForm {
	
	public static void main(String[] args) {
		
		

			InputForm username = new InputForm("username");
			InputForm password = new InputForm("clave", "password");
			InputForm email = new InputForm("email", "email");
			InputForm edad = new InputForm("edad", "number");
			
			TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
			SelectForm lenguaje = new SelectForm("lenguaje");
			
			Opcion java = new Opcion("1", "java");
			lenguaje.addOpcion(java);
			lenguaje.addOpcion(new Opcion("2","python"));
			lenguaje.addOpcion(new Opcion("3","js"));
			lenguaje.addOpcion(new Opcion("4","c"));
			
			username.setValor("jesus");
			password.setValor("1234");
			email.setValor("algo@example.com");
			edad.setValor("24");
			experiencia.setValor("mas de 4 años de experiencia");
			java.setSelected(true);
			
			List<ElementoForm> elementos = new ArrayList<>(); 
			elementos.add(username);
			elementos.add(password);
			elementos.add(email);
			elementos.add(experiencia);
			elementos.add(lenguaje);
			
			for(ElementoForm e: elementos) {
				System.out.println(e.dibujarHtml());
			}
			
			
			
			
			
		
	}
}
