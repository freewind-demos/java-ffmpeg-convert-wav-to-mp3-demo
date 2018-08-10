package demo;

import net.bramp.ffmpeg.FFmpeg;
import net.bramp.ffmpeg.FFmpegExecutor;
import net.bramp.ffmpeg.builder.FFmpegBuilder;

import java.io.File;
import java.io.IOException;

public class Hello {

    private static String FFMPEG_PATH = "/usr/local/bin/ffmpeg";
    private static File output = new File("data/demo.mp3");

    public static void main(String[] args) throws IOException {
        FFmpeg ffmpeg = new FFmpeg(FFMPEG_PATH);
        FFmpegBuilder builder = new FFmpegBuilder()
                .setInput("data/demo.wav")
                .overrideOutputFiles(true)
                .addOutput(output.getAbsolutePath())
                .setFormat("mp2")
                .setAudioCodec("libmp3lame")
                .done();
        FFmpegExecutor executor = new FFmpegExecutor(ffmpeg);
        executor.createJob(builder).run();
        System.out.println("Generated mp3 file: " + output.getAbsolutePath());
    }

}
