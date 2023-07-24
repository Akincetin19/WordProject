package firstProject.io.first.model.request;


import firstProject.io.first.model.dto.CreateQuestionDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateQuestionRequest {

    private CreateQuestionDto createQuestionDto;
}
