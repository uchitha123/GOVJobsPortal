package com.gov.uk.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gov.uk.model.Candidate;

@Service
public class CandidateService {
	
   static public List<Candidate> searchList = new ArrayList<Candidate>();
	
   public List<Candidate> candidateList = new ArrayList<Candidate>();
   {
	   candidateList.add(new Candidate(1,"John","Williams","junior Developer","07915475733","John.34@yahoo.com","name234"," Bsc. Computer science","Web Developer -EFuture- 2014"));
	   candidateList.add(new Candidate(2,"Peter","Taylor","Garduate Developer","07915475734","Peter.34@yahoo.com","name234","Msc in BI, Bsc in softawre Engineering "," IT Indusrial Trainee- IBM - 2015"));
	   candidateList.add(new Candidate(3,"Uchitha","Green","web Developer","07915475735","Uchitha.34@yahoo.com","name234","Msc. Enterprise Software Engineering, Bsc Information Technology ","Junior developer -JustMe - 2016"));
	   candidateList.add(new Candidate(4,"Mariya","Brown","Senior Developer","07915475736","Mariya.34@yahoo.com","name234","Bsc. computer engineering","IT Supporter- GSSL - 2014"));
   }
 
   public List<Candidate> retrieveCandidate(){
		return candidateList;
	}

   public Candidate getCandidateDetails(int id){
	  Iterator<Candidate> iterator = candidateList.iterator();
	  while(iterator.hasNext()){
		 Candidate candidate = iterator.next();
		 if (candidate.getcId() == id){
			 return candidate;
		 }
	  }
	  return null;
   }
   
   public List<Candidate> searchCandidateDetails(String searchValue){
	   searchList.clear();
	   Iterator<Candidate> iterator = candidateList.iterator();
	   try{ 
		     int cId = Integer.parseInt(searchValue);
		    
			  while(iterator.hasNext()){
				 Candidate candidate = iterator.next();
				 if (candidate.getcId() == cId){
					 searchList.add(candidate);	 
				 }
			  }
			  return searchList;
		   	}catch( Exception e){ 		}
		  while(iterator.hasNext()){
			 Candidate candidate = iterator.next();
			 if (candidate.getfName().equals(searchValue) || candidate.getlName().equals(searchValue)){
				 searchList.add(candidate);	 
			 }
		  }
		  System.out.println(searchList);
		  return searchList;
 }
}
