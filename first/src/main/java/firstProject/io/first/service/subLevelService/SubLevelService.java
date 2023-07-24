package firstProject.io.first.service.subLevelService;

import firstProject.io.first.model.request.CreateSubLevelRequest;
import firstProject.io.first.model.response.GetAllSubLevelResponse;

public interface SubLevelService {

    void add(CreateSubLevelRequest createSubLevelRequest);

    GetAllSubLevelResponse getAllSubLevel();

}
