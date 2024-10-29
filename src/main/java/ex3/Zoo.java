package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	/** nom : nom du zoo */
	private String nom;
	/** types : types des animaux */
	private List<Animal> animals = new ArrayList<>();

	/**
	 * Constructeur
	 * @param nom : nom du zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * @param animal : animal à ajouter
	 */
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	/**
	 * Affiche les informations sur les animaux du zoo
	 */
	public void afficherListeAnimaux() {
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i).getNom() + " " + animals.get(i).getType() + " " + animals.get(i).getComportement());
		}
	}

	/**
	 * @return le nombre d'animaux dans le zoo
	 */
	public int obtenirNombreAnimaux() {
		return animals.size();
	}

	/**
	 * Getter for nom
	 * * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter for animals
	 * * @return the animals
	 */
	public List<Animal> getAnimals() {
		return animals;
	}
}