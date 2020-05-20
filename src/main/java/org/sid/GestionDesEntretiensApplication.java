package org.sid;

import org.sid.dao.CandidatRepository;
import org.sid.dao.ResponsableRepository;
import org.sid.entities.Candidat;
import org.sid.entities.Competence;
import org.sid.entities.Metier;
import org.sid.entities.Responsable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionDesEntretiensApplication implements CommandLineRunner {

	@Autowired
	private CandidatRepository candidatRepository;
	@Autowired
	private ResponsableRepository responsableRepository;


	public static void main(String[] args) {
		SpringApplication.run(GestionDesEntretiensApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*restConfiguration.exposeIdsFor(Candidat.class, Responsable.class);
		candidatRepository.save(new Candidat(null, "el garb", "nazha", "0601223344", "casablanca", "23", "Immediat","Senior", "15000",null,null));
		candidatRepository.save(new Candidat(null, "garb", "souad", "0601426169", "ouarzazate", "28", "Immediat", "Senior", "15000",null,null));
		responsableRepository.save(new Responsable(null, "Bentalha", "hicham", "0601426169", "Kenitra", "28", "admin", "1234")); */
	}

}
