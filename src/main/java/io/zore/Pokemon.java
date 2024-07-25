package io.zore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ASH_POKEMON")
public class Pokemon {

	@Id
	@Column(name="Pokemon_name")
	private String name;
	@Column(nullable=false)
	private String type;
//	@Column
	private int power;
	
	@Enumerated(EnumType.STRING)
	private Color color;   // use enum ,enum is a primitive type.
//	private int Color;
//	public int getColor() {
//		return color;
//	}
//	public void setColor(int color) {
//		this.color = color;
//	}
//	
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power){
		this.power = power;
	}
	@Override
	public String toString() {
		return this.getName()+" "+this.getType()+" "+this.getPower();
	}
}
