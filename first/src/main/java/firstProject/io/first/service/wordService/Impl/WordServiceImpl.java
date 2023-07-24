package firstProject.io.first.service.wordService.Impl;

import firstProject.io.first.dao.WordDao;
import firstProject.io.first.entity.SubLevel;
import firstProject.io.first.entity.Word;
import firstProject.io.first.model.dto.WordDto;
import firstProject.io.first.model.request.CreateWordRequest;
import firstProject.io.first.model.request.DeleteWordRequest;
import firstProject.io.first.model.request.UpdateQuestionRequest;
import firstProject.io.first.model.request.UpdateWordRequest;
import firstProject.io.first.model.response.GetAllWordResponse;
import firstProject.io.first.service.wordService.WordService;
import firstProject.io.first.utilities.ModelMapperService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor

public class WordServiceImpl implements WordService {

    private WordDao wordDao;
    private ModelMapperService modelMapperService;

    @Override
    public GetAllWordResponse getAllWordResponse() {

        List<Word> wordList = this.wordDao.findAll();

        List<WordDto> wordDtoList = wordList.stream().map(word -> this.modelMapperService.forResponse()
                .map(word, WordDto.class)).collect(Collectors.toList());

        GetAllWordResponse getAllWordResponse = new GetAllWordResponse();
        getAllWordResponse.setWordDtoList(wordDtoList);

        return getAllWordResponse;
    }

    @Override
    public void add(CreateWordRequest createWordRequest) {
        Word newWord = new Word();
        newWord = this.modelMapperService.forRequest().map(createWordRequest.getCreateWordDto(), Word.class);
        newWord.setId(0);
        newWord.getSubLevel().setId(createWordRequest.getCreateWordDto().getSubLevelId());
        this.wordDao.save(newWord);
    }

    @Override
    public void update(UpdateWordRequest updateWordRequest) {

        Word word = this.modelMapperService.forRequest().map(updateWordRequest, Word.class);

        word.setId(updateWordRequest.getUpdateWordDto().getId());
        word.setSubLevel(new SubLevel());
        word.getSubLevel().setId(updateWordRequest.getUpdateWordDto().getSubLevelId());
        this.wordDao.save(word);
    }

    @Override
    public void delete(int id) {
        this.wordDao.deleteById(id);
    }

    @Override
    public GetAllWordResponse getAllWordByLevelId(int id) {
        List<Word> words = this.wordDao.findWordByLevelId(id);
        List<WordDto> dtos = words.stream().map(word -> this.modelMapperService
                .forResponse().map(word, WordDto.class)).collect(Collectors.toList());
        GetAllWordResponse response = new GetAllWordResponse();
        response.setWordDtoList(dtos);
        return response;
    }

    @Override
    public GetAllWordResponse getAllWordBySubLevelId(int sublevelId) {
        List<Word> words = this.wordDao.findAllBySubLevelId(sublevelId);
        List<WordDto> dtos = words.stream().map(word -> this.modelMapperService
                .forResponse().map(word, WordDto.class)).collect(Collectors.toList());
        GetAllWordResponse response = new GetAllWordResponse();
        response.setWordDtoList(dtos);
        return response;

    }

}
