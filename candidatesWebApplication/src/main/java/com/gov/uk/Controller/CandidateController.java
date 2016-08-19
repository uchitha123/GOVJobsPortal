package com.gov.uk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gov.uk.service.CandidateService;

@Controller
public class CandidateController {
	
	@Autowired
	CandidateService candidateService; 
	
	@RequestMapping(value ="/candidates",method = RequestMethod.GET)
	public String getAllCadidates(ModelMap model){
		model.addAttribute("candidates",candidateService.retrieveCandidate());
		return "candidates";
	}
	
	@RequestMapping(value ="/candidateDetails", method = RequestMethod.GET)
	public String getCadidateDetails(ModelMap model,@RequestParam int cid){
		model.addAttribute("candidate",candidateService.getCandidateDetails(cid));
		return "candidateDetails";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String showSearchPage(){
		return"search";	
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String handleCandidateSearch(ModelMap model, @RequestParam String searchValue)
	{ 
		if (candidateService.searchCandidateDetails(searchValue) !=null || !(candidateService.searchCandidateDetails(searchValue)).isEmpty()){
			model.clear();
			model.addAttribute("candidateList",candidateService.searchCandidateDetails(searchValue));
			return "searchResult";
		}else {
			model.put("errorMessage", "Please Enter Valid Candidate Name or ID");
			return "searchResult"; 
		}			
	}
}
