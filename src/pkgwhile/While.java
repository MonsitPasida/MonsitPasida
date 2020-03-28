package pkgwhile;

public class While {

    public static void main(String[] args) {
        double money = 10000, interest = 0;
        int year = 0;
        while (money <= 15000) {
            interest = money * 2.8 / 100;
            money = money + interest;
            year++;
            System.out.println("ปีที่ = " + year);
            System.out.println("เงินฝากพร้อมดอกเบี้ย = " + money);
        }
        System.out.println("ใช้เวลาทั้งหมด = " + year + " ปี ");
    }
}
