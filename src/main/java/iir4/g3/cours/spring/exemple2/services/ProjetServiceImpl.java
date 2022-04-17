package iir4.g3.cours.spring.exemple2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iir4.g3.cours.spring.exemple2.model.Projet;
import iir4.g3.cours.spring.exemple2.repository.ProjetRepository;
@Service
public class ProjetServiceImpl implements ProjetService {
	@Autowired
ProjetRepository projetRepository;
	@Override
	public void ajouter(Projet projet) {
		// TODO Auto-generated method stub
		projetRepository.ajouter(projet);
	}

	@Override
	public void modifier(Projet projet) {
		// TODO Auto-generated method stub
		projetRepository.modifier(projet);

	}

	@Override
	public void supprimer(int idprojet) {
		// TODO Auto-generated method stub
		projetRepository.supprimer(idprojet);

	}

	@Override
	public List<Projet> get() {
		// TODO Auto-generated method stub
		return projetRepository.get();
	}

	@Override
	public Projet get(int idProjet) {
		// TODO Auto-generated method stub
		return projetRepository.get(idProjet);
	}

}
