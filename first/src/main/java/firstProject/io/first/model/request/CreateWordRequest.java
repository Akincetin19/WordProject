package firstProject.io.first.model.request;


import firstProject.io.first.model.dto.CreateWordDto;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateWordRequest {

    private CreateWordDto createWordDto;
}
