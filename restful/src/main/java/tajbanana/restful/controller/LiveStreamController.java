package tajbanana.restful.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tajbanana.restful.model.LiveStream;
import tajbanana.restful.repository.LiveStreamRepo;

import java.util.List;

@RestController
@RequestMapping(path = "/streams")
public class LiveStreamController {

    private final LiveStreamRepo repo;

    public LiveStreamController(LiveStreamRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<LiveStream> findAll() {

        return repo.findAll();
    }

    @GetMapping(path = "/{Id}")
    public String findById(@PathVariable String Id) {

        return Id;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create(@RequestBody LiveStream stream) {

        return repo.create();
    }

}
