import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;
import java.util.*;

class Board{

  private ArrayList<Word> words;
  private ArrayList<Intersection> intersections;

  public Board(int size, double originality){
    words = new ArrayList<Word>();

    // get the words for the puzzle
    FileReader fileReader = new FileReader("words.txt");
    for(int i = 0; i < size; i++){
      String word = fileReader.randomLine(originality);
      words.add(new Word(word.split("\\|")[0], word.split("\\|")[1]));
    }

    // sort the words from largest to smallest
    words.sort((a, b) -> (b.getWord().length() - a.getWord().length()));
    for(int i = 1; i < words.size(); i++){
      int bestScore = 100;
    int bestScoreIndex = -1;
      ArrayList<Intersection> possibleIntersections = words.get(i).possibleIntersections(words.get(i-1));
      for(int j = 0; j < possibleIntersections.size(); j++){
        int currentScore = Math.abs(((words.get(i).getWord().length() + words.get(i-1).getWord().length())/2) - possibleIntersections.get(j).getScore());
        if(currentScore <= bestScore){
          bestScoreIndex = j;
          bestScore = currentScore;
        }
      }
      if(bestScoreIndex != -1){
        System.out.println(possibleIntersections.get(bestScoreIndex).toString());
      }
    }
    
    
  }

  public void printWords(){
    for(Word word : words){
      System.out.println(word.getWord());
    }
  }
}