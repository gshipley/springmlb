package org.springapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="teams")
public class MLBPark {

	@Id
	private String id;
	
	private String name;
	@Indexed
	private double[] position;
	private String ballpark;
	private long payroll;
	private String league;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double[] getPosition() {
		return position;
	}
	public void setPosition(double[] position) {
		this.position = position;
	}
	public String getBallpark() {
		return ballpark;
	}
	public void setBallpark(String ballpark) {
		this.ballpark = ballpark;
	}
	public long getPayroll() {
		return payroll;
	}
	public void setPayroll(long payroll) {
		this.payroll = payroll;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	
	
}
