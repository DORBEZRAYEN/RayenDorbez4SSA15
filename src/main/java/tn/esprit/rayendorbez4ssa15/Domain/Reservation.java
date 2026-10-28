package tn.esprit.rayendorbez4ssa15.Domain;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    @Enumerated(EnumType.STRING)
    private StatutReservation statut;
    @ManyToOne
    Vehicule vehicule;
    @ManyToOne
    Client client;
    @OneToOne(mappedBy = "reservation")
    Contrat contrat;
}