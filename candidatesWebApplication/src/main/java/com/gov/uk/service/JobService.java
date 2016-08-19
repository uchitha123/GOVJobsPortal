package com.gov.uk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gov.uk.model.Job;

@Service 
public class JobService {
	
	public List<Job> jobList= new ArrayList<Job>();
	{ 	
		jobList.add(new Job(1,"Junior Softawre Developer"));
		
	}
	public List<Job> getJobList(){
		 return jobList;
	}
}
