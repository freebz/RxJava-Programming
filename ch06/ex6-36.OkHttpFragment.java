// 코드 6-36 구현된 인터페이스 사용(fragments/OkHttpFragment.java)

public class OkHttpFragment extends Fragments {

    // 생략

    /**
     * Retrofit + OkHttp + RxJava
     */
    private void startRx() {
	GitHubServiceApi service = RestfulAdapter.getInstance().getServiceApi();
	Observable<List<Contributor>> observable =
	  service.getObContributors(sName, sRepo);

	mCompositeDisposable.add(
	  observable.subscribeOn(Schedulers.io())
	   .observeOn(AndroidSchedulers.mainThread())
	   .subscribeWith(new DisposableObserver<List<Contributor>>() {
	      @Override
	      public void onNext(List<Contributor> contributors) {
		  for(Contributor c : contributors) {
		      log(c.toString());
		  }
	      }

	      // 생략
	}));
    }

    /**
     * retrofit + okHttp(Retrofit의 내부)
     */
    private void startRetrofit() {
	GitHubServiceApi service = RestfulAdapter.getInstance().getSimpleApi();
	call.enqueue(new Callback<List<Contributor>>() {
	    @Override
	    public void onResponse(Call<List<Controbutor>> call,
		Response<List<Contributor>> response) {
		  if (response.isSuccessful()) {
		      List<Contributor> contributors = response.body();
		      for (Contributor c : contributors) {
			  log(c.toString());
		      }
		  } else {
		      log("not successful");
		  }
	    }

	    @Override
	    public void onFailure(Call<List<Contributor>> call, Throwable t) {
		log(t.getMessage());
	    }
	    });
    }

    /**
     * Retrofit + OKHttp
     */
    private void startOkHttp() {
	GitHubServiceApi service = RestfulAdapter.getInstance().getServiceApi();
	// 생략
    }
}
