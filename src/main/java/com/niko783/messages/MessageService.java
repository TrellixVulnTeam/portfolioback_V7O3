package com.niko783.messages;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

	@Autowired
	private MessageRepository mr;
	
	public void guardar(Message m) {
		mr.save(m);
	}
	
	public List<Message> obtenerLista(){		
		return mr.findAll();		
	}
	
	public Message obtener(Integer id) {
		//return ur.getReferenceById(id);
		return mr.getOne(id);
	}
	
	public void actualizar(Message m) {
		mr.save(m);
	}
	
	public void eliminar(Integer id) {
		mr.deleteById(id);
	}
}
