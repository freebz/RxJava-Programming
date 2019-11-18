// 코드 2-11 fromIterable()에 Set 사용(ObservableFromIterable.java - setExample())

Set<String> cities = new HashSet<>();
cities.add("Seoul");
cities.add("London");
cities.add("Paris");

Observable<String> source = Observable.fromIterable(cities);
source.subscribe(System.out::println);
