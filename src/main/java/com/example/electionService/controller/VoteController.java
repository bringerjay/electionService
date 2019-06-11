package com.example.electionService.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.electionService.model.*;;

@RestController
@CrossOrigin("*")
public class VoteController{
public Integer idTracker = 6;
static List<Candidate> candidates = new ArrayList<Candidate>();
static {candidates.add(new Candidate(1,"AAA",0));
candidates.add(new Candidate(2,"BBB",0));
candidates.add(new Candidate(3,"CCC",0));
candidates.add(new Candidate(4,"DDD",0));
candidates.add(new Candidate(5,"EEE",0));
System.out.println(candidates);
}
@GetMapping("/api/candidates")
public List<Candidate> findAllCandidates(){
	System.out.println("getting request");
	return candidates;
}

@PutMapping("/api/candidates/{candadateName}")
public List<Candidate> updateVote
(@PathVariable("candadateName") String cName){
	System.out.println("vote received for "+ cName);
	for (Candidate c: candidates) {
		if(c.getName().equals(cName))
		{c.setVotes(c.getVotes()+1);
		System.out.println(c.getName()+c.getVotes());
		}
	}
	return candidates;
}
}