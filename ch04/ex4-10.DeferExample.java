// 코드 4-10 getObservable()에서 반환하는 Observable 구독(create/DeferExample.java - notDeferred())

Observable<String> source = getObservable();
source.subscribe(val -> Log.i("Subscriber #1" + val));
source.subscribe(val -> Log.i("Subscriber #2" + val));
