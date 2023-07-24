package firstProject.io.first.service.levelService;

import firstProject.io.first.model.request.CreateLevelRequest;
import firstProject.io.first.model.response.GetAllLevelResponse;

import java.util.List;

public interface LevelService {

    GetAllLevelResponse getAllLevel();

    void add(CreateLevelRequest createLevelResponse);

}
