package firstProject.io.first.model.dto;


import firstProject.io.first.entity.SubLevel;
import firstProject.io.first.entity.Word;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class QuestionDto {

    private int id;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private WordDto wordDto;
    private SubLevelDto subLevelDto;

}
