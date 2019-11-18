// 코드 2-7 fromArray() 함수 활용 예(ObservableFromArray.java - integerArray())

Integer[] arr = {100, 200, 300};
Observable<Integer> source = Observable.fromArray(arr);
source.subscribe(System.out::println);
