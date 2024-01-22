package HomeWork_2;

import java.io.*;
import java.util.BitSet;

public class Example {
    public static void main(String[] args) throws IOException {
        int digit = 222111233;
        byte[] bytes = new byte[3];
        for(int j = 0; j < bytes.length; j++){
            bytes[j] = (byte) (digit % 1000);
            System.out.println(bytes[j] & 0xFF); //Для самопроверки беззнакового использования типа byte
            digit = digit/1000;
        }
        try (FileOutputStream fileWriter = new FileOutputStream("test.txt")){
            for (byte aByte : bytes) {
                fileWriter.write(aByte);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
