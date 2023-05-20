/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

/**
 *
 * @author 91897
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author 91897
 */
public class decompressor {
    public static void method(File file) throws IOException{
        String fileDirectory=file.getParent();
        
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(fileDirectory+"/DecompressedFile");
        GZIPInputStream gzip=new GZIPInputStream(fis);
        
        byte[] buffer=new byte[1024];
        int len;
        
        while((len=fis.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        
        gzip.close();
        fos.close();
        fis.close();
    }
    
    public static void main(String[] args) throws IOException{
        File path=new File("/Users/91897/Downloads/saniya/CompressedFile.gz");
        method(path);
    }
    
}

