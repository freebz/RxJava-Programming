// 코드 7-14 onErrorReturnItem() 함수의 활용 예(ExceptionHandling.java - onErrorReturnItem())

String[] grades = {"70", "88", "$100", "93", "83"};

Observable<Integer> source = Observable.fromArray(grades)
  .map(data -> Integer.parseInt(data))
  .onErrorReturn(-1);

source.subscribe(data -> {
    if (data < 0) {
      Log.e("Wrong Data found!!");
      return;
    }

    Log.i("Grade is " + data);
});
