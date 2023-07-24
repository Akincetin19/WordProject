package firstProject.io.first.model.response;

import firstProject.io.first.model.dto.QuestionDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Setter
@Getter
public class GetAllQuestionResponse {

    List<QuestionDto> getAllQuestionResponses;
}
