package firstProject.io.first.api;

import firstProject.io.first.model.request.CreateWordRequest;
import firstProject.io.first.model.request.UpdateWordRequest;
import firstProject.io.first.model.response.GetAllWordResponse;
import firstProject.io.first.service.wordService.Impl.WordServiceImpl;
import firstProject.io.first.service.wordService.WordService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/word")
@AllArgsConstructor
public class WordController {

    private WordService wordService;

    @GetMapping("/getAll")

    public GetAllWordResponse getAllWordResponse() {
        return this.wordService.getAllWordResponse();
    }

    @GetMapping("/getAllWordByLevelId/{id}")
    public GetAllWordResponse getAllWordResponseByLevelId(@PathVariable int id) {
        return this.wordService.getAllWordByLevelId(id);
    }
    @GetMapping("/getAllWordBySubLevelId/{id}")
    public GetAllWordResponse getAllWordResponseBySubLevelId(@PathVariable int id) {
        return this.wordService.getAllWordBySubLevelId(id);
    }

    @PostMapping("/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateWordRequest createWordRequest) {

        this.wordService.add(createWordRequest);
    }

    @PutMapping("/update")

    public void update(@RequestBody UpdateWordRequest updateWordRequest) {
        this.wordService.update(updateWordRequest);
    }
    @DeleteMapping("/delete/{id}")

    public void delete(@PathVariable int id) {
        this.wordService.delete(id);
    }

}
