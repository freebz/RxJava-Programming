// 코드 7-12 onErrorReturn() 함수의 활용 예(ExceptionHandling.java - onErrorReturn())

String[] grades = {"70", "88", "$100", "93", "83"};  // $100이 에러 데이터

Observable<Integer> source = Observable.fromArray(grades)
  .map(data -> Integer.parseInt(data))
  .onErrorReturn(e -> {
      if(e instanceof NumberFormatException) {
	e.printStackTrace();
      }
      return -1;
  });

source.subscribe(data -> {
    if (data < 0) {
      Log.e("Wrong Data found!!");
      return;
    }

    Log.i("Grade is " + data);
});
