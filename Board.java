class Board{
	public Board(){
		Word[] words = new Word[]{("BEANS", "amazing", 0, 0, true)};
		for(int y = 0; y < 10; y++){
			for(int x = 0; x < 10; x++){
				for(int i = 0; i < 3; i++){
					for(Word word : words){
						if(word.getCell(x, y, i) != "null"){
							
						}
					}
				}
			}
		}
	}
}