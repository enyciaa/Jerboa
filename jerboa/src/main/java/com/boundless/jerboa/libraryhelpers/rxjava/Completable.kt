package com.boundless.jerboa.libraryhelpers.rxjava

import io.reactivex.Completable
import io.reactivex.disposables.Disposable

fun Completable.applyNewThreadToMain(rxSchedulerProvider: RxSchedulerProvider): Completable {
    return subscribeOn(rxSchedulerProvider.new)
            .observeOn(rxSchedulerProvider.main)
}

fun Completable.applyIOToMain(rxSchedulerProvider: RxSchedulerProvider): Completable {
    return subscribeOn(rxSchedulerProvider.io)
            .observeOn(rxSchedulerProvider.main)
}

fun Completable.subscribeFireAndForget(): Disposable = subscribe({}, {})
