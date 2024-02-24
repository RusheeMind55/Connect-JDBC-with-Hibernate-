package com.jbk;



import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "song")
public class Song {
	
	@Column(name = "idsong")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String Name;
	
	@Column(name = "Artist")
	String artist;
	
	public Song() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + Name + ", artist=" + artist + "]";
	}
	
	
	

}