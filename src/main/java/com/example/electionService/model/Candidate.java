package com.example.electionService.model;
public class Candidate{
	private int id;
	private String name;
	private long votes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getVotes() {
		return votes;
	}
	public void setVotes(long votes) {
		this.votes = votes;
	}
	public Candidate(int id, String name, long votes) {
		super();
		this.id = id;
		this.name = name;
		this.votes = votes;
	}
	public Candidate(int id) {
		super();
		this.id = id;
	}
	public Candidate(String name) {
		super();
		this.name = name;
	}
	
	
}