package tajbanana.restful.repository;

import tajbanana.restful.model.LiveStream;

import java.util.ArrayList;
import java.util.List;

public class LiveStreamRepo {
    List<LiveStream> streams =  new ArrayList<>();

    public LiveStreamRepo() {
        streams.add(new LiveStream());
    }
}
