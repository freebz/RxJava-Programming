// 코드 7-11 LambdaObserver.OnError()의 RxJava 내부 코드

@Override
public void onError(Throwable t) {
    if (!isDisposed()) {
	lazySet(DisposableHelper.DISPOSED);
	try {
	    onError.accept(t);
	} catch (Throwable e) {
	    Exceptions.throwIfFatal(e);
	    RxJavaPlugins.onError(new CompositeException(t, e));
	}
    }
}
