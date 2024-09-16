package animal;

public class Human extends Animal implements Thinkable{
    // 趣味のフィールド
    private String hobby;

   // コンストラクタで名前、年齢、趣味を初期化
    public Human(String name, int age, String hobby) {
        super(name, age); //スーパークラスのコンストラクタを呼び出して名前と年齢を初期化
        this.hobby = hobby;
    }


    //趣味について考えるメソッド（インターフェースの実装）
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えます。");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }




}
