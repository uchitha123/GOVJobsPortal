package candidatesWebApplication;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import com.gov.uk.model.Candidate;

import com.gov.uk.service.CandidateService;

public class CandidateServiceTest {

	private Candidate candidate;
	private CandidateService candidateService = new CandidateService();
	List<Candidate> candidateList = new ArrayList<Candidate>();
	
	@Test
	public void retrieveCandidate() {
		candidateList = candidateService.retrieveCandidate();
		assertTrue(candidateList.size()>0);
		System.out.println("candidateList is not empty");
	}
	
	@Test
	public void getCandidateDetails() {
		candidate = new Candidate(1, "peter","Brown", "web Devloper", "07915475744", "peter@yahoo.com", "peter34", "Bsc Information Technology", "None");
		candidate = candidateService.getCandidateDetails(1);
		assertEquals(candidate, candidate);		
	}
}
