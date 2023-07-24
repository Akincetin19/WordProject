package firstProject.io.first.model.dto;


import firstProject.io.first.entity.Word;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CreateQuestionDto {

    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private int wordId;
    private int subLevelId;

}
