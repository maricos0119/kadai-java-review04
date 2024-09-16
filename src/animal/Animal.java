package animal;

public class Animal {
    // フィールド
    private String name; // 名前
    private int age;      // 年齢

    // 引数なしのコンストラクタ（念のため記述しただけなので中身はからでOK）
    public Animal() {
    }

    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 名前と年齢を言うメソッド
    public void say() {
            System.out.println( this.name + " です。 " + this.age + "歳です。");
        }
}