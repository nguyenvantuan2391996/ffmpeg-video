/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processVideo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.CutVideoForm;

/**
 *
 * @author nguyenvantuan
 */
public class CutVideo {

    public String msg = "";

    public String cutVideo() {

        Thread getByteVideo = new Thread(new Runnable() {
            @Override
            public void run() {
                File file = new File("bin\\output.mp4");
                double sizeFile = 0d;

                while (true) {
                    try {
                        Thread.sleep(1000);
                        if (sizeFile == file.length()) {
                            break;
                        }
                        System.out.println(file.length());
                        sizeFile = file.length();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CutVideo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                msg = "Video was processed success and saved in folder bin";
            }
        });
        getByteVideo.start();

        // xử lý video
        try {
            Process p = Runtime.getRuntime().exec("cmd /c start hideCmd.vbs");

            p.waitFor();

        } catch (Exception e) {
            // TODO: handle exception
        }
        return msg;
    }

    public static void main(String[] args) throws IOException {
        String a = "hasbjhbasj.mp4";
        System.out.println(a.contains(".MP4"));
    }
}
