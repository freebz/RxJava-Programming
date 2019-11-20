// 코드 4-20 filter() 함수 추가(transform/GroupByExample.java - filterBallGroup())

String[] objs = {"6", "4", "2-T", "2", "6-T", "4-T"};
Observable<GroupedObservable<String, String>> source =
  Observable.fromArray(objs).groupBy(CommonUtils::getShape);

source.subscribe(obj -> {
    obj.filter(val -> obj.getKey().equals(Shape.BALL))
    .subscribe(val ->
      System.out.println("GROUP:" + obj.getKey() + "\t Value:" + val));
});
