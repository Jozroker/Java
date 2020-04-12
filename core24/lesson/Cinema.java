package mainPackage.core24.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Cinema {

    private Map<Days, Schedule> schedules = new TreeMap<>();
    private List<Movie> moviesLibrary = new ArrayList<>();
    private Time open;
    private Time close;

    public Cinema(Time open, Time close) {
        this.open = open;
        this.close = close;
    }

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

    public void removeSeance(Seance seance, String day) {
        schedules.forEach((key, value) -> {
            if (key.equals(day.toUpperCase())) {
                value.removeSeance(seance);
            }
        });
    }

    public String showCinemaLibrary() {
        return "Movies:" +
                moviesLibrary.stream()
                        .map(elem -> "    " + elem.toString())
                        .collect(Collectors.joining("\n"));
    }

    @Override
    public String toString() {
        if (schedules.isEmpty()) {
            return "Cinema hasn't active seances";
        } else {
            return "Cinema{\n" +
                    "   Schedules:\n" + schedules
                    .entrySet()
                    .stream()
                    .map(elem -> {
                return "        " + elem.getKey().toString() + "-> Schedule: " + elem.getValue().toString();
            })
                    .collect(Collectors.joining("\n")) +
                    ", open=" + open +
                    ", close=" + close +
                    '}';
        }
    }
}
