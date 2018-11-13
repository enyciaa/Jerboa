package com.boundless.jerboa.libraryhelpers.rxjava

import io.reactivex.Scheduler

interface RxSchedulerProvider {

    val new: Scheduler

    val trampoline: Scheduler

    val io: Scheduler

    val single: Scheduler

    val computation: Scheduler

    val main: Scheduler
}
