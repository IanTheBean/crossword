class Cell{
	private char letter;
	private boolean found;

	private int x;
	private int y;

	public boolean[] adjacent;
	
	public Cell(char letter, int x, int y, boolean[] adjacent){
		this.letter = letter;
		this.adjacent = adjacent;
		this.found = false;
		this.x = x;
		this.y = y;
	}

	public void reveal(){
		this.found = true;
	}

	public char getChar(){
		return letter;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}
	
	public String getBox(int h){
		String r = "";
		if(h == 2){
			r += " " + (found ? letter : " ") + " │";
		}
		else if(h == 3){
			r += "───";
			if(adjacent[1] == true && adjacent[2] == true){
				r += "┼";
			}else if(adjacent[2] == true){
				r += "┤";
			}else if(adjacent[1] == true){
				r += "┴";
			}else{
				r += "┘";
			}
		}
		return r;
	}
	
	public String getVert(int h){
		String r = "";
		if(h == 1){
			if(adjacent[3] == true && adjacent[0] == true){
				r += "┼";
			}else if(adjacent[0] == true){
				r += "├";
			}else if(adjacent[3] == true){
				r += "┬";
			}else{
				r += "┌";
			}
		}else if(h == 2){
			r += "│";
		}else if(h == 3){
			if(adjacent[3] == true && adjacent[2] == true){
				r += "┼";
			}else if(adjacent[2] == true){
				r += "├";
			}else if(adjacent[3] == true){
				r += "┴";
			}else{
				r += "└";
			}
		}
		return r;
	}

	public String getHor(){
		String r = "───";
		if(adjacent[0] == true && adjacent[1] == true){
			r += "┼";
		}else if(adjacent[0] == true){
			r += "┤";
		}else if(adjacent[1] == true){
			r += "┬";
		}else{
			r += "┐";
		}
		return r;
	}
}