package mate.academy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "movie_sessions")
public class MovieSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private CinemaHall cinemaHall;
    private LocalDateTime showTime;

    public MovieSession() {
    }

    public MovieSession(Movie movie, CinemaHall cinemaHall, LocalDateTime showTime) {
        this.movie = movie;
        this.cinemaHall = cinemaHall;
        this.showTime = showTime;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MovieSession{" +
                "id=" + id +
                ", movie=" + movie +
                ", cinemaHall=" + cinemaHall +
                ", showTime=" + showTime +
                '}';
    }
}
