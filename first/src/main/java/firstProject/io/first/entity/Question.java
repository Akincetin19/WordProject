package firstProject.io.first.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Questions")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "option_A")
    private String optionA;
    @Column(name = "option_B")
    private String optionB;
    @Column(name = "option_C")
    private String optionC;
    @Column(name = "option_D")
    private String optionD;

    @ManyToOne
    @JoinColumn(name = "word_id")
    private Word word;

    @ManyToOne
    @JoinColumn(name = "sub_level_id")
    private SubLevel subLevel;
}
