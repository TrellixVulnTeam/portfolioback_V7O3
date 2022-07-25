package com.niko783.messages;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class MessageController {
	//origin http://localhost:4200
	@Autowired
	private MessageService ms;
	
	//Obtener lista de mensajes
	@GetMapping("/messages")
	public List<Message> obtener(){		
		return ms.obtenerLista();		
	}
	
	//Crear un mensaje
	@PostMapping("/messages")
	public Message guardarMessage(@RequestBody Message m){
		System.out.println(m);
		ms.guardar(m);
		return m;		
	}
	
	//Obtener un mensaje
	@GetMapping("/messages/{id}")
	public Message obtenerMessage(@PathVariable("id") Integer id) {
		return ms.obtener(id);
	}
	
	//Modificar un mensaje
	@PutMapping("/messages")
	public void actualizarMessage(@RequestBody Message m) {
		ms.actualizar(m);
	}
	
	//Eliminar un mensaje
	@DeleteMapping("/messages/{id}")
	public void eliminarMessage(@PathVariable("id") Integer id) {
		ms.eliminar(id);
	}
		
	}
