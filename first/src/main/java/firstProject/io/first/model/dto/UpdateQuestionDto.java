package firstProject.io.first.model.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class UpdateQuestionDto {

    @NotNull
    private int id;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private int wordId;
    private int subLevelId;
}
