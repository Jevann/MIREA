package homework8;

import java.io.*;

public class Main {
    static void Zapis_v_file(String str) throws IOException {
        FileWriter fw = new FileWriter("Text1.txt", false);
        fw.write(str);
        fw.flush();
    }
    static void Vivod_iz_file() throws IOException {
        FileReader fr = new FileReader("Text1.txt");
        int c;
        while((c = fr.read()) != -1){
            System.out.print((char) c);
        }

    }
    static void Dobavit_v_file(String str) throws IOException {
        FileWriter fw = new FileWriter("Text1.txt", true);
        fw.write(str);
        fw.close();
    }
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();

        Zapis_v_file(str);
        Vivod_iz_file();
        str = br.readLine();
        Dobavit_v_file(str);
    }
}