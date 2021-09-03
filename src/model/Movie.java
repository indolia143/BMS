package model;

public class Movie {
    private int id;
    private String name;
    private String imdb;
    private String duration;

    public Movie(int id, String name, String imdb, String duration) {
        this.id = id;
        this.name = name;
        this.imdb = imdb;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imdb='" + imdb + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
