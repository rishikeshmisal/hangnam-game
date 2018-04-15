package game.entity;

import javax.persistence.*;

@Entity
@Table(name="movie", schema="public")
public class Movie {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_id_seq")
    @SequenceGenerator(name = "movie_id_seq", sequenceName = "public.movie_id_seq", initialValue=1, allocationSize = 1)
    @Column(name="ID", nullable=false)
    private Integer id  ;


   @Column(name="name")
   public String name;

   @Column(name="year")
   public int year;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Column(name="genre")
    public String genre;

}
