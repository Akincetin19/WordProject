package firstProject.io.first.api;

import firstProject.io.first.model.request.CreateQuestionRequest;
import firstProject.io.first.model.request.UpdateQuestionRequest;
import firstProject.io.first.model.response.GetAllQuestionResponse;
import firstProject.io.first.model.response.GetQuestionsBySubLevelIdResponse;
import firstProject.io.first.service.question.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/question")
@AllArgsConstructor
public class QuestionController {

    private QuestionService questionService;

    @GetMapping("/getAll")
    public GetAllQuestionResponse getAll() {
        return this.questionService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateQuestionRequest createQuestionRequest) {
        this.questionService.add(createQuestionRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateQuestionRequest updateQuestionRequest) {

        this.questionService.update(updateQuestionRequest);
    }

    @GetMapping("/getAllBySubLevelId/{id}")
    public GetQuestionsBySubLevelIdResponse getAllBySubLevelId(@PathVariable int id) {
        return this.questionService.getAllQuestionBySublevelId(id);
    }


}
