package com.niko783.skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
	
	@Autowired
	private SkillRepository sr;
	
	public void guardar(Skill u) {
		sr.save(u);
	}
	
	public List<Skill> obtenerLista(){		
		return sr.findAll();		
	}
	
	public Skill obtenerUser(Integer id) {
		//return ur.getReferenceById(id);
		return sr.getOne(id);
	}
	
	public void actualizar(Skill u) {
		sr.save(u);
	}
	
	public void eliminar(Integer id) {
		sr.deleteById(id);
	}
}
