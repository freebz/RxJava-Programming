// 코드 6-5 제어 흐름 구현 비교(activities/LoopActivity.java)

public class LoopActivity extends AppCompatActivity {
    public static final String TAG = LoopActivity.class.getSimpleName();

    Iterable<String> samples = Arrays.asList(
	"banana", "orange", "apple", "apple mango", "melon", "watermelon");

    // 자바
    @OnClick(R.id.btn_loop)
    void loop() {
	log(">>>>> get an apple :: java");
	for(String s : samples) {
	    if(s.contains("apple")) {
		log(s);
		return;
	    }
	}
    }

    // RxJava 1.x
    @OnClick(R.id.btn_loop2)
    void loop2() {
	log(">>>>> get an apple :: rx 1.x");
	rx.Observable.from(samples)
	    .filter(s -> s.contains("apple"))
	    .firstOrDefault("Not found")
	    .subscribe(this::log);
    }

    // RxJava 2.X
    @OnClick(R.id_bon_loop3)
    void loop3() {
	log(">>>>> get an apple :: rx 2.x");
	Observable.fromIterable(samples)
	    .filter(s -> s.contains("apple"))
	    // .skipWhile(s -> !s.contains("apple"))
	    .first("Not found")
	    .subscribe(this::log);
    }
}
