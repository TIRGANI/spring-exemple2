package iir4.g3.cours.spring.exemple2.services;

import java.util.List;

import iir4.g3.cours.spring.exemple2.model.Projet;

public interface ProjetService {
	void ajouter(Projet projet);

	void modifier(Projet projet);

	void supprimer(int idprojet);

	List<Projet> get();

	Projet get(int idProjet);
}
