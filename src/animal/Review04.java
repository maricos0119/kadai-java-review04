package animal;

public class Review04 {

    public static void main(String[] args) {
        // Humanクラスのインスタンスを生成
        Human tanaka = new Human("田中　太郎", 25, "電車");
        Human suzuki = new Human("鈴木　二郎", 30, "野球");
        Human sato =new Human("佐藤　花子", 20, "映画");

        // tanakaの情報を表示
        tanaka.say();
        tanaka.think();

        // suzukiの情報を表示
        suzuki.say();
        suzuki.think();

        // satoの情報を表示
        sato.say();
        sato.think();

    }

}
