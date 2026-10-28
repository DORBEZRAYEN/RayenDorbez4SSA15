package tn.esprit.rayendorbez4ssa15.Services;

import tn.esprit.rayendorbez4ssa15.Domain.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation createReservation(Reservation reservation);

    Reservation getReservationById(Long id);

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Long id);

    List<Reservation> getAllReservations();
}
