// 코드 2-9 toIntegerArray() 메서드 적용(ObservableFromArray.java - intArray())

int[] intArray = {400, 500, 600};
Observable<Integer> source = Observable.fromArray(toIntegerArray(intArray));
source.subscribe(System.out::println);


private static Integer[] toIntegerArray(int[] intArray) {
    return IntStream.of(intArray).boxed().toArray(Integer[]::new);
}
