package com.niko783.messages;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="messages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Message {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String nombre;
private String correo;
private String asunto;
private String mensaje;

public Message(){
	
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

public String getAsunto() {
	return asunto;
}

public void setAsunto(String asunto) {
	this.asunto = asunto;
}

public String getMensaje() {
	return mensaje;
}

public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}

@Override
public String toString() {
	return "User [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", asunto=" + asunto + ", mensaje=" + mensaje + "]";
}


}
