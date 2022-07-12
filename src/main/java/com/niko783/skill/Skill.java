package com.niko783.skill;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="skills")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String titulo;
private String subtitulo;
private String info;
private String extra;
private String url;

public Skill(){
	
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}


public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getSubtitulo() {
	return subtitulo;
}

public void setSubtitulo(String subtitulo) {
	this.subtitulo = subtitulo;
}

public String getInfo() {
	return info;
}

public void setInfo(String info) {
	this.info = info;
}

public String getExtra() {
	return extra;
}

public void setExtra(String extra) {
	this.extra = extra;
}

public String getURL() {
	return url;
}

public void setURL(String url) {
	this.url = url;
}

@Override
public String toString() {
	return "User [id=" + id + ", titulo=" + titulo + ", subtitulo=" + subtitulo + ", info=" + info + ", extra=" + extra + ", url=" + url + "]";
}


}
