package firstProject.io.first.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.List;

@Table(name = "sub_levels")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SubLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "level_id")
    private Level level;

    @OneToMany(mappedBy = "subLevel")
    private List<Word> words;

    @OneToMany(mappedBy = "subLevel")
    private List<Question> questions;


}
