class Cell{
  private Word word;
  private int index;
  private char letter;
  //private Word interserction;

  public Cell(Word word, int index){
    this.word = word;
    this.index = index;
    this.letter = this.word.getWord().charAt(index);
  }
}