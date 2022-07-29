package com.niko783.skill;
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
@CrossOrigin(origins = "https://nikolopez783.web.app/home")
public class SkillController {
	@Autowired
	private SkillService ss;

	//Obtener lista de habilidades
	@GetMapping("/skills")
	public List<Skill> obtenerSkills(){		
		return ss.obtenerLista();		
	}
	
	//Crear una habilidad
	@PostMapping("/skills")
	public Skill guardarSkill(@RequestBody Skill s){
		System.out.println(s);
		ss.guardar(s);
		return s;		
	}
	
	//Obtener una habilidad
	@GetMapping("/skills/{id}")
	public Skill obtenerSkill(@PathVariable("id") Integer id) {
		return ss.obtenerUser(id);
	}
	
	//Modificar una habilidad
	@PutMapping("/skills")
	public void actualizarSkill(@RequestBody Skill s) {
		ss.actualizar(s);
	}
	
	//Eliminar una habilidad
	@DeleteMapping("/skills/{id}")
	public void eliminarSkill(@PathVariable("id") Integer id) {
		ss.eliminar(id);
	}
		
	}
