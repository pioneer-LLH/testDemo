package javaio.javaio.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class javaio {
    public static void main(String[] args) throws IOException {
        //创建文件
        File file=new File("f:/a.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        //字节流
        FileInputStream fileinput= new FileInputStream(file);
        byte bytes[]=new byte[1024];
        int n=0;
        while(fileinput.read(bytes)!=-1){
            String str = new String(bytes);
            System.out.println(str);
        }
        fileinput.read();
        fileinput.close();
    }
}
