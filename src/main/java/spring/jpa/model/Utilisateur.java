package spring.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@MappedSuperclass
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @Size(max = 50)
    private String code;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateEmbauchement() {
		return dateEmbauchement;
	}

	public void setDateEmbauchement(LocalDate dateEmbauchement) {
		this.dateEmbauchement = dateEmbauchement;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(length = 50)
    @Size(max = 50)
    private String nom;

    @Column(length = 50)
    @Size(max = 50)
    private String prenom;

    @Column(name = "date_embauchement")
    private LocalDate dateEmbauchement;

    @Column(unique = true, length = 50)
    @Size(max = 50)
    private String login;

    @Column(length = 10)
    @Size(min = 6, max = 10)
    private String password;

 
}
