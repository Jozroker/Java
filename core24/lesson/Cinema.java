package mainPackage.core24.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Cinema {

    private Map<Days, Schedule> schedules = new TreeMap<>();
    private List<Movie> moviesLibrary = new ArrayList<>();
    private Time open;
    private Time close;

    public void addMovie(Movie movie) {
        if (moviesLibrary.contains(movie)) {
            System.out.println("Library already exist such movie");
        } else {
            moviesLibrary.add(movie);
        }
    }

    public void addSeance(Seance seance, String day) {
        if (!schedules.containsKey(day.toUpperCase())) {
            schedules.put(Days.valueOf(day.toUpperCase()), new Schedule());
        }
        schedules.forEach((key, value) -> {
            if (key.equals(day.toUpperCase())) {
                value.addSeance(seance);
            }
        });
    }

    public void removeMovie(Movie movie) {
        moviesLibrary.remove(movie);
        schedules.values().forEach(schedule -> schedule.getSeances().removeIf(seance -> seance.getMovie().equals(movie)));
    }

    private void removeSeance(Seance seance, String day) {
        schedules.forEach((key, value) -> {
            if (key.equals(day.toUpperCase())) {
                value.removeSeance(seance);
            }
        });
    }

    @Override
    public String toString() {
        return "Cinema{\n" +
                "   Schedules: " + schedules.entrySet().stream().map() +
                ", moviesLibrary=" + moviesLibrary +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}
