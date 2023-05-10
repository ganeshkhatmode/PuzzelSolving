package com.gk.polymorphisam;

import java.util.Comparator;
import java.util.Objects;

public class Word implements Comparable<Word> {
    private String word;
    private int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return  Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }

    @Override
    public String toString() {
        return "{" + word +
                "= " + count +
                '}';
    }

//    @Override
//    public int compare(Word o1, Word o2) {
//        if(o1.getCount() == o2.getCount()){
//            return 0;
//        } else if (o1.getCount() > o2.getCount()) {
//            return 1;
//        } else
//        return -1;
//    }

    @Override
    public int compareTo(Word o) {
        if(count == o.getCount())
            return 0;
        else if (count < o.getCount()) {
            return 1;
        } else
        return -1;
    }
}
