package ca.uqam.inf2050;

/**
 * Classe représentant un enseignant.
 */
public class Enseignant {

  // Code de l'enseignant
  private String codeenseignant;

  // Nom de l'enseignant
  private String nom;

  // Prénom de l'enseignant
  private String prenom;

  /**
   * Constructeur de la classe Enseignant.
   *
   * @param codeenseignant Le code de l'enseignant.
   * @param nom Le nom de l'enseignant.
   * @param prenom Le prénom de l'enseignant.
   */
  public Enseignant(String codeenseignant, String nom, String prenom) {
    this.codeenseignant = codeenseignant;
    this.nom = nom;
    this.prenom = prenom;
  }

  /**
   * Getter pour le code de l'enseignant.
   *
   * @return Le code de l'enseignant.
   */
  public String getCodeenseignant() {
    return codeenseignant;
  }

  /**
   * Setter pour le code de l'enseignant.
   *
   * @param codeenseignant Le code de l'enseignant.
   */
  public void setCodeenseignant(String codeenseignant) {
    this.codeenseignant = codeenseignant;
  }

  /**
   * Getter pour le nom de l'enseignant.
   *
   * @return Le nom de l'enseignant.
   */
  public String getNom() {
    return nom;
  }

  /**
   * Setter pour le nom de l'enseignant.
   *
   * @param nom Le nom de l'enseignant.
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * Getter pour le prénom de l'enseignant.
   *
   * @return Le prénom de l'enseignant.
   */
  public String getPrenom() {
    return prenom;
  }

  /**
   * Setter pour le prénom de l'enseignant.
   *
   * @param prenom Le prénom de l'enseignant.
   */
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
}
