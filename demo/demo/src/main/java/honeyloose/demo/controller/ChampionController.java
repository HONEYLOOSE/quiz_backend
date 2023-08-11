package honeyloose.demo.controller;

import honeyloose.demo.entity.ChampionEntity;
import honeyloose.demo.repository.ChampionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // JSON 형태 결과값을 반환해줌 (@ResponseBody가 필요없음)
@RequiredArgsConstructor // final 객체를 Constructor Injection 해줌. (Autowired 역할)
@RequestMapping("/v1") // version1의 API
public class ChampionController {

    private final ChampionRepository championRepository;

    @GetMapping("/champion")
    public List<ChampionEntity> findAllChampion() {
        return championRepository.findAll();
    }

    @GetMapping("/champion/query")
    public List<ChampionEntity> findAllChampion(
            @RequestParam(value = "length",required = false) int length) {
        return championRepository.findByLengthOfName(length);
    }


}
