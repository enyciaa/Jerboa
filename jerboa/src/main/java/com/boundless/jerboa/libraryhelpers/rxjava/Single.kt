package com.boundless.jerboa.libraryhelpers.rxjava

import io.reactivex.Single

fun <T> Single<T>.applyNewThreadToMain(rxSchedulerProvider: RxSchedulerProvider): Single<T> {
  return subscribeOn(rxSchedulerProvider.new)
      .observeOn(rxSchedulerProvider.main)
}

fun <T> Single<T>.applyIOToMain(rxSchedulerProvider: RxSchedulerProvider): Single<T> {
  return subscribeOn(rxSchedulerProvider.io)
      .observeOn(rxSchedulerProvider.main)
}
