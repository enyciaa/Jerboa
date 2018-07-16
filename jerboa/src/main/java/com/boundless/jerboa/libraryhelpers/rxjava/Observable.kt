package com.boundless.jerboa.libraryhelpers.rxjava

import io.reactivex.Observable

fun <T> Observable<T>.applyNewThreadToMain(rxSchedulerProvider: RxSchedulerProvider): Observable<T> {
  return subscribeOn(rxSchedulerProvider.new)
      .observeOn(rxSchedulerProvider.main)
}

fun <T> Observable<T>.applyIOToMain(rxSchedulerProvider: RxSchedulerProvider): Observable<T> {
  return subscribeOn(rxSchedulerProvider.io)
      .observeOn(rxSchedulerProvider.main)
}
