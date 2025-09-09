package model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Annotation Lombok pour générer les getters, setters, etc. automatiquement
@NoArgsConstructor // Annotation Lombok pour un constructeur sans arguments
@Entity // Indique à Spring que cette classe est une entité de base de données
@Table(name = "books") // Définit le nom de la table dans la base de données
public class Book {

    @Id // Indique que ce champ est la clé primaire de la table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // L'ID sera généré automatiquement
    private Long id;

    @Column(name = "title", nullable = false) // Mappe ce champ à une colonne nommée "title"
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "published_year")
    private Integer publishedYear;
}