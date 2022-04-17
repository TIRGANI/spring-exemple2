/**
 * 
 */
package iir4.g3.cours.spring.exemple2.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import iir4.g3.cours.spring.exemple2.model.Projet;

/**
 * @author Administrateur
 *
 */
@Repository
public class ProjetRepositoryImpl implements ProjetRepository {
static private List<Projet> projects = new ArrayList<>();
	@Override
	public void ajouter(Projet projet) {
		// TODO Auto-generated method stub
		projects.add(projet);
	}

	@Override
	public void modifier(Projet projet) {
		// TODO Auto-generated method stub
		int id= projet.getId();
		for (Projet p : projects) {
			if(p.getId()==id)
			{
				p.setDescription(projet.getDescription());
				break;
			}
			
		}
	}

	@Override
	public void supprimer(int idprojet) {
		// TODO Auto-generated method stub
		for(Projet p : projects)
		{
			if(p.getId()==idprojet)
			{
				projects.remove(p);
				break;
			}
		}
	}

	@Override
	public List<Projet> get() {
		// TODO Auto-generated method stub
		
		return projects;
	}

	@Override
	public Projet get(int idProjet) {
		// TODO Auto-generated method stub
		for(Projet p :projects)
		{
			if(p.getId()==idProjet)
			{
				return p;
			}
		}
		return null;
	}

}
