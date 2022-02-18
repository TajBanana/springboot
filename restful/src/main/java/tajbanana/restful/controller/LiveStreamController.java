package tajbanana.restful.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tajbanana.restful.model.LiveStream;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/streams")
public class LiveStreamController {

    @GetMapping
    public List<LiveStream> findAll() {
        streams.add(new LiveStream());

        return null;
    }
}
