import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

class FileReader{
  private File file;
  private Scanner reader;
  private Random random = new Random();

  public FileReader(String fileName){
    try{
      file = new File(fileName);
      reader = new Scanner(file);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  public String nextLine(){
    return reader.nextLine();
  }

  public String randomLine(double chance){
    for(int i = 0; i < 1000;i++){
      if(this.random.nextDouble() < chance){
        return this.nextLine();
      }else{
        this.nextLine();
      }
    }
    return this.nextLine();
  }
}