package com.gov.uk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gov.uk.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@RequestMapping(value = "/jobs", method = RequestMethod.GET)
	public String getJobList(ModelMap model){
		model.addAttribute("jobs", jobService.getJobList());
		return "jobs";
	}
}
