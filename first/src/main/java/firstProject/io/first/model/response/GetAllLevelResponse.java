package firstProject.io.first.model.response;

import firstProject.io.first.model.dto.LevelDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class GetAllLevelResponse {

    private List<LevelDto> getAllLevelResponse;
}
