// 코드 4-9 defer() 함수의 활용 예(create/DeferExample.java)

Iterator<String> colors = Arrays.asList("1", "3", "5", "6").iterator();

@Override
public void marbleDiagram() {
    Callable<Observable<String>> supplier = () -> getObservable();
    Observable<String> source = Observable.defer(supplier);

    source.subscribe(val -> Log.i("Subscriber #1:" + val));
    source.subscribe(val -> Log.i("Subscriber #2:" + val));
    CommonUtils.exampleComplete();
}

// 번호가 적인 도형을 발행하는 Observable을 생성합니다.
private Observable<String> getObservable() {
    if (colors.hasNext()) {
	String color = colors.next();
	return Observable.just(
	    Shape.getString(color, Shape.BALL),
	    Shape.getString(color, Shape.RECTANGLE),
	    Shape.getString(color, Shape.PENTAGON));
    }

    return Observable.empty();
}
