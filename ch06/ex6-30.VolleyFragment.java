// 코드 6-30 시간 정보 얻기 1(fragments/VolleyFragment.java - defer())

private Observable<JSONObject> getObservable() {
    return Observable.defer(() -> {
	try {
	    return Observable.just(getData());
	} catch (InterruptedException e) {
	    log("error : " + e.getMessage());
	    return Observable.error(e);
	} catch (ExecutionException e) {
	    log("error : " + e.getCause());
	    return Observable.error(e.getCause());
	}
    });
}
