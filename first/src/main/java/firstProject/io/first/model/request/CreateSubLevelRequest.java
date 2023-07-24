package firstProject.io.first.model.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSubLevelRequest {



    @NotNull
    @NotBlank
    private String name;

    @NotBlank
    @NotNull
    private int levelId;

}
