package firstProject.io.first.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "words")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "word_name")
    private String wordName;

    @Column(name = "word_description")
    private String wordDescription;

    @Column(name = "word_turkish_mean")
    private String turkishMean;

    @ManyToOne
    @JoinColumn(name = "sub_level_id")
    private SubLevel subLevel;

    @OneToMany(mappedBy = "word")
    private List<Question> questions;


}
