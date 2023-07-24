package firstProject.io.first.service.question;


import firstProject.io.first.model.request.CreateQuestionRequest;
import firstProject.io.first.model.request.UpdateQuestionRequest;
import firstProject.io.first.model.response.GetAllQuestionResponse;
import firstProject.io.first.model.response.GetQuestionsBySubLevelIdResponse;

public interface QuestionService {

    void add(CreateQuestionRequest createQuestionRequest);

    GetAllQuestionResponse getAll();

    void update(UpdateQuestionRequest updateQuestionRequest);

    GetQuestionsBySubLevelIdResponse getAllQuestionBySublevelId(int id);
}
