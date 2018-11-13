package com.boundless.jerboa.libraryhelpers.coroutines

import kotlinx.coroutines.CoroutineDispatcher

interface DispatcherProvider {

  val main: CoroutineDispatcher

  val background: CoroutineDispatcher
}
