// 코드 8-4 test() 함수의 소스 코드

public final TestObserver<T> test() {
    TestObserver<T> ts = new TestObserver<T>();
    subscribe(ts);
    return ts;
}
