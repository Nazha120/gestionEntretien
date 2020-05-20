package org.sid.web;

import java.util.Optional;

import org.sid.dao.CandidatRepository;
import org.sid.entities.Candidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@RestController
@CrossOrigin("*")
public class CandidatController {
	@Autowired
	private CandidatRepository candidatRepository;
	
	@RequestMapping(value="/addCandidat", method=RequestMethod.POST)
	public Candidat save(@RequestBody Candidat c){		
		return candidatRepository.save(c);
	}
	
	@RequestMapping(value="/updateCandidat", method=RequestMethod.PUT)
	public Candidat updateCandidat(@RequestBody Candidat c){		
		return candidatRepository.save(c);
	}
	
	@RequestMapping(value="/getCandidat", method=RequestMethod.GET)
	public Optional<Candidat> getCandidat(@RequestParam(name="id") Long id) {
		return candidatRepository.findById(id);
	}
	
	@RequestMapping(value="/getCandidats", method=RequestMethod.GET)
	public Page<Candidat> chercher(
			@RequestParam(name="mc", defaultValue="") String mc,
			@RequestParam(name="page", defaultValue="0") int page,
			@RequestParam(name="size", defaultValue="5") int size) {
		Pageable paging = PageRequest.of(page, size);
		return candidatRepository.chercher("%" + mc +"%",paging); 
	}
	 
	@RequestMapping(value="/deleteCandidat", method=RequestMethod.DELETE)
	public boolean supprimer(@RequestParam(name="id") Long id){
		candidatRepository.deleteById(id);
	  return true;
	}  
}
