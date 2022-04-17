package iir4.g3.cours.spring.exemple2.repository;

import java.util.List;

import iir4.g3.cours.spring.exemple2.model.Projet;

public interface ProjetRepository {
	void ajouter(Projet projet);

	void modifier(Projet projet);

	void supprimer(int idprojet);

	List<Projet> get();

	Projet get(int idProjet);

}
