package by.adamovichhh.laba.task8;

import java.util.ArrayList;
import java.util.List;

public class Sequences {

    public void functionOutput() {
        List<Integer> a = List.of(1,5,8,19,23);
        ArrayList<Integer> aSeq = new ArrayList<>(a);
        List<Integer> b = List.of(0,3,6,8,15,19,20,21,25,26,27);
        ArrayList<Integer> bSeq = new ArrayList<>(b);
        mergeArrays(aSeq,bSeq);
    }

    private void mergeArrays(List<Integer> firstSeqn, List<Integer> secondSeqn) {
        int j = 0;
        for (int i = 0; i < firstSeqn.size(); i++) {
            if (firstSeqn.get(i) > secondSeqn.get(j)) {
                firstSeqn.add(i, secondSeqn.get(j));
                j++;
                if (j >= secondSeqn.size()) break;
            }
        }
        firstSeqn.addAll(secondSeqn.subList(j, secondSeqn.size()));
        System.out.println(firstSeqn);
    }
}
