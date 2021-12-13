class Intersection{

  private Word vertical;
  private Word horizontal;
  private int verticalIndex;
  private int horizontalIndex;

  public Intersection(Word vertical, Word horizontal, int verticalIndex, int horizontalIndex){
    this.vertical = vertical;
    this.verticalIndex = verticalIndex;

    this.horizontal = horizontal;
    this.horizontalIndex = horizontalIndex;
  }

  public String toString(){
    return this.vertical.getWord() + ", " + this.horizontal.getWord() + " : " + verticalIndex + ", " + horizontalIndex;
  }

  public int getScore(){
    return verticalIndex + horizontalIndex;
  }
}