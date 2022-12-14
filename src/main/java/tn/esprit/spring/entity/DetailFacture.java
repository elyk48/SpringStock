package tn.esprit.spring.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Table(name="T_DetailFacture")
public class DetailFacture implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFacture;
	@NonNull
	private Integer qte;
	@NonNull
	private Float prixTotal;
	@NonNull
	private Integer pourcentageRemise;
	@NonNull
	private Integer montantRemise;
	@ToString.Exclude
	@ManyToOne
	Facture facture;
	@ToString.Exclude
	@ManyToOne
	Produit produit;
}
