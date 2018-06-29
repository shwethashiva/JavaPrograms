import java.io.*;
import java.io.BufferedReader;

public class MathSolutions {

    public void fileOperation(String fileName){
        File file=new File(fileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            reverseFile(br);
        }
        catch(FileNotFoundException e){
            System.out.println(e.getClass());
        }
        catch(IOException io){
            System.out.println(io.getClass());
        }
    }
    public void reverseFile(BufferedReader br) throws IOException{
        String st=br.readLine();
        if(st!=null){
            reverseFile(br);
            System.out.println(st);
        }

    }
    public static void main(String [] args){
        MathSolutions math= new MathSolutions();
        math.fileOperation("/users/PRAVEEN/Documents/rhyme.txt");

        /*File file = new File("/users/PRAVEEN/Documents/rhyme.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getClass());
        }
        catch(IOException io){
            System.out.println(io.getClass());
        }*/
    }
}
