// 코드 4-18 groupBy() 함수의 활용 예(transform/GroupByExample.java - marbleDiagram())

String[] objs = {"6", "4", "2-T", "2", "6-T", "4-T"};
Observable<GroupedObservable<String, String>> source =
  Observable.fromArray(objs).groupBy(CommonUtils::getShape);

source.subscribe(obj -> {
  obj.subscribe(
    val -> System.out.println("GROUP:" + obj.getKey() + "\t Value:" + val));
});
