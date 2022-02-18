package tajbanana.restful.repository;

import org.springframework.stereotype.Repository;
import tajbanana.restful.model.LiveStream;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LiveStreamRepo {
    List<LiveStream> streams =  new ArrayList<>();

    public LiveStreamRepo() {
        streams.add(new LiveStream());
    }

    public List<LiveStream> findAll() {
        return null;
    }

    public LiveStream create() {
        return null;
    }
}
