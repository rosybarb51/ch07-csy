package ch07;

public class IPTV extends Television {
//	IPTV의 멤버 변수, vod채널의 범위를 101 ~ 199까지 설정함
    int vodChannel;

//    생성자를 사용하여 기본값 입력
    IPTV() {
        vodChannel = 101;
        channel = 1;
        volume = 0;
    }

    void changeVodChannel(int vodChannel) {
        this.vodChannel = vodChannel;
        if (vodChannel < 100) {
            System.out.println("vod 채널은 101번 부터 입니다.");
            System.out.println("vod 채널을 101번으로 변경 합니다.");
        }
        else if (vodChannel > 200) {
            System.out.println("vod 채널은 199번 까지입니다.");
            System.out.println("vod 채널을 199번으로 변경 합니다.");
        }
        else {
            System.out.println("vod 채널을 " + vodChannel + "번으로 변경 합니다.");
        }
    }

    void vodChannelUp() {
    	vodChannel++;
    	
        if (vodChannel < 100 || vodChannel >= 200) {
        	vodChannel = 101;
            System.out.println("vod 채널을 101번으로 변경 합니다.");
        }
        else {
            System.out.println("vod 채널을 " + vodChannel + "번으로 변경 합니다.");
        }
    }

    void vodChannelDown() {
    	vodChannel--;
    	
        if (vodChannel < 100 || vodChannel > 200) {
        	vodChannel = 199;
            System.out.println("vod 채널을 199번으로 변경 합니다.");
        }
        else {
            System.out.println("vod 채널을 " + vodChannel + "번으로 변경 합니다.");
        }
    }
}
