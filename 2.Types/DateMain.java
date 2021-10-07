import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateMain {
    public static void main(String[] args){
        final Date now = new Date();
        final SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA);
        final SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
        final SimpleDateFormat format3 = new SimpleDateFormat("오늘은 이 달의 W번째 E요일 입니다.", Locale.KOREA);
        System.out.println(format1.format(now));
        System.out.println(format2.format(now));
        System.out.println(format3.format(now));
    }
}
//HH:mm:ss