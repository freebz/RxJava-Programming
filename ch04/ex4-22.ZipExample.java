// 코드 4-22 zip() 함수의 활용 예(combine/ZipExample.java - marbleDiagram())

String[] shapes = {"BALL", "PENTAGON", "STAR"};
String[] coloredTriangles = {"2-T", "6-T", "4-T"};

Observable<String> source = Observable.zip(
  Observable.fromArray(shapes).map(Shape::getSuffix),  // 모양을 가져옵니다.
  Observable.fromArray(coloredTriangles).map(Shape::getColor),  // 색상을 가져옵니다.
  (suffix, color) -> color + suffix);

source.subscribe(Log::i);
