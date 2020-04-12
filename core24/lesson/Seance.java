package mainPackage.core24.lesson;

public class Seance implements Comparable<Seance>{

    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        int movieDurationHour = movie.getDuration().getHour();
        int movieDurationMinute = movie.getDuration().getMin();
        if (movieDurationMinute + startTime.getMin() >= 60) {
            movieDurationMinute -= 60;
            movieDurationHour++;
        }
        movieDurationMinute += startTime.getMin();
        if (movieDurationHour + startTime.getHour() >= 24) {
            movieDurationHour -= 24;
        }
        movieDurationHour += startTime.getHour();
        this.endTime = new Time(movieDurationHour, movieDurationMinute);
    }

    @Override
    public int compareTo(Seance s) {
        if (startTime.getHour() == s.getStartTime().getHour()) {
            if (startTime.getMin() == s.getStartTime().getMin()) {
                if (movie.getTitle().equals(s.movie.getTitle())) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return startTime.getMin() - s.getStartTime().getMin();
            }
        } else {
            return startTime.getHour() - s.getStartTime().getHour();
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
