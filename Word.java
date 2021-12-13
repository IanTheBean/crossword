import java.util.ArrayList;

class Word{
  private String word;
  private String definition;
  private boolean across;
  private int number;
  private Cell[] letters;
  private ArrayList<Intersection> intersections;

  public Word(String word, String definition){
    intersections = new ArrayList<Intersection>();
    this.word = word;
    this.definition = definition;
    this.letters = new Cell[word.length()];
    for(int i = 0; i < this.word.length(); i++){
      letters[i] = new Cell(this, i);
    }
  }

  public String getWord(){
    return this.word;
  }

  public ArrayList<Intersection> possibleIntersections(Word word){
    ArrayList<Intersection> intersectionPossibilities = new ArrayList<Intersection>();
    for(int i = 0; i < word.getWord().length(); i++){
      for(int j = 0; j < this.word.length(); j++){
        if(this.getWord().charAt(j) == word.getWord().charAt(i)){
          if(across){
            intersectionPossibilities.add(new Intersection(word, this, i, j));
          }else{
            intersectionPossibilities.add(new Intersection(word, this, i, j));
          }
        }
      }
    }
    return intersectionPossibilities;
  }
}