package brightlogic.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publisherId;

    @Column(unique = true, nullable = false, name = "name", length = 50)
    private String name;

    @ManyToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<>() ;

}
