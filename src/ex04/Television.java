package ex04;

public class Television {
  int channel;
  int volume;
  String name;
  boolean isOnOff;

  public static void main(String[] args) {
    Television myTv = new Television();
    myTv.channel = 7;
    myTv.volume = 10;
    myTv.isOnOff = true;

    Television yourTv;
    yourTv = new Television();
    yourTv.channel = 9;
    yourTv.volume = 12;
    yourTv.isOnOff = true;

    System.out.println("나의 텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");
    System.out.println("나의 텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");

  }
}
