package memento.exercise;

import java.util.ArrayList;
import java.util.List;

public class DocHistory {
    private List<DocState> docStates = new ArrayList<>();

    public void push(DocState docState){
docStates.add(docState);
    }

    public DocState pop(){
         var lastIndex = docStates.size() -1;
         var lastState = docStates.get(lastIndex);
         docStates.remove(lastState);

         return lastState;
    }
}
