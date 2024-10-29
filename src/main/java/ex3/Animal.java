package ex3;

public class Animal {
    /** nom : nom de l'animal */
    private String nom;

    /** type : type de l'animal */
    private String type;

    /** comportement : comportement de l'animal */
    private String comportement;


    /**
     * Constructeur
     * @param nom : nom de l'animal
     * @param type :  type de l'animal
     * @param comportement  : comportement de l'animal
     */
    public Animal(String nom, String type, String comportement){
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @return comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter nom
     * @param nom : nom de l'animal
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Setter type
     * @param type : type de l'animal
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Setter comportement
     * @param comportement : comportement de l'animal
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
