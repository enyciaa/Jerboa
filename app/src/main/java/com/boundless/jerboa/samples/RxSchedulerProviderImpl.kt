package com.boundless.jerboa.samples

import com.boundless.jerboa.libraryhelpers.rxjava.RxSchedulerProvider
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

class RxSchedulerProviderImpl : RxSchedulerProvider {

    override val new: Scheduler
        get() = Schedulers.trampoline()

    override val trampoline: Scheduler
        get() = Schedulers.trampoline()

    override val io: Scheduler
        get() = Schedulers.trampoline()

    override val single: Scheduler
        get() = Schedulers.trampoline()

    override val computation: Scheduler
        get() = Schedulers.trampoline()

    override val main: Scheduler
        get() = Schedulers.trampoline()

}
