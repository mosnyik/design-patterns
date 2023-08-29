package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    // this implementation works, but it has a problem because a change in the internal of the
    // class causes some external breaks in the app which is bad

    private List<String> urls  = new ArrayList<>();

    public void push(String url){
        urls.add(url);
    }

    public String pop(){
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
}
