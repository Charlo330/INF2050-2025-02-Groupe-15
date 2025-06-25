package ca.uqam.inf2050;

/**
 * Classe représentant un groupe de cours.
 */
public class GroupeCours {

  // Cours associé au groupe de cours
  private Cours cours;

  // Enseignant responsable du groupe de cours
  private Enseignant enseignant;

  // Session à laquelle le groupe de cours est associé
  private Session session;

  // Nombre maximum d'inscriptions autorisées dans le groupe de cours
  private Number maxInscriptions;

  // Local où se déroule le groupe de cours
  private String local;

  /**
   * Constructeur de la classe Groupecours.
   *
   * @param cours Cours associé au groupe de cours.
   * @param enseignant Enseignant responsable du groupe de cours.
   * @param session Session à laquelle le groupe de cours est associé.
   * @param maxInscriptions Nombre maximum d'inscriptions autorisées dans le groupe de cours.
   * @param local Local où se déroule le groupe de cours.
   */
  public GroupeCours(Cours cours, Enseignant enseignant, Session session,
                     Number maxInscriptions, String local) {
    this.cours = cours;
    this.enseignant = enseignant;
    this.session = session;
    this.maxInscriptions = maxInscriptions;
    this.local = local;
  }

  /**
   * Getter pour le cours associé au groupe de cours.
   *
   * @return Cours associé au groupe de cours.
   */
  public Cours getCours() {
    return cours;
  }

  /**
   * Setter pour le cours associé au groupe de cours.
   *
   * @param cours Cours à associer au groupe de cours.
   */
  public void setCours(Cours cours) {
    this.cours = cours;
  }

  /**
   * Getter pour l'enseignant responsable du groupe de cours.
   *
   * @return Enseignant responsable du groupe de cours.
   */
  public Enseignant getEnseignant() {
    return enseignant;
  }

  /**
   * Setter pour l'enseignant responsable du groupe de cours.
   *
   * @param enseignant Enseignant à associer au groupe de cours.
   */
  public void setEnseignant(Enseignant enseignant) {
    this.enseignant = enseignant;
  }

  /**
   * Getter pour la session à laquelle le groupe de cours est associé.
   *
   * @return Session à laquelle le groupe de cours est associé.
   */
  public Session getSession() {
    return session;
  }

  /**
   * Setter pour la session à laquelle le groupe de cours est associé.
   *
   * @param session Session à associer au groupe de cours.
   */
  public void setSession(Session session) {
    this.session = session;
  }

  /**
   * Getter pour le nombre maximum d'inscriptions autorisées dans le groupe de cours.
   *
   * @return Nombre maximum d'inscriptions autorisées.
   */
  public Number getMaxinscriptions() {
    return maxInscriptions;
  }

  /**
   * Setter pour le nombre maximum d'inscriptions autorisées dans le groupe de cours.
   *
   * @param maxInscriptions Nombre maximum d'inscriptions à définir.
   */
  public void setMaxinscriptions(Number maxInscriptions) {
    this.maxInscriptions = maxInscriptions;
  }

  /**
   * Getter pour le local où se déroule le groupe de cours.
   *
   * @return Local où se déroule le groupe de cours.
   */
  public String getLocal() {
    return local;
  }

  /**
   * Setter pour le local où se déroule le groupe de cours.
   *
   * @param local Local à définir pour le groupe de cours.
   */
  public void setLocal(String local) {
    this.local = local;
  }
}
