package tn.esprit.rayendorbez4ssa15.Web.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.rayendorbez4ssa15.Domain.Reservation;
import tn.esprit.rayendorbez4ssa15.Services.IReservationService;

import java.util.List;

@Tag(name = "gestionreservation")
@RestController
@RequiredArgsConstructor
@RequestMapping("reservation")
public class ReservationRestController {

    private final IReservationService reservationService;

    @Operation(summary = "Récupérer la liste complète des reservations")
    @GetMapping
    public List<Reservation> findAll() {
        return reservationService.getAllReservations();
    }

    @Operation(summary = "Récupérer un(e) reservation par identifiant")
    @GetMapping("/{id}")
    public Reservation findById(@PathVariable Long id) {
        return reservationService.getReservationById(id);
    }

    @Operation(summary = "Ajouter un(e) reservation")
    @PostMapping
    public Reservation create(@RequestBody Reservation reservation) {
        return reservationService.createReservation(reservation);
    }

    @Operation(summary = "Modifier un(e) reservation")
    @PutMapping
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @Operation(summary = "Supprimer un(e) reservation par identifiant")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}
