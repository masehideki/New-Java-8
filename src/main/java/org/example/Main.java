//課題
//
//入出力を実際に実装して、作ったファイルに文章を追加する。
//その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして、例外処理を行う。
//catchした中で更にファイルに書き込もうとして例外になった場合、どうなるのかを確認してください。

package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

  public static void main(String[] args) throws IOException {
    try{
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "Javaコース楽しすぎる！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    }catch (IOException e){
//      ここの処理を実行する
      e.printStackTrace();
      System.out.println("例外が発生した。");

//      もう一度同じ処理
      Path path = Path.of("JavaCourse.txt");
      Files.writeString(path, "Javaコース楽しすぎる！", StandardOpenOption.APPEND);
      System.out.println(Files.readString(path));
    }

  }
}

//メモ
//エラー：どうしようもないもの
//例外：制御できるもの
