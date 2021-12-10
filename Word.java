
class Word{
	private String word;
	private String definition;
	private Cell[] letters;
	
	public Word(String word, String definition, int x, int y, boolean facingRight){
		this.word = word;
		this.definition = definition;
		letters = new Cell[word.length()];
		for(int i = 0; i < word.length();i++){
			letters[i] = new Cell(word.charAt(i), x + (facingRight ? i : 0), y + (facingRight ? 0 : i), new boolean[]{false, false, false, false});
		}
	}

	public String getCell(int x, int y, int l, boolean top){
		for(Cell letter : letters){
			if(letter.getX() == x && letter.getY() == y){
				if(top == true){
					return letter.getVert(1) + letter.getHor();
				}else if(l == 1){
					return letter.getVert(2) + letter.getBox(2);
				}else{
					return letter.getVert(3) + letter.getBox(3);
				}
			}
		}
		return "null";
	}

	public String getWord(){
		return word;
	}

	public String getDefinition(){
		return definition;
	}
}