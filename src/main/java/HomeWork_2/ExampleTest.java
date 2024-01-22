package HomeWork_2;

import java.io.*;

public class ExampleTest {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream reader = new FileInputStream("test.txt")){
            byte[] bytes = reader.readAllBytes();
            byte[] okBytes = new byte[bytes.length];
            for(int i = 0; i < bytes.length; i++){
                okBytes[okBytes.length-i-1] = bytes[i];
            }
            for(byte b : okBytes){
                System.out.print(b & 0xFF);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}