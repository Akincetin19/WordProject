package firstProject.io.first.service.question.Impl;

import firstProject.io.first.dao.QuestionDao;
import firstProject.io.first.entity.Question;
import firstProject.io.first.model.dto.QuestionDto;
import firstProject.io.first.model.request.CreateQuestionRequest;
import firstProject.io.first.model.request.UpdateQuestionRequest;
import firstProject.io.first.model.response.GetAllQuestionResponse;
import firstProject.io.first.model.response.GetQuestionsBySubLevelIdResponse;
import firstProject.io.first.service.question.QuestionService;
import firstProject.io.first.utilities.ModelMapperService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService {
    @Override
    public GetAllQuestionResponse getAll() {
        List<Question> questions = this.questionDao.findAll();
        List<QuestionDto> dtos = questions.stream()
                .map(question -> this.modelMapperService.forResponse()
                        .map(question, QuestionDto.class)).collect(Collectors.toList());

        GetAllQuestionResponse response = new GetAllQuestionResponse();
        response.setGetAllQuestionResponses(dtos);

        return response;
    }

    @Override
    public void update(UpdateQuestionRequest updateQuestionRequest) {

        Question question = modelMapperService.forRequest().map(updateQuestionRequest.getUpdateQuestionDto(), Question.class);
        this.questionDao.save(question);
    }

    @Override
    public GetQuestionsBySubLevelIdResponse getAllQuestionBySublevelId(int id) {

        List<Question> questions = this.questionDao.findBySubLevelId(id);

        List<QuestionDto> questionDtos = questions.stream().map(question -> this.modelMapperService
                .forResponse().map(question, QuestionDto.class)).collect(Collectors.toList());
        GetQuestionsBySubLevelIdResponse response = new GetQuestionsBySubLevelIdResponse();
        response.setGetAllQuestion(questionDtos);
        return response;
    }

    private ModelMapperService modelMapperService;
    private QuestionDao questionDao;
    @Override
    public void add(CreateQuestionRequest createQuestionRequest) {
        Question newQuestion = this.modelMapperService.forRequest().map(createQuestionRequest.getCreateQuestionDto(), Question.class);
        this.questionDao.save(newQuestion);
    }
}
