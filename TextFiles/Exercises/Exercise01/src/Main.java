import java.io.*;

public class Main {
    public static void main(String[] args) {
        int lines=0;

        File f = new File("shakespeare.txt");
        File nf = new File("shakespeare2.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            while(br.readLine()!=null) {
                lines++;
            }
        }catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("TotalLines: "+lines);

        System.out.println("==========File content in array============");
        String[] array = new String[lines];
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            while(br.readLine()!=null) {
                for(int i=0; i< array.length-1;i++){
                    System.out.println(array[i]=br.readLine());
                }
            }
        }catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("==========New File content with two more line============");
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(nf)))){
            for(int i=0; i<array.length-1; i++){
                pw.println("\n"+array[i]);
            }
        }catch (IOException e) {
            System.err.println(e);
        }
    }
}