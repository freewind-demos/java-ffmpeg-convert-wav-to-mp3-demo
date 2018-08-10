Java Convert wav to mp3 Demo
============================

Use [ffmpeg wrapper](https://github.com/bramp/ffmpeg-cli-wrapper) to convert wav file to mp3.

```
brew install ffmpeg
```

Check the path of `ffmpeg`:

```
$ which ffmpeg
/usr/local/bin/ffmpeg
```

Modify the path in `Hello.java` if not same.

Run `Hello.java` in your IDE.

Notice
------

mp3文件实际上有很多格式的，比如`mp1`, `mp2`, `mp2.5`, `mp3`等等

1. 通常我们使用`mp3`格式：`setFormat("mp3")`，可以正常被各种播放器播放
2. 但是，JavaFX不支持。所以要想让JavaFX正常播放，需要：`.setFormat("mp2")`
3. 减小体积：`setAudioCodec("libmp3lame")`。如果不设置的话，会大几倍

这是花了几个小时研究出来的