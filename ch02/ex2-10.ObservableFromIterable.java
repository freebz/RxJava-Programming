// 코드 2-10 fromIterable()에 List 사용(ObservableFromIterable.java - listExample())

List<String> names = new ArrayList<>();
names.add("Jerry");
names.add("William");
names.add("Bob");

Observable<String> source = Observable.fromIterable(names);
source.subscribe(System.out::println);
