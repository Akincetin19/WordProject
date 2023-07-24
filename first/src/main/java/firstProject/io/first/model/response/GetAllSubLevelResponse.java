package firstProject.io.first.model.response;

import firstProject.io.first.model.dto.SubLevelDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class GetAllSubLevelResponse {
    private List<SubLevelDto> allSubLevelDtoList;
}
