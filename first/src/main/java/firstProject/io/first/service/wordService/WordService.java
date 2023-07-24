package firstProject.io.first.service.wordService;

import firstProject.io.first.model.dto.DeleteWordDto;
import firstProject.io.first.model.request.CreateWordRequest;
import firstProject.io.first.model.request.DeleteWordRequest;
import firstProject.io.first.model.request.UpdateQuestionRequest;
import firstProject.io.first.model.request.UpdateWordRequest;
import firstProject.io.first.model.response.GetAllWordResponse;

import java.util.List;

public interface WordService {



    GetAllWordResponse getAllWordResponse();
    void add(CreateWordRequest createWordRequest);
    void update(UpdateWordRequest updateWordRequest);
    void delete(int id);

    GetAllWordResponse getAllWordByLevelId(int levelId);

    GetAllWordResponse getAllWordBySubLevelId(int sublevelId);
}
