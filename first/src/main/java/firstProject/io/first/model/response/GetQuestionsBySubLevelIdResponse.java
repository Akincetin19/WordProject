package firstProject.io.first.model.response;

import firstProject.io.first.model.dto.QuestionDto;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Setter
@Getter
public class GetQuestionsBySubLevelIdResponse {

    List<QuestionDto> getAllQuestion;
}
