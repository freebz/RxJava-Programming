// 코드 2-8 fromArray()에 int[] 사용(ObservableFromArray.java - intArrayWrong())

int[] intArray = {400, 500, 600};
Observable.fromArray(intArray).subscribe(System.out::println);
