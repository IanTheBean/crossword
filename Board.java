class Board{

  private ArrayList<Word> words;

  public Board(int size){
    words = new ArrayList<Word>();

    // get the words for the puzzle
    FileReader fileReader = new FileReader("words.txt");
    for(int i = 0; i < size; i++){
      String word = fileReader.randomLine(0.1);
      words.add(new Word(word.split("\\|")[0], word.split("\\|")[1]));
    }

    // sort the words from largest to smallest
    words.sort((a, b) -> (b.getWord().length() - a.getWord().length()));

    //combine words to form a puzzle
    for(int i = 0; i < words.size(); i++){
      
    }
  }
}